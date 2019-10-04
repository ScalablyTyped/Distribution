package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authenticationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authenticationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.authenticationNs.v1Ns.BoundObjectReference
import typings.atPulumiKubernetes.typesInputMod.authenticationNs.v1Ns.TokenRequestSpec
import typings.atPulumiKubernetes.typesInputMod.authenticationNs.v1Ns.TokenReviewSpec
import typings.atPulumiKubernetes.typesInputMod.authenticationNs.v1Ns.UserInfo
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "authentication")
@js.native
object authenticationNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * BoundObjectReference is a reference to an object that a token is bound to.
      */
    trait BoundObjectReference extends js.Object {
      /**
        * API version of the referent.
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * Name of the referent.
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      /**
        * UID of the referent.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * TokenRequest requests a token for a given service account.
      */
    trait TokenRequest extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authenticationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.TokenRequest]] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      var spec: Input[TokenRequestSpec]
    }
    
    /**
      * TokenRequestSpec contains client provided parameters of a token request.
      */
    trait TokenRequestSpec extends js.Object {
      /**
        * Audiences are the intendend audiences of the token. A recipient of a token must identitfy
        * themself with an identifier in the list of audiences of the token, and otherwise should
        * reject the token. A token issued for multiple audiences may be used to authenticate against
        * any of the audiences listed but implies a high degree of trust between the target
        * audiences.
        */
      var audiences: Input[js.Array[Input[String]]]
      /**
        * BoundObjectRef is a reference to an object that the token will be bound to. The token will
        * only be valid for as long as the bound object exists. NOTE: The API server's TokenReview
        * endpoint will validate the BoundObjectRef, but other audiences may not. Keep
        * ExpirationSeconds small if you want prompt revocation.
        */
      var boundObjectRef: js.UndefOr[Input[BoundObjectReference]] = js.undefined
      /**
        * ExpirationSeconds is the requested duration of validity of the request. The token issuer
        * may return a token with a different validity duration so a client needs to check the
        * 'expiration' field in a response.
        */
      var expirationSeconds: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * TokenRequestStatus is the result of a token request.
      */
    trait TokenRequestStatus extends js.Object {
      /**
        * ExpirationTimestamp is the time of expiration of the returned token.
        */
      var expirationTimestamp: Input[String]
      /**
        * Token is the opaque bearer token.
        */
      var token: Input[String]
    }
    
    /**
      * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
      * be cached by the webhook token authenticator plugin in the kube-apiserver.
      */
    trait TokenReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authenticationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.TokenReview]] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated
        */
      var spec: Input[TokenReviewSpec]
    }
    
    /**
      * TokenReviewSpec is a description of the token authentication request.
      */
    trait TokenReviewSpec extends js.Object {
      /**
        * Audiences is a list of the identifiers that the resource server presented with the token
        * identifies as. Audience-aware token authenticators will verify that the token was intended
        * for at least one of the audiences in this list. If no audiences are provided, the audience
        * will default to the audience of the Kubernetes apiserver.
        */
      var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Token is the opaque bearer token.
        */
      var token: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * TokenReviewStatus is the result of the token authentication request.
      */
    trait TokenReviewStatus extends js.Object {
      /**
        * Audiences are audience identifiers chosen by the authenticator that are compatible with
        * both the TokenReview and token. An identifier is any identifier in the intersection of the
        * TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that
        * sets the spec.audiences field should validate that a compatible audience identifier is
        * returned in the status.audiences field to ensure that the TokenReview server is audience
        * aware. If a TokenReview returns an empty status.audience field where status.authenticated
        * is "true", the token is valid against the audience of the Kubernetes API server.
        */
      var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Authenticated indicates that the token was associated with a known user.
        */
      var authenticated: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * Error indicates that the token couldn't be checked
        */
      var error: js.UndefOr[Input[String]] = js.undefined
      /**
        * User is the UserInfo associated with the provided token.
        */
      var user: js.UndefOr[Input[UserInfo]] = js.undefined
    }
    
    /**
      * UserInfo holds the information about the user needed to implement the user.Info interface.
      */
    trait UserInfo extends js.Object {
      /**
        * Any additional information provided by the authenticator.
        */
      var extra: js.UndefOr[Input[js.Object]] = js.undefined
      /**
        * The names of groups this user is a part of.
        */
      var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * A unique value that identifies this user across time. If this user is deleted and another
        * user by the same name is added, they will have different UIDs.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
      /**
        * The name that uniquely identifies this user among all active users.
        */
      var username: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isBoundObjectReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1.BoundObjectReference */ Boolean = js.native
    def isTokenRequest(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1.TokenRequest */ Boolean = js.native
    def isTokenReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1.TokenReview */ Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
      * be cached by the webhook token authenticator plugin in the kube-apiserver.
      */
    trait TokenReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authenticationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.TokenReview]] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated
        */
      var spec: Input[
            typings.atPulumiKubernetes.typesInputMod.authenticationNs.v1beta1Ns.TokenReviewSpec
          ]
    }
    
    /**
      * TokenReviewSpec is a description of the token authentication request.
      */
    trait TokenReviewSpec extends js.Object {
      /**
        * Audiences is a list of the identifiers that the resource server presented with the token
        * identifies as. Audience-aware token authenticators will verify that the token was intended
        * for at least one of the audiences in this list. If no audiences are provided, the audience
        * will default to the audience of the Kubernetes apiserver.
        */
      var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Token is the opaque bearer token.
        */
      var token: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * TokenReviewStatus is the result of the token authentication request.
      */
    trait TokenReviewStatus extends js.Object {
      /**
        * Audiences are audience identifiers chosen by the authenticator that are compatible with
        * both the TokenReview and token. An identifier is any identifier in the intersection of the
        * TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that
        * sets the spec.audiences field should validate that a compatible audience identifier is
        * returned in the status.audiences field to ensure that the TokenReview server is audience
        * aware. If a TokenReview returns an empty status.audience field where status.authenticated
        * is "true", the token is valid against the audience of the Kubernetes API server.
        */
      var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Authenticated indicates that the token was associated with a known user.
        */
      var authenticated: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * Error indicates that the token couldn't be checked
        */
      var error: js.UndefOr[Input[String]] = js.undefined
      /**
        * User is the UserInfo associated with the provided token.
        */
      var user: js.UndefOr[
            Input[typings.atPulumiKubernetes.typesInputMod.authenticationNs.v1beta1Ns.UserInfo]
          ] = js.undefined
    }
    
    /**
      * UserInfo holds the information about the user needed to implement the user.Info interface.
      */
    trait UserInfo extends js.Object {
      /**
        * Any additional information provided by the authenticator.
        */
      var extra: js.UndefOr[Input[js.Object]] = js.undefined
      /**
        * The names of groups this user is a part of.
        */
      var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * A unique value that identifies this user across time. If this user is deleted and another
        * user by the same name is added, they will have different UIDs.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
      /**
        * The name that uniquely identifies this user among all active users.
        */
      var username: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isTokenReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1beta1.TokenReview */ Boolean = js.native
  }
  
}


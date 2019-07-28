package typings.atPulumiKubernetes.typesOutputMod.authenticationNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authenticationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
  * be cached by the webhook token authenticator plugin in the kube-apiserver.
  */
trait TokenReview extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `authenticationDOTk8sDOTio/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.TokenReview
  val metadata: ObjectMeta
  /**
    * Spec holds information about the request being evaluated
    */
  val spec: TokenReviewSpec
  /**
    * Status is filled in by the server and indicates whether the request can be authenticated.
    */
  val status: TokenReviewStatus
}

object TokenReview {
  @scala.inline
  def apply(
    apiVersion: `authenticationDOTk8sDOTio/v1beta1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.TokenReview,
    metadata: ObjectMeta,
    spec: TokenReviewSpec,
    status: TokenReviewStatus
  ): TokenReview = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[TokenReview]
  }
}


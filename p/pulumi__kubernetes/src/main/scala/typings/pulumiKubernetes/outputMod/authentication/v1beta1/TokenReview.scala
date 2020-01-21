package typings.pulumiKubernetes.outputMod.authentication.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.authenticationDotk8sDotioSlashv1beta1
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
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: authenticationDotk8sDotioSlashv1beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.TokenReview
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
    apiVersion: authenticationDotk8sDotioSlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.TokenReview,
    metadata: ObjectMeta,
    spec: TokenReviewSpec,
    status: TokenReviewStatus
  ): TokenReview = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenReview]
  }
}


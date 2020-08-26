package typings.pulumiKubernetes.selfSubjectAccessReviewMod

import typings.pulumiKubernetes.inputMod.authorization.v1beta1.SelfSubjectAccessReviewSpec
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.authorizationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfSubjectAccessReviewArgs extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[authorizationDotk8sDotioSlashv1beta1]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectAccessReview]] = js.native
  val metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Spec holds information about the request being evaluated.  user and groups must be empty
    */
  val spec: Input[SelfSubjectAccessReviewSpec] = js.native
}

object SelfSubjectAccessReviewArgs {
  @scala.inline
  def apply(spec: Input[SelfSubjectAccessReviewSpec]): SelfSubjectAccessReviewArgs = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectAccessReviewArgs]
  }
  @scala.inline
  implicit class SelfSubjectAccessReviewArgsOps[Self <: SelfSubjectAccessReviewArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSpec(value: Input[SelfSubjectAccessReviewSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: Input[authorizationDotk8sDotioSlashv1beta1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectAccessReview]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}


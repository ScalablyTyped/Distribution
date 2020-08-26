package typings.pulumiKubernetes.priorityLevelConfigurationListMod

import typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1.PriorityLevelConfiguration
import typings.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.flowcontrolDotapiserverDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityLevelConfigurationListArgs extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[flowcontrolDotapiserverDotk8sDotioSlashv1alpha1]] = js.native
  /**
    * `items` is a list of request-priorities.
    */
  val items: Input[js.Array[Input[PriorityLevelConfiguration]]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[
    Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfigurationList]
  ] = js.native
  /**
    * `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: js.UndefOr[Input[ListMeta]] = js.native
}

object PriorityLevelConfigurationListArgs {
  @scala.inline
  def apply(items: Input[js.Array[Input[PriorityLevelConfiguration]]]): PriorityLevelConfigurationListArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationListArgs]
  }
  @scala.inline
  implicit class PriorityLevelConfigurationListArgsOps[Self <: PriorityLevelConfigurationListArgs] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Input[PriorityLevelConfiguration]*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: Input[js.Array[Input[PriorityLevelConfiguration]]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: Input[flowcontrolDotapiserverDotk8sDotioSlashv1alpha1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfigurationList]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ListMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}


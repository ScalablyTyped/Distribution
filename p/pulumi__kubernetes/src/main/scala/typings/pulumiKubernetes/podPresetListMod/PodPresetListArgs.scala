package typings.pulumiKubernetes.podPresetListMod

import typings.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.inputMod.settings.v1alpha1.PodPreset
import typings.pulumiKubernetes.pulumiKubernetesStrings.settingsDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PodPresetListArgs extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[settingsDotk8sDotioSlashv1alpha1]] = js.native
  /**
    * Items is a list of schema objects.
    */
  val items: Input[js.Array[Input[PodPreset]]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PodPresetList]] = js.native
  /**
    * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: js.UndefOr[Input[ListMeta]] = js.native
}

object PodPresetListArgs {
  @scala.inline
  def apply(items: Input[js.Array[Input[PodPreset]]]): PodPresetListArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodPresetListArgs]
  }
  @scala.inline
  implicit class PodPresetListArgsOps[Self <: PodPresetListArgs] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Input[PodPreset]*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: Input[js.Array[Input[PodPreset]]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: Input[settingsDotk8sDotioSlashv1alpha1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PodPresetList]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ListMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}


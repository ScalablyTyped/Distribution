package typings.pulumiKubernetes.persistentVolumeClaimListMod

import typings.pulumiKubernetes.inputMod.core.v1.PersistentVolumeClaim
import typings.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.v1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistentVolumeClaimListArgs extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[v1]] = js.native
  /**
    * A list of persistent volume claims. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  val items: Input[js.Array[Input[PersistentVolumeClaim]]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[
    Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PersistentVolumeClaimList]
  ] = js.native
  /**
    * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val metadata: js.UndefOr[Input[ListMeta]] = js.native
}

object PersistentVolumeClaimListArgs {
  @scala.inline
  def apply(items: Input[js.Array[Input[PersistentVolumeClaim]]]): PersistentVolumeClaimListArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimListArgs]
  }
  @scala.inline
  implicit class PersistentVolumeClaimListArgsOps[Self <: PersistentVolumeClaimListArgs] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Input[PersistentVolumeClaim]*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: Input[js.Array[Input[PersistentVolumeClaim]]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: Input[v1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PersistentVolumeClaimList]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ListMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}


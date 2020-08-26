package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ComponentStatus (and ComponentStatusList) holds the cluster validation info.
  */
@js.native
trait ComponentStatus extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1 = js.native
  /**
    * List of component conditions observed
    */
  var conditions: js.Array[ComponentCondition] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ComponentStatus = js.native
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
}

object ComponentStatus {
  @scala.inline
  def apply(
    apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1,
    conditions: js.Array[ComponentCondition],
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ComponentStatus,
    metadata: ObjectMeta
  ): ComponentStatus = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentStatus]
  }
  @scala.inline
  implicit class ComponentStatusOps[Self <: ComponentStatus] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: typings.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: ComponentCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[ComponentCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.ComponentStatus): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}


package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMap holds configuration data for pods to consume.
  */
@js.native
trait ConfigMap extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1 = js.native
  /**
    * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
    */
  var binaryData: StringDictionary[String] = js.native
  /**
    * Data contains the configuration data. Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
    */
  var data: StringDictionary[String] = js.native
  /**
    * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil. This is an alpha field enabled by ImmutableEphemeralVolumes feature gate.
    */
  var immutable: Boolean = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap = js.native
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
}

object ConfigMap {
  @scala.inline
  def apply(
    apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1,
    binaryData: StringDictionary[String],
    data: StringDictionary[String],
    immutable: Boolean,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap,
    metadata: ObjectMeta
  ): ConfigMap = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], binaryData = binaryData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], immutable = immutable.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMap]
  }
  @scala.inline
  implicit class ConfigMapOps[Self <: ConfigMap] (val x: Self) extends AnyVal {
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
    def setBinaryData(value: StringDictionary[String]): Self = this.set("binaryData", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}


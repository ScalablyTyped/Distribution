package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMap holds configuration data for pods to consume.
  */
trait ConfigMap extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1
  /**
    * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-',
    * '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys
    * stored in BinaryData must not overlap with the ones in the Data field, this is enforced
    * during validation process. Using this field will require 1.10+ apiserver and kubelet.
    */
  val binaryData: js.Object
  /**
    * Data contains the configuration data. Each key must consist of alphanumeric characters,
    * '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The
    * keys stored in Data must not overlap with the keys in the BinaryData field, this is
    * enforced during validation process.
    */
  val data: StringDictionary[String]
  /**
    * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated
    * (only object metadata can be modified). If not set to true, the field can be modified at
    * any time. Defaulted to nil. This is an alpha field enabled by ImmutableEphemeralVolumes
    * feature gate.
    */
  val immutable: Boolean
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
}

object ConfigMap {
  @scala.inline
  def apply(
    apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1,
    binaryData: js.Object,
    data: StringDictionary[String],
    immutable: Boolean,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap,
    metadata: ObjectMeta
  ): ConfigMap = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], binaryData = binaryData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], immutable = immutable.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigMap]
  }
}


package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.undefined
  /**
    * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-',
    * '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys
    * stored in BinaryData must not overlap with the ones in the Data field, this is enforced
    * during validation process. Using this field will require 1.10+ apiserver and kubelet.
    */
  var binaryData: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Data contains the configuration data. Each key must consist of alphanumeric characters,
    * '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The
    * keys stored in Data must not overlap with the keys in the BinaryData field, this is
    * enforced during validation process.
    */
  var data: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
}

object ConfigMap {
  @scala.inline
  def apply(
    apiVersion: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1] = null,
    binaryData: Input[js.Object] = null,
    data: Input[StringDictionary[Input[String]]] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap] = null,
    metadata: Input[ObjectMeta] = null
  ): ConfigMap = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (binaryData != null) __obj.updateDynamic("binaryData")(binaryData.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMap]
  }
}


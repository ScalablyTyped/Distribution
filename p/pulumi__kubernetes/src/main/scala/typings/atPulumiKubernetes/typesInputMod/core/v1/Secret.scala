package typings.atPulumiKubernetes.typesInputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Secret holds secret data of a certain type. The total bytes of the values in the Data field
  * must be less than MaxSecretSize bytes.
  */
trait Secret extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1]] = js.undefined
  /**
    * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_'
    * or '.'. The serialized form of the secret data is a base64 encoded string, representing the
    * arbitrary (possibly non-string) data value here. Described in
    * https://tools.ietf.org/html/rfc4648#section-4
    */
  var data: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Secret]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * stringData allows specifying non-binary secret data in string form. It is provided as a
    * write-only convenience method. All keys and values are merged into the data field on write,
    * overwriting any existing values. It is never output when reading from the API.
    */
  var stringData: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Used to facilitate programmatic handling of secret data.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Secret {
  @scala.inline
  def apply(
    apiVersion: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1] = null,
    data: Input[js.Object] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Secret] = null,
    metadata: Input[ObjectMeta] = null,
    stringData: Input[StringDictionary[Input[String]]] = null,
    `type`: Input[String] = null
  ): Secret = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (stringData != null) __obj.updateDynamic("stringData")(stringData.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
}


package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
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
  val apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1
  /**
    * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_'
    * or '.'. The serialized form of the secret data is a base64 encoded string, representing the
    * arbitrary (possibly non-string) data value here. Described in
    * https://tools.ietf.org/html/rfc4648#section-4
    */
  val data: js.Object
  /**
    * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only
    * object metadata can be modified). If not set to true, the field can be modified at any
    * time. Defaulted to nil. This is an alpha field enabled by ImmutableEphemeralVolumes feature
    * gate.
    */
  val immutable: Boolean
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Secret
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * stringData allows specifying non-binary secret data in string form. It is provided as a
    * write-only convenience method. All keys and values are merged into the data field on write,
    * overwriting any existing values. It is never output when reading from the API.
    */
  val stringData: StringDictionary[String]
  /**
    * Used to facilitate programmatic handling of secret data.
    */
  val `type`: String
}

object Secret {
  @scala.inline
  def apply(
    apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1,
    data: js.Object,
    immutable: Boolean,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Secret,
    metadata: ObjectMeta,
    stringData: StringDictionary[String],
    `type`: String
  ): Secret = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], immutable = immutable.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], stringData = stringData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
}


package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
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
  val apiVersion: v1
  /**
    * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_'
    * or '.'. The serialized form of the secret data is a base64 encoded string, representing the
    * arbitrary (possibly non-string) data value here. Described in
    * https://tools.ietf.org/html/rfc4648#section-4
    */
  val data: js.Object
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Secret
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
    apiVersion: v1,
    data: js.Object,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Secret,
    metadata: ObjectMeta,
    stringData: StringDictionary[String],
    `type`: String
  ): Secret = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, data = data, kind = kind, metadata = metadata, stringData = stringData)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Secret]
  }
}


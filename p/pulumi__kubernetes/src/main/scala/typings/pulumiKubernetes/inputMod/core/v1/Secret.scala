package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
  *
  * Note: While Pulumi automatically encrypts the 'data' and 'stringData'
  * fields, this encryption only applies to Pulumi's context, including the state file,
  * the Service, the CLI, etc. Kubernetes does not encrypt Secret resources by default,
  * and the contents are visible to users with access to the Secret in Kubernetes using
  * tools like 'kubectl'.
  *
  * For more information on securing Kubernetes Secrets, see the following links:
  * https://kubernetes.io/docs/concepts/configuration/secret/#security-properties
  * https://kubernetes.io/docs/concepts/configuration/secret/#risks
  */
@js.native
trait Secret extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.native
  /**
    * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
    */
  var data: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil. This is an alpha field enabled by ImmutableEphemeralVolumes feature gate.
    */
  var immutable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Secret]] = js.native
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * stringData allows specifying non-binary secret data in string form. It is provided as a write-only convenience method. All keys and values are merged into the data field on write, overwriting any existing values. It is never output when reading from the API.
    */
  var stringData: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Used to facilitate programmatic handling of secret data.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object Secret {
  @scala.inline
  def apply(): Secret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Secret]
  }
  @scala.inline
  implicit class SecretOps[Self <: Secret] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.v1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setData(value: Input[StringDictionary[Input[String]]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setImmutable(value: Input[Boolean]): Self = this.set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Secret]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setStringData(value: Input[StringDictionary[Input[String]]]): Self = this.set("stringData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringData: Self = this.set("stringData", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


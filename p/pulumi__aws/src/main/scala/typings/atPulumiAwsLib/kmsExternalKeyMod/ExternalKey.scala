package typings
package atPulumiAwsLib.kmsExternalKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms/externalKey", "ExternalKey")
@js.native
class ExternalKey protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ExternalKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: ExternalKeyArgs) = this()
  def this(name: java.lang.String, args: ExternalKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the key.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
    */
  val deletionWindowInDays: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Description of the key.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
    */
  val enabled: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
    */
  val expirationModel: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
    */
  val keyMaterialBase64: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The state of the CMK.
    */
  val keyState: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The cryptographic operations for which you can use the CMK.
    */
  val keyUsage: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
    */
  val policy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A key-value map of tags to assign to the key.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
    */
  val validTo: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/kms/externalKey", "ExternalKey")
@js.native
object ExternalKey extends js.Object {
  /**
    * Get an existing ExternalKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kmsExternalKeyMod.ExternalKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kmsExternalKeyMod.ExternalKeyState
  ): atPulumiAwsLib.kmsExternalKeyMod.ExternalKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kmsExternalKeyMod.ExternalKeyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.kmsExternalKeyMod.ExternalKey = js.native
  /**
    * Returns true if the given object is an instance of ExternalKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ scala.Boolean = js.native
}


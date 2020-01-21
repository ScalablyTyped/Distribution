package typings.pulumiAws.externalKeyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms/externalKey", "ExternalKey")
@js.native
class ExternalKey protected () extends CustomResource {
  /**
    * Create a ExternalKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ExternalKeyArgs) = this()
  def this(name: String, args: ExternalKeyArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the key.
    */
  val arn: Output_[String] = js.native
  /**
    * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
    */
  val deletionWindowInDays: Output_[js.UndefOr[Double]] = js.native
  /**
    * Description of the key.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
    */
  val enabled: Output_[Boolean] = js.native
  /**
    * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
    */
  val expirationModel: Output_[String] = js.native
  /**
    * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
    */
  val keyMaterialBase64: Output_[js.UndefOr[String]] = js.native
  /**
    * The state of the CMK.
    */
  val keyState: Output_[String] = js.native
  /**
    * The cryptographic operations for which you can use the CMK.
    */
  val keyUsage: Output_[String] = js.native
  /**
    * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
    */
  val policy: Output_[String] = js.native
  /**
    * A key-value map of tags to assign to the key.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
    */
  val validTo: Output_[js.UndefOr[String]] = js.native
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
  def get(name: String, id: Input[ID]): ExternalKey = js.native
  def get(name: String, id: Input[ID], state: ExternalKeyState): ExternalKey = js.native
  def get(name: String, id: Input[ID], state: ExternalKeyState, opts: CustomResourceOptions): ExternalKey = js.native
  /**
    * Returns true if the given object is an instance of ExternalKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean = js.native
}


package typings.atPulumiAws.kmsKeyMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms/key", "Key")
@js.native
class Key protected () extends CustomResource {
  /**
    * Create a Key resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: KeyArgs) = this()
  def this(name: String, args: KeyArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the key.
    */
  val arn: Output[String] = js.native
  /**
    * Duration in days after which the key is deleted
    * after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
    */
  val deletionWindowInDays: Output[js.UndefOr[Double]] = js.native
  /**
    * The description of the key as viewed in AWS console.
    */
  val description: Output[String] = js.native
  /**
    * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html)
    * is enabled. Defaults to false.
    */
  val enableKeyRotation: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Specifies whether the key is enabled. Defaults to true.
    */
  val isEnabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The globally unique identifier for the key.
    */
  val keyId: Output[String] = js.native
  /**
    * Specifies the intended use of the key.
    * Defaults to ENCRYPT_DECRYPT, and only symmetric encryption and decryption are supported.
    */
  val keyUsage: Output[String] = js.native
  /**
    * A valid policy JSON document.
    */
  val policy: Output[String] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/kms/key", "Key")
@js.native
object Key extends js.Object {
  /**
    * Get an existing Key resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Key = js.native
  def get(name: String, id: Input[ID], state: KeyState): Key = js.native
  def get(name: String, id: Input[ID], state: KeyState, opts: CustomResourceOptions): Key = js.native
  /**
    * Returns true if the given object is an instance of Key.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean = js.native
}


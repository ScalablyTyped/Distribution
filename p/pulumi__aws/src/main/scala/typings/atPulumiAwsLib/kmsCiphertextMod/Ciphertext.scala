package typings
package atPulumiAwsLib.kmsCiphertextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms/ciphertext", "Ciphertext")
@js.native
class Ciphertext protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Ciphertext resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: CiphertextArgs) = this()
  def this(name: java.lang.String, args: CiphertextArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Base64 encoded ciphertext
    */
  val ciphertextBlob: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/kms/ciphertext", "Ciphertext")
@js.native
object Ciphertext extends js.Object {
  /**
    * Get an existing Ciphertext resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kmsCiphertextMod.Ciphertext = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kmsCiphertextMod.CiphertextState
  ): atPulumiAwsLib.kmsCiphertextMod.Ciphertext = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kmsCiphertextMod.CiphertextState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.kmsCiphertextMod.Ciphertext = js.native
  /**
    * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ scala.Boolean = js.native
}


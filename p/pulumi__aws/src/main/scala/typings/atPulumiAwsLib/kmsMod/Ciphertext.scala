package typings
package atPulumiAwsLib.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms", "Ciphertext")
@js.native
class Ciphertext protected ()
  extends atPulumiAwsLib.kmsCiphertextMod.Ciphertext {
  /**
    * Create a Ciphertext resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.kmsCiphertextMod.CiphertextArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.kmsCiphertextMod.CiphertextArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/kms", "Ciphertext")
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
}


package typings.atPulumiAws.kmsMod

import typings.atPulumiAws.kmsCiphertextMod.CiphertextArgs
import typings.atPulumiAws.kmsCiphertextMod.CiphertextState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms", "Ciphertext")
@js.native
class Ciphertext protected ()
  extends typings.atPulumiAws.kmsCiphertextMod.Ciphertext {
  /**
    * Create a Ciphertext resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CiphertextArgs) = this()
  def this(name: String, args: CiphertextArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.kmsCiphertextMod.Ciphertext = js.native
  def get(name: String, id: Input[ID], state: CiphertextState): typings.atPulumiAws.kmsCiphertextMod.Ciphertext = js.native
  def get(name: String, id: Input[ID], state: CiphertextState, opts: CustomResourceOptions): typings.atPulumiAws.kmsCiphertextMod.Ciphertext = js.native
  /**
    * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean = js.native
}


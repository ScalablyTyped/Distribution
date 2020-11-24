package typings.pulumiAws.ciphertextMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/kms/ciphertext", "Ciphertext")
@js.native
class Ciphertext protected () extends CustomResource {
  /**
    * Create a Ciphertext resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CiphertextArgs) = this()
  def this(name: String, args: CiphertextArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Base64 encoded ciphertext
    */
  val ciphertextBlob: Output_[String] = js.native
  
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: Output_[String] = js.native
  
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Ciphertext = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Ciphertext = js.native
  def get(name: String, id: Input[ID], state: CiphertextState): Ciphertext = js.native
  def get(name: String, id: Input[ID], state: CiphertextState, opts: CustomResourceOptions): Ciphertext = js.native
  
  /**
    * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean = js.native
}

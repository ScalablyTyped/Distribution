package typings.pulumiAws.ec2Mod

import typings.pulumiAws.keyPairMod.KeyPairArgs
import typings.pulumiAws.keyPairMod.KeyPairState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "KeyPair")
@js.native
class KeyPair protected ()
  extends typings.pulumiAws.keyPairMod.KeyPair {
  /**
    * Create a KeyPair resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: KeyPairArgs) = this()
  def this(name: String, args: KeyPairArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object KeyPair {
  
  /**
    * Get an existing KeyPair resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "KeyPair.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.keyPairMod.KeyPair = js.native
  @JSImport("@pulumi/aws/ec2", "KeyPair.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.keyPairMod.KeyPair = js.native
  @JSImport("@pulumi/aws/ec2", "KeyPair.get")
  @js.native
  def get(name: String, id: Input[ID], state: KeyPairState): typings.pulumiAws.keyPairMod.KeyPair = js.native
  @JSImport("@pulumi/aws/ec2", "KeyPair.get")
  @js.native
  def get(name: String, id: Input[ID], state: KeyPairState, opts: CustomResourceOptions): typings.pulumiAws.keyPairMod.KeyPair = js.native
  
  /**
    * Returns true if the given object is an instance of KeyPair.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "KeyPair.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/keyPair.KeyPair */ Boolean = js.native
}

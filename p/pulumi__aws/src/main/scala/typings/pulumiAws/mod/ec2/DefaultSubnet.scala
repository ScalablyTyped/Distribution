package typings.pulumiAws.mod.ec2

import typings.pulumiAws.defaultSubnetMod.DefaultSubnetArgs
import typings.pulumiAws.defaultSubnetMod.DefaultSubnetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.DefaultSubnet")
@js.native
class DefaultSubnet protected ()
  extends typings.pulumiAws.ec2Mod.DefaultSubnet {
  /**
    * Create a DefaultSubnet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DefaultSubnetArgs) = this()
  def this(name: String, args: DefaultSubnetArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object DefaultSubnet {
  
  /**
    * Get an existing DefaultSubnet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "ec2.DefaultSubnet.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.defaultSubnetMod.DefaultSubnet = js.native
  @JSImport("@pulumi/aws", "ec2.DefaultSubnet.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.defaultSubnetMod.DefaultSubnet = js.native
  @JSImport("@pulumi/aws", "ec2.DefaultSubnet.get")
  @js.native
  def get(name: String, id: Input[ID], state: DefaultSubnetState): typings.pulumiAws.defaultSubnetMod.DefaultSubnet = js.native
  @JSImport("@pulumi/aws", "ec2.DefaultSubnet.get")
  @js.native
  def get(name: String, id: Input[ID], state: DefaultSubnetState, opts: CustomResourceOptions): typings.pulumiAws.defaultSubnetMod.DefaultSubnet = js.native
  
  /**
    * Returns true if the given object is an instance of DefaultSubnet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "ec2.DefaultSubnet.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSubnet.DefaultSubnet */ Boolean = js.native
}

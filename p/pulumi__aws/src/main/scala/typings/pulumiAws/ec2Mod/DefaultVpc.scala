package typings.pulumiAws.ec2Mod

import typings.pulumiAws.defaultVpcMod.DefaultVpcArgs
import typings.pulumiAws.defaultVpcMod.DefaultVpcState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "DefaultVpc")
@js.native
class DefaultVpc protected ()
  extends typings.pulumiAws.defaultVpcMod.DefaultVpc {
  /**
    * Create a DefaultVpc resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DefaultVpcArgs) = this()
  def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
  def this(name: String, args: DefaultVpcArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object DefaultVpc {
  
  @JSImport("@pulumi/aws/ec2", "DefaultVpc")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get an existing DefaultVpc resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  inline def get(name: String, id: Input[ID]): typings.pulumiAws.defaultVpcMod.DefaultVpc = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.defaultVpcMod.DefaultVpc]
  inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.defaultVpcMod.DefaultVpc = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.defaultVpcMod.DefaultVpc]
  inline def get(name: String, id: Input[ID], state: DefaultVpcState): typings.pulumiAws.defaultVpcMod.DefaultVpc = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.defaultVpcMod.DefaultVpc]
  inline def get(name: String, id: Input[ID], state: DefaultVpcState, opts: CustomResourceOptions): typings.pulumiAws.defaultVpcMod.DefaultVpc = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.defaultVpcMod.DefaultVpc]
  
  /**
    * Returns true if the given object is an instance of DefaultVpc.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultVpc.DefaultVpc */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/defaultVpc.DefaultVpc */ Boolean]
}

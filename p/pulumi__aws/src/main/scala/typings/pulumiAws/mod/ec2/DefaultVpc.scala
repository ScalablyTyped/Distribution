package typings.pulumiAws.mod.ec2

import typings.pulumiAws.defaultVpcMod.DefaultVpcArgs
import typings.pulumiAws.defaultVpcMod.DefaultVpcState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.DefaultVpc")
@js.native
class DefaultVpc protected ()
  extends typings.pulumiAws.ec2Mod.DefaultVpc {
  /**
    * Create a DefaultVpc resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DefaultVpcArgs) = this()
  def this(name: String, args: DefaultVpcArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.DefaultVpc")
@js.native
object DefaultVpc extends js.Object {
  /**
    * Get an existing DefaultVpc resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.defaultVpcMod.DefaultVpc = js.native
  def get(name: String, id: Input[ID], state: DefaultVpcState): typings.pulumiAws.defaultVpcMod.DefaultVpc = js.native
  def get(name: String, id: Input[ID], state: DefaultVpcState, opts: CustomResourceOptions): typings.pulumiAws.defaultVpcMod.DefaultVpc = js.native
  /**
    * Returns true if the given object is an instance of DefaultVpc.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultVpc.DefaultVpc */ Boolean = js.native
}


package typings
package atPulumiAwsLib.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "AmiFromInstance")
@js.native
class AmiFromInstance protected ()
  extends atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance {
  /**
    * Create a AmiFromInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "AmiFromInstance")
@js.native
object AmiFromInstance extends js.Object {
  /**
    * Get an existing AmiFromInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceState
  ): atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance = js.native
  /**
    * Returns true if the given object is an instance of AmiFromInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiFromInstance.AmiFromInstance */ scala.Boolean = js.native
}


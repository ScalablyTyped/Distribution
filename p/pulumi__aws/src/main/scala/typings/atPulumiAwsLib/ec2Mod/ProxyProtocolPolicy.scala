package typings
package atPulumiAwsLib.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "ProxyProtocolPolicy")
@js.native
class ProxyProtocolPolicy protected ()
  extends atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicy {
  /**
    * Create a ProxyProtocolPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicyArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "ProxyProtocolPolicy")
@js.native
object ProxyProtocolPolicy extends js.Object {
  /**
    * Get an existing ProxyProtocolPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicyState
  ): atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2ProxyProtocolPolicyMod.ProxyProtocolPolicy = js.native
}


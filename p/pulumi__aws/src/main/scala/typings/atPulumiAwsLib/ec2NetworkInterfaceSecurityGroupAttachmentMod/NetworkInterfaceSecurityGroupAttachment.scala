package typings
package atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/networkInterfaceSecurityGroupAttachment", "NetworkInterfaceSecurityGroupAttachment")
@js.native
class NetworkInterfaceSecurityGroupAttachment protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a NetworkInterfaceSecurityGroupAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: NetworkInterfaceSecurityGroupAttachmentArgs) = this()
  def this(name: java.lang.String, args: NetworkInterfaceSecurityGroupAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ID of the network interface to attach to.
    */
  val networkInterfaceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the security group.
    */
  val securityGroupId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/networkInterfaceSecurityGroupAttachment", "NetworkInterfaceSecurityGroupAttachment")
@js.native
object NetworkInterfaceSecurityGroupAttachment extends js.Object {
  /**
    * Get an existing NetworkInterfaceSecurityGroupAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachmentState
  ): atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod.NetworkInterfaceSecurityGroupAttachment = js.native
}


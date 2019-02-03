package typings
package atPulumiAwsLib.datasyncAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/agent", "Agent")
@js.native
class Agent protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Agent resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: AgentArgs) = this()
  def this(name: java.lang.String, args: AgentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, Terraform will retrieve the `activation_key` as part of the resource creation.
    */
  val activationKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Amazon Resource Name (ARN) of the DataSync Agent.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where Terraform is running.
    */
  val ipAddress: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Name of the DataSync Agent.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Agent.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/datasync/agent", "Agent")
@js.native
object Agent extends js.Object {
  /**
    * Get an existing Agent resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.datasyncAgentMod.Agent = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.datasyncAgentMod.AgentState
  ): atPulumiAwsLib.datasyncAgentMod.Agent = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.datasyncAgentMod.AgentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.datasyncAgentMod.Agent = js.native
}


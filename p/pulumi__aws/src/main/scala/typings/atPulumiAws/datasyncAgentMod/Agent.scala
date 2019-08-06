package typings.atPulumiAws.datasyncAgentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/agent", "Agent")
@js.native
class Agent protected () extends CustomResource {
  /**
    * Create a Agent resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AgentArgs) = this()
  def this(name: String, args: AgentArgs, opts: CustomResourceOptions) = this()
  /**
    * DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
    */
  val activationKey: Output[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the DataSync Agent.
    */
  val arn: Output[String] = js.native
  /**
    * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
    */
  val ipAddress: Output[String] = js.native
  /**
    * Name of the DataSync Agent.
    */
  val name: Output[String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Agent.
    */
  val tags: Output[js.UndefOr[StringDictionary[String]]] = js.native
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
  def get(name: String, id: Input[ID]): Agent = js.native
  def get(name: String, id: Input[ID], state: AgentState): Agent = js.native
  def get(name: String, id: Input[ID], state: AgentState, opts: CustomResourceOptions): Agent = js.native
  /**
    * Returns true if the given object is an instance of Agent.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/agent.Agent */ Boolean = js.native
}


package typings.atPulumiAws.datasyncMod

import typings.atPulumiAws.datasyncAgentMod.AgentArgs
import typings.atPulumiAws.datasyncAgentMod.AgentState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync", "Agent")
@js.native
class Agent protected ()
  extends typings.atPulumiAws.datasyncAgentMod.Agent {
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
}

/* static members */
@JSImport("@pulumi/aws/datasync", "Agent")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.datasyncAgentMod.Agent = js.native
  def get(name: String, id: Input[ID], state: AgentState): typings.atPulumiAws.datasyncAgentMod.Agent = js.native
  def get(name: String, id: Input[ID], state: AgentState, opts: CustomResourceOptions): typings.atPulumiAws.datasyncAgentMod.Agent = js.native
  /**
    * Returns true if the given object is an instance of Agent.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/agent.Agent */ Boolean = js.native
}


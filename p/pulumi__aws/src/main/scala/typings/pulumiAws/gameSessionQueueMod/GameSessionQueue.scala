package typings.pulumiAws.gameSessionQueueMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.gamelift.GameSessionQueuePlayerLatencyPolicy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/gamelift/gameSessionQueue", "GameSessionQueue")
@js.native
class GameSessionQueue protected () extends CustomResource {
  /**
    * Create a GameSessionQueue resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: GameSessionQueueArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: GameSessionQueueArgs, opts: CustomResourceOptions) = this()
  /**
    * Game Session Queue ARN.
    */
  val arn: Output_[String] = js.native
  /**
    * List of fleet/alias ARNs used by session queue for placing game sessions.
    */
  val destinations: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Name of the session queue.
    */
  val name: Output_[String] = js.native
  /**
    * One or more policies used to choose fleet based on player latency. See below.
    */
  val playerLatencyPolicies: Output_[js.UndefOr[js.Array[GameSessionQueuePlayerLatencyPolicy]]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Maximum time a game session request can remain in the queue.
    */
  val timeoutInSeconds: Output_[js.UndefOr[Double]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/gamelift/gameSessionQueue", "GameSessionQueue")
@js.native
object GameSessionQueue extends js.Object {
  /**
    * Get an existing GameSessionQueue resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): GameSessionQueue = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GameSessionQueue = js.native
  def get(name: String, id: Input[ID], state: GameSessionQueueState): GameSessionQueue = js.native
  def get(name: String, id: Input[ID], state: GameSessionQueueState, opts: CustomResourceOptions): GameSessionQueue = js.native
  /**
    * Returns true if the given object is an instance of GameSessionQueue.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/gameSessionQueue.GameSessionQueue */ Boolean = js.native
}


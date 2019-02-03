package typings
package atPulumiAwsLib.gameliftGameSessionQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/gamelift/gameSessionQueue", "GameSessionQueue")
@js.native
class GameSessionQueue protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a GameSessionQueue resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: GameSessionQueueArgs) = this()
  def this(name: java.lang.String, args: GameSessionQueueArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Game Session Queue ARN.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * List of fleet/alias ARNs used by session queue for placing game sessions.
    */
  val destinations: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Name of the session queue.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * One or more policies used to choose fleet based on player latency. See below.
    */
  val playerLatencyPolicies: atPulumiPulumiLib.atPulumiPulumiMod.Output[
    js.UndefOr[js.Array[atPulumiAwsLib.Anon_MaximumIndividualPlayerLatencyMilliseconds]]
  ] = js.native
  /**
    * Maximum time a game session request can remain in the queue.
    */
  val timeoutInSeconds: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.gameliftGameSessionQueueMod.GameSessionQueue = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.gameliftGameSessionQueueMod.GameSessionQueueState
  ): atPulumiAwsLib.gameliftGameSessionQueueMod.GameSessionQueue = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.gameliftGameSessionQueueMod.GameSessionQueueState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.gameliftGameSessionQueueMod.GameSessionQueue = js.native
}


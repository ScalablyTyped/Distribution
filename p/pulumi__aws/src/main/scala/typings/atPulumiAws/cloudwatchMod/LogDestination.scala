package typings.atPulumiAws.cloudwatchMod

import typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestinationArgs
import typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestinationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "LogDestination")
@js.native
class LogDestination protected ()
  extends typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestination {
  /**
    * Create a LogDestination resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogDestinationArgs) = this()
  def this(name: String, args: LogDestinationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch", "LogDestination")
@js.native
object LogDestination extends js.Object {
  /**
    * Get an existing LogDestination resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestination = js.native
  def get(name: String, id: Input[ID], state: LogDestinationState): typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestination = js.native
  def get(name: String, id: Input[ID], state: LogDestinationState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestination = js.native
  /**
    * Returns true if the given object is an instance of LogDestination.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestination.LogDestination */ Boolean = js.native
}


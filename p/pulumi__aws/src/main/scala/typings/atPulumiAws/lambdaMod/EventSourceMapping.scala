package typings.atPulumiAws.lambdaMod

import typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMappingArgs
import typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMappingState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "EventSourceMapping")
@js.native
class EventSourceMapping protected ()
  extends typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMapping {
  /**
    * Create a EventSourceMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventSourceMappingArgs) = this()
  def this(name: String, args: EventSourceMappingArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/lambda", "EventSourceMapping")
@js.native
object EventSourceMapping extends js.Object {
  /**
    * Get an existing EventSourceMapping resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMapping = js.native
  def get(name: String, id: Input[ID], state: EventSourceMappingState): typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMapping = js.native
  def get(name: String, id: Input[ID], state: EventSourceMappingState, opts: CustomResourceOptions): typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMapping = js.native
  /**
    * Returns true if the given object is an instance of EventSourceMapping.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/eventSourceMapping.EventSourceMapping */ Boolean = js.native
}


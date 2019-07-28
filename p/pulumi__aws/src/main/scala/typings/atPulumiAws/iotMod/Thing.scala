package typings.atPulumiAws.iotMod

import typings.atPulumiAws.iotThingMod.ThingArgs
import typings.atPulumiAws.iotThingMod.ThingState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot", "Thing")
@js.native
class Thing protected ()
  extends typings.atPulumiAws.iotThingMod.Thing {
  /**
    * Create a Thing resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ThingArgs) = this()
  def this(name: String, args: ThingArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iot", "Thing")
@js.native
object Thing extends js.Object {
  /**
    * Get an existing Thing resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.iotThingMod.Thing = js.native
  def get(name: String, id: Input[ID], state: ThingState): typings.atPulumiAws.iotThingMod.Thing = js.native
  def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): typings.atPulumiAws.iotThingMod.Thing = js.native
  /**
    * Returns true if the given object is an instance of Thing.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean = js.native
}


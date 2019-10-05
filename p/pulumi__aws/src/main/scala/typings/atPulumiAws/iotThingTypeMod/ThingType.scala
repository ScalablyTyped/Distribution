package typings.atPulumiAws.iotThingTypeMod

import typings.atPulumiAws.typesOutputMod.iot.ThingTypeProperties
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot/thingType", "ThingType")
@js.native
class ThingType protected () extends CustomResource {
  /**
    * Create a ThingType resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ThingTypeArgs) = this()
  def this(name: String, args: ThingTypeArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the created AWS IoT Thing Type.
    */
  val arn: Output[String] = js.native
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  val deprecated: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The name of the thing type.
    */
  val name: Output[String] = js.native
  val properties: Output[js.UndefOr[ThingTypeProperties]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iot/thingType", "ThingType")
@js.native
object ThingType extends js.Object {
  /**
    * Get an existing ThingType resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ThingType = js.native
  def get(name: String, id: Input[ID], state: ThingTypeState): ThingType = js.native
  def get(name: String, id: Input[ID], state: ThingTypeState, opts: CustomResourceOptions): ThingType = js.native
  /**
    * Returns true if the given object is an instance of ThingType.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingType.ThingType */ Boolean = js.native
}


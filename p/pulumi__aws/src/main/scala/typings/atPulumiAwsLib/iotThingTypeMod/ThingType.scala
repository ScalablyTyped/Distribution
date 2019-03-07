package typings
package atPulumiAwsLib.iotThingTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot/thingType", "ThingType")
@js.native
class ThingType protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ThingType resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: ThingTypeArgs) = this()
  def this(name: java.lang.String, args: ThingTypeArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the created AWS IoT Thing Type.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  val deprecated: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The name of the thing type.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val properties: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_Description]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotThingTypeMod.ThingType = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotThingTypeMod.ThingTypeState
  ): atPulumiAwsLib.iotThingTypeMod.ThingType = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotThingTypeMod.ThingTypeState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iotThingTypeMod.ThingType = js.native
}


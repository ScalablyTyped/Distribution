package typings
package atPulumiAwsLib.iotThingPrincipalAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot/thingPrincipalAttachment", "ThingPrincipalAttachment")
@js.native
class ThingPrincipalAttachment protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ThingPrincipalAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ThingPrincipalAttachmentArgs) = this()
  def this(name: java.lang.String, args: ThingPrincipalAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
    */
  val principal: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * The name of the thing.
    */
  val thing: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iot/thingPrincipalAttachment", "ThingPrincipalAttachment")
@js.native
object ThingPrincipalAttachment extends js.Object {
  /**
    * Get an existing ThingPrincipalAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentState
  ): atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
}


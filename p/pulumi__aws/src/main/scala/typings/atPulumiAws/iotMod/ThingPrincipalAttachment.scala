package typings.atPulumiAws.iotMod

import typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentArgs
import typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachmentState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot", "ThingPrincipalAttachment")
@js.native
class ThingPrincipalAttachment protected ()
  extends typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment {
  /**
    * Create a ThingPrincipalAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ThingPrincipalAttachmentArgs) = this()
  def this(name: String, args: ThingPrincipalAttachmentArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iot", "ThingPrincipalAttachment")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
  def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState): typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
  def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.iotThingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
  /**
    * Returns true if the given object is an instance of ThingPrincipalAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ Boolean = js.native
}


package typings.pulumiAws.thingPrincipalAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iot/thingPrincipalAttachment", "ThingPrincipalAttachment")
@js.native
class ThingPrincipalAttachment protected () extends CustomResource {
  /**
    * Create a ThingPrincipalAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ThingPrincipalAttachmentArgs) = this()
  def this(name: String, args: ThingPrincipalAttachmentArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
    */
  val principal: Output_[ARN] = js.native
  
  /**
    * The name of the thing.
    */
  val thing: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ThingPrincipalAttachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ThingPrincipalAttachment = js.native
  def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState): ThingPrincipalAttachment = js.native
  def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState, opts: CustomResourceOptions): ThingPrincipalAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of ThingPrincipalAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ Boolean = js.native
}

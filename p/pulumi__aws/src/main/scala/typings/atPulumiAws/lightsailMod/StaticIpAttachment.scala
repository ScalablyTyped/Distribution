package typings.atPulumiAws.lightsailMod

import typings.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachmentArgs
import typings.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachmentState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lightsail", "StaticIpAttachment")
@js.native
class StaticIpAttachment protected ()
  extends typings.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachment {
  /**
    * Create a StaticIpAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StaticIpAttachmentArgs) = this()
  def this(name: String, args: StaticIpAttachmentArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/lightsail", "StaticIpAttachment")
@js.native
object StaticIpAttachment extends js.Object {
  /**
    * Get an existing StaticIpAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachment = js.native
  def get(name: String, id: Input[ID], state: StaticIpAttachmentState): typings.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachment = js.native
  def get(name: String, id: Input[ID], state: StaticIpAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachment = js.native
  /**
    * Returns true if the given object is an instance of StaticIpAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIpAttachment.StaticIpAttachment */ Boolean = js.native
}


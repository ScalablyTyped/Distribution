package typings.atPulumiAws.shieldProtectionMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/shield/protection", "Protection")
@js.native
class Protection protected () extends CustomResource {
  /**
    * Create a Protection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProtectionArgs) = this()
  def this(name: String, args: ProtectionArgs, opts: CustomResourceOptions) = this()
  /**
    * A friendly name for the Protection you are creating.
    */
  val name: Output[String] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource to be protected.
    */
  val resourceArn: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/shield/protection", "Protection")
@js.native
object Protection extends js.Object {
  /**
    * Get an existing Protection resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Protection = js.native
  def get(name: String, id: Input[ID], state: ProtectionState): Protection = js.native
  def get(name: String, id: Input[ID], state: ProtectionState, opts: CustomResourceOptions): Protection = js.native
  /**
    * Returns true if the given object is an instance of Protection.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/shield/protection.Protection */ Boolean = js.native
}


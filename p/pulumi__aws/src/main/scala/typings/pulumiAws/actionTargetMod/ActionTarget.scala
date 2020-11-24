package typings.pulumiAws.actionTargetMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/securityhub/actionTarget", "ActionTarget")
@js.native
class ActionTarget protected () extends CustomResource {
  /**
    * Create a ActionTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ActionTargetArgs) = this()
  def this(name: String, args: ActionTargetArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of the Security Hub custom action target.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The name of the custom action target.
    */
  val description: Output_[String] = js.native
  
  /**
    * The ID for the custom action target.
    */
  val identifier: Output_[String] = js.native
  
  /**
    * The description for the custom action target.
    */
  val name: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/securityhub/actionTarget", "ActionTarget")
@js.native
object ActionTarget extends js.Object {
  
  /**
    * Get an existing ActionTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ActionTarget = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ActionTarget = js.native
  def get(name: String, id: Input[ID], state: ActionTargetState): ActionTarget = js.native
  def get(name: String, id: Input[ID], state: ActionTargetState, opts: CustomResourceOptions): ActionTarget = js.native
  
  /**
    * Returns true if the given object is an instance of ActionTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/actionTarget.ActionTarget */ Boolean = js.native
}

package typings.atPulumiAws.ssmMod

import typings.atPulumiAws.ssmActivationMod.ActivationArgs
import typings.atPulumiAws.ssmActivationMod.ActivationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm", "Activation")
@js.native
class Activation protected ()
  extends typings.atPulumiAws.ssmActivationMod.Activation {
  /**
    * Create a Activation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ActivationArgs) = this()
  def this(name: String, args: ActivationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ssm", "Activation")
@js.native
object Activation extends js.Object {
  /**
    * Get an existing Activation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmActivationMod.Activation = js.native
  def get(name: String, id: Input[ID], state: ActivationState): typings.atPulumiAws.ssmActivationMod.Activation = js.native
  def get(name: String, id: Input[ID], state: ActivationState, opts: CustomResourceOptions): typings.atPulumiAws.ssmActivationMod.Activation = js.native
  /**
    * Returns true if the given object is an instance of Activation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/activation.Activation */ Boolean = js.native
}


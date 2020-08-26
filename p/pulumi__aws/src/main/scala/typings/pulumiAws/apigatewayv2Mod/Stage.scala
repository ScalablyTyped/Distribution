package typings.pulumiAws.apigatewayv2Mod

import typings.pulumiAws.stageMod.StageArgs
import typings.pulumiAws.stageMod.StageState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigatewayv2", "Stage")
@js.native
class Stage protected ()
  extends typings.pulumiAws.stageMod.Stage {
  /**
    * Create a Stage resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StageArgs) = this()
  def this(name: String, args: StageArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigatewayv2", "Stage")
@js.native
object Stage extends js.Object {
  /**
    * Get an existing Stage resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.stageMod.Stage = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.stageMod.Stage = js.native
  def get(name: String, id: Input[ID], state: StageState): typings.pulumiAws.stageMod.Stage = js.native
  def get(name: String, id: Input[ID], state: StageState, opts: CustomResourceOptions): typings.pulumiAws.stageMod.Stage = js.native
  /**
    * Returns true if the given object is an instance of Stage.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/stage.Stage */ Boolean = js.native
}


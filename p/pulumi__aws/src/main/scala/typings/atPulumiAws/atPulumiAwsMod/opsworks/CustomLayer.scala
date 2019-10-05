package typings.atPulumiAws.atPulumiAwsMod.opsworks

import typings.atPulumiAws.opsworksCustomLayerMod.CustomLayerArgs
import typings.atPulumiAws.opsworksCustomLayerMod.CustomLayerState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "opsworks.CustomLayer")
@js.native
class CustomLayer protected ()
  extends typings.atPulumiAws.opsworksMod.CustomLayer {
  /**
    * Create a CustomLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CustomLayerArgs) = this()
  def this(name: String, args: CustomLayerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "opsworks.CustomLayer")
@js.native
object CustomLayer extends js.Object {
  /**
    * Get an existing CustomLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksCustomLayerMod.CustomLayer = js.native
  def get(name: String, id: Input[ID], state: CustomLayerState): typings.atPulumiAws.opsworksCustomLayerMod.CustomLayer = js.native
  def get(name: String, id: Input[ID], state: CustomLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksCustomLayerMod.CustomLayer = js.native
  /**
    * Returns true if the given object is an instance of CustomLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/customLayer.CustomLayer */ Boolean = js.native
}


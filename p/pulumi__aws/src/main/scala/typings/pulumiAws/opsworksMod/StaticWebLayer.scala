package typings.pulumiAws.opsworksMod

import typings.pulumiAws.staticWebLayerMod.StaticWebLayerArgs
import typings.pulumiAws.staticWebLayerMod.StaticWebLayerState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks", "StaticWebLayer")
@js.native
class StaticWebLayer protected ()
  extends typings.pulumiAws.staticWebLayerMod.StaticWebLayer {
  /**
    * Create a StaticWebLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StaticWebLayerArgs) = this()
  def this(name: String, args: StaticWebLayerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/opsworks", "StaticWebLayer")
@js.native
object StaticWebLayer extends js.Object {
  /**
    * Get an existing StaticWebLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
  def get(name: String, id: Input[ID], state: StaticWebLayerState): typings.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
  def get(name: String, id: Input[ID], state: StaticWebLayerState, opts: CustomResourceOptions): typings.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
  /**
    * Returns true if the given object is an instance of StaticWebLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/staticWebLayer.StaticWebLayer */ Boolean = js.native
}


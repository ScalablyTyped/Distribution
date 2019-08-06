package typings.atPulumiAws.sesConfgurationSetMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/confgurationSet", "ConfgurationSet")
@js.native
class ConfgurationSet protected () extends CustomResource {
  /**
    * Create a ConfgurationSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ConfgurationSetArgs) = this()
  def this(name: String, args: ConfgurationSetArgs, opts: CustomResourceOptions) = this()
  val name: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ses/confgurationSet", "ConfgurationSet")
@js.native
object ConfgurationSet extends js.Object {
  /**
    * Get an existing ConfgurationSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ConfgurationSet = js.native
  def get(name: String, id: Input[ID], state: ConfgurationSetState): ConfgurationSet = js.native
  def get(name: String, id: Input[ID], state: ConfgurationSetState, opts: CustomResourceOptions): ConfgurationSet = js.native
  /**
    * Returns true if the given object is an instance of ConfgurationSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean = js.native
}


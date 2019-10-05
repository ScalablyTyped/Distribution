package typings.atPulumiAws.atPulumiAwsMod.rds

import typings.atPulumiAws.rdsOptionGroupMod.OptionGroupArgs
import typings.atPulumiAws.rdsOptionGroupMod.OptionGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.OptionGroup")
@js.native
class OptionGroup protected ()
  extends typings.atPulumiAws.rdsMod.OptionGroup {
  /**
    * Create a OptionGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OptionGroupArgs) = this()
  def this(name: String, args: OptionGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "rds.OptionGroup")
@js.native
object OptionGroup extends js.Object {
  /**
    * Get an existing OptionGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.rdsOptionGroupMod.OptionGroup = js.native
  def get(name: String, id: Input[ID], state: OptionGroupState): typings.atPulumiAws.rdsOptionGroupMod.OptionGroup = js.native
  def get(name: String, id: Input[ID], state: OptionGroupState, opts: CustomResourceOptions): typings.atPulumiAws.rdsOptionGroupMod.OptionGroup = js.native
  /**
    * Returns true if the given object is an instance of OptionGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/optionGroup.OptionGroup */ Boolean = js.native
}


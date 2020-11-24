package typings.pulumiAws.optionGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.rds.OptionGroupOption
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds/optionGroup", "OptionGroup")
@js.native
class OptionGroup protected () extends CustomResource {
  /**
    * Create a OptionGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OptionGroupArgs) = this()
  def this(name: String, args: OptionGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the db option group.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  val engineName: Output_[String] = js.native
  
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  val majorEngineVersion: Output_[String] = js.native
  
  /**
    * The Name of the setting.
    */
  val name: Output_[String] = js.native
  
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
    */
  val namePrefix: Output_[String] = js.native
  
  /**
    * The description of the option group. Defaults to "Managed by Pulumi".
    */
  val optionGroupDescription: Output_[String] = js.native
  
  /**
    * A list of Options to apply.
    */
  val options: Output_[js.UndefOr[js.Array[OptionGroupOption]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/rds/optionGroup", "OptionGroup")
@js.native
object OptionGroup extends js.Object {
  
  /**
    * Get an existing OptionGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): OptionGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OptionGroup = js.native
  def get(name: String, id: Input[ID], state: OptionGroupState): OptionGroup = js.native
  def get(name: String, id: Input[ID], state: OptionGroupState, opts: CustomResourceOptions): OptionGroup = js.native
  
  /**
    * Returns true if the given object is an instance of OptionGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/optionGroup.OptionGroup */ Boolean = js.native
}

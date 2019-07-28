package typings.atPulumiAws.rdsOptionGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_DbSecurityGroupMemberships
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val arn: Output[String] = js.native
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  val engineName: Output[String] = js.native
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  val majorEngineVersion: Output[String] = js.native
  /**
    * The Name of the setting.
    */
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
    */
  val namePrefix: Output[String] = js.native
  val optionGroupDescription: Output[String] = js.native
  /**
    * A list of Options to apply.
    */
  val options: Output[js.UndefOr[js.Array[Anon_DbSecurityGroupMemberships]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
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
    */
  def get(name: String, id: Input[ID]): OptionGroup = js.native
  def get(name: String, id: Input[ID], state: OptionGroupState): OptionGroup = js.native
  def get(name: String, id: Input[ID], state: OptionGroupState, opts: CustomResourceOptions): OptionGroup = js.native
  /**
    * Returns true if the given object is an instance of OptionGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/optionGroup.OptionGroup */ Boolean = js.native
}


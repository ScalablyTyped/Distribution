package typings.pulumiAws.configurationTemplateMod

import typings.pulumiAws.outputMod.elasticbeanstalk.ConfigurationTemplateSetting
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk/configurationTemplate", "ConfigurationTemplate")
@js.native
class ConfigurationTemplate protected () extends CustomResource {
  /**
    * Create a ConfigurationTemplate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ConfigurationTemplateArgs) = this()
  def this(name: String, args: ConfigurationTemplateArgs, opts: CustomResourceOptions) = this()
  /**
    * name of the application to associate with this configuration template
    */
  val application: Output_[String] = js.native
  /**
    * Short description of the Template
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The ID of the environment used with this configuration template
    */
  val environmentId: Output_[js.UndefOr[String]] = js.native
  /**
    * A unique name for this Template.
    */
  val name: Output_[String] = js.native
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: Output_[js.Array[ConfigurationTemplateSetting]] = js.native
  /**
    * A solution stack to base your Template
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticbeanstalk/configurationTemplate", "ConfigurationTemplate")
@js.native
object ConfigurationTemplate extends js.Object {
  /**
    * Get an existing ConfigurationTemplate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ConfigurationTemplate = js.native
  def get(name: String, id: Input[ID], state: ConfigurationTemplateState): ConfigurationTemplate = js.native
  def get(name: String, id: Input[ID], state: ConfigurationTemplateState, opts: CustomResourceOptions): ConfigurationTemplate = js.native
  /**
    * Returns true if the given object is an instance of ConfigurationTemplate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/configurationTemplate.ConfigurationTemplate */ Boolean = js.native
}


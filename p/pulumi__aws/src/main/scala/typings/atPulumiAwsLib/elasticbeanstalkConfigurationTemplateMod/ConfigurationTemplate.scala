package typings
package atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk/configurationTemplate", "ConfigurationTemplate")
@js.native
class ConfigurationTemplate protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a ConfigurationTemplate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ConfigurationTemplateArgs) = this()
  def this(name: java.lang.String, args: ConfigurationTemplateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * name of the application to associate with this configuration template
    */
  val application: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Short description of the Template
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID of the environment used with this configuration template
    */
  val environmentId: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A unique name for this Template.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiAwsLib.Anon_NamespaceResourceValue]] = js.native
  /**
    * A solution stack to base your Template
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateState
  ): atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
}


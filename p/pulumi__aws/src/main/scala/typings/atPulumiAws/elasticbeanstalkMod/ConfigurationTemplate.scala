package typings.atPulumiAws.elasticbeanstalkMod

import typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateArgs
import typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk", "ConfigurationTemplate")
@js.native
class ConfigurationTemplate protected ()
  extends typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate {
  /**
    * Create a ConfigurationTemplate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ConfigurationTemplateArgs) = this()
  def this(name: String, args: ConfigurationTemplateArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elasticbeanstalk", "ConfigurationTemplate")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
  def get(name: String, id: Input[ID], state: ConfigurationTemplateState): typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
  def get(name: String, id: Input[ID], state: ConfigurationTemplateState, opts: CustomResourceOptions): typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
  /**
    * Returns true if the given object is an instance of ConfigurationTemplate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/configurationTemplate.ConfigurationTemplate */ Boolean = js.native
}


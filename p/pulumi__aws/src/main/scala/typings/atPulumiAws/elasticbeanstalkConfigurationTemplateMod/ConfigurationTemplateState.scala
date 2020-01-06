package typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod

import typings.atPulumiAws.typesInputMod.elasticbeanstalk.ConfigurationTemplateSetting
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationTemplateState extends js.Object {
  /**
    * name of the application to associate with this configuration template
    */
  val application: js.UndefOr[Input[String]] = js.native
  /**
    * Short description of the Template
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the environment used with this configuration template
    */
  val environmentId: js.UndefOr[Input[String]] = js.native
  /**
    * A unique name for this Template.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: js.UndefOr[Input[js.Array[Input[ConfigurationTemplateSetting]]]] = js.native
  /**
    * A solution stack to base your Template
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: js.UndefOr[Input[String]] = js.native
}

object ConfigurationTemplateState {
  @scala.inline
  def apply(
    application: Input[String] = null,
    description: Input[String] = null,
    environmentId: Input[String] = null,
    name: Input[String] = null,
    settings: Input[js.Array[Input[ConfigurationTemplateSetting]]] = null,
    solutionStackName: Input[String] = null
  ): ConfigurationTemplateState = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (solutionStackName != null) __obj.updateDynamic("solutionStackName")(solutionStackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationTemplateState]
  }
}


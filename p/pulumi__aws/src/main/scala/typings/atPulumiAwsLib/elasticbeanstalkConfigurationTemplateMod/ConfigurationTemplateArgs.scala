package typings
package atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationTemplateArgs extends js.Object {
  /**
    * name of the application to associate with this configuration template
    */
  val application: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Short description of the Template
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the environment used with this configuration template
    */
  val environmentId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A unique name for this Template.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameNamespaceResource]]
    ]
  ] = js.undefined
  /**
    * A solution stack to base your Template
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ConfigurationTemplateArgs {
  @scala.inline
  def apply(
    application: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    environmentId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    settings: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameNamespaceResource]]
    ] = null,
    solutionStackName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ConfigurationTemplateArgs = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (solutionStackName != null) __obj.updateDynamic("solutionStackName")(solutionStackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationTemplateArgs]
  }
}


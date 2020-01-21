package typings.pulumiAws.inputMod.batch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentComputeResourcesLaunchTemplate extends js.Object {
  /**
    * ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
    */
  var launchTemplateId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[Input[String]] = js.native
  /**
    * The version number of the launch template. Default: The default version of the launch template.
    */
  var version: js.UndefOr[Input[String]] = js.native
}

object ComputeEnvironmentComputeResourcesLaunchTemplate {
  @scala.inline
  def apply(
    launchTemplateId: Input[String] = null,
    launchTemplateName: Input[String] = null,
    version: Input[String] = null
  ): ComputeEnvironmentComputeResourcesLaunchTemplate = {
    val __obj = js.Dynamic.literal()
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId.asInstanceOf[js.Any])
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentComputeResourcesLaunchTemplate]
  }
}


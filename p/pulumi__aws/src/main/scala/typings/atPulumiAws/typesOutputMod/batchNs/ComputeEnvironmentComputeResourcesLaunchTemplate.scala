package typings.atPulumiAws.typesOutputMod.batchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeEnvironmentComputeResourcesLaunchTemplate extends js.Object {
  /**
    * ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
    */
  var launchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[String] = js.undefined
  /**
    * The version number of the launch template. Default: The default version of the launch template.
    */
  var version: js.UndefOr[String] = js.undefined
}

object ComputeEnvironmentComputeResourcesLaunchTemplate {
  @scala.inline
  def apply(launchTemplateId: String = null, launchTemplateName: String = null, version: String = null): ComputeEnvironmentComputeResourcesLaunchTemplate = {
    val __obj = js.Dynamic.literal()
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId)
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ComputeEnvironmentComputeResourcesLaunchTemplate]
  }
}


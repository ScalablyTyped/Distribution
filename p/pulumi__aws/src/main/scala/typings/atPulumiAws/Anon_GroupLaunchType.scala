package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupLaunchType extends js.Object {
  var group: js.UndefOr[Input[String]] = js.undefined
  var launchType: js.UndefOr[Input[String]] = js.undefined
  var networkConfiguration: js.UndefOr[Input[Anon_AssignPublicIpSecurityGroups]] = js.undefined
  var platformVersion: js.UndefOr[Input[String]] = js.undefined
  var taskCount: js.UndefOr[Input[Double]] = js.undefined
  var taskDefinitionArn: Input[String]
}

object Anon_GroupLaunchType {
  @scala.inline
  def apply(
    taskDefinitionArn: Input[String],
    group: Input[String] = null,
    launchType: Input[String] = null,
    networkConfiguration: Input[Anon_AssignPublicIpSecurityGroups] = null,
    platformVersion: Input[String] = null,
    taskCount: Input[Double] = null
  ): Anon_GroupLaunchType = {
    val __obj = js.Dynamic.literal(taskDefinitionArn = taskDefinitionArn.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (taskCount != null) __obj.updateDynamic("taskCount")(taskCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupLaunchType]
  }
}


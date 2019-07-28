package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Group extends js.Object {
  var group: js.UndefOr[String] = js.undefined
  var launchType: js.UndefOr[String] = js.undefined
  var networkConfiguration: js.UndefOr[Anon_AssignPublicIp] = js.undefined
  var platformVersion: js.UndefOr[String] = js.undefined
  var taskCount: js.UndefOr[Double] = js.undefined
  var taskDefinitionArn: String
}

object Anon_Group {
  @scala.inline
  def apply(
    taskDefinitionArn: String,
    group: String = null,
    launchType: String = null,
    networkConfiguration: Anon_AssignPublicIp = null,
    platformVersion: String = null,
    taskCount: Int | Double = null
  ): Anon_Group = {
    val __obj = js.Dynamic.literal(taskDefinitionArn = taskDefinitionArn)
    if (group != null) __obj.updateDynamic("group")(group)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType)
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (taskCount != null) __obj.updateDynamic("taskCount")(taskCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Group]
  }
}


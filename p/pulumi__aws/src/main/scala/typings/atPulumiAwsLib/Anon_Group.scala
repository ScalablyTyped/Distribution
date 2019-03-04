package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Group extends js.Object {
  var group: js.UndefOr[java.lang.String] = js.undefined
  var launchType: js.UndefOr[java.lang.String] = js.undefined
  var networkConfiguration: js.UndefOr[Anon_AssignPublicIp] = js.undefined
  var platformVersion: js.UndefOr[java.lang.String] = js.undefined
  var taskCount: js.UndefOr[scala.Double] = js.undefined
  var taskDefinitionArn: java.lang.String
}

object Anon_Group {
  @scala.inline
  def apply(
    taskDefinitionArn: java.lang.String,
    group: java.lang.String = null,
    launchType: java.lang.String = null,
    networkConfiguration: Anon_AssignPublicIp = null,
    platformVersion: java.lang.String = null,
    taskCount: scala.Int | scala.Double = null
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


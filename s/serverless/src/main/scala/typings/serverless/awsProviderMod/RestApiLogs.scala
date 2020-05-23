package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestApiLogs extends js.Object {
  var accessLogging: js.UndefOr[Boolean] = js.undefined
  var executionLogging: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var fullExecutionData: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var roleManagedExternally: js.UndefOr[Boolean] = js.undefined
}

object RestApiLogs {
  @scala.inline
  def apply(
    accessLogging: js.UndefOr[Boolean] = js.undefined,
    executionLogging: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    fullExecutionData: js.UndefOr[Boolean] = js.undefined,
    level: String = null,
    role: String = null,
    roleManagedExternally: js.UndefOr[Boolean] = js.undefined
  ): RestApiLogs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessLogging)) __obj.updateDynamic("accessLogging")(accessLogging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(executionLogging)) __obj.updateDynamic("executionLogging")(executionLogging.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(fullExecutionData)) __obj.updateDynamic("fullExecutionData")(fullExecutionData.get.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(roleManagedExternally)) __obj.updateDynamic("roleManagedExternally")(roleManagedExternally.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestApiLogs]
  }
}


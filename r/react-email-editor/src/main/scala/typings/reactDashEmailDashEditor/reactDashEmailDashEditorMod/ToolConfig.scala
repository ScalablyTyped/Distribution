package typings.reactDashEmailDashEditor.reactDashEmailDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolConfig extends js.Object {
  val data: js.UndefOr[StringList] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val position: js.UndefOr[Double] = js.undefined
}

object ToolConfig {
  @scala.inline
  def apply(
    data: StringList = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    position: Int | Double = null
  ): ToolConfig = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolConfig]
  }
}


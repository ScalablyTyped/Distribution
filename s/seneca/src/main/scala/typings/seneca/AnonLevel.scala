package typings.seneca

import typings.seneca.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: js.UndefOr[LogLevel] = js.undefined
  var short: js.UndefOr[Boolean] = js.undefined
}

object AnonLevel {
  @scala.inline
  def apply(level: LogLevel = null, short: js.UndefOr[Boolean] = js.undefined): AnonLevel = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(short)) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
}


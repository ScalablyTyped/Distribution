package typings.seneca

import typings.seneca.senecaMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: js.UndefOr[LogLevel] = js.undefined
  var short: js.UndefOr[Boolean] = js.undefined
}

object Anon_Level {
  @scala.inline
  def apply(level: LogLevel = null, short: js.UndefOr[Boolean] = js.undefined): Anon_Level = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level)
    if (!js.isUndefined(short)) __obj.updateDynamic("short")(short)
    __obj.asInstanceOf[Anon_Level]
  }
}


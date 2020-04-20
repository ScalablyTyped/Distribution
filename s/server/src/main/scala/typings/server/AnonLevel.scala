package typings.server

import typings.server.commonMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: LogLevel
  def report(content: String, `type`: LogLevel): Unit
}

object AnonLevel {
  @scala.inline
  def apply(level: LogLevel, report: (String, LogLevel) => Unit): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], report = js.Any.fromFunction2(report))
    __obj.asInstanceOf[AnonLevel]
  }
}


package typings.server.anon

import typings.server.commonMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var level: LogLevel
  def report(content: String, `type`: LogLevel): Unit
}

object Level {
  @scala.inline
  def apply(level: LogLevel, report: (String, LogLevel) => Unit): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], report = js.Any.fromFunction2(report))
    __obj.asInstanceOf[Level]
  }
}


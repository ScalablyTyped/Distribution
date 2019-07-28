package typings.server

import typings.server.typingsCommonMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var level: LogLevel
  def report(content: String, `type`: LogLevel): Unit
}

object Anon_Content {
  @scala.inline
  def apply(level: LogLevel, report: (String, LogLevel) => Unit): Anon_Content = {
    val __obj = js.Dynamic.literal(level = level, report = js.Any.fromFunction2(report))
  
    __obj.asInstanceOf[Anon_Content]
  }
}


package typings.server.anon

import typings.server.commonMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  var level: LogLevel = js.native
  def report(content: String, `type`: LogLevel): Unit = js.native
}

object Level {
  @scala.inline
  def apply(level: LogLevel, report: (String, LogLevel) => Unit): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], report = js.Any.fromFunction2(report))
    __obj.asInstanceOf[Level]
  }
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport(value: (String, LogLevel) => Unit): Self = this.set("report", js.Any.fromFunction2(value))
  }
  
}


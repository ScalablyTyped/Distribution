package typings
package serverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var level: serverLib.typingsCommonMod.LogLevel
  def report(content: java.lang.String, `type`: serverLib.typingsCommonMod.LogLevel): scala.Unit
}

object Anon_Content {
  @scala.inline
  def apply(
    level: serverLib.typingsCommonMod.LogLevel,
    report: js.Function2[java.lang.String, serverLib.typingsCommonMod.LogLevel, scala.Unit]
  ): Anon_Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("report")(report)
    __obj.asInstanceOf[Anon_Content]
  }
}


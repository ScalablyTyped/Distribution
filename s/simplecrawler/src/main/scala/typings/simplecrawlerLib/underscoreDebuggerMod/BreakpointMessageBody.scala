package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakpointMessageBody extends js.Object {
  var line: scala.Double
  var target: scala.Double
  var `type`: java.lang.String
}

object BreakpointMessageBody {
  @scala.inline
  def apply(line: scala.Double, target: scala.Double, `type`: java.lang.String): BreakpointMessageBody = {
    val __obj = js.Dynamic.literal(line = line, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BreakpointMessageBody]
  }
}


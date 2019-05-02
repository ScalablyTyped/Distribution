package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoint extends js.Object {
  var condition: js.UndefOr[java.lang.String] = js.undefined
  var id: scala.Double
  var line: scala.Double
  var script: ScriptDesc
  var scriptId: scala.Double
  var scriptReq: js.UndefOr[java.lang.String] = js.undefined
}

object Breakpoint {
  @scala.inline
  def apply(
    id: scala.Double,
    line: scala.Double,
    script: ScriptDesc,
    scriptId: scala.Double,
    condition: java.lang.String = null,
    scriptReq: java.lang.String = null
  ): Breakpoint = {
    val __obj = js.Dynamic.literal(id = id, line = line, script = script, scriptId = scriptId)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (scriptReq != null) __obj.updateDynamic("scriptReq")(scriptReq)
    __obj.asInstanceOf[Breakpoint]
  }
}


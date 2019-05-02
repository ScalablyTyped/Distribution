package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakResponse extends js.Object {
  var exception: js.UndefOr[ExceptionInfo] = js.undefined
  var script: js.UndefOr[ScriptDesc] = js.undefined
  var sourceColumn: scala.Double
  var sourceLine: scala.Double
  var sourceLineText: java.lang.String
}

object BreakResponse {
  @scala.inline
  def apply(
    sourceColumn: scala.Double,
    sourceLine: scala.Double,
    sourceLineText: java.lang.String,
    exception: ExceptionInfo = null,
    script: ScriptDesc = null
  ): BreakResponse = {
    val __obj = js.Dynamic.literal(sourceColumn = sourceColumn, sourceLine = sourceLine, sourceLineText = sourceLineText)
    if (exception != null) __obj.updateDynamic("exception")(exception)
    if (script != null) __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[BreakResponse]
  }
}


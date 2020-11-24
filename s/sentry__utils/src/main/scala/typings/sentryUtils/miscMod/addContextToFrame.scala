package typings.sentryUtils.miscMod

import typings.sentryTypes.stackframeMod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils/dist/misc", "addContextToFrame")
@js.native
object addContextToFrame extends js.Object {
  
  def apply(lines: js.Array[String], frame: StackFrame): Unit = js.native
  def apply(lines: js.Array[String], frame: StackFrame, linesOfContext: Double): Unit = js.native
}

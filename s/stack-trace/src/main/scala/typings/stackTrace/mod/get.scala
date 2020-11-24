package typings.stackTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stack-trace", "get")
@js.native
object get extends js.Object {
  
  def apply(): js.Array[StackFrame] = js.native
  def apply(belowFn: js.Function0[Unit]): js.Array[StackFrame] = js.native
}

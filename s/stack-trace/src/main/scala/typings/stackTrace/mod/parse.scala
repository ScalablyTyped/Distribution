package typings.stackTrace.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stack-trace", "parse")
@js.native
object parse extends js.Object {
  
  def apply(err: Error): js.Array[StackFrame] = js.native
}

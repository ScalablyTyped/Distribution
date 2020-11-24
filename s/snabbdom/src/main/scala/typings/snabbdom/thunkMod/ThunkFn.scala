package typings.snabbdom.thunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThunkFn extends js.Object {
  
  def apply(sel: String, fn: js.Function, args: js.Array[_]): Thunk_ = js.native
  def apply(sel: String, key: js.Any, fn: js.Function, args: js.Array[_]): Thunk_ = js.native
}

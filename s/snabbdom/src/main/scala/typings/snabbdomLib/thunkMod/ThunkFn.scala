package typings
package snabbdomLib.thunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThunkFn extends js.Object {
  def apply(sel: java.lang.String, fn: js.Function, args: js.Array[_]): Thunk = js.native
  def apply(sel: java.lang.String, key: js.Any, fn: js.Function, args: js.Array[_]): Thunk = js.native
}


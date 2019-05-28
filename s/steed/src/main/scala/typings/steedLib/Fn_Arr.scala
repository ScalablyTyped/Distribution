package typings
package steedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Arr extends js.Object {
  def apply[T, E](arr: js.Array[T], iterator: steedLib.steedMod.SteedIterator[T, E]): scala.Unit = js.native
  def apply[T, E](
    arr: js.Array[T],
    iterator: steedLib.steedMod.SteedIterator[T, E],
    callback: steedLib.steedMod.ErrorCallback[E]
  ): scala.Unit = js.native
  def apply[T, E](arr: steedLib.steedMod.Dictionary[T], iterator: steedLib.steedMod.SteedIterator[T, E]): scala.Unit = js.native
  def apply[T, E](
    arr: steedLib.steedMod.Dictionary[T],
    iterator: steedLib.steedMod.SteedIterator[T, E],
    callback: steedLib.steedMod.ErrorCallback[E]
  ): scala.Unit = js.native
}


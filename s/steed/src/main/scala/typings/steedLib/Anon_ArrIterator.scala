package typings
package steedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrIterator extends js.Object {
  def apply[T, E](arr: js.Array[T], iterator: steedLib.steedMod.steedNs.SteedIterator[T, E]): scala.Unit = js.native
  def apply[T, E](
    arr: js.Array[T],
    iterator: steedLib.steedMod.steedNs.SteedIterator[T, E],
    callback: steedLib.steedMod.steedNs.ErrorCallback[E]
  ): scala.Unit = js.native
  def apply[T, E](
    arr: steedLib.steedMod.steedNs.Dictionary[T],
    iterator: steedLib.steedMod.steedNs.SteedIterator[T, E]
  ): scala.Unit = js.native
  def apply[T, E](
    arr: steedLib.steedMod.steedNs.Dictionary[T],
    iterator: steedLib.steedMod.steedNs.SteedIterator[T, E],
    callback: steedLib.steedMod.steedNs.ErrorCallback[E]
  ): scala.Unit = js.native
}


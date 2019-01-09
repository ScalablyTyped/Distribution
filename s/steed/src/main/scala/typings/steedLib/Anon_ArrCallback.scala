package typings
package steedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrCallback extends js.Object {
  def apply[T, R, E](arr: js.Array[T], iterator: steedLib.steedMod.steedNs.SteedResultIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    iterator: steedLib.steedMod.steedNs.SteedResultIterator[T, R, E],
    callback: steedLib.steedMod.steedNs.SteedResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](
    arr: steedLib.steedMod.steedNs.Dictionary[T],
    iterator: steedLib.steedMod.steedNs.SteedResultIterator[T, R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](
    arr: steedLib.steedMod.steedNs.Dictionary[T],
    iterator: steedLib.steedMod.steedNs.SteedResultIterator[T, R, E],
    callback: steedLib.steedMod.steedNs.SteedResultArrayCallback[R, E]
  ): scala.Unit = js.native
}


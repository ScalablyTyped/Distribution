package typings.steed

import typings.steed.steedMod.Dictionary
import typings.steed.steedMod.SteedResultArrayCallback
import typings.steed.steedMod.SteedResultIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ArrCallback extends js.Object {
  def apply[T, R, E](arr: js.Array[T], iterator: SteedResultIterator[T, R, E]): Unit = js.native
  def apply[T, R, E](arr: js.Array[T], iterator: SteedResultIterator[T, R, E], callback: SteedResultArrayCallback[R, E]): Unit = js.native
  def apply[T, R, E](arr: Dictionary[T], iterator: SteedResultIterator[T, R, E]): Unit = js.native
  def apply[T, R, E](
    arr: Dictionary[T],
    iterator: SteedResultIterator[T, R, E],
    callback: SteedResultArrayCallback[R, E]
  ): Unit = js.native
}


package typings.steed

import typings.steed.steedMod.Dictionary
import typings.steed.steedMod.ErrorCallback
import typings.steed.steedMod.SteedIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Arr extends js.Object {
  def apply[T, E](arr: js.Array[T], iterator: SteedIterator[T, E]): Unit = js.native
  def apply[T, E](arr: js.Array[T], iterator: SteedIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def apply[T, E](arr: Dictionary[T], iterator: SteedIterator[T, E]): Unit = js.native
  def apply[T, E](arr: Dictionary[T], iterator: SteedIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
}


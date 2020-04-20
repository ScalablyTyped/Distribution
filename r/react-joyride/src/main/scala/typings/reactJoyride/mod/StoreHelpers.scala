package typings.reactJoyride.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreHelpers extends js.Object {
  def close(): Unit
  def go(nextIndex: Double): Unit
  def info(): StoreState
  def next(): Unit
  def open(): Unit
  def prev(): Unit
  def reset(restart: Boolean): Unit
  def skip(): Unit
}

object StoreHelpers {
  @scala.inline
  def apply(
    close: () => Unit,
    go: Double => Unit,
    info: () => StoreState,
    next: () => Unit,
    open: () => Unit,
    prev: () => Unit,
    reset: Boolean => Unit,
    skip: () => Unit
  ): StoreHelpers = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), go = js.Any.fromFunction1(go), info = js.Any.fromFunction0(info), next = js.Any.fromFunction0(next), open = js.Any.fromFunction0(open), prev = js.Any.fromFunction0(prev), reset = js.Any.fromFunction1(reset), skip = js.Any.fromFunction0(skip))
    __obj.asInstanceOf[StoreHelpers]
  }
}


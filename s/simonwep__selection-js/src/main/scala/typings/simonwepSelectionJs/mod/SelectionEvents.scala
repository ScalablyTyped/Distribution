package typings.simonwepSelectionJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionEvents extends js.Object {
  def beforestart(e: SelectionEvent): Boolean
  def move(e: SelectionEvent): Unit
  def start(e: SelectionEvent): Unit
  def stop(e: SelectionEvent): Unit
}

object SelectionEvents {
  @scala.inline
  def apply(
    beforestart: SelectionEvent => Boolean,
    move: SelectionEvent => Unit,
    start: SelectionEvent => Unit,
    stop: SelectionEvent => Unit
  ): SelectionEvents = {
    val __obj = js.Dynamic.literal(beforestart = js.Any.fromFunction1(beforestart), move = js.Any.fromFunction1(move), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[SelectionEvents]
  }
}


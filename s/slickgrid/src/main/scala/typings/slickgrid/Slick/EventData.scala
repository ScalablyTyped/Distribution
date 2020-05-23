package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  /***
    * Returns whether stopImmediatePropagation was called on this event object.\
    * @method isImmediatePropagationStopped
    * @return {Boolean}
    */
  def isImmediatePropagationStopped(): Boolean
  /***
    * Returns whether stopPropagation was called on this event object.
    * @method isPropagationStopped
    * @return {Boolean}
    */
  def isPropagationStopped(): Boolean
  /***
    * Prevents the rest of the handlers from being executed.
    * @method stopImmediatePropagation
    */
  def stopImmediatePropagation(): Unit
  /***
    * Stops event from propagating up the DOM tree.
    * @method stopPropagation
    */
  def stopPropagation(): Unit
}

object EventData {
  @scala.inline
  def apply(
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit
  ): EventData = {
    val __obj = js.Dynamic.literal(isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[EventData]
  }
}


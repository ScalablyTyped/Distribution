package typings.slickgrid.global.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.EventData")
@js.native
class EventData ()
  extends typings.slickgrid.Slick.EventData {
  /***
    * Returns whether stopImmediatePropagation was called on this event object.\
    * @method isImmediatePropagationStopped
    * @return {Boolean}
    */
  /* CompleteClass */
  override def isImmediatePropagationStopped(): Boolean = js.native
  /***
    * Returns whether stopPropagation was called on this event object.
    * @method isPropagationStopped
    * @return {Boolean}
    */
  /* CompleteClass */
  override def isPropagationStopped(): Boolean = js.native
  /***
    * Prevents the rest of the handlers from being executed.
    * @method stopImmediatePropagation
    */
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /***
    * Stops event from propagating up the DOM tree.
    * @method stopPropagation
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}


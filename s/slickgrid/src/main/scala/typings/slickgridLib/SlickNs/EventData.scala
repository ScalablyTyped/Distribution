package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.EventData")
@js.native
class EventData () extends js.Object {
  /***
  		* Returns whether stopImmediatePropagation was called on this event object.\
  		* @method isImmediatePropagationStopped
  		* @return {Boolean}
  		*/
  def isImmediatePropagationStopped(): scala.Boolean = js.native
  /***
  		* Returns whether stopPropagation was called on this event object.
  		* @method isPropagationStopped
  		* @return {Boolean}
  		*/
  def isPropagationStopped(): scala.Boolean = js.native
  /***
  		* Prevents the rest of the handlers from being executed.
  		* @method stopImmediatePropagation
  		*/
  def stopImmediatePropagation(): scala.Unit = js.native
  /***
  		* Stops event from propagating up the DOM tree.
  		* @method stopPropagation
  		*/
  def stopPropagation(): scala.Unit = js.native
}


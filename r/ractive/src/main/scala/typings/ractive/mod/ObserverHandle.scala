package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverHandle extends js.Object {
  /**
  	 * Removes the listener or observer.j
  	 */
  def cancel(): Unit
  /**
  	 * @returns true if the callback is not going to be called
  	 */
  def isSilenced(): Boolean
  /**
  	 * Resume calling the callback with changes or events.
  	 */
  def resume(): Unit
  /**
  	 * Stops further firings of the callback. Any related observers will still stay up-to-date, so the old value will be updated as the data changes.
  	 */
  def silence(): Unit
}

object ObserverHandle {
  @scala.inline
  def apply(cancel: () => Unit, isSilenced: () => Boolean, resume: () => Unit, silence: () => Unit): ObserverHandle = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), isSilenced = js.Any.fromFunction0(isSilenced), resume = js.Any.fromFunction0(resume), silence = js.Any.fromFunction0(silence))
  
    __obj.asInstanceOf[ObserverHandle]
  }
}


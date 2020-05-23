package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PopStateEvent is an event handler for the popstate event on the window. */
@js.native
trait PopStateEvent extends Event {
  /**
    * Returns a copy of the information that was provided to pushState() or replaceState().
    */
  val state: js.Any = js.native
}


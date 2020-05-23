package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that fire when the fragment identifier of the URL has changed. */
@js.native
trait HashChangeEvent extends Event {
  /**
    * Returns the URL of the session history entry that is now current.
    */
  val newURL: java.lang.String = js.native
  /**
    * Returns the URL of the session history entry that was previously current.
    */
  val oldURL: java.lang.String = js.native
}


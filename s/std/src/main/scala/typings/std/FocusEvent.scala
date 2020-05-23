package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Focus-related events like focus, blur, focusin, or focusout. */
@js.native
trait FocusEvent extends UIEvent {
  val relatedTarget: EventTarget | Null = js.native
}


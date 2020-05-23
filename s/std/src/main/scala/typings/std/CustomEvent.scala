package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEvent[T] extends Event {
  /**
    * Returns any custom data event was created with. Typically used for synthetic events.
    */
  val detail: T = js.native
  def initCustomEvent(typeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean, detailArg: T): Unit = js.native
}


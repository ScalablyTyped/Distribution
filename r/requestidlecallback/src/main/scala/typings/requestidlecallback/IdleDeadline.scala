package typings.requestidlecallback

import typings.std.DOMHighResTimeStamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleDeadline extends js.Object {
  val didTimeout: Boolean
  def timeRemaining(): DOMHighResTimeStamp
}

object IdleDeadline {
  @scala.inline
  def apply(didTimeout: Boolean, timeRemaining: () => DOMHighResTimeStamp): IdleDeadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout, timeRemaining = js.Any.fromFunction0(timeRemaining))
  
    __obj.asInstanceOf[IdleDeadline]
  }
}


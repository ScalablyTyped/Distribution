package typings.soundjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventObj extends js.Object {
  def handleEvent(eventObj: js.Object): Boolean
}

object AnonEventObj {
  @scala.inline
  def apply(handleEvent: js.Object => Boolean): AnonEventObj = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[AnonEventObj]
  }
}


package typings.storybookApi

import typings.storybookApi.shortcutsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddEventListener extends js.Object {
  var tagName: String
  def addEventListener(): Unit
  def dispatchEvent(event: Event): Boolean
  def getAttribute(attr: String): String | Null
  def removeEventListener(): Boolean
}

object AnonAddEventListener {
  @scala.inline
  def apply(
    addEventListener: () => Unit,
    dispatchEvent: Event => Boolean,
    getAttribute: String => String | Null,
    removeEventListener: () => Boolean,
    tagName: String
  ): AnonAddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction0(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), getAttribute = js.Any.fromFunction1(getAttribute), removeEventListener = js.Any.fromFunction0(removeEventListener), tagName = tagName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddEventListener]
  }
}


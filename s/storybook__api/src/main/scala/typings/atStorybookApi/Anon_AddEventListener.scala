package typings.atStorybookApi

import typings.atStorybookApi.distModulesShortcutsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListener extends js.Object {
  var tagName: String
  def addEventListener(): Unit
  def dispatchEvent(event: Event): Boolean
  def getAttribute(attr: String): String | Null
  def removeEventListener(): Boolean
}

object Anon_AddEventListener {
  @scala.inline
  def apply(
    addEventListener: () => Unit,
    dispatchEvent: Event => Boolean,
    getAttribute: String => String | Null,
    removeEventListener: () => Boolean,
    tagName: String
  ): Anon_AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction0(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), getAttribute = js.Any.fromFunction1(getAttribute), removeEventListener = js.Any.fromFunction0(removeEventListener), tagName = tagName)
  
    __obj.asInstanceOf[Anon_AddEventListener]
  }
}


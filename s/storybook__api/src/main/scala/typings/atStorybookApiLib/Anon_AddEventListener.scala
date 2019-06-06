package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListener extends js.Object {
  var tagName: java.lang.String
  def addEventListener(): scala.Unit
  def dispatchEvent(event: atStorybookApiLib.distModulesShortcutsMod.Event): scala.Boolean
  def getAttribute(attr: java.lang.String): java.lang.String | scala.Null
  def removeEventListener(): scala.Boolean
}

object Anon_AddEventListener {
  @scala.inline
  def apply(
    addEventListener: () => scala.Unit,
    dispatchEvent: atStorybookApiLib.distModulesShortcutsMod.Event => scala.Boolean,
    getAttribute: java.lang.String => java.lang.String | scala.Null,
    removeEventListener: () => scala.Boolean,
    tagName: java.lang.String
  ): Anon_AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction0(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), getAttribute = js.Any.fromFunction1(getAttribute), removeEventListener = js.Any.fromFunction0(removeEventListener), tagName = tagName)
  
    __obj.asInstanceOf[Anon_AddEventListener]
  }
}


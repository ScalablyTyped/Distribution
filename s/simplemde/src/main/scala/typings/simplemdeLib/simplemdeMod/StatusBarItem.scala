package typings
package simplemdeLib.simplemdeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarItem extends js.Object {
  var className: java.lang.String
  def defaultValue(element: stdLib.HTMLElement): scala.Unit
  def onUpdate(element: stdLib.HTMLElement): scala.Unit
}

object StatusBarItem {
  @scala.inline
  def apply(
    className: java.lang.String,
    defaultValue: stdLib.HTMLElement => scala.Unit,
    onUpdate: stdLib.HTMLElement => scala.Unit
  ): StatusBarItem = {
    val __obj = js.Dynamic.literal(className = className, defaultValue = js.Any.fromFunction1(defaultValue), onUpdate = js.Any.fromFunction1(onUpdate))
  
    __obj.asInstanceOf[StatusBarItem]
  }
}


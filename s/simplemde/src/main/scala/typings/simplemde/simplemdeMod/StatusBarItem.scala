package typings.simplemde.simplemdeMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarItem extends js.Object {
  var className: String
  def defaultValue(element: HTMLElement): Unit
  def onUpdate(element: HTMLElement): Unit
}

object StatusBarItem {
  @scala.inline
  def apply(className: String, defaultValue: HTMLElement => Unit, onUpdate: HTMLElement => Unit): StatusBarItem = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultValue = js.Any.fromFunction1(defaultValue), onUpdate = js.Any.fromFunction1(onUpdate))
  
    __obj.asInstanceOf[StatusBarItem]
  }
}


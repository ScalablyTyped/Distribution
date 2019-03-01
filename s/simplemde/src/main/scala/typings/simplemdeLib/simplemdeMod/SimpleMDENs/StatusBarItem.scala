package typings
package simplemdeLib.simplemdeMod.SimpleMDENs

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
    defaultValue: js.Function1[stdLib.HTMLElement, scala.Unit],
    onUpdate: js.Function1[stdLib.HTMLElement, scala.Unit]
  ): StatusBarItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.asInstanceOf[StatusBarItem]
  }
}


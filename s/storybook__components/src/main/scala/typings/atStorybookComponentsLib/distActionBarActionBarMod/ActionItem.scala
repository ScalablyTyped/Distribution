package typings
package atStorybookComponentsLib.distActionBarActionBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionItem extends js.Object {
  var title: java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  def onClick(e: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent]): scala.Unit
}

object ActionItem {
  @scala.inline
  def apply(
    onClick: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent] => scala.Unit,
    title: java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  ): ActionItem = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionItem]
  }
}


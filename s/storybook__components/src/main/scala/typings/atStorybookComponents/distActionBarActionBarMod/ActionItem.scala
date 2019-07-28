package typings.atStorybookComponents.distActionBarActionBarMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionItem extends js.Object {
  var title: String | Element
  def onClick(e: MouseEvent[HTMLButtonElement, typings.std.MouseEvent]): Unit
}

object ActionItem {
  @scala.inline
  def apply(onClick: MouseEvent[HTMLButtonElement, typings.std.MouseEvent] => Unit, title: String | Element): ActionItem = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionItem]
  }
}


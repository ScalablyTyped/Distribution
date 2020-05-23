package typings.reactOnsenui.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbarRenderTab extends js.Object {
  var content: Element
  var tab: Element
}

object TabbarRenderTab {
  @scala.inline
  def apply(content: Element, tab: Element): TabbarRenderTab = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbarRenderTab]
  }
}


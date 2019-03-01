package typings
package reactDashOnsenuiLib.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbarRenderTab extends js.Object {
  var content: reactLib.reactMod.Global.JSXNs.Element
  var tab: reactLib.reactMod.Global.JSXNs.Element
}

object TabbarRenderTab {
  @scala.inline
  def apply(content: reactLib.reactMod.Global.JSXNs.Element, tab: reactLib.reactMod.Global.JSXNs.Element): TabbarRenderTab = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("tab")(tab)
    __obj.asInstanceOf[TabbarRenderTab]
  }
}


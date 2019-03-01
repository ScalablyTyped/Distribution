package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRenderItemInfo[ItemT] extends js.Object {
  var index: scala.Double
  var item: ItemT
  var separators: reactDashNativeLib.Anon_Highlight
}

object ListRenderItemInfo {
  @scala.inline
  def apply[ItemT](index: scala.Double, item: ItemT, separators: reactDashNativeLib.Anon_Highlight): ListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.updateDynamic("separators")(separators)
    __obj.asInstanceOf[ListRenderItemInfo[ItemT]]
  }
}


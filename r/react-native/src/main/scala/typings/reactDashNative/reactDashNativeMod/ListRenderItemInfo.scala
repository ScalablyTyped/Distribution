package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.Anon_Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRenderItemInfo[ItemT] extends js.Object {
  var index: Double
  var item: ItemT
  var separators: Anon_Highlight
}

object ListRenderItemInfo {
  @scala.inline
  def apply[ItemT](index: Double, item: ItemT, separators: Anon_Highlight): ListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListRenderItemInfo[ItemT]]
  }
}


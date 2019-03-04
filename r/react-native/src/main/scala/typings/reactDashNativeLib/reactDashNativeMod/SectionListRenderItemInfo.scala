package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionListRenderItemInfo[ItemT] extends ListRenderItemInfo[ItemT] {
  var section: SectionListData[ItemT]
}

object SectionListRenderItemInfo {
  @scala.inline
  def apply[ItemT](
    index: scala.Double,
    item: ItemT,
    section: SectionListData[ItemT],
    separators: reactDashNativeLib.Anon_Highlight
  ): SectionListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index, item = item.asInstanceOf[js.Any], section = section, separators = separators)
  
    __obj.asInstanceOf[SectionListRenderItemInfo[ItemT]]
  }
}


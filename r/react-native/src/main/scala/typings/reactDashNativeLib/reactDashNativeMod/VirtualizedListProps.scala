package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualizedListProps[ItemT] extends VirtualizedListWithoutRenderItemProps[ItemT] {
  @JSName("renderItem")
  var renderItem_Original: ListRenderItem[ItemT] = js.native
  def renderItem(info: ListRenderItemInfo[ItemT]): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
}


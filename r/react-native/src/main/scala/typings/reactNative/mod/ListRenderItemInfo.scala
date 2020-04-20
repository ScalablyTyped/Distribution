package typings.reactNative.mod

import typings.reactNative.AnonHighlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRenderItemInfo[ItemT] extends js.Object {
  var index: Double
  var item: ItemT
  var separators: AnonHighlight
}

object ListRenderItemInfo {
  @scala.inline
  def apply[ItemT](index: Double, item: ItemT, separators: AnonHighlight): ListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRenderItemInfo[ItemT]]
  }
}


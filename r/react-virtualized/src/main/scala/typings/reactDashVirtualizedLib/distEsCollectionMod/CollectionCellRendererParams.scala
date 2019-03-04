package typings
package reactDashVirtualizedLib.distEsCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionCellRendererParams extends js.Object {
  var index: scala.Double
  var isScrolling: scala.Boolean
  var key: scala.Double
  var style: reactLib.reactMod.ReactNs.CSSProperties
}

object CollectionCellRendererParams {
  @scala.inline
  def apply(
    index: scala.Double,
    isScrolling: scala.Boolean,
    key: scala.Double,
    style: reactLib.reactMod.ReactNs.CSSProperties
  ): CollectionCellRendererParams = {
    val __obj = js.Dynamic.literal(index = index, isScrolling = isScrolling, key = key, style = style)
  
    __obj.asInstanceOf[CollectionCellRendererParams]
  }
}


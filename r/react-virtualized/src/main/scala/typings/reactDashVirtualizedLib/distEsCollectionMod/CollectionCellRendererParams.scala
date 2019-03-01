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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CollectionCellRendererParams]
  }
}


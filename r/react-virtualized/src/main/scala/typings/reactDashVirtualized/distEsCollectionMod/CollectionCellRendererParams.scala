package typings.reactDashVirtualized.distEsCollectionMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionCellRendererParams extends js.Object {
  var index: Double
  var isScrolling: Boolean
  var key: Double
  var style: CSSProperties
}

object CollectionCellRendererParams {
  @scala.inline
  def apply(index: Double, isScrolling: Boolean, key: Double, style: CSSProperties): CollectionCellRendererParams = {
    val __obj = js.Dynamic.literal(index = index, isScrolling = isScrolling, key = key, style = style)
  
    __obj.asInstanceOf[CollectionCellRendererParams]
  }
}


package typings.reactVirtualized.esCollectionMod

import typings.react.mod.CSSProperties
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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionCellRendererParams]
  }
}


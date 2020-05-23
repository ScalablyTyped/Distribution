package typings.reactVirtualized.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-virtualized.react-virtualized/dist/es/Grid.ScrollOffset> */
trait PartialScrollOffset extends js.Object {
  var scrollLeft: js.UndefOr[Double] = js.undefined
  var scrollTop: js.UndefOr[Double] = js.undefined
}

object PartialScrollOffset {
  @scala.inline
  def apply(scrollLeft: js.UndefOr[Double] = js.undefined, scrollTop: js.UndefOr[Double] = js.undefined): PartialScrollOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollOffset]
  }
}


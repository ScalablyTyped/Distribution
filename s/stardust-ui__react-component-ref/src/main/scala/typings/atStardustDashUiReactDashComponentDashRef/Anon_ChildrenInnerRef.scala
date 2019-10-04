package typings.atStardustDashUiReactDashComponentDashRef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInnerRef extends js.Object {
  var children: js.UndefOr[scala.Nothing] = js.undefined
  var innerRef: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_ChildrenInnerRef {
  @scala.inline
  def apply(
    children: js.UndefOr[scala.Nothing] = js.undefined,
    innerRef: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ChildrenInnerRef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef)
    __obj.asInstanceOf[Anon_ChildrenInnerRef]
  }
}


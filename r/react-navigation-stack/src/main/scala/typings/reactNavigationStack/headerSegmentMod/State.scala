package typings.reactNavigationStack.headerSegmentMod

import typings.reactNavigationStack.vendorTypesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var leftLabelLayout: js.UndefOr[Layout] = js.undefined
  var titleLayout: js.UndefOr[Layout] = js.undefined
}

object State {
  @scala.inline
  def apply(leftLabelLayout: Layout = null, titleLayout: Layout = null): State = {
    val __obj = js.Dynamic.literal()
    if (leftLabelLayout != null) __obj.updateDynamic("leftLabelLayout")(leftLabelLayout.asInstanceOf[js.Any])
    if (titleLayout != null) __obj.updateDynamic("titleLayout")(titleLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}


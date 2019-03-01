package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentStyle extends js.Object {
  var contentStyle: js.UndefOr[js.Any] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var onHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderBottomToolbar: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderFixed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderModal: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderToolbar: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_ContentStyle {
  @scala.inline
  def apply(
    contentStyle: js.Any = null,
    modifier: java.lang.String = null,
    onHide: js.Function0[scala.Unit] = null,
    onInit: js.Function0[scala.Unit] = null,
    onShow: js.Function0[scala.Unit] = null,
    renderBottomToolbar: js.Function0[scala.Unit] = null,
    renderFixed: js.Function0[scala.Unit] = null,
    renderModal: js.Function0[scala.Unit] = null,
    renderToolbar: js.Function0[scala.Unit] = null
  ): Anon_ContentStyle = {
    val __obj = js.Dynamic.literal()
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (renderBottomToolbar != null) __obj.updateDynamic("renderBottomToolbar")(renderBottomToolbar)
    if (renderFixed != null) __obj.updateDynamic("renderFixed")(renderFixed)
    if (renderModal != null) __obj.updateDynamic("renderModal")(renderModal)
    if (renderToolbar != null) __obj.updateDynamic("renderToolbar")(renderToolbar)
    __obj.asInstanceOf[Anon_ContentStyle]
  }
}


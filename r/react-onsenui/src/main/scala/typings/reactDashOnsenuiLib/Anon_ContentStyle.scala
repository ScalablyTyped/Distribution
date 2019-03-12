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
    onHide: () => scala.Unit = null,
    onInit: () => scala.Unit = null,
    onShow: () => scala.Unit = null,
    renderBottomToolbar: () => scala.Unit = null,
    renderFixed: () => scala.Unit = null,
    renderModal: () => scala.Unit = null,
    renderToolbar: () => scala.Unit = null
  ): Anon_ContentStyle = {
    val __obj = js.Dynamic.literal()
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (renderBottomToolbar != null) __obj.updateDynamic("renderBottomToolbar")(js.Any.fromFunction0(renderBottomToolbar))
    if (renderFixed != null) __obj.updateDynamic("renderFixed")(js.Any.fromFunction0(renderFixed))
    if (renderModal != null) __obj.updateDynamic("renderModal")(js.Any.fromFunction0(renderModal))
    if (renderToolbar != null) __obj.updateDynamic("renderToolbar")(js.Any.fromFunction0(renderToolbar))
    __obj.asInstanceOf[Anon_ContentStyle]
  }
}


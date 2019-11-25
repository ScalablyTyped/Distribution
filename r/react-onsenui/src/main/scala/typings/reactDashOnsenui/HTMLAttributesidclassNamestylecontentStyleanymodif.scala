package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  contentStyle ? :any,   modifier ? :string,   renderModal ? :(): void,   renderToolbar ? :(): void,   renderBottomToolbar ? :(): void,   renderFixed ? :(): void,   onInit ? :(): void,   onShow ? :(): void,   onHide ? :(): void} */
trait HTMLAttributesidclassNamestylecontentStyleanymodif extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderBottomToolbar: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderModal: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderToolbar: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNamestylecontentStyleanymodif {
  @scala.inline
  def apply(
    className: String = null,
    contentStyle: js.Any = null,
    id: String = null,
    modifier: String = null,
    onHide: () => Unit = null,
    onInit: () => Unit = null,
    onShow: () => Unit = null,
    renderBottomToolbar: () => Unit = null,
    renderFixed: () => Unit = null,
    renderModal: () => Unit = null,
    renderToolbar: () => Unit = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylecontentStyleanymodif = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (renderBottomToolbar != null) __obj.updateDynamic("renderBottomToolbar")(js.Any.fromFunction0(renderBottomToolbar))
    if (renderFixed != null) __obj.updateDynamic("renderFixed")(js.Any.fromFunction0(renderFixed))
    if (renderModal != null) __obj.updateDynamic("renderModal")(js.Any.fromFunction0(renderModal))
    if (renderToolbar != null) __obj.updateDynamic("renderToolbar")(js.Any.fromFunction0(renderToolbar))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNamestylecontentStyleanymodif]
  }
}


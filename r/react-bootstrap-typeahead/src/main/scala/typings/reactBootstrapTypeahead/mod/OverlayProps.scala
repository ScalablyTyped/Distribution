package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends OverlayTypeaheadProps {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var container: HTMLElement
  var referenceElement: js.UndefOr[HTMLElement] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    container: HTMLElement,
    align: TypeaheadAlign = null,
    children: ReactNode = null,
    className: String = null,
    dropup: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    onMenuHide: () => Unit = null,
    onMenuShow: () => Unit = null,
    onMenuToggle: /* show */ Boolean => Unit = null,
    referenceElement: HTMLElement = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (onMenuHide != null) __obj.updateDynamic("onMenuHide")(js.Any.fromFunction0(onMenuHide))
    if (onMenuShow != null) __obj.updateDynamic("onMenuShow")(js.Any.fromFunction0(onMenuShow))
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(js.Any.fromFunction1(onMenuToggle))
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}


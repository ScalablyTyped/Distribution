package typings.reactOffcanvas.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactOffcanvas.reactOffcanvasStrings.left
import typings.reactOffcanvas.reactOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffCanvasMenuProps extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var isMenuOpened: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[left | right] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object OffCanvasMenuProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    isMenuOpened: js.UndefOr[Boolean] = js.undefined,
    position: left | right = null,
    style: CSSProperties = null,
    transitionDuration: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): OffCanvasMenuProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenuOpened)) __obj.updateDynamic("isMenuOpened")(isMenuOpened.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffCanvasMenuProps]
  }
}


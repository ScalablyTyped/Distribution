package typings.reactDashOffcanvas.reactDashOffcanvasMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashOffcanvas.reactDashOffcanvasStrings.left
import typings.reactDashOffcanvas.reactDashOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffCanvasBodyProps extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var isMenuOpened: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[left | right] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object OffCanvasBodyProps {
  @scala.inline
  def apply(
    children: ReactNode,
    className: String = null,
    isMenuOpened: js.UndefOr[Boolean] = js.undefined,
    position: left | right = null,
    style: CSSProperties = null,
    transitionDuration: Int | Double = null,
    width: Int | Double = null
  ): OffCanvasBodyProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(isMenuOpened)) __obj.updateDynamic("isMenuOpened")(isMenuOpened)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffCanvasBodyProps]
  }
}


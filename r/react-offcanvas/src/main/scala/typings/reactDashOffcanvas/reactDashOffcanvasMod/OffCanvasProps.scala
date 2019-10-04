package typings.reactDashOffcanvas.reactDashOffcanvasMod

import typings.react.reactMod.ReactNode
import typings.reactDashOffcanvas.reactDashOffcanvasStrings.left
import typings.reactDashOffcanvas.reactDashOffcanvasStrings.overlay
import typings.reactDashOffcanvas.reactDashOffcanvasStrings.parallax
import typings.reactDashOffcanvas.reactDashOffcanvasStrings.push
import typings.reactDashOffcanvas.reactDashOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffCanvasProps extends js.Object {
  var children: ReactNode
  var effect: js.UndefOr[push | overlay | parallax] = js.undefined
  var isMenuOpened: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[left | right] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object OffCanvasProps {
  @scala.inline
  def apply(
    children: ReactNode,
    effect: push | overlay | parallax = null,
    isMenuOpened: js.UndefOr[Boolean] = js.undefined,
    position: left | right = null,
    transitionDuration: Int | Double = null,
    width: Int | Double = null
  ): OffCanvasProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenuOpened)) __obj.updateDynamic("isMenuOpened")(isMenuOpened)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffCanvasProps]
  }
}


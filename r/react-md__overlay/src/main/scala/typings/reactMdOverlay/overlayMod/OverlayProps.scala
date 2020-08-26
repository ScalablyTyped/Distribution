package typings.reactMdOverlay.overlayMod

import typings.react.mod.HTMLAttributes
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.OverridableCSSTransitionProps
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayProps
  extends HTMLAttributes[HTMLSpanElement]
     with OverridableCSSTransitionProps
     with RenderConditionalPortalProps {
  /**
    * Boolean if the overlay should gain the pointer cursor while it's visible.
    * You normally want this enabled by default except when used as a modal's
    * overlay.
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the overlay is currently visible. When this prop changes, the
    * overlay will enter/exit with an opacity transition.
    */
  var visible: Boolean = js.native
  /**
    * A function that should change the `visible` prop to `false`. This is used
    * so that clicking the overlay can hide the overlay.
    */
  def onRequestClose(): Unit = js.native
}

object OverlayProps {
  @scala.inline
  def apply(onRequestClose: () => Unit, visible: Boolean): OverlayProps = {
    val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
  }
  
}


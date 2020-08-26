package typings.reactMdTransition.scaleTransitionMod

import typings.react.mod.ReactNode
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.OverridableCSSTransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleTransitionProps
  extends OverridableCSSTransitionProps
     with RenderConditionalPortalProps {
  /**
    * The children to render.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Boolean if the vertical scale animation should be used instead of the
    * normal scale animation.
    */
  var vertical: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the animation should be triggered. Enabling this will trigger
    * the appear/enter animations while disabling it will trigger the exit
    * animation.
    */
  var visible: Boolean = js.native
}

object ScaleTransitionProps {
  @scala.inline
  def apply(visible: Boolean): ScaleTransitionProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleTransitionProps]
  }
  @scala.inline
  implicit class ScaleTransitionPropsOps[Self <: ScaleTransitionProps] (val x: Self) extends AnyVal {
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}


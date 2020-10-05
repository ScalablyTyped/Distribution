package typings.semanticUiReact.transitionGroupMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticTRANSITIONS
import typings.semanticUiReact.transitionTransitionMod.TransitionPropDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictTransitionGroupProps extends js.Object {
  /** Named animation event to used. Must be defined in CSS. */
  var animation: js.UndefOr[SemanticTRANSITIONS | String] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Whether it is directional animation event or not. Use it only for custom transitions. */
  var directional: js.UndefOr[Boolean] = js.native
  /** Duration of the CSS transition animation in milliseconds. */
  var duration: js.UndefOr[Double | String | TransitionPropDuration] = js.native
}

object StrictTransitionGroupProps {
  @scala.inline
  def apply(): StrictTransitionGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTransitionGroupProps]
  }
  @scala.inline
  implicit class StrictTransitionGroupPropsOps[Self <: StrictTransitionGroupProps] (val x: Self) extends AnyVal {
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
    def setAnimation(value: SemanticTRANSITIONS | String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDirectional(value: Boolean): Self = this.set("directional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectional: Self = this.set("directional", js.undefined)
    @scala.inline
    def setDuration(value: Double | String | TransitionPropDuration): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}


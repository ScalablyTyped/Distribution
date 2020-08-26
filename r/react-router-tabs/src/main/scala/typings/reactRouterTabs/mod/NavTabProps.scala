package typings.reactRouterTabs.mod

import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.reactRouterDom.mod.NavLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavTabProps extends NavLinkProps[LocationState] {
  var allowClickOnActive: js.UndefOr[Boolean] = js.native
  @JSName("aria-current")
  var `aria-current_NavTabProps`: js.UndefOr[AriaCurrent] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
}

object NavTabProps {
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
  ): NavTabProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavTabProps]
  }
  @scala.inline
  implicit class NavTabPropsOps[Self <: NavTabProps] (val x: Self) extends AnyVal {
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
    def setAllowClickOnActive(value: Boolean): Self = this.set("allowClickOnActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClickOnActive: Self = this.set("allowClickOnActive", js.undefined)
    @scala.inline
    def `setAria-current`(value: AriaCurrent): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
  
}


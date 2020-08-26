package typings.reactMdPortal.conditionalPortalMod

import typings.reactMdPortal.getContainerMod.PortalInto
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderConditionalPortalProps extends js.Object {
  /**
    * Boolean if the portal should be used.
    */
  var portal: js.UndefOr[Boolean] = js.native
  /**
    * @see {@link Portal#into}
    */
  var portalInto: js.UndefOr[PortalInto] = js.native
  /**
    * @see {@link Portal#intoId}
    */
  var portalIntoId: js.UndefOr[String] = js.native
}

object RenderConditionalPortalProps {
  @scala.inline
  def apply(): RenderConditionalPortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderConditionalPortalProps]
  }
  @scala.inline
  implicit class RenderConditionalPortalPropsOps[Self <: RenderConditionalPortalProps] (val x: Self) extends AnyVal {
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
    def setPortal(value: Boolean): Self = this.set("portal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    @scala.inline
    def setPortalIntoFunction0(value: () => HTMLElement | Null): Self = this.set("portalInto", js.Any.fromFunction0(value))
    @scala.inline
    def setPortalInto(value: PortalInto): Self = this.set("portalInto", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalInto: Self = this.set("portalInto", js.undefined)
    @scala.inline
    def setPortalIntoNull: Self = this.set("portalInto", null)
    @scala.inline
    def setPortalIntoId(value: String): Self = this.set("portalIntoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalIntoId: Self = this.set("portalIntoId", js.undefined)
  }
  
}


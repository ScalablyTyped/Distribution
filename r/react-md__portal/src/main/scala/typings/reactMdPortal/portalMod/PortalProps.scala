package typings.reactMdPortal.portalMod

import typings.react.mod.ReactNode
import typings.reactMdPortal.getContainerMod.PortalInto
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalProps extends js.Object {
  /**
    * The children to render within the portal.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Either a function that returns an HTMLElement, an HTMLElement, or a
    * `document.querySelector` string that will return the HTMLElement to render
    * the children into. If both the `into` and `intoId` props are `undefined`,
    * the `document.body` will be chosen instead.
    *
    * If the `querySelector` string does not return a valid HTMLElement, an error
    * will be thrown.
    */
  var into: js.UndefOr[PortalInto] = js.native
  /**
    * The id of an element that the portal should be rendered into. If an element
    * with the provided id can not be found on the page at the time of mounting,
    * an error will be thrown.
    */
  var intoId: js.UndefOr[String] = js.native
}

object PortalProps {
  @scala.inline
  def apply(): PortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalProps]
  }
  @scala.inline
  implicit class PortalPropsOps[Self <: PortalProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setIntoFunction0(value: () => HTMLElement | Null): Self = this.set("into", js.Any.fromFunction0(value))
    @scala.inline
    def setInto(value: PortalInto): Self = this.set("into", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInto: Self = this.set("into", js.undefined)
    @scala.inline
    def setIntoNull: Self = this.set("into", null)
    @scala.inline
    def setIntoId(value: String): Self = this.set("intoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntoId: Self = this.set("intoId", js.undefined)
  }
  
}


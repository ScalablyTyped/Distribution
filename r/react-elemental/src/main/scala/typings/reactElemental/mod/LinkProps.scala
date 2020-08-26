package typings.reactElemental.mod

import typings.react.mod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  val activeColor: js.UndefOr[String] = js.native
  val ref: js.UndefOr[String] = js.native
  @JSName("type")
  val type_LinkProps: js.UndefOr[LinkType] = js.native
}

object LinkProps {
  @scala.inline
  def apply(): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkProps]
  }
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
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
    def setActiveColor(value: String): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveColor: Self = this.set("activeColor", js.undefined)
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setType(value: LinkType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


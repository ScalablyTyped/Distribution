package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FooterDropDownSectionProps
  extends MDLHTMLAttributes
     with DOMAttributes[FooterDropDownSection] {
  var size: js.UndefOr[String] = js.native
  var title: ReactNode = js.native
}

object FooterDropDownSectionProps {
  @scala.inline
  def apply(): FooterDropDownSectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterDropDownSectionProps]
  }
  @scala.inline
  implicit class FooterDropDownSectionPropsOps[Self <: FooterDropDownSectionProps] (val x: Self) extends AnyVal {
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
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}


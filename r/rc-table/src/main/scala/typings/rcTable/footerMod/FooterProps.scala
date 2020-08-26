package typings.rcTable.footerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FooterProps[RecordType] extends js.Object {
  var children: ReactNode = js.native
}

object FooterProps {
  @scala.inline
  def apply[RecordType](): FooterProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterProps[RecordType]]
  }
  @scala.inline
  implicit class FooterPropsOps[Self <: FooterProps[_], RecordType] (val x: Self with FooterProps[RecordType]) extends AnyVal {
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
  }
  
}


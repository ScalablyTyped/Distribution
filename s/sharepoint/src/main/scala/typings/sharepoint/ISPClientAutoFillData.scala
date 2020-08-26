package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ISPClientAutoFillData extends js.Object {
  var AutoFillDisplayText: js.UndefOr[String] = js.native
  var AutoFillKey: js.UndefOr[js.Any] = js.native
  var AutoFillMenuOptionType: js.UndefOr[Double] = js.native
  var AutoFillSubDisplayText: js.UndefOr[String] = js.native
  var AutoFillTitleText: js.UndefOr[String] = js.native
}

object ISPClientAutoFillData {
  @scala.inline
  def apply(): ISPClientAutoFillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISPClientAutoFillData]
  }
  @scala.inline
  implicit class ISPClientAutoFillDataOps[Self <: ISPClientAutoFillData] (val x: Self) extends AnyVal {
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
    def setAutoFillDisplayText(value: String): Self = this.set("AutoFillDisplayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFillDisplayText: Self = this.set("AutoFillDisplayText", js.undefined)
    @scala.inline
    def setAutoFillKey(value: js.Any): Self = this.set("AutoFillKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFillKey: Self = this.set("AutoFillKey", js.undefined)
    @scala.inline
    def setAutoFillMenuOptionType(value: Double): Self = this.set("AutoFillMenuOptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFillMenuOptionType: Self = this.set("AutoFillMenuOptionType", js.undefined)
    @scala.inline
    def setAutoFillSubDisplayText(value: String): Self = this.set("AutoFillSubDisplayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFillSubDisplayText: Self = this.set("AutoFillSubDisplayText", js.undefined)
    @scala.inline
    def setAutoFillTitleText(value: String): Self = this.set("AutoFillTitleText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFillTitleText: Self = this.set("AutoFillTitleText", js.undefined)
  }
  
}


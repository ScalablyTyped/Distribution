package typings.searchParams.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var arrayFormat: js.UndefOr[typings.searchParams.encodeMod.arrayFormat] = js.native
  var booleanFormat: js.UndefOr[typings.searchParams.encodeMod.booleanFormat] = js.native
  var nullFormat: js.UndefOr[typings.searchParams.encodeMod.nullFormat] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setArrayFormat(value: arrayFormat): Self = this.set("arrayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayFormat: Self = this.set("arrayFormat", js.undefined)
    @scala.inline
    def setBooleanFormat(value: booleanFormat): Self = this.set("booleanFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanFormat: Self = this.set("booleanFormat", js.undefined)
    @scala.inline
    def setNullFormat(value: nullFormat): Self = this.set("nullFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullFormat: Self = this.set("nullFormat", js.undefined)
  }
  
}


package typings.searchParams.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFinalOptions extends js.Object {
  var arrayFormat: typings.searchParams.encodeMod.arrayFormat = js.native
  var booleanFormat: typings.searchParams.encodeMod.booleanFormat = js.native
  var nullFormat: typings.searchParams.encodeMod.nullFormat = js.native
}

object IFinalOptions {
  @scala.inline
  def apply(arrayFormat: arrayFormat, booleanFormat: booleanFormat, nullFormat: nullFormat): IFinalOptions = {
    val __obj = js.Dynamic.literal(arrayFormat = arrayFormat.asInstanceOf[js.Any], booleanFormat = booleanFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFinalOptions]
  }
  @scala.inline
  implicit class IFinalOptionsOps[Self <: IFinalOptions] (val x: Self) extends AnyVal {
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
    def setBooleanFormat(value: booleanFormat): Self = this.set("booleanFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setNullFormat(value: nullFormat): Self = this.set("nullFormat", value.asInstanceOf[js.Any])
  }
  
}


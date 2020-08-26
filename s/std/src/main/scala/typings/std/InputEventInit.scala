package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputEventInit extends UIEventInit {
  var data: js.UndefOr[java.lang.String | Null] = js.native
  var inputType: js.UndefOr[java.lang.String] = js.native
  var isComposing: js.UndefOr[scala.Boolean] = js.native
}

object InputEventInit {
  @scala.inline
  def apply(): InputEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputEventInit]
  }
  @scala.inline
  implicit class InputEventInitOps[Self <: InputEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: java.lang.String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setInputType(value: java.lang.String): Self = this.set("inputType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    @scala.inline
    def setIsComposing(value: scala.Boolean): Self = this.set("isComposing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsComposing: Self = this.set("isComposing", js.undefined)
  }
  
}


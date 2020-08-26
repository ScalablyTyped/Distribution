package typings.reactElemental.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Regular extends js.Object {
  var bold: js.UndefOr[String] = js.native
  var regular: js.UndefOr[String] = js.native
}

object Regular {
  @scala.inline
  def apply(): Regular = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Regular]
  }
  @scala.inline
  implicit class RegularOps[Self <: Regular] (val x: Self) extends AnyVal {
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
    def setBold(value: String): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setRegular(value: String): Self = this.set("regular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegular: Self = this.set("regular", js.undefined)
  }
  
}


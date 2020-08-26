package typings.qiniuJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.Extra> */
@js.native
trait PartialExtra extends js.Object {
  var fname: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[js.Array[String] | Null] = js.native
  var params: js.UndefOr[js.Any] = js.native
}

object PartialExtra {
  @scala.inline
  def apply(): PartialExtra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialExtra]
  }
  @scala.inline
  implicit class PartialExtraOps[Self <: PartialExtra] (val x: Self) extends AnyVal {
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
    def setFname(value: String): Self = this.set("fname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFname: Self = this.set("fname", js.undefined)
    @scala.inline
    def setMimeTypeVarargs(value: String*): Self = this.set("mimeType", js.Array(value :_*))
    @scala.inline
    def setMimeType(value: js.Array[String]): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setMimeTypeNull: Self = this.set("mimeType", null)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}


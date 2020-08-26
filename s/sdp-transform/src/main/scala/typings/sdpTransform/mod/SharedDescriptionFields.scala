package typings.sdpTransform.mod

import typings.sdpTransform.anon.Ip
import typings.sdpTransform.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedDescriptionFields extends js.Object {
  // b=AS:4000
  var bandwidth: js.UndefOr[js.Array[Limit]] = js.native
  // c=IN IP4 10.47.197.26
  var connection: js.UndefOr[Ip] = js.native
  // i=
  var description: js.UndefOr[String] = js.native
}

object SharedDescriptionFields {
  @scala.inline
  def apply(): SharedDescriptionFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDescriptionFields]
  }
  @scala.inline
  implicit class SharedDescriptionFieldsOps[Self <: SharedDescriptionFields] (val x: Self) extends AnyVal {
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
    def setBandwidthVarargs(value: Limit*): Self = this.set("bandwidth", js.Array(value :_*))
    @scala.inline
    def setBandwidth(value: js.Array[Limit]): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    @scala.inline
    def setConnection(value: Ip): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}


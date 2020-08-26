package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaEncryptedEventInit extends EventInit {
  var initData: js.UndefOr[ArrayBuffer | Null] = js.native
  var initDataType: js.UndefOr[java.lang.String] = js.native
}

object MediaEncryptedEventInit {
  @scala.inline
  def apply(): MediaEncryptedEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaEncryptedEventInit]
  }
  @scala.inline
  implicit class MediaEncryptedEventInitOps[Self <: MediaEncryptedEventInit] (val x: Self) extends AnyVal {
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
    def setInitData(value: ArrayBuffer): Self = this.set("initData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitData: Self = this.set("initData", js.undefined)
    @scala.inline
    def setInitDataNull: Self = this.set("initData", null)
    @scala.inline
    def setInitDataType(value: java.lang.String): Self = this.set("initDataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitDataType: Self = this.set("initDataType", js.undefined)
  }
  
}


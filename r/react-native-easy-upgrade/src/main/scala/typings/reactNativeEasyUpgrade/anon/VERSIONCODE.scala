package typings.reactNativeEasyUpgrade.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VERSIONCODE extends js.Object {
  var VERSION_CODE: String = js.native
  var VERSION_NAME: String = js.native
}

object VERSIONCODE {
  @scala.inline
  def apply(VERSION_CODE: String, VERSION_NAME: String): VERSIONCODE = {
    val __obj = js.Dynamic.literal(VERSION_CODE = VERSION_CODE.asInstanceOf[js.Any], VERSION_NAME = VERSION_NAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[VERSIONCODE]
  }
  @scala.inline
  implicit class VERSIONCODEOps[Self <: VERSIONCODE] (val x: Self) extends AnyVal {
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
    def setVERSION_CODE(value: String): Self = this.set("VERSION_CODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setVERSION_NAME(value: String): Self = this.set("VERSION_NAME", value.asInstanceOf[js.Any])
  }
  
}


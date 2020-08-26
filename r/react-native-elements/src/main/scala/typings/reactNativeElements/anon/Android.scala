package typings.reactNativeElements.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Android extends js.Object {
  var android: Error = js.native
  var ios: Error = js.native
}

object Android {
  @scala.inline
  def apply(android: Error, ios: Error): Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
  @scala.inline
  implicit class AndroidOps[Self <: Android] (val x: Self) extends AnyVal {
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
    def setAndroid(value: Error): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def setIos(value: Error): Self = this.set("ios", value.asInstanceOf[js.Any])
  }
  
}


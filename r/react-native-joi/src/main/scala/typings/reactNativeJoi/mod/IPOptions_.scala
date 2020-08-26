package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPOptions_ extends js.Object {
  var cidr: js.UndefOr[String] = js.native
  var version: js.UndefOr[js.Array[String]] = js.native
}

object IPOptions_ {
  @scala.inline
  def apply(): IPOptions_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPOptions_]
  }
  @scala.inline
  implicit class IPOptions_Ops[Self <: IPOptions_] (val x: Self) extends AnyVal {
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
    def setCidr(value: String): Self = this.set("cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidr: Self = this.set("cidr", js.undefined)
    @scala.inline
    def setVersionVarargs(value: String*): Self = this.set("version", js.Array(value :_*))
    @scala.inline
    def setVersion(value: js.Array[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


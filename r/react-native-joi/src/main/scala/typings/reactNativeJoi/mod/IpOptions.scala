package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpOptions extends js.Object {
  /**
    * Used to determine if a CIDR is allowed or not. Valid values: optional, required, forbidden
    */
  var cidr: js.UndefOr[String] = js.native
  /**
    * One or more IP address versions to validate against. Valid values: ipv4, ipv6, ipvfuture
    */
  var version: js.UndefOr[String | js.Array[String]] = js.native
}

object IpOptions {
  @scala.inline
  def apply(): IpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpOptions]
  }
  @scala.inline
  implicit class IpOptionsOps[Self <: IpOptions] (val x: Self) extends AnyVal {
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
    def setVersion(value: String | js.Array[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


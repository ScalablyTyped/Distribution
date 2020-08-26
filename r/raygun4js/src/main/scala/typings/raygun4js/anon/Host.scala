package typings.raygun4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Host extends js.Object {
  var Host: String = js.native
  var Referer: String = js.native
  var `User-Agent`: String = js.native
}

object Host {
  @scala.inline
  def apply(Host: String, Referer: String, `User-Agent`: String): Host = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Referer = Referer.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  @scala.inline
  implicit class HostOps[Self <: Host] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("Host", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferer(value: String): Self = this.set("Referer", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-Agent`(value: String): Self = this.set("User-Agent", value.asInstanceOf[js.Any])
  }
  
}


package typings.statsdClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UdpOptions extends CommonOptions {
  /**
    * Where to send the stats (default localhost).
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Port to contact the statsd-daemon on (default 8125).
    */
  var port: js.UndefOr[Double] = js.native
}

object UdpOptions {
  @scala.inline
  def apply(): UdpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UdpOptions]
  }
  @scala.inline
  implicit class UdpOptionsOps[Self <: UdpOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}


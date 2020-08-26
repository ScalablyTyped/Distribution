package typings.pulumiAws.outputMod.mediapackage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelHlsIngestIngestEndpoint extends js.Object {
  /**
    * The password
    */
  var password: String = js.native
  /**
    * The URL
    */
  var url: String = js.native
  /**
    * The username
    */
  var username: String = js.native
}

object ChannelHlsIngestIngestEndpoint {
  @scala.inline
  def apply(password: String, url: String, username: String): ChannelHlsIngestIngestEndpoint = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHlsIngestIngestEndpoint]
  }
  @scala.inline
  implicit class ChannelHlsIngestIngestEndpointOps[Self <: ChannelHlsIngestIngestEndpoint] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}


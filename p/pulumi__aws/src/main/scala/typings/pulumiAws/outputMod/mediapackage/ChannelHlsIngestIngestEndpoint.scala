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
}


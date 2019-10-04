package typings.atPulumiAws.typesOutputMod.mediapackageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelHlsIngestIngestEndpoint extends js.Object {
  /**
    * The password
    */
  var password: String
  /**
    * The URL
    */
  var url: String
  /**
    * The username
    */
  var username: String
}

object ChannelHlsIngestIngestEndpoint {
  @scala.inline
  def apply(password: String, url: String, username: String): ChannelHlsIngestIngestEndpoint = {
    val __obj = js.Dynamic.literal(password = password, url = url, username = username)
  
    __obj.asInstanceOf[ChannelHlsIngestIngestEndpoint]
  }
}


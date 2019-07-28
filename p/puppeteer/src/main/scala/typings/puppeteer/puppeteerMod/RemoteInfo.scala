package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteInfo extends js.Object {
  /** the IP address of the remote server */
  var ip: String
  /** the port used to connect to the remote server */
  var port: Double
}

object RemoteInfo {
  @scala.inline
  def apply(ip: String, port: Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(ip = ip, port = port)
  
    __obj.asInstanceOf[RemoteInfo]
  }
}


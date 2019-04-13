package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var host: java.lang.String
  var port: java.lang.String | scala.Double
}

object Server {
  @scala.inline
  def apply(host: java.lang.String, port: java.lang.String | scala.Double): Server = {
    val __obj = js.Dynamic.literal(host = host, port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Server]
  }
}


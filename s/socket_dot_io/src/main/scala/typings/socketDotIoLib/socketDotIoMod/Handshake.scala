package typings
package socketDotIoLib.socketDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handshake extends js.Object {
  /**
  		 * The remote address of the connection request
  		 */
  var address: java.lang.String
  /**
  		 * The headers passed along with the request. e.g. 'host',
  		 * 'connection', 'accept', 'referer', 'cookie'
  		 */
  var headers: js.Any
  /**
  		 * The timestamp for when this was issued
  		 */
  var issued: scala.Double
  /**
  		 * Any query string parameters in the request url
  		 */
  var query: js.Any
  /**
  		 * Is this a secure request?
  		 */
  var secure: scala.Boolean
  /**
  		 * The current time, as a string
  		 */
  var time: java.lang.String
  /**
  		 * The request url
  		 */
  var url: java.lang.String
  /**
  		 * Is this a cross-domain request?
  		 */
  var xdomain: scala.Boolean
}

object Handshake {
  @scala.inline
  def apply(
    address: java.lang.String,
    headers: js.Any,
    issued: scala.Double,
    query: js.Any,
    secure: scala.Boolean,
    time: java.lang.String,
    url: java.lang.String,
    xdomain: scala.Boolean
  ): Handshake = {
    val __obj = js.Dynamic.literal(address = address, headers = headers, issued = issued, query = query, secure = secure, time = time, url = url, xdomain = xdomain)
  
    __obj.asInstanceOf[Handshake]
  }
}


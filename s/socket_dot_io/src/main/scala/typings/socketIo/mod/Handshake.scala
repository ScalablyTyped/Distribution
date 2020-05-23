package typings.socketIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handshake extends js.Object {
  /**
    * The remote address of the connection request
    */
  var address: String
  /**
    * The headers passed along with the request. e.g. 'host',
    * 'connection', 'accept', 'referer', 'cookie'
    */
  var headers: js.Any
  /**
    * The timestamp for when this was issued
    */
  var issued: Double
  /**
    * Any query string parameters in the request url
    */
  var query: js.Any
  /**
    * Is this a secure request?
    */
  var secure: Boolean
  /**
    * The current time, as a string
    */
  var time: String
  /**
    * The request url
    */
  var url: String
  /**
    * Is this a cross-domain request?
    */
  var xdomain: Boolean
}

object Handshake {
  @scala.inline
  def apply(
    address: String,
    headers: js.Any,
    issued: Double,
    query: js.Any,
    secure: Boolean,
    time: String,
    url: String,
    xdomain: Boolean
  ): Handshake = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xdomain = xdomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handshake]
  }
}


package typings.reveal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#multiplexing
trait MultiplexConfig extends js.Object {
  // Obtained from the socket.io server
  var id: String
  // Obtained from the socket.io server. Gives this (the master) control of the presentation
  var secret: js.UndefOr[String] = js.undefined
  // Location of socket.io server
  var url: String
}

object MultiplexConfig {
  @scala.inline
  def apply(id: String, url: String, secret: String = null): MultiplexConfig = {
    val __obj = js.Dynamic.literal(id = id, url = url)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[MultiplexConfig]
  }
}


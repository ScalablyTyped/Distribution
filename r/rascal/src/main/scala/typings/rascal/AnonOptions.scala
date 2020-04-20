package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: AnonTimeout
  var port: Double
  var protocol: String
  var slashes: Boolean
}

object AnonOptions {
  @scala.inline
  def apply(options: AnonTimeout, port: Double, protocol: String, slashes: Boolean): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}


package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: Timeout
  var port: Double
  var protocol: String
  var slashes: Boolean
}

object Options {
  @scala.inline
  def apply(options: Timeout, port: Double, protocol: String, slashes: Boolean): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


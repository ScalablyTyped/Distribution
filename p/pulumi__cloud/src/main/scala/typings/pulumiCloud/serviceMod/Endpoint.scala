package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  var hostname: String
  var port: Double
}

object Endpoint {
  @scala.inline
  def apply(hostname: String, port: Double): Endpoint = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}


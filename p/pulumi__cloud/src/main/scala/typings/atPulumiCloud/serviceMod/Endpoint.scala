package typings.atPulumiCloud.serviceMod

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
    val __obj = js.Dynamic.literal(hostname = hostname, port = port)
  
    __obj.asInstanceOf[Endpoint]
  }
}


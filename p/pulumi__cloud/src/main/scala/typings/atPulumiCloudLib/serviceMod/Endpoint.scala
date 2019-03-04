package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  var hostname: java.lang.String
  var port: scala.Double
}

object Endpoint {
  @scala.inline
  def apply(hostname: java.lang.String, port: scala.Double): Endpoint = {
    val __obj = js.Dynamic.literal(hostname = hostname, port = port)
  
    __obj.asInstanceOf[Endpoint]
  }
}


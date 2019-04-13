package typings
package socketclusterDashServerLib.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCServerSocketStatus extends js.Object {
  var id: java.lang.String
  var pingTimeout: scala.Double
}

object SCServerSocketStatus {
  @scala.inline
  def apply(id: java.lang.String, pingTimeout: scala.Double): SCServerSocketStatus = {
    val __obj = js.Dynamic.literal(id = id, pingTimeout = pingTimeout)
  
    __obj.asInstanceOf[SCServerSocketStatus]
  }
}


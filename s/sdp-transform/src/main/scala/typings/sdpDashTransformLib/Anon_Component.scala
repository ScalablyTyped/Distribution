package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var component: scala.Double
  var ip: java.lang.String
  var port: scala.Double
}

object Anon_Component {
  @scala.inline
  def apply(component: scala.Double, ip: java.lang.String, port: scala.Double): Anon_Component = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[Anon_Component]
  }
}


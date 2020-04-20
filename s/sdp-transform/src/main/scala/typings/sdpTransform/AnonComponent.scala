package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends js.Object {
  var component: Double
  var ip: String
  var port: Double
}

object AnonComponent {
  @scala.inline
  def apply(component: Double, ip: String, port: Double): AnonComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent]
  }
}


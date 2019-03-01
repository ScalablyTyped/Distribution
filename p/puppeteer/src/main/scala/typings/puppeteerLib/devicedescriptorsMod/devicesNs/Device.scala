package typings
package puppeteerLib.devicedescriptorsMod.devicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var name: java.lang.String
  var userAgent: java.lang.String
  var viewport: Viewport
}

object Device {
  @scala.inline
  def apply(name: java.lang.String, userAgent: java.lang.String, viewport: Viewport): Device = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("userAgent")(userAgent)
    __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Device]
  }
}


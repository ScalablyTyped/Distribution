package typings.stormReactDiagrams

import typings.stormReactDiagrams.portModelMod.PortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPort extends js.Object {
  var port: Null | PortModel
}

object AnonPort {
  @scala.inline
  def apply(port: PortModel = null): AnonPort = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPort]
  }
}


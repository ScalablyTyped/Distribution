package typings
package reactDashRelayLib.compatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayProp extends js.Object {
  var environment: CompatEnvironment
}

object RelayProp {
  @scala.inline
  def apply(environment: CompatEnvironment): RelayProp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayProp]
  }
}


package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayNetworkLayer extends js.Object {
  def supports(options: java.lang.String*): scala.Boolean
}

object RelayNetworkLayer {
  @scala.inline
  def apply(supports: js.Function1[/* repeated */ java.lang.String, scala.Boolean]): RelayNetworkLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("supports")(supports)
    __obj.asInstanceOf[RelayNetworkLayer]
  }
}


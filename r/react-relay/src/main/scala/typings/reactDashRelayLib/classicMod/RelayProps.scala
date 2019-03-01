package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayProps[V] extends js.Object {
  val relay: RelayProp[V]
}

object RelayProps {
  @scala.inline
  def apply[V](relay: RelayProp[V]): RelayProps[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("relay")(relay)
    __obj.asInstanceOf[RelayProps[V]]
  }
}


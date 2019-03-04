package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait REQUIRED_CHILDREN extends RelayMutationConfig {
  var children: js.Array[RelayConcreteNode]
  var `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.REQUIRED_CHILDREN
}

object REQUIRED_CHILDREN {
  @scala.inline
  def apply(
    children: js.Array[RelayConcreteNode],
    `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.REQUIRED_CHILDREN
  ): REQUIRED_CHILDREN = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[REQUIRED_CHILDREN]
  }
}


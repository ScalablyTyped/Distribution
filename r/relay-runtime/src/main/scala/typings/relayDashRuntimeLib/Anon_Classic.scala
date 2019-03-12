package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Classic extends js.Object {
  def classic(relayQL: relayDashRuntimeLib.relayDashRuntimeMod.RelayQL): relayDashRuntimeLib.relayDashRuntimeMod.ConcreteFragmentDefinition | relayDashRuntimeLib.relayDashRuntimeMod.ConcreteOperationDefinition
  def modern(): relayDashRuntimeLib.relayDashRuntimeMod.ConcreteFragment | relayDashRuntimeLib.relayDashRuntimeMod.RequestNode
}

object Anon_Classic {
  @scala.inline
  def apply(
    classic: relayDashRuntimeLib.relayDashRuntimeMod.RelayQL => relayDashRuntimeLib.relayDashRuntimeMod.ConcreteFragmentDefinition | relayDashRuntimeLib.relayDashRuntimeMod.ConcreteOperationDefinition,
    modern: () => relayDashRuntimeLib.relayDashRuntimeMod.ConcreteFragment | relayDashRuntimeLib.relayDashRuntimeMod.RequestNode
  ): Anon_Classic = {
    val __obj = js.Dynamic.literal(classic = js.Any.fromFunction1(classic), modern = js.Any.fromFunction0(modern))
  
    __obj.asInstanceOf[Anon_Classic]
  }
}


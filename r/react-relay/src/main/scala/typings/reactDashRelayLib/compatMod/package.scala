package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compatMod {
  type CompatEnvironment = relayDashRuntimeLib.relayDashRuntimeMod.Environment | RelayClassicEnvironment
  type ConcreteFragmentDefinition = js.Object
  type ConcreteOperationDefinition = js.Object
  type GeneratedNodeMap = org.scalablytyped.runtime.StringDictionary[relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode]
  type RelayClassicEnvironment = reactDashRelayLib.classicMod.RelayEnvironmentInterface
  type RelayPaginationProp = reactDashRelayLib.reactDashRelayMod.RelayPaginationProp with RelayProp
  type RelayRefetchProp = reactDashRelayLib.reactDashRelayMod.RelayRefetchProp with RelayProp
  type VariablesProvider = js.Function0[relayDashRuntimeLib.relayDashRuntimeMod.Variables]
}

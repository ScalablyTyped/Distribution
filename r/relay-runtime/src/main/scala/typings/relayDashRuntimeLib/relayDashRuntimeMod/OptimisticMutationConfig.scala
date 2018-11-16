package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptimisticMutationConfig extends js.Object {
  var configs: js.UndefOr[js.Array[RelayMutationConfig]] = js.undefined
  var mutation: GraphQLTaggedNode
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[_]] = js.undefined
  var variables: Variables
}


package typings.relayDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libQueryRelayModernGraphQLTagMod {
  import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
  import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest

  /* Rewritten from type alias, can be one of: 
    - typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
    - typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
    - js.Function0[
  typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment | typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest]
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest])
}

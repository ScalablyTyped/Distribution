package typings.reactRelay.useRefetchableFragmentNodeMod

import typings.reactRelay.helpersMod.KeyType
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/useRefetchableFragmentNode", "useRefetchableFragmentNode")
@js.native
object useRefetchableFragmentNode extends js.Object {
  
  def apply[TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */](fragmentNode: ReaderFragment, parentFragmentRef: js.Any, componentDisplayName: String): // tslint:disable-next-line:no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, InternalOptions] = js.native
}

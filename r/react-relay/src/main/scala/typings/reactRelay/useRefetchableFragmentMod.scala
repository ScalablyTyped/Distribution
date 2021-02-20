package typings.reactRelay

import typings.reactRelay.helpersMod.KeyType
import typings.reactRelay.helpersMod.KeyTypeData
import typings.reactRelay.useRefetchableFragmentNodeMod.Options
import typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefetchableFragmentMod {
  
  @JSImport("react-relay/lib/relay-experimental/useRefetchableFragment", "useRefetchableFragment")
  @js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  @JSImport("react-relay/lib/relay-experimental/useRefetchableFragment", "useRefetchableFragment")
  @js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, KeyTypeData[TKey, _]] = js.native
  
  type ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData] = js.Tuple2[TFragmentData, RefetchFnDynamic[TQuery, TKey, Options]]
}

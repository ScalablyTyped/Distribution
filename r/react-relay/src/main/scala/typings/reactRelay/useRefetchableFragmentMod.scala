package typings.reactRelay

import typings.reactRelay.helpersMod.KeyType
import typings.reactRelay.helpersMod.KeyTypeData
import typings.reactRelay.useRefetchableFragmentNodeMod.Options
import typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefetchableFragmentMod {
  
  @JSImport("react-relay/lib/relay-experimental/useRefetchableFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null]]
  @scala.inline
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, KeyTypeData[TKey, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, KeyTypeData[TKey, js.Any]]]
  
  type ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] | Null */, TFragmentData] = js.Tuple2[TFragmentData, RefetchFnDynamic[TQuery, TKey, Options]]
}

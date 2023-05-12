package typings.reactRelay

import typings.reactRelay.relayHooksHelpersMod.KeyType
import typings.reactRelay.relayHooksHelpersMod.KeyTypeData
import typings.reactRelay.relayHooksUseRefetchableFragmentNodeMod.Options
import typings.reactRelay.relayHooksUseRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseRefetchableFragmentMod {
  
  @JSImport("react-relay/relay-hooks/useRefetchableFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): // eslint-disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[TQuery, TKey, (KeyTypeData[TKey, Any]) | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// eslint-disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[TQuery, TKey, (KeyTypeData[TKey, Any]) | Null]]
  inline def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // eslint-disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[TQuery, TKey, KeyTypeData[TKey, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[// eslint-disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[TQuery, TKey, KeyTypeData[TKey, Any]]]
  
  type useRefetchableFragmentHookType[TQuery /* <: OperationType */, TKey /* <: KeyType[Any] | Null */, TFragmentData] = js.Tuple2[TFragmentData, RefetchFnDynamic[TQuery, TKey, Options]]
}

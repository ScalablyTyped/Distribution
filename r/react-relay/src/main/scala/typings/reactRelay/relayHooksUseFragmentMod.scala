package typings.reactRelay

import typings.reactRelay.relayHooksHelpersMod.ArrayKeyType
import typings.reactRelay.relayHooksHelpersMod.ArrayKeyTypeData
import typings.reactRelay.relayHooksHelpersMod.KeyType
import typings.reactRelay.relayHooksHelpersMod.KeyTypeData
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseFragmentMod {
  
  @JSImport("react-relay/relay-hooks/useFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFragment[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  inline def useFragment[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[ArrayKeyTypeData[TKey, Any]]
  
  inline def useFragment_TKey_KeyTypeData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[KeyTypeData[TKey, Any]]
  
  inline def useFragment_TKey_Union[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
}

package typings.reactRelay

import typings.reactRelay.helpersMod.ArrayKeyType
import typings.reactRelay.helpersMod.ArrayKeyTypeData
import typings.reactRelay.helpersMod.KeyType
import typings.reactRelay.helpersMod.KeyTypeData
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFragmentMod {
  
  @JSImport("react-relay/lib/relay-experimental/useFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFragment[TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, js.Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(KeyTypeData[TKey, js.Any]) | Null]
  inline def useFragment[TKey /* <: ArrayKeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[ArrayKeyTypeData[TKey, js.Any]]
  
  inline def useFragment_TKey_ArrayKeyTypeAny[TKey /* <: ArrayKeyType[js.Any] */](fragmentInput: GraphQLTaggedNode): (ArrayKeyTypeData[TKey, js.Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(ArrayKeyTypeData[TKey, js.Any]) | Null]
  
  inline def useFragment_TKey_ArrayKeyTypeAny_Union[TKey /* <: ArrayKeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (ArrayKeyTypeData[TKey, js.Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(ArrayKeyTypeData[TKey, js.Any]) | Null]
  
  inline def useFragment_TKey_KeyTypeAny_KeyTypeData[TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[KeyTypeData[TKey, js.Any]]
  
  inline def useFragment_TKey_KeyTypeAny_Union[TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, js.Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(KeyTypeData[TKey, js.Any]) | Null]
}

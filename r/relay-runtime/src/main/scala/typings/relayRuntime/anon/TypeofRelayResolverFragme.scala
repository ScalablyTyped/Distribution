package typings.relayRuntime.anon

import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.resolverFragmentsMod.ArrayKeyType
import typings.relayRuntime.resolverFragmentsMod.ArrayKeyTypeData
import typings.relayRuntime.resolverFragmentsMod.KeyType
import typings.relayRuntime.resolverFragmentsMod.KeyTypeData
import typings.relayRuntime.resolverFragmentsMod.ResolverContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRelayResolverFragme extends StObject {
  
  val RESOLVER_FRAGMENT_MISSING_DATA_SENTINEL: Any = js.native
  
  def readFragment[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, Any]) | Null = js.native
  def readFragment[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, Any]) | Null = js.native
  @JSName("readFragment")
  def readFragment_TKey_ArrayKeyTypeData[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, Any] = js.native
  @JSName("readFragment")
  def readFragment_TKey_KeyTypeData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, Any] = js.native
  
  def withResolverContext[T](context: ResolverContext, cb: js.Function0[T]): T = js.native
}

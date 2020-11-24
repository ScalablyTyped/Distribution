package typings.reactRelay

import typings.reactRelay.helpersMod.ArrayKeyType
import typings.reactRelay.helpersMod.ArrayKeyTypeData
import typings.reactRelay.helpersMod.KeyType
import typings.reactRelay.helpersMod.KeyTypeData
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/useFragment", JSImport.Namespace)
@js.native
object useFragmentMod extends js.Object {
  
  def useFragment[TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, _]) | Null = js.native
  def useFragment[TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, _]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyTypeWildcard[TKey /* <: ArrayKeyType[_] */](fragmentInput: GraphQLTaggedNode): (ArrayKeyTypeData[TKey, _]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyTypeWildcard[TKey /* <: ArrayKeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (ArrayKeyTypeData[TKey, _]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyTypeWildcard_ArrayKeyTypeData[TKey /* <: ArrayKeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, _] = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyTypeWildcard_KeyTypeData[TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, _] = js.native
}

package typings.relayRuntime

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.readerNodeMod.ReaderInlineDataFragment
import typings.relayRuntime.readerNodeMod.ReaderPaginationFragment
import typings.relayRuntime.readerNodeMod.ReaderRefetchableFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", JSImport.Namespace)
@js.native
object relayModernGraphQLTagMod extends js.Object {
  
  def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = js.native
  
  def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = js.native
  
  def getNode(taggedNode: js.Any): js.Any = js.native
  
  def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = js.native
  
  def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = js.native
  
  def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
  
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  
  def isFragment(node: GraphQLTaggedNode): Boolean = js.native
  
  def isInlineDataFragment(node: GraphQLTaggedNode): Boolean = js.native
  
  def isRequest(node: GraphQLTaggedNode): Boolean = js.native
  
  trait _GraphQLTaggedNode extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.readerNodeMod.ReaderFragment
    - typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
    - js.Function0[
  typings.relayRuntime.readerNodeMod.ReaderFragment | typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest]
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest])
}

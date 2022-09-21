package typings.relayRuntime

import typings.relayRuntime.normalizationNodeMod.NormalizationOperation
import typings.relayRuntime.readerNodeMod.ReaderArgumentDefinition
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.readerNodeMod.ReaderInlineDataFragment
import typings.relayRuntime.readerNodeMod.ReaderPaginationFragment
import typings.relayRuntime.readerNodeMod.ReaderRefetchableFragment
import typings.relayRuntime.readerNodeMod.ReaderSelection
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernGraphQLTagMod {
  
  @JSImport("relay-runtime/lib/query/RelayModernGraphQLTag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderFragment]
  
  inline def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("getInlineDataFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderInlineDataFragment]
  
  inline def getNode(taggedNode: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderPaginationFragment | Null]
  
  inline def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefetchableFragment")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ReaderRefetchableFragment | Null]
  
  inline def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(taggedNode.asInstanceOf[js.Any]).asInstanceOf[ConcreteRequest]
  
  inline def graphql(strings: Any): GraphQLTaggedNode = ^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(strings.asInstanceOf[js.Any]).asInstanceOf[GraphQLTaggedNode]
  
  inline def isFragment(node: GraphQLTaggedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInlineDataFragment(node: GraphQLTaggedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInlineDataFragment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRequest(node: GraphQLTaggedNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequest")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.readerNodeMod.ReaderFragment
    - typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
    - js.Function0[
  typings.relayRuntime.readerNodeMod.ReaderFragment | typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest]
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest])
  
  trait _GraphQLTaggedNode extends StObject
  object _GraphQLTaggedNode {
    
    inline def ConcreteRequest(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest]
    }
    
    inline def ReaderFragment(
      argumentDefinitions: js.Array[ReaderArgumentDefinition],
      kind: String,
      name: String,
      selections: js.Array[ReaderSelection],
      `type`: String
    ): typings.relayRuntime.readerNodeMod.ReaderFragment = {
      val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderFragment]
    }
  }
}

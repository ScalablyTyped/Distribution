package typings.relayRuntime

import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation
import typings.relayRuntime.libUtilReaderNodeMod.ReaderArgumentDefinition
import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
import typings.relayRuntime.libUtilReaderNodeMod.ReaderPaginationFragment
import typings.relayRuntime.libUtilReaderNodeMod.ReaderRefetchableFragment
import typings.relayRuntime.libUtilReaderNodeMod.ReaderSelection
import typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQueryRelayModernGraphQLTagMod {
  
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
    - typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
    - typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
    - typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
    - js.Function0[
  typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment | typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest | typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment]
  */
  type GraphQLTaggedNode = _GraphQLTaggedNode | (js.Function0[ReaderFragment | ConcreteRequest | ReaderInlineDataFragment])
  
  trait _GraphQLTaggedNode extends StObject
  object _GraphQLTaggedNode {
    
    inline def ConcreteRequest(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest]
    }
    
    inline def ReaderFragment(
      argumentDefinitions: js.Array[ReaderArgumentDefinition],
      kind: String,
      name: String,
      selections: js.Array[ReaderSelection],
      `type`: String
    ): typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment = {
      val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment]
    }
    
    inline def ReaderInlineDataFragment(kind: String, name: String): typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment]
    }
  }
}

package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.normalizationNodeMod.NormalizationOperation
import typings.relayRuntime.normalizationNodeMod.NormalizationSelection
import typings.relayRuntime.readerNodeMod.ReaderArgumentDefinition
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.readerNodeMod.ReaderSelection
import typings.relayRuntime.relayModernGraphQLTagMod._GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeStrings.ClientExtension
import typings.relayRuntime.relayRuntimeStrings.Condition
import typings.relayRuntime.relayRuntimeStrings.Connection
import typings.relayRuntime.relayRuntimeStrings.Defer
import typings.relayRuntime.relayRuntimeStrings.Fragment
import typings.relayRuntime.relayRuntimeStrings.FragmentSpread
import typings.relayRuntime.relayRuntimeStrings.InlineDataFragment
import typings.relayRuntime.relayRuntimeStrings.InlineDataFragmentSpread
import typings.relayRuntime.relayRuntimeStrings.InlineFragment
import typings.relayRuntime.relayRuntimeStrings.LinkedField
import typings.relayRuntime.relayRuntimeStrings.LinkedHandle
import typings.relayRuntime.relayRuntimeStrings.ListValue
import typings.relayRuntime.relayRuntimeStrings.Literal
import typings.relayRuntime.relayRuntimeStrings.LocalArgument
import typings.relayRuntime.relayRuntimeStrings.ModuleImport
import typings.relayRuntime.relayRuntimeStrings.ObjectValue
import typings.relayRuntime.relayRuntimeStrings.Operation
import typings.relayRuntime.relayRuntimeStrings.Request
import typings.relayRuntime.relayRuntimeStrings.RootArgument
import typings.relayRuntime.relayRuntimeStrings.ScalarField
import typings.relayRuntime.relayRuntimeStrings.ScalarHandle
import typings.relayRuntime.relayRuntimeStrings.SplitOperation
import typings.relayRuntime.relayRuntimeStrings.Stream
import typings.relayRuntime.relayRuntimeStrings.TypeDiscriminator
import typings.relayRuntime.relayRuntimeStrings.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayConcreteNodeMod {
  
  object RelayConcreteNode {
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CLIENT_EXTENSION")
    @js.native
    def CLIENT_EXTENSION: ClientExtension = js.native
    @scala.inline
    def CLIENT_EXTENSION_=(x: ClientExtension): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CONDITION")
    @js.native
    def CONDITION: Condition = js.native
    @scala.inline
    def CONDITION_=(x: Condition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONDITION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CONNECTION")
    @js.native
    def CONNECTION: Connection = js.native
    @scala.inline
    def CONNECTION_=(x: Connection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.DEFER")
    @js.native
    def DEFER: Defer = js.native
    @scala.inline
    def DEFER_=(x: Defer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.FRAGMENT")
    @js.native
    def FRAGMENT: Fragment = js.native
    @scala.inline
    def FRAGMENT_=(x: Fragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.FRAGMENT_SPREAD")
    @js.native
    def FRAGMENT_SPREAD: FragmentSpread = js.native
    @scala.inline
    def FRAGMENT_SPREAD_=(x: FragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.INLINE_DATA_FRAGMENT")
    @js.native
    def INLINE_DATA_FRAGMENT: InlineDataFragment = js.native
    @scala.inline
    def INLINE_DATA_FRAGMENT_=(x: InlineDataFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.INLINE_DATA_FRAGMENT_SPREAD")
    @js.native
    def INLINE_DATA_FRAGMENT_SPREAD: InlineDataFragmentSpread = js.native
    @scala.inline
    def INLINE_DATA_FRAGMENT_SPREAD_=(x: InlineDataFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.INLINE_FRAGMENT")
    @js.native
    def INLINE_FRAGMENT: InlineFragment = js.native
    @scala.inline
    def INLINE_FRAGMENT_=(x: InlineFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LINKED_FIELD")
    @js.native
    def LINKED_FIELD: LinkedField = js.native
    @scala.inline
    def LINKED_FIELD_=(x: LinkedField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LINKED_HANDLE")
    @js.native
    def LINKED_HANDLE: LinkedHandle = js.native
    @scala.inline
    def LINKED_HANDLE_=(x: LinkedHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LIST_VALUE")
    @js.native
    def LIST_VALUE: ListValue = js.native
    @scala.inline
    def LIST_VALUE_=(x: ListValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LITERAL")
    @js.native
    def LITERAL: Literal = js.native
    @scala.inline
    def LITERAL_=(x: Literal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LITERAL")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LOCAL_ARGUMENT")
    @js.native
    def LOCAL_ARGUMENT: LocalArgument = js.native
    @scala.inline
    def LOCAL_ARGUMENT_=(x: LocalArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.MODULE_IMPORT")
    @js.native
    def MODULE_IMPORT: ModuleImport = js.native
    @scala.inline
    def MODULE_IMPORT_=(x: ModuleImport): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODULE_IMPORT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.OBJECT_VALUE")
    @js.native
    def OBJECT_VALUE: ObjectValue = js.native
    @scala.inline
    def OBJECT_VALUE_=(x: ObjectValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.OPERATION")
    @js.native
    def OPERATION: Operation = js.native
    @scala.inline
    def OPERATION_=(x: Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.REQUEST")
    @js.native
    def REQUEST: Request = js.native
    @scala.inline
    def REQUEST_=(x: Request): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.ROOT_ARGUMENT")
    @js.native
    def ROOT_ARGUMENT: RootArgument = js.native
    @scala.inline
    def ROOT_ARGUMENT_=(x: RootArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.SCALAR_FIELD")
    @js.native
    def SCALAR_FIELD: ScalarField = js.native
    @scala.inline
    def SCALAR_FIELD_=(x: ScalarField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.SCALAR_HANDLE")
    @js.native
    def SCALAR_HANDLE: ScalarHandle = js.native
    @scala.inline
    def SCALAR_HANDLE_=(x: ScalarHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.SPLIT_OPERATION")
    @js.native
    def SPLIT_OPERATION: SplitOperation = js.native
    @scala.inline
    def SPLIT_OPERATION_=(x: SplitOperation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPLIT_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.STREAM")
    @js.native
    def STREAM: Stream = js.native
    @scala.inline
    def STREAM_=(x: Stream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.TYPE_DISCRIMINATOR")
    @js.native
    def TYPE_DISCRIMINATOR: TypeDiscriminator = js.native
    @scala.inline
    def TYPE_DISCRIMINATOR_=(x: TypeDiscriminator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_DISCRIMINATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.VARIABLE")
    @js.native
    def VARIABLE: Variable = js.native
    @scala.inline
    def VARIABLE_=(x: Variable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VARIABLE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ConcreteRequest
    extends GeneratedNode
       with _GraphQLTaggedNode {
    
    // 'Request';
    val fragment: ReaderFragment = js.native
    
    val kind: String = js.native
    
    val operation: NormalizationOperation = js.native
    
    val params: RequestParameters = js.native
  }
  object ConcreteRequest {
    
    @scala.inline
    def apply(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcreteRequest]
    }
    
    @scala.inline
    implicit class ConcreteRequestMutableBuilder[Self <: ConcreteRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragment(value: ReaderFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperation(value: NormalizationOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
    - typings.relayRuntime.readerNodeMod.ReaderFragment
    - typings.relayRuntime.readerNodeMod.ReaderInlineDataFragment
    - typings.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
  */
  trait GeneratedNode extends StObject
  object GeneratedNode {
    
    @scala.inline
    def ConcreteRequest(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest]
    }
    
    @scala.inline
    def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.normalizationNodeMod.NormalizationSplitOperation = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.normalizationNodeMod.NormalizationSplitOperation]
    }
    
    @scala.inline
    def ReaderFragment(
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
    
    @scala.inline
    def ReaderInlineDataFragment(kind: InlineDataFragment, name: String): typings.relayRuntime.readerNodeMod.ReaderInlineDataFragment = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.readerNodeMod.ReaderInlineDataFragment]
    }
  }
  
  @js.native
  trait RequestParameters extends StObject {
    
    val cacheID: js.UndefOr[String | Null] = js.native
    
    // 'mutation' | 'query' | 'subscription';
    val id: js.UndefOr[String | Null] = js.native
    
    val metadata: StringDictionary[js.Any] = js.native
    
    val name: String = js.native
    
    val operationKind: String = js.native
    
    val text: js.UndefOr[String | Null] = js.native
  }
  object RequestParameters {
    
    @scala.inline
    def apply(metadata: StringDictionary[js.Any], name: String, operationKind: String): RequestParameters = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestParameters]
    }
    
    @scala.inline
    implicit class RequestParametersMutableBuilder[Self <: RequestParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheID(value: String): Self = StObject.set(x, "cacheID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheIDNull: Self = StObject.set(x, "cacheID", null)
      
      @scala.inline
      def setCacheIDUndefined: Self = StObject.set(x, "cacheID", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationKind(value: String): Self = StObject.set(x, "operationKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}

package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.Get
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod._GraphQLTaggedNode
import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationOperation
import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationRootNode
import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSelection
import typings.relayRuntime.libUtilReaderNodeMod.ReaderArgumentDefinition
import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayRuntime.libUtilReaderNodeMod.ReaderSelection
import typings.relayRuntime.relayRuntimeStrings.ActorChange
import typings.relayRuntime.relayRuntimeStrings.AliasedFragmentSpread
import typings.relayRuntime.relayRuntimeStrings.AliasedInlineFragmentSpread
import typings.relayRuntime.relayRuntimeStrings.ClientComponent
import typings.relayRuntime.relayRuntimeStrings.ClientEdgeToClientObject
import typings.relayRuntime.relayRuntimeStrings.ClientEdgeToServerObject
import typings.relayRuntime.relayRuntimeStrings.ClientExtension
import typings.relayRuntime.relayRuntimeStrings.Condition
import typings.relayRuntime.relayRuntimeStrings.Connection
import typings.relayRuntime.relayRuntimeStrings.Defer
import typings.relayRuntime.relayRuntimeStrings.FlightField
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
import typings.relayRuntime.relayRuntimeStrings.RelayLiveResolver
import typings.relayRuntime.relayRuntimeStrings.RelayResolver
import typings.relayRuntime.relayRuntimeStrings.Request
import typings.relayRuntime.relayRuntimeStrings.RequiredField
import typings.relayRuntime.relayRuntimeStrings.RootArgument
import typings.relayRuntime.relayRuntimeStrings.ScalarField
import typings.relayRuntime.relayRuntimeStrings.ScalarHandle
import typings.relayRuntime.relayRuntimeStrings.SplitOperation
import typings.relayRuntime.relayRuntimeStrings.Stream
import typings.relayRuntime.relayRuntimeStrings.TypeDiscriminator
import typings.relayRuntime.relayRuntimeStrings.UpdatableQuery
import typings.relayRuntime.relayRuntimeStrings.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilRelayConcreteNodeMod {
  
  object RelayConcreteNode {
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.ACTOR_CHANGE")
    @js.native
    def ACTOR_CHANGE: ActorChange = js.native
    inline def ACTOR_CHANGE_=(x: ActorChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTOR_CHANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.ALIASED_FRAGMENT_SPREAD")
    @js.native
    def ALIASED_FRAGMENT_SPREAD: AliasedFragmentSpread = js.native
    inline def ALIASED_FRAGMENT_SPREAD_=(x: AliasedFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIASED_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.ALIASED_INLINE_FRAGMENT_SPREAD")
    @js.native
    def ALIASED_INLINE_FRAGMENT_SPREAD: AliasedInlineFragmentSpread = js.native
    inline def ALIASED_INLINE_FRAGMENT_SPREAD_=(x: AliasedInlineFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIASED_INLINE_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CLIENT_COMPONENT")
    @js.native
    def CLIENT_COMPONENT: ClientComponent = js.native
    inline def CLIENT_COMPONENT_=(x: ClientComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_COMPONENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CLIENT_EDGE_TO_CLIENT_OBJECT")
    @js.native
    def CLIENT_EDGE_TO_CLIENT_OBJECT: ClientEdgeToClientObject = js.native
    inline def CLIENT_EDGE_TO_CLIENT_OBJECT_=(x: ClientEdgeToClientObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EDGE_TO_CLIENT_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CLIENT_EDGE_TO_SERVER_OBJECT")
    @js.native
    def CLIENT_EDGE_TO_SERVER_OBJECT: ClientEdgeToServerObject = js.native
    inline def CLIENT_EDGE_TO_SERVER_OBJECT_=(x: ClientEdgeToServerObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EDGE_TO_SERVER_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CLIENT_EXTENSION")
    @js.native
    def CLIENT_EXTENSION: ClientExtension = js.native
    inline def CLIENT_EXTENSION_=(x: ClientExtension): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CONDITION")
    @js.native
    def CONDITION: Condition = js.native
    inline def CONDITION_=(x: Condition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONDITION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.CONNECTION")
    @js.native
    def CONNECTION: Connection = js.native
    inline def CONNECTION_=(x: Connection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.DEFER")
    @js.native
    def DEFER: Defer = js.native
    inline def DEFER_=(x: Defer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.FLIGHT_FIELD")
    @js.native
    def FLIGHT_FIELD: FlightField = js.native
    inline def FLIGHT_FIELD_=(x: FlightField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLIGHT_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.FRAGMENT")
    @js.native
    def FRAGMENT: Fragment = js.native
    inline def FRAGMENT_=(x: Fragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.FRAGMENT_SPREAD")
    @js.native
    def FRAGMENT_SPREAD: FragmentSpread = js.native
    inline def FRAGMENT_SPREAD_=(x: FragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.INLINE_DATA_FRAGMENT")
    @js.native
    def INLINE_DATA_FRAGMENT: InlineDataFragment = js.native
    inline def INLINE_DATA_FRAGMENT_=(x: InlineDataFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.INLINE_DATA_FRAGMENT_SPREAD")
    @js.native
    def INLINE_DATA_FRAGMENT_SPREAD: InlineDataFragmentSpread = js.native
    inline def INLINE_DATA_FRAGMENT_SPREAD_=(x: InlineDataFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.INLINE_FRAGMENT")
    @js.native
    def INLINE_FRAGMENT: InlineFragment = js.native
    inline def INLINE_FRAGMENT_=(x: InlineFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LINKED_FIELD")
    @js.native
    def LINKED_FIELD: LinkedField = js.native
    inline def LINKED_FIELD_=(x: LinkedField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LINKED_HANDLE")
    @js.native
    def LINKED_HANDLE: LinkedHandle = js.native
    inline def LINKED_HANDLE_=(x: LinkedHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LIST_VALUE")
    @js.native
    def LIST_VALUE: ListValue = js.native
    inline def LIST_VALUE_=(x: ListValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LITERAL")
    @js.native
    def LITERAL: Literal = js.native
    inline def LITERAL_=(x: Literal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LITERAL")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.LOCAL_ARGUMENT")
    @js.native
    def LOCAL_ARGUMENT: LocalArgument = js.native
    inline def LOCAL_ARGUMENT_=(x: LocalArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.MODULE_IMPORT")
    @js.native
    def MODULE_IMPORT: ModuleImport = js.native
    inline def MODULE_IMPORT_=(x: ModuleImport): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODULE_IMPORT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.OBJECT_VALUE")
    @js.native
    def OBJECT_VALUE: ObjectValue = js.native
    inline def OBJECT_VALUE_=(x: ObjectValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.OPERATION")
    @js.native
    def OPERATION: Operation = js.native
    inline def OPERATION_=(x: Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.RELAY_LIVE_RESOLVER")
    @js.native
    def RELAY_LIVE_RESOLVER: RelayLiveResolver = js.native
    inline def RELAY_LIVE_RESOLVER_=(x: RelayLiveResolver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELAY_LIVE_RESOLVER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.RELAY_RESOLVER")
    @js.native
    def RELAY_RESOLVER: RelayResolver = js.native
    inline def RELAY_RESOLVER_=(x: RelayResolver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELAY_RESOLVER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.REQUEST")
    @js.native
    def REQUEST: Request = js.native
    inline def REQUEST_=(x: Request): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.REQUIRED_FIELD")
    @js.native
    def REQUIRED_FIELD: RequiredField = js.native
    inline def REQUIRED_FIELD_=(x: RequiredField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUIRED_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.ROOT_ARGUMENT")
    @js.native
    def ROOT_ARGUMENT: RootArgument = js.native
    inline def ROOT_ARGUMENT_=(x: RootArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.SCALAR_FIELD")
    @js.native
    def SCALAR_FIELD: ScalarField = js.native
    inline def SCALAR_FIELD_=(x: ScalarField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.SCALAR_HANDLE")
    @js.native
    def SCALAR_HANDLE: ScalarHandle = js.native
    inline def SCALAR_HANDLE_=(x: ScalarHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.SPLIT_OPERATION")
    @js.native
    def SPLIT_OPERATION: SplitOperation = js.native
    inline def SPLIT_OPERATION_=(x: SplitOperation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPLIT_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.STREAM")
    @js.native
    def STREAM: Stream = js.native
    inline def STREAM_=(x: Stream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.TYPE_DISCRIMINATOR")
    @js.native
    def TYPE_DISCRIMINATOR: TypeDiscriminator = js.native
    inline def TYPE_DISCRIMINATOR_=(x: TypeDiscriminator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_DISCRIMINATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.UPDATABLE_QUERY")
    @js.native
    def UPDATABLE_QUERY: UpdatableQuery = js.native
    inline def UPDATABLE_QUERY_=(x: UpdatableQuery): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATABLE_QUERY")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime/lib/util/RelayConcreteNode", "RelayConcreteNode.VARIABLE")
    @js.native
    def VARIABLE: Variable = js.native
    inline def VARIABLE_=(x: Variable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VARIABLE")(x.asInstanceOf[js.Any])
  }
  
  trait ConcreteRequest
    extends StObject
       with GeneratedNode
       with NormalizationRootNode
       with _GraphQLTaggedNode {
    
    // 'Request';
    val fragment: ReaderFragment
    
    val kind: String
    
    val operation: NormalizationOperation
    
    val params: RequestParameters
  }
  object ConcreteRequest {
    
    inline def apply(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcreteRequest]
    }
    
    extension [Self <: ConcreteRequest](x: Self) {
      
      inline def setFragment(value: ReaderFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: NormalizationOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConcreteUpdatableQuery
    extends StObject
       with GeneratedNode {
    
    // 'UpdatableQuery';
    val fragment: ReaderFragment
    
    val kind: String
  }
  object ConcreteUpdatableQuery {
    
    inline def apply(fragment: ReaderFragment, kind: String): ConcreteUpdatableQuery = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcreteUpdatableQuery]
    }
    
    extension [Self <: ConcreteUpdatableQuery](x: Self) {
      
      inline def setFragment(value: ReaderFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
    - typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
    - typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
    - typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
    - typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteUpdatableQuery
  */
  trait GeneratedNode extends StObject
  object GeneratedNode {
    
    inline def ConcreteRequest(
      fragment: ReaderFragment,
      kind: String,
      operation: NormalizationOperation,
      params: RequestParameters
    ): typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest]
    }
    
    inline def ConcreteUpdatableQuery(fragment: ReaderFragment, kind: String): typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteUpdatableQuery = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteUpdatableQuery]
    }
    
    inline def NormalizationSplitOperation(kind: String, name: String, selections: js.Array[NormalizationSelection]): typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation]
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
  
  type ProvidedVariablesType = StringDictionary[Get]
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.anon.Id
    - typings.relayRuntime.anon.CacheID
  */
  trait RequestParameters extends StObject
  object RequestParameters {
    
    inline def CacheID(cacheID: String, id: Null, metadata: StringDictionary[Any], name: String, operationKind: String): typings.relayRuntime.anon.CacheID = {
      val __obj = js.Dynamic.literal(cacheID = cacheID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any], text = null)
      __obj.asInstanceOf[typings.relayRuntime.anon.CacheID]
    }
    
    inline def Id(id: String, metadata: StringDictionary[Any], name: String, operationKind: String, text: Null): typings.relayRuntime.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.anon.Id]
    }
  }
}

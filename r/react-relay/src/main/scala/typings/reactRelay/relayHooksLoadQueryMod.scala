package typings.reactRelay

import typings.reactRelay.relayHooksEntryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.relayHooksEntryPointTypesMod.LoadQueryOptions
import typings.reactRelay.relayHooksEntryPointTypesMod.PreloadableConcreteRequest
import typings.reactRelay.relayHooksEntryPointTypesMod.PreloadedQuery
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksLoadQueryMod {
  
  @JSImport("react-relay/relay-hooks/loadQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery]
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: Unit,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](environment: Environment, preloadableRequest: GraphQLTaggedNode, variables: VariablesOf[TQuery]): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: Unit,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
}

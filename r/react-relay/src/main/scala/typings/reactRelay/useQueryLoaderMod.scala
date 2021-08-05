package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.LoadQueryOptions
import typings.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typings.reactRelay.entryPointTypesMod.PreloadedQuery
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.DisposeFn
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useQueryLoaderMod {
  
  @JSImport("react-relay/lib/relay-experimental/useQueryLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: PreloadableConcreteRequest[TQuery]): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: GraphQLTaggedNode): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  
  type useQueryLoaderHookType[TQuery /* <: OperationType */] = js.Tuple3[
    js.UndefOr[
      (PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, js.Any]]]) | Null
    ], 
    js.Function2[
      /* variables */ VariablesOf[TQuery], 
      /* options */ js.UndefOr[LoadQueryOptions], 
      Unit
    ], 
    DisposeFn
  ]
}

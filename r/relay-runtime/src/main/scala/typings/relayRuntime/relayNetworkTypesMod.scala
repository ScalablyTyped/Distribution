package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.Column
import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayObservableMod.ObservableFromValue
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayRuntimeStrings.CRITICAL
import typings.relayRuntime.relayRuntimeStrings.ERROR
import typings.relayRuntime.relayRuntimeStrings.WARNING
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayNetworkTypesMod {
  
  type ExecuteFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | Null], 
    RelayObservable[GraphQLResponse]
  ]
  
  type FetchFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* uploadables */ js.UndefOr[UploadableMap | Null], 
    ObservableFromValue[GraphQLResponse]
  ]
  
  type GraphQLResponse = GraphQLSingularResponse | js.Array[GraphQLSingularResponse]
  
  trait GraphQLResponseWithData
    extends StObject
       with GraphQLSingularResponse {
    
    var data: PayloadData
    
    var errors: js.UndefOr[js.Array[PayloadError]] = js.undefined
    
    var extensions: js.UndefOr[PayloadExtensions] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[js.Array[String | Double]] = js.undefined
  }
  object GraphQLResponseWithData {
    
    inline def apply(data: PayloadData): GraphQLResponseWithData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLResponseWithData]
    }
    
    extension [Self <: GraphQLResponseWithData](x: Self) {
      
      inline def setData(value: PayloadData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[PayloadError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: PayloadError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setExtensions(value: PayloadExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait GraphQLResponseWithExtensionsOnly
    extends StObject
       with GraphQLSingularResponse {
    
    // Per https://spec.graphql.org/June2018/#sec-Errors
    // > If the data entry in the response is not present, the errors entry
    // > in the response must not be empty. It must contain at least one error
    // This means a payload has to have either a data key or an errors key:
    // but the spec leaves room for the combination of data: null plus extensions
    // since `data: null` is a *required* output if there was an error during
    // execution, but the inverse is not described in the sepc: `data: null`
    // does not necessarily indicate that there was an error.
    var data: Null
    
    var extensions: PayloadExtensions
  }
  object GraphQLResponseWithExtensionsOnly {
    
    inline def apply(data: Null, extensions: PayloadExtensions): GraphQLResponseWithExtensionsOnly = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLResponseWithExtensionsOnly]
    }
    
    extension [Self <: GraphQLResponseWithExtensionsOnly](x: Self) {
      
      inline def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExtensions(value: PayloadExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphQLResponseWithoutData
    extends StObject
       with GraphQLSingularResponse {
    
    var data: js.UndefOr[PayloadData] = js.undefined
    
    var errors: js.Array[PayloadError]
    
    var extensions: js.UndefOr[PayloadExtensions] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[js.Array[String | Double]] = js.undefined
  }
  object GraphQLResponseWithoutData {
    
    inline def apply(errors: js.Array[PayloadError]): GraphQLResponseWithoutData = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLResponseWithoutData]
    }
    
    extension [Self <: GraphQLResponseWithoutData](x: Self) {
      
      inline def setData(value: PayloadData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setErrors(value: js.Array[PayloadError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: PayloadError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setExtensions(value: PayloadExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithData
    - typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithExtensionsOnly
    - typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithoutData
  */
  trait GraphQLSingularResponse extends StObject
  object GraphQLSingularResponse {
    
    inline def GraphQLResponseWithData(data: PayloadData): typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithData]
    }
    
    inline def GraphQLResponseWithExtensionsOnly(data: Null, extensions: PayloadExtensions): typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithExtensionsOnly = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithExtensionsOnly]
    }
    
    inline def GraphQLResponseWithoutData(errors: js.Array[PayloadError]): typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithoutData = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.relayRuntime.relayNetworkTypesMod.GraphQLResponseWithoutData]
    }
  }
  
  trait LegacyObserver[T] extends StObject {
    
    var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var onNext: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.undefined
  }
  object LegacyObserver {
    
    inline def apply[T](): LegacyObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyObserver[T]]
    }
    
    extension [Self <: LegacyObserver[?], T](x: Self & LegacyObserver[T]) {
      
      inline def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
      
      inline def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnNext(value: /* data */ T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    }
  }
  
  type LogRequestInfoFunction = js.Function1[/* arg */ Any, Unit]
  
  trait Network extends StObject {
    
    def execute(request: RequestParameters, variables: Variables, cacheConfig: CacheConfig): RelayObservable[GraphQLResponse]
    def execute(
      request: RequestParameters,
      variables: Variables,
      cacheConfig: CacheConfig,
      uploadables: UploadableMap
    ): RelayObservable[GraphQLResponse]
    @JSName("execute")
    var execute_Original: ExecuteFunction
  }
  object Network {
    
    inline def apply(
      execute: (/* request */ RequestParameters, /* variables */ Variables, /* cacheConfig */ CacheConfig, /* uploadables */ js.UndefOr[UploadableMap | Null]) => RelayObservable[GraphQLResponse]
    ): Network = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction4(execute))
      __obj.asInstanceOf[Network]
    }
    
    extension [Self <: Network](x: Self) {
      
      inline def setExecute(
        value: (/* request */ RequestParameters, /* variables */ Variables, /* cacheConfig */ CacheConfig, /* uploadables */ js.UndefOr[UploadableMap | Null]) => RelayObservable[GraphQLResponse]
      ): Self = StObject.set(x, "execute", js.Any.fromFunction4(value))
    }
  }
  
  type PayloadData = StringDictionary[Any]
  
  trait PayloadError extends StObject {
    
    var locations: js.UndefOr[js.Array[Column]] = js.undefined
    
    var message: String
    
    var severity: js.UndefOr[CRITICAL | ERROR | WARNING] = js.undefined
  }
  object PayloadError {
    
    inline def apply(message: String): PayloadError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadError]
    }
    
    extension [Self <: PayloadError](x: Self) {
      
      inline def setLocations(value: js.Array[Column]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      inline def setLocationsVarargs(value: Column*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: CRITICAL | ERROR | WARNING): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    }
  }
  
  type PayloadExtensions = StringDictionary[Any]
  
  trait ReactFlightPayloadData extends StObject {
    
    val queries: js.Array[ReactFlightPayloadQuery]
    
    val tree: js.Array[ReactFlightServerTree]
  }
  object ReactFlightPayloadData {
    
    inline def apply(queries: js.Array[ReactFlightPayloadQuery], tree: js.Array[ReactFlightServerTree]): ReactFlightPayloadData = {
      val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactFlightPayloadData]
    }
    
    extension [Self <: ReactFlightPayloadData](x: Self) {
      
      inline def setQueries(value: js.Array[ReactFlightPayloadQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesVarargs(value: ReactFlightPayloadQuery*): Self = StObject.set(x, "queries", js.Array(value*))
      
      inline def setTree(value: js.Array[ReactFlightServerTree]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeVarargs(value: ReactFlightServerTree*): Self = StObject.set(x, "tree", js.Array(value*))
    }
  }
  
  trait ReactFlightPayloadQuery extends StObject {
    
    val id: Any
    
    val module: Any
    
    val response: GraphQLSingularResponse
    
    val variables: Variables
  }
  object ReactFlightPayloadQuery {
    
    inline def apply(id: Any, module: Any, response: GraphQLSingularResponse, variables: Variables): ReactFlightPayloadQuery = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactFlightPayloadQuery]
    }
    
    extension [Self <: ReactFlightPayloadQuery](x: Self) {
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setModule(value: Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: GraphQLSingularResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactFlightServerTree = Any
  
  type SubscribeFunction = js.Function4[
    /* request */ RequestParameters, 
    /* variables */ Variables, 
    /* cacheConfig */ CacheConfig, 
    /* observer */ js.UndefOr[LegacyObserver[GraphQLResponse]], 
    RelayObservable[GraphQLResponse] | Disposable
  ]
  
  type Uploadable = File | Blob
  
  type UploadableMap = StringDictionary[Uploadable]
}

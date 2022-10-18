package typings.relayRuntime

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilRelayFeatureFlagsMod {
  
  @JSImport("relay-runtime/lib/util/RelayFeatureFlags", "RelayFeatureFlags")
  @js.native
  val RelayFeatureFlags: FeatureFlags = js.native
  
  trait FeatureFlags extends StObject {
    
    var BATCH_ASYNC_MODULE_UPDATES_FN: js.UndefOr[Null | (js.Function1[/* arg */ js.Function0[Unit], Disposable])] = js.undefined
    
    var ENABLE_CLIENT_EDGES: Boolean
    
    var ENABLE_CONTAINERS_SUBSCRIBE_ON_COMMIT: Boolean
    
    var ENABLE_DO_NOT_WRAP_LIVE_QUERY: Boolean
    
    var ENABLE_FRIENDLY_QUERY_NAME_GQL_URL: Boolean
    
    var ENABLE_GETFRAGMENTIDENTIFIER_OPTIMIZATION: Boolean
    
    var ENABLE_LOAD_QUERY_REQUEST_DEDUPING: Boolean
    
    var ENABLE_NOTIFY_SUBSCRIPTION: Boolean
    
    var ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean
    
    var ENABLE_REACT_FLIGHT_COMPONENT_FIELD: Boolean
    
    var ENABLE_RELAY_RESOLVERS: Boolean
    
    var ENABLE_VARIABLE_CONNECTION_KEY: Boolean
    
    var MAX_DATA_ID_LENGTH: js.UndefOr[Double | Null] = js.undefined
    
    var STRING_INTERN_LEVEL: Double
    
    var USE_REACT_CACHE: Boolean
    
    var USE_REACT_CACHE_LEGACY_TIMEOUTS: Boolean
  }
  object FeatureFlags {
    
    inline def apply(
      ENABLE_CLIENT_EDGES: Boolean,
      ENABLE_CONTAINERS_SUBSCRIBE_ON_COMMIT: Boolean,
      ENABLE_DO_NOT_WRAP_LIVE_QUERY: Boolean,
      ENABLE_FRIENDLY_QUERY_NAME_GQL_URL: Boolean,
      ENABLE_GETFRAGMENTIDENTIFIER_OPTIMIZATION: Boolean,
      ENABLE_LOAD_QUERY_REQUEST_DEDUPING: Boolean,
      ENABLE_NOTIFY_SUBSCRIPTION: Boolean,
      ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean,
      ENABLE_REACT_FLIGHT_COMPONENT_FIELD: Boolean,
      ENABLE_RELAY_RESOLVERS: Boolean,
      ENABLE_VARIABLE_CONNECTION_KEY: Boolean,
      STRING_INTERN_LEVEL: Double,
      USE_REACT_CACHE: Boolean,
      USE_REACT_CACHE_LEGACY_TIMEOUTS: Boolean
    ): FeatureFlags = {
      val __obj = js.Dynamic.literal(ENABLE_CLIENT_EDGES = ENABLE_CLIENT_EDGES.asInstanceOf[js.Any], ENABLE_CONTAINERS_SUBSCRIBE_ON_COMMIT = ENABLE_CONTAINERS_SUBSCRIBE_ON_COMMIT.asInstanceOf[js.Any], ENABLE_DO_NOT_WRAP_LIVE_QUERY = ENABLE_DO_NOT_WRAP_LIVE_QUERY.asInstanceOf[js.Any], ENABLE_FRIENDLY_QUERY_NAME_GQL_URL = ENABLE_FRIENDLY_QUERY_NAME_GQL_URL.asInstanceOf[js.Any], ENABLE_GETFRAGMENTIDENTIFIER_OPTIMIZATION = ENABLE_GETFRAGMENTIDENTIFIER_OPTIMIZATION.asInstanceOf[js.Any], ENABLE_LOAD_QUERY_REQUEST_DEDUPING = ENABLE_LOAD_QUERY_REQUEST_DEDUPING.asInstanceOf[js.Any], ENABLE_NOTIFY_SUBSCRIPTION = ENABLE_NOTIFY_SUBSCRIPTION.asInstanceOf[js.Any], ENABLE_PARTIAL_RENDERING_DEFAULT = ENABLE_PARTIAL_RENDERING_DEFAULT.asInstanceOf[js.Any], ENABLE_REACT_FLIGHT_COMPONENT_FIELD = ENABLE_REACT_FLIGHT_COMPONENT_FIELD.asInstanceOf[js.Any], ENABLE_RELAY_RESOLVERS = ENABLE_RELAY_RESOLVERS.asInstanceOf[js.Any], ENABLE_VARIABLE_CONNECTION_KEY = ENABLE_VARIABLE_CONNECTION_KEY.asInstanceOf[js.Any], STRING_INTERN_LEVEL = STRING_INTERN_LEVEL.asInstanceOf[js.Any], USE_REACT_CACHE = USE_REACT_CACHE.asInstanceOf[js.Any], USE_REACT_CACHE_LEGACY_TIMEOUTS = USE_REACT_CACHE_LEGACY_TIMEOUTS.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureFlags]
    }
    
    extension [Self <: FeatureFlags](x: Self) {
      
      inline def setBATCH_ASYNC_MODULE_UPDATES_FN(value: /* arg */ js.Function0[Unit] => Disposable): Self = StObject.set(x, "BATCH_ASYNC_MODULE_UPDATES_FN", js.Any.fromFunction1(value))
      
      inline def setBATCH_ASYNC_MODULE_UPDATES_FNNull: Self = StObject.set(x, "BATCH_ASYNC_MODULE_UPDATES_FN", null)
      
      inline def setBATCH_ASYNC_MODULE_UPDATES_FNUndefined: Self = StObject.set(x, "BATCH_ASYNC_MODULE_UPDATES_FN", js.undefined)
      
      inline def setENABLE_CLIENT_EDGES(value: Boolean): Self = StObject.set(x, "ENABLE_CLIENT_EDGES", value.asInstanceOf[js.Any])
      
      inline def setENABLE_CONTAINERS_SUBSCRIBE_ON_COMMIT(value: Boolean): Self = StObject.set(x, "ENABLE_CONTAINERS_SUBSCRIBE_ON_COMMIT", value.asInstanceOf[js.Any])
      
      inline def setENABLE_DO_NOT_WRAP_LIVE_QUERY(value: Boolean): Self = StObject.set(x, "ENABLE_DO_NOT_WRAP_LIVE_QUERY", value.asInstanceOf[js.Any])
      
      inline def setENABLE_FRIENDLY_QUERY_NAME_GQL_URL(value: Boolean): Self = StObject.set(x, "ENABLE_FRIENDLY_QUERY_NAME_GQL_URL", value.asInstanceOf[js.Any])
      
      inline def setENABLE_GETFRAGMENTIDENTIFIER_OPTIMIZATION(value: Boolean): Self = StObject.set(x, "ENABLE_GETFRAGMENTIDENTIFIER_OPTIMIZATION", value.asInstanceOf[js.Any])
      
      inline def setENABLE_LOAD_QUERY_REQUEST_DEDUPING(value: Boolean): Self = StObject.set(x, "ENABLE_LOAD_QUERY_REQUEST_DEDUPING", value.asInstanceOf[js.Any])
      
      inline def setENABLE_NOTIFY_SUBSCRIPTION(value: Boolean): Self = StObject.set(x, "ENABLE_NOTIFY_SUBSCRIPTION", value.asInstanceOf[js.Any])
      
      inline def setENABLE_PARTIAL_RENDERING_DEFAULT(value: Boolean): Self = StObject.set(x, "ENABLE_PARTIAL_RENDERING_DEFAULT", value.asInstanceOf[js.Any])
      
      inline def setENABLE_REACT_FLIGHT_COMPONENT_FIELD(value: Boolean): Self = StObject.set(x, "ENABLE_REACT_FLIGHT_COMPONENT_FIELD", value.asInstanceOf[js.Any])
      
      inline def setENABLE_RELAY_RESOLVERS(value: Boolean): Self = StObject.set(x, "ENABLE_RELAY_RESOLVERS", value.asInstanceOf[js.Any])
      
      inline def setENABLE_VARIABLE_CONNECTION_KEY(value: Boolean): Self = StObject.set(x, "ENABLE_VARIABLE_CONNECTION_KEY", value.asInstanceOf[js.Any])
      
      inline def setMAX_DATA_ID_LENGTH(value: Double): Self = StObject.set(x, "MAX_DATA_ID_LENGTH", value.asInstanceOf[js.Any])
      
      inline def setMAX_DATA_ID_LENGTHNull: Self = StObject.set(x, "MAX_DATA_ID_LENGTH", null)
      
      inline def setMAX_DATA_ID_LENGTHUndefined: Self = StObject.set(x, "MAX_DATA_ID_LENGTH", js.undefined)
      
      inline def setSTRING_INTERN_LEVEL(value: Double): Self = StObject.set(x, "STRING_INTERN_LEVEL", value.asInstanceOf[js.Any])
      
      inline def setUSE_REACT_CACHE(value: Boolean): Self = StObject.set(x, "USE_REACT_CACHE", value.asInstanceOf[js.Any])
      
      inline def setUSE_REACT_CACHE_LEGACY_TIMEOUTS(value: Boolean): Self = StObject.set(x, "USE_REACT_CACHE_LEGACY_TIMEOUTS", value.asInstanceOf[js.Any])
    }
  }
}

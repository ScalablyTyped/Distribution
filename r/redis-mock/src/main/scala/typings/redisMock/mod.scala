package typings.redisMock

import typings.redis.mod.RedisClusterType
import typings.redis.mod.RedisDefaultModules
import typings.redisClient.clientMod.RedisClientOptions
import typings.redisClient.clientMod.RedisClientType
import typings.redisClient.clusterMod.RedisClusterOptions
import typings.redisClient.libCommandsMod.RedisFunctions
import typings.redisClient.libCommandsMod.RedisModules
import typings.redisClient.libCommandsMod.RedisScripts
import typings.redisClient.luaScriptMod.RedisScriptConfig
import typings.redisClient.luaScriptMod.SHA1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redis-mock", "AbortError")
  @js.native
  open class AbortError ()
    extends typings.redis.mod.AbortError
  
  @JSImport("redis-mock", "AggregateGroupByReducers")
  @js.native
  object AggregateGroupByReducers extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisSearch.aggregateMod.AggregateGroupByReducers & String] = js.native
    
    /* "AVG" */ val AVG: typings.redisSearch.aggregateMod.AggregateGroupByReducers.AVG & String = js.native
    
    /* "COUNT" */ val COUNT: typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT & String = js.native
    
    /* "COUNT_DISTINCT" */ val COUNT_DISTINCT: typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT_DISTINCT & String = js.native
    
    /* "COUNT_DISTINCTISH" */ val COUNT_DISTINCTISH: typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH & String = js.native
    
    /* "FIRST_VALUE" */ val FIRST_VALUE: typings.redisSearch.aggregateMod.AggregateGroupByReducers.FIRST_VALUE & String = js.native
    
    /* "MAX" */ val MAX: typings.redisSearch.aggregateMod.AggregateGroupByReducers.MAX & String = js.native
    
    /* "MIN" */ val MIN: typings.redisSearch.aggregateMod.AggregateGroupByReducers.MIN & String = js.native
    
    /* "QUANTILE" */ val QUANTILE: typings.redisSearch.aggregateMod.AggregateGroupByReducers.QUANTILE & String = js.native
    
    /* "RANDOM_SAMPLE" */ val RANDOM_SAMPLE: typings.redisSearch.aggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE & String = js.native
    
    /* "STDDEV" */ val STDDEV: typings.redisSearch.aggregateMod.AggregateGroupByReducers.STDDEV & String = js.native
    
    /* "SUM" */ val SUM: typings.redisSearch.aggregateMod.AggregateGroupByReducers.SUM & String = js.native
    
    /* "TOLIST" */ val TOLIST: typings.redisSearch.aggregateMod.AggregateGroupByReducers.TOLIST & String = js.native
    
    /* "TOLIST" */ val TO_LIST: typings.redisSearch.aggregateMod.AggregateGroupByReducers.TO_LIST & String = js.native
  }
  
  @JSImport("redis-mock", "AggregateSteps")
  @js.native
  object AggregateSteps extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisSearch.aggregateMod.AggregateSteps & String] = js.native
    
    /* "APPLY" */ val APPLY: typings.redisSearch.aggregateMod.AggregateSteps.APPLY & String = js.native
    
    /* "FILTER" */ val FILTER: typings.redisSearch.aggregateMod.AggregateSteps.FILTER & String = js.native
    
    /* "GROUPBY" */ val GROUPBY: typings.redisSearch.aggregateMod.AggregateSteps.GROUPBY & String = js.native
    
    /* "LIMIT" */ val LIMIT: typings.redisSearch.aggregateMod.AggregateSteps.LIMIT & String = js.native
    
    /* "SORTBY" */ val SORTBY: typings.redisSearch.aggregateMod.AggregateSteps.SORTBY & String = js.native
  }
  
  @JSImport("redis-mock", "ClientClosedError")
  @js.native
  open class ClientClosedError ()
    extends typings.redis.mod.ClientClosedError
  
  @JSImport("redis-mock", "ConnectionTimeoutError")
  @js.native
  open class ConnectionTimeoutError ()
    extends typings.redis.mod.ConnectionTimeoutError
  
  @JSImport("redis-mock", "DisconnectsClientError")
  @js.native
  open class DisconnectsClientError ()
    extends typings.redis.mod.DisconnectsClientError
  
  @JSImport("redis-mock", "ErrorReply")
  @js.native
  open class ErrorReply protected ()
    extends typings.redis.mod.ErrorReply {
    def this(message: String) = this()
  }
  
  @JSImport("redis-mock", "GeoReplyWith")
  @js.native
  object GeoReplyWith extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisClient.genericTransformersMod.GeoReplyWith & String] = js.native
    
    /* "WITHCOORD" */ val COORDINATES: typings.redisClient.genericTransformersMod.GeoReplyWith.COORDINATES & String = js.native
    
    /* "WITHDIST" */ val DISTANCE: typings.redisClient.genericTransformersMod.GeoReplyWith.DISTANCE & String = js.native
    
    /* "WITHHASH" */ val HASH: typings.redisClient.genericTransformersMod.GeoReplyWith.HASH & String = js.native
  }
  
  @JSImport("redis-mock", "ReconnectStrategyError")
  @js.native
  open class ReconnectStrategyError protected ()
    extends typings.redis.mod.ReconnectStrategyError {
    def this(originalError: js.Error, socketError: Any) = this()
  }
  
  @JSImport("redis-mock", "RootNodesUnavailableError")
  @js.native
  open class RootNodesUnavailableError ()
    extends typings.redis.mod.RootNodesUnavailableError
  
  @JSImport("redis-mock", "SchemaFieldTypes")
  @js.native
  object SchemaFieldTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisSearch.commandsMod.SchemaFieldTypes & String] = js.native
    
    /* "GEO" */ val GEO: typings.redisSearch.commandsMod.SchemaFieldTypes.GEO & String = js.native
    
    /* "NUMERIC" */ val NUMERIC: typings.redisSearch.commandsMod.SchemaFieldTypes.NUMERIC & String = js.native
    
    /* "TAG" */ val TAG: typings.redisSearch.commandsMod.SchemaFieldTypes.TAG & String = js.native
    
    /* "TEXT" */ val TEXT: typings.redisSearch.commandsMod.SchemaFieldTypes.TEXT & String = js.native
    
    /* "VECTOR" */ val VECTOR: typings.redisSearch.commandsMod.SchemaFieldTypes.VECTOR & String = js.native
  }
  
  @JSImport("redis-mock", "SchemaTextFieldPhonetics")
  @js.native
  object SchemaTextFieldPhonetics extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisSearch.commandsMod.SchemaTextFieldPhonetics & String] = js.native
    
    /* "dm:en" */ val DM_EN: typings.redisSearch.commandsMod.SchemaTextFieldPhonetics.DM_EN & String = js.native
    
    /* "dm:es" */ val DM_ES: typings.redisSearch.commandsMod.SchemaTextFieldPhonetics.DM_ES & String = js.native
    
    /* "dm:fr" */ val DM_FR: typings.redisSearch.commandsMod.SchemaTextFieldPhonetics.DM_FR & String = js.native
    
    /* "dm:pt" */ val FM_PT: typings.redisSearch.commandsMod.SchemaTextFieldPhonetics.FM_PT & String = js.native
  }
  
  @JSImport("redis-mock", "SocketClosedUnexpectedlyError")
  @js.native
  open class SocketClosedUnexpectedlyError ()
    extends typings.redis.mod.SocketClosedUnexpectedlyError
  
  @JSImport("redis-mock", "TimeSeriesAggregationType")
  @js.native
  object TimeSeriesAggregationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType & String] = js.native
    
    /* "avg" */ val AVERAGE: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.AVERAGE & String = js.native
    
    /* "count" */ val COUNT: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.COUNT & String = js.native
    
    /* "first" */ val FIRST: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.FIRST & String = js.native
    
    /* "last" */ val LAST: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.LAST & String = js.native
    
    /* "max" */ val MAXIMUM: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.MAXIMUM & String = js.native
    
    /* "min" */ val MINIMUM: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.MINIMUM & String = js.native
    
    /* "range" */ val RANGE: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.RANGE & String = js.native
    
    /* "std.p" */ val STD_P: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.STD_P & String = js.native
    
    /* "std.s" */ val STD_S: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.STD_S & String = js.native
    
    /* "sum" */ val SUM: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.SUM & String = js.native
    
    /* "var.p" */ val VAR_P: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.VAR_P & String = js.native
    
    /* "var.s" */ val VAR_S: typings.redisTimeSeries.commandsMod.TimeSeriesAggregationType.VAR_S & String = js.native
  }
  
  @JSImport("redis-mock", "TimeSeriesDuplicatePolicies")
  @js.native
  object TimeSeriesDuplicatePolicies extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisTimeSeries.commandsMod.TimeSeriesDuplicatePolicies & String] = js.native
    
    /* "BLOCK" */ val BLOCK: typings.redisTimeSeries.commandsMod.TimeSeriesDuplicatePolicies.BLOCK & String = js.native
    
    /* "FIRST" */ val FIRST: typings.redisTimeSeries.commandsMod.TimeSeriesDuplicatePolicies.FIRST & String = js.native
    
    /* "LAST" */ val LAST: typings.redisTimeSeries.commandsMod.TimeSeriesDuplicatePolicies.LAST & String = js.native
    
    /* "MAX" */ val MAX: typings.redisTimeSeries.commandsMod.TimeSeriesDuplicatePolicies.MAX & String = js.native
    
    /* "MIN" */ val MIN: typings.redisTimeSeries.commandsMod.TimeSeriesDuplicatePolicies.MIN & String = js.native
    
    /* "SUM" */ val SUM: typings.redisTimeSeries.commandsMod.TimeSeriesDuplicatePolicies.SUM & String = js.native
  }
  
  @JSImport("redis-mock", "TimeSeriesEncoding")
  @js.native
  object TimeSeriesEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisTimeSeries.commandsMod.TimeSeriesEncoding & String] = js.native
    
    /* "COMPRESSED" */ val COMPRESSED: typings.redisTimeSeries.commandsMod.TimeSeriesEncoding.COMPRESSED & String = js.native
    
    /* "UNCOMPRESSED" */ val UNCOMPRESSED: typings.redisTimeSeries.commandsMod.TimeSeriesEncoding.UNCOMPRESSED & String = js.native
  }
  
  @JSImport("redis-mock", "VectorAlgorithms")
  @js.native
  object VectorAlgorithms extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisSearch.commandsMod.VectorAlgorithms & String] = js.native
    
    /* "FLAT" */ val FLAT: typings.redisSearch.commandsMod.VectorAlgorithms.FLAT & String = js.native
    
    /* "HNSW" */ val HNSW: typings.redisSearch.commandsMod.VectorAlgorithms.HNSW & String = js.native
  }
  
  @JSImport("redis-mock", "WatchError")
  @js.native
  open class WatchError ()
    extends typings.redis.mod.WatchError
  
  @JSImport("redis-mock", "commandOptions")
  @js.native
  val commandOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisClient.commandOptions */ Any = js.native
  
  inline def createClient[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): RedisClientType[RedisDefaultModules & M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[RedisClientType[RedisDefaultModules & M, F, S]]
  inline def createClient[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](options: RedisClientOptions[M, F, S]): RedisClientType[RedisDefaultModules & M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[RedisClientType[RedisDefaultModules & M, F, S]]
  
  inline def createCluster[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](options: RedisClusterOptions[M, F, S]): RedisClusterType[RedisDefaultModules & M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCluster")(options.asInstanceOf[js.Any]).asInstanceOf[RedisClusterType[RedisDefaultModules & M, F, S]]
  
  inline def defineScript[S /* <: RedisScriptConfig */](script: S): S & SHA1 = ^.asInstanceOf[js.Dynamic].applyDynamic("defineScript")(script.asInstanceOf[js.Any]).asInstanceOf[S & SHA1]
}

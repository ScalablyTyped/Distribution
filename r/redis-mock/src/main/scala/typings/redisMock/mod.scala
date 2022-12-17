package typings.redisMock

import typings.redis.mod.RedisClusterType
import typings.redis.mod.RedisDefaultModules
import typings.redisClient.distLibClientMod.RedisClientOptions
import typings.redisClient.distLibClientMod.RedisClientType
import typings.redisClient.distLibClusterMod.RedisClusterOptions
import typings.redisClient.distLibCommandsMod.RedisFunctions
import typings.redisClient.distLibCommandsMod.RedisModules
import typings.redisClient.distLibCommandsMod.RedisScripts
import typings.redisClient.distLibLuaScriptMod.RedisScriptConfig
import typings.redisClient.distLibLuaScriptMod.SHA1
import typings.redisGraph.distGraphMod.GraphClientType
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
    def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers & String] = js.native
    
    /* "AVG" */ val AVG: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.AVG & String = js.native
    
    /* "COUNT" */ val COUNT: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT & String = js.native
    
    /* "COUNT_DISTINCT" */ val COUNT_DISTINCT: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCT & String = js.native
    
    /* "COUNT_DISTINCTISH" */ val COUNT_DISTINCTISH: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH & String = js.native
    
    /* "FIRST_VALUE" */ val FIRST_VALUE: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.FIRST_VALUE & String = js.native
    
    /* "MAX" */ val MAX: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MAX & String = js.native
    
    /* "MIN" */ val MIN: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MIN & String = js.native
    
    /* "QUANTILE" */ val QUANTILE: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.QUANTILE & String = js.native
    
    /* "RANDOM_SAMPLE" */ val RANDOM_SAMPLE: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE & String = js.native
    
    /* "STDDEV" */ val STDDEV: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.STDDEV & String = js.native
    
    /* "SUM" */ val SUM: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.SUM & String = js.native
    
    /* "TOLIST" */ val TOLIST: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TOLIST & String = js.native
    
    /* "TOLIST" */ val TO_LIST: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TO_LIST & String = js.native
  }
  
  @JSImport("redis-mock", "AggregateSteps")
  @js.native
  object AggregateSteps extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsAggregateMod.AggregateSteps & String] = js.native
    
    /* "APPLY" */ val APPLY: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.APPLY & String = js.native
    
    /* "FILTER" */ val FILTER: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.FILTER & String = js.native
    
    /* "GROUPBY" */ val GROUPBY: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.GROUPBY & String = js.native
    
    /* "LIMIT" */ val LIMIT: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.LIMIT & String = js.native
    
    /* "SORTBY" */ val SORTBY: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.SORTBY & String = js.native
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
    def apply(value: String): js.UndefOr[typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith & String] = js.native
    
    /* "WITHCOORD" */ val COORDINATES: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.COORDINATES & String = js.native
    
    /* "WITHDIST" */ val DISTANCE: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.DISTANCE & String = js.native
    
    /* "WITHHASH" */ val HASH: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.HASH & String = js.native
  }
  
  @JSImport("redis-mock", "Graph")
  @js.native
  open class Graph protected ()
    extends typings.redis.mod.Graph {
    def this(client: GraphClientType, name: String) = this()
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
    def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsMod.SchemaFieldTypes & String] = js.native
    
    /* "GEO" */ val GEO: typings.redisSearch.distCommandsMod.SchemaFieldTypes.GEO & String = js.native
    
    /* "NUMERIC" */ val NUMERIC: typings.redisSearch.distCommandsMod.SchemaFieldTypes.NUMERIC & String = js.native
    
    /* "TAG" */ val TAG: typings.redisSearch.distCommandsMod.SchemaFieldTypes.TAG & String = js.native
    
    /* "TEXT" */ val TEXT: typings.redisSearch.distCommandsMod.SchemaFieldTypes.TEXT & String = js.native
    
    /* "VECTOR" */ val VECTOR: typings.redisSearch.distCommandsMod.SchemaFieldTypes.VECTOR & String = js.native
  }
  
  @JSImport("redis-mock", "SchemaTextFieldPhonetics")
  @js.native
  object SchemaTextFieldPhonetics extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics & String] = js.native
    
    /* "dm:en" */ val DM_EN: typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.DM_EN & String = js.native
    
    /* "dm:es" */ val DM_ES: typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.DM_ES & String = js.native
    
    /* "dm:fr" */ val DM_FR: typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.DM_FR & String = js.native
    
    /* "dm:pt" */ val FM_PT: typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.FM_PT & String = js.native
  }
  
  @JSImport("redis-mock", "SocketClosedUnexpectedlyError")
  @js.native
  open class SocketClosedUnexpectedlyError ()
    extends typings.redis.mod.SocketClosedUnexpectedlyError
  
  @JSImport("redis-mock", "TimeSeriesAggregationType")
  @js.native
  object TimeSeriesAggregationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType & String] = js.native
    
    /* "AVG" */ val AVERAGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.AVERAGE & String = js.native
    
    /* "AVG" */ val AVG: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.AVG & String = js.native
    
    /* "COUNT" */ val COUNT: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.COUNT & String = js.native
    
    /* "FIRST" */ val FIRST: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.FIRST & String = js.native
    
    /* "LAST" */ val LAST: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.LAST & String = js.native
    
    /* "MAX" */ val MAX: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MAX & String = js.native
    
    /* "MAX" */ val MAXIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MAXIMUM & String = js.native
    
    /* "MIN" */ val MIN: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MIN & String = js.native
    
    /* "MIN" */ val MINIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MINIMUM & String = js.native
    
    /* "RANGE" */ val RANGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.RANGE & String = js.native
    
    /* "STD.P" */ val STD_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_P & String = js.native
    
    /* "STD.S" */ val STD_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_S & String = js.native
    
    /* "SUM" */ val SUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.SUM & String = js.native
    
    /* "TWA" */ val TWA: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.TWA & String = js.native
    
    /* "VAR.P" */ val VAR_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_P & String = js.native
    
    /* "VAR.S" */ val VAR_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_S & String = js.native
  }
  
  @JSImport("redis-mock", "TimeSeriesBucketTimestamp")
  @js.native
  object TimeSeriesBucketTimestamp extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp & String] = js.native
    
    /* "+" */ val HIGH: typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp.HIGH & String = js.native
    
    /* "-" */ val LOW: typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp.LOW & String = js.native
    
    /* "~" */ val MID: typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp.MID & String = js.native
  }
  
  @JSImport("redis-mock", "TimeSeriesDuplicatePolicies")
  @js.native
  object TimeSeriesDuplicatePolicies extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies & String] = js.native
    
    /* "BLOCK" */ val BLOCK: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.BLOCK & String = js.native
    
    /* "FIRST" */ val FIRST: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.FIRST & String = js.native
    
    /* "LAST" */ val LAST: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.LAST & String = js.native
    
    /* "MAX" */ val MAX: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.MAX & String = js.native
    
    /* "MIN" */ val MIN: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.MIN & String = js.native
    
    /* "SUM" */ val SUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.SUM & String = js.native
  }
  
  @JSImport("redis-mock", "TimeSeriesEncoding")
  @js.native
  object TimeSeriesEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesEncoding & String] = js.native
    
    /* "COMPRESSED" */ val COMPRESSED: typings.redisTimeSeries.distCommandsMod.TimeSeriesEncoding.COMPRESSED & String = js.native
    
    /* "UNCOMPRESSED" */ val UNCOMPRESSED: typings.redisTimeSeries.distCommandsMod.TimeSeriesEncoding.UNCOMPRESSED & String = js.native
  }
  
  @JSImport("redis-mock", "TimeSeriesReducers")
  @js.native
  object TimeSeriesReducers extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers & String] = js.native
    
    /* "AVG" */ val AVG: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.AVG & String = js.native
    
    /* "COUNT" */ val COUNT: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.COUNT & String = js.native
    
    /* "MAX" */ val MAX: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MAX & String = js.native
    
    /* "MAX" */ val MAXIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MAXIMUM & String = js.native
    
    /* "MIN" */ val MIN: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MIN & String = js.native
    
    /* "MIN" */ val MINIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MINIMUM & String = js.native
    
    /* "range" */ val RANGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.RANGE & String = js.native
    
    /* "STD.P" */ val STD_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.STD_P & String = js.native
    
    /* "STD.S" */ val STD_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.STD_S & String = js.native
    
    /* "SUM" */ val SUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.SUM & String = js.native
    
    /* "VAR.P" */ val VAR_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.VAR_P & String = js.native
    
    /* "VAR.S" */ val VAR_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.VAR_S & String = js.native
  }
  
  @JSImport("redis-mock", "VectorAlgorithms")
  @js.native
  object VectorAlgorithms extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsMod.VectorAlgorithms & String] = js.native
    
    /* "FLAT" */ val FLAT: typings.redisSearch.distCommandsMod.VectorAlgorithms.FLAT & String = js.native
    
    /* "HNSW" */ val HNSW: typings.redisSearch.distCommandsMod.VectorAlgorithms.HNSW & String = js.native
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

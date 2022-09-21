package typings.redisClient

import typings.genericPool.mod.Options
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.redisClient.anon.CommandOptionsClientComma
import typings.redisClient.anon.PartialRedisClusterClient
import typings.redisClient.clientMod.ClientCommandOptions
import typings.redisClient.clientMod.WithFunctions
import typings.redisClient.clientMod.WithModules
import typings.redisClient.clientMod.WithScripts
import typings.redisClient.clusterMultiCommandMod.RedisClusterMultiCommandType
import typings.redisClient.clusterSlotsMod.ClusterNode
import typings.redisClient.clusterSlotsMod.NodeAddress
import typings.redisClient.clusterSlotsMod.NodeAddressMap
import typings.redisClient.libCommandsMod.ConvertArgumentType
import typings.redisClient.libCommandsMod.RedisCommand
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.libCommandsMod.RedisCommandRawReply
import typings.redisClient.libCommandsMod.RedisCommandReply
import typings.redisClient.libCommandsMod.RedisCommandSignature
import typings.redisClient.libCommandsMod.RedisExtensions
import typings.redisClient.libCommandsMod.RedisFunction
import typings.redisClient.libCommandsMod.RedisFunctions
import typings.redisClient.libCommandsMod.RedisModules
import typings.redisClient.libCommandsMod.RedisScript
import typings.redisClient.libCommandsMod.RedisScripts
import typings.redisClient.socketMod.RedisSocketOptions
import typings.std.Parameters
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterMod {
  
  @JSImport("@redis/client/dist/lib/cluster", JSImport.Default)
  @js.native
  open class default[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] protected () extends RedisCluster[M, F, S] {
    def this(options: RedisClusterOptions[M, F, S]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@redis/client/dist/lib/cluster", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): RedisClusterType[M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RedisClusterType[M, F, S]]
    inline def create[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](options: RedisClusterOptions[M, F, S]): RedisClusterType[M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[RedisClusterType[M, F, S]]
    
    inline def extractFirstKey(command: RedisCommand, originalArgs: js.Array[Any], redisArgs: RedisCommandArguments): js.UndefOr[RedisCommandArgument] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFirstKey")(command.asInstanceOf[js.Any], originalArgs.asInstanceOf[js.Any], redisArgs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RedisCommandArgument]]
  }
  
  @js.native
  trait RedisCluster[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends EventEmitter {
    
    def commandsExecutor[C /* <: RedisCommand */](command: C, args: js.Array[Any]): js.Promise[RedisCommandReply[C]] = js.native
    
    def connect(): js.Promise[Unit] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def duplicate(): RedisClusterType[M, F, S] = js.native
    def duplicate(overrides: Partial[RedisClusterOptions[M, F, S]]): RedisClusterType[M, F, S] = js.native
    
    def executeFunction(name: String, fn: RedisFunction, originalArgs: js.Array[Any], redisArgs: RedisCommandArguments): js.Promise[RedisCommandRawReply] = js.native
    def executeFunction(
      name: String,
      fn: RedisFunction,
      originalArgs: js.Array[Any],
      redisArgs: RedisCommandArguments,
      options: ClientCommandOptions
    ): js.Promise[RedisCommandRawReply] = js.native
    
    def executeScript(script: RedisScript, originalArgs: js.Array[Any], redisArgs: RedisCommandArguments): js.Promise[RedisCommandRawReply] = js.native
    def executeScript(
      script: RedisScript,
      originalArgs: js.Array[Any],
      redisArgs: RedisCommandArguments,
      options: ClientCommandOptions
    ): js.Promise[RedisCommandRawReply] = js.native
    
    def functionsExecutor[F /* <: RedisFunction */](fn: F, args: js.Array[Any], name: String): js.Promise[RedisCommandReply[F]] = js.native
    
    def getMasters(): js.Array[ClusterNode[M, F, S]] = js.native
    
    def getSlotMaster(slot: Double): ClusterNode[M, F, S] = js.native
    
    def multi(): RedisClusterMultiCommandType[M, F, S] = js.native
    def multi(routing: RedisCommandArgument): RedisClusterMultiCommandType[M, F, S] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def quit(): js.Promise[Unit] = js.native
    
    def scriptsExecutor[S /* <: RedisScript */](script: S, args: js.Array[Any]): js.Promise[RedisCommandReply[S]] = js.native
    
    def sendCommand[T](firstKey: Unit, isReadonly: Boolean, args: RedisCommandArguments): js.Promise[T] = js.native
    def sendCommand[T](firstKey: Unit, isReadonly: Boolean, args: RedisCommandArguments, options: ClientCommandOptions): js.Promise[T] = js.native
    def sendCommand[T](firstKey: Unit, isReadonly: Unit, args: RedisCommandArguments): js.Promise[T] = js.native
    def sendCommand[T](firstKey: Unit, isReadonly: Unit, args: RedisCommandArguments, options: ClientCommandOptions): js.Promise[T] = js.native
    def sendCommand[T](firstKey: RedisCommandArgument, isReadonly: Boolean, args: RedisCommandArguments): js.Promise[T] = js.native
    def sendCommand[T](
      firstKey: RedisCommandArgument,
      isReadonly: Boolean,
      args: RedisCommandArguments,
      options: ClientCommandOptions
    ): js.Promise[T] = js.native
    def sendCommand[T](firstKey: RedisCommandArgument, isReadonly: Unit, args: RedisCommandArguments): js.Promise[T] = js.native
    def sendCommand[T](
      firstKey: RedisCommandArgument,
      isReadonly: Unit,
      args: RedisCommandArguments,
      options: ClientCommandOptions
    ): js.Promise[T] = js.native
  }
  
  /* Inlined std.Omit<@redis/client.@redis/client/dist/lib/client.RedisClientOptions<@redis/client.@redis/client/dist/lib/commands.RedisModules, @redis/client.@redis/client/dist/lib/commands.RedisFunctions, @redis/client.@redis/client/dist/lib/commands.RedisScripts>, 'modules' | 'functions' | 'scripts' | 'database'> */
  trait RedisClusterClientOptions extends StObject {
    
    var commandsQueueMaxLength: js.UndefOr[Double] = js.undefined
    
    var disableOfflineQueue: js.UndefOr[Boolean] = js.undefined
    
    var isolationPoolOptions: js.UndefOr[Options] = js.undefined
    
    var legacyMode: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var socket: js.UndefOr[RedisSocketOptions] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object RedisClusterClientOptions {
    
    inline def apply(): RedisClusterClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisClusterClientOptions]
    }
    
    extension [Self <: RedisClusterClientOptions](x: Self) {
      
      inline def setCommandsQueueMaxLength(value: Double): Self = StObject.set(x, "commandsQueueMaxLength", value.asInstanceOf[js.Any])
      
      inline def setCommandsQueueMaxLengthUndefined: Self = StObject.set(x, "commandsQueueMaxLength", js.undefined)
      
      inline def setDisableOfflineQueue(value: Boolean): Self = StObject.set(x, "disableOfflineQueue", value.asInstanceOf[js.Any])
      
      inline def setDisableOfflineQueueUndefined: Self = StObject.set(x, "disableOfflineQueue", js.undefined)
      
      inline def setIsolationPoolOptions(value: Options): Self = StObject.set(x, "isolationPoolOptions", value.asInstanceOf[js.Any])
      
      inline def setIsolationPoolOptionsUndefined: Self = StObject.set(x, "isolationPoolOptions", js.undefined)
      
      inline def setLegacyMode(value: Boolean): Self = StObject.set(x, "legacyMode", value.asInstanceOf[js.Any])
      
      inline def setLegacyModeUndefined: Self = StObject.set(x, "legacyMode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setSocket(value: RedisSocketOptions): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait RedisClusterOptions[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */]
    extends StObject
       with RedisExtensions[M, F, S] {
    
    var defaults: js.UndefOr[PartialRedisClusterClient] = js.undefined
    
    var maxCommandRedirections: js.UndefOr[Double] = js.undefined
    
    var nodeAddressMap: js.UndefOr[NodeAddressMap] = js.undefined
    
    var rootNodes: js.Array[RedisClusterClientOptions]
    
    var useReplicas: js.UndefOr[Boolean] = js.undefined
  }
  object RedisClusterOptions {
    
    inline def apply[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](rootNodes: js.Array[RedisClusterClientOptions]): RedisClusterOptions[M, F, S] = {
      val __obj = js.Dynamic.literal(rootNodes = rootNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedisClusterOptions[M, F, S]]
    }
    
    extension [Self <: RedisClusterOptions[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](x: Self & (RedisClusterOptions[M, F, S])) {
      
      inline def setDefaults(value: PartialRedisClusterClient): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setMaxCommandRedirections(value: Double): Self = StObject.set(x, "maxCommandRedirections", value.asInstanceOf[js.Any])
      
      inline def setMaxCommandRedirectionsUndefined: Self = StObject.set(x, "maxCommandRedirections", js.undefined)
      
      inline def setNodeAddressMap(value: NodeAddressMap): Self = StObject.set(x, "nodeAddressMap", value.asInstanceOf[js.Any])
      
      inline def setNodeAddressMapFunction1(value: /* address */ String => js.UndefOr[NodeAddress]): Self = StObject.set(x, "nodeAddressMap", js.Any.fromFunction1(value))
      
      inline def setNodeAddressMapUndefined: Self = StObject.set(x, "nodeAddressMap", js.undefined)
      
      inline def setRootNodes(value: js.Array[RedisClusterClientOptions]): Self = StObject.set(x, "rootNodes", value.asInstanceOf[js.Any])
      
      inline def setRootNodesVarargs(value: RedisClusterClientOptions*): Self = StObject.set(x, "rootNodes", js.Array(value*))
      
      inline def setUseReplicas(value: Boolean): Self = StObject.set(x, "useReplicas", value.asInstanceOf[js.Any])
      
      inline def setUseReplicasUndefined: Self = StObject.set(x, "useReplicas", js.undefined)
    }
  }
  
  type RedisClusterType[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] = (RedisCluster[M, F, S]) & WithCommands & WithModules[M] & WithFunctions[F] & WithScripts[S]
  
  /* Inlined {[ P in keyof {  APPEND :typeof APPEND,   append :typeof APPEND,   BITCOUNT :typeof BITCOUNT,   bitCount :typeof BITCOUNT,   BITFIELD_RO :typeof BITFIELD_RO,   bitFieldRo :typeof BITFIELD_RO,   BITFIELD :typeof BITFIELD,   bitField :typeof BITFIELD,   BITOP :typeof BITOP,   bitOp :typeof BITOP,   BITPOS :typeof BITPOS,   bitPos :typeof BITPOS,   BLMOVE :typeof BLMOVE,   blMove :typeof BLMOVE,   BLMPOP :typeof BLMPOP,   blmPop :typeof BLMPOP,   BLPOP :typeof BLPOP,   blPop :typeof BLPOP,   BRPOP :typeof BRPOP,   brPop :typeof BRPOP,   BRPOPLPUSH :typeof BRPOPLPUSH,   brPopLPush :typeof BRPOPLPUSH,   BZMPOP :typeof BZMPOP,   bzmPop :typeof BZMPOP,   BZPOPMAX :typeof BZPOPMAX,   bzPopMax :typeof BZPOPMAX,   BZPOPMIN :typeof BZPOPMIN,   bzPopMin :typeof BZPOPMIN,   COPY :typeof COPY,   copy :typeof COPY,   DECR :typeof DECR,   decr :typeof DECR,   DECRBY :typeof DECRBY,   decrBy :typeof DECRBY,   DEL :typeof DEL,   del :typeof DEL,   DUMP :typeof DUMP,   dump :typeof DUMP,   EVAL_RO :typeof EVAL_RO,   evalRo :typeof EVAL_RO,   EVAL :typeof EVAL,   eval :typeof EVAL,   EVALSHA :typeof EVALSHA,   evalSha :typeof EVALSHA,   EVALSHA_RO :typeof EVALSHA_RO,   evalShaRo :typeof EVALSHA_RO,   EXISTS :typeof EXISTS,   exists :typeof EXISTS,   EXPIRE :typeof EXPIRE,   expire :typeof EXPIRE,   EXPIREAT :typeof EXPIREAT,   expireAt :typeof EXPIREAT,   EXPIRETIME :typeof EXPIRETIME,   expireTime :typeof EXPIRETIME,   FCALL_RO :typeof FCALL_RO,   fCallRo :typeof FCALL_RO,   FCALL :typeof FCALL,   fCall :typeof FCALL,   GEOADD :typeof GEOADD,   geoAdd :typeof GEOADD,   GEODIST :typeof GEODIST,   geoDist :typeof GEODIST,   GEOHASH :typeof GEOHASH,   geoHash :typeof GEOHASH,   GEOPOS :typeof GEOPOS,   geoPos :typeof GEOPOS,   GEORADIUS_RO_WITH :typeof GEORADIUS_RO_WITH,   geoRadiusRoWith :typeof GEORADIUS_RO_WITH,   GEORADIUS_RO :typeof GEORADIUS_RO,   geoRadiusRo :typeof GEORADIUS_RO,   GEORADIUS_WITH :typeof GEORADIUS_WITH,   geoRadiusWith :typeof GEORADIUS_WITH,   GEORADIUS :typeof GEORADIUS,   geoRadius :typeof GEORADIUS,   GEORADIUSBYMEMBER_RO_WITH :typeof GEORADIUSBYMEMBER_RO_WITH,   geoRadiusByMemberRoWith :typeof GEORADIUSBYMEMBER_RO_WITH,   GEORADIUSBYMEMBER_RO :typeof GEORADIUSBYMEMBER_RO,   geoRadiusByMemberRo :typeof GEORADIUSBYMEMBER_RO,   GEORADIUSBYMEMBER_WITH :typeof GEORADIUSBYMEMBER_WITH,   geoRadiusByMemberWith :typeof GEORADIUSBYMEMBER_WITH,   GEORADIUSBYMEMBER :typeof GEORADIUSBYMEMBER,   geoRadiusByMember :typeof GEORADIUSBYMEMBER,   GEORADIUSBYMEMBERSTORE :typeof GEORADIUSBYMEMBERSTORE,   geoRadiusByMemberStore :typeof GEORADIUSBYMEMBERSTORE,   GEORADIUSSTORE :typeof GEORADIUSSTORE,   geoRadiusStore :typeof GEORADIUSSTORE,   GEOSEARCH_WITH :typeof GEOSEARCH_WITH,   geoSearchWith :typeof GEOSEARCH_WITH,   GEOSEARCH :typeof GEOSEARCH,   geoSearch :typeof GEOSEARCH,   GEOSEARCHSTORE :typeof GEOSEARCHSTORE,   geoSearchStore :typeof GEOSEARCHSTORE,   GET :typeof GET,   get :typeof GET,   GETBIT :typeof GETBIT,   getBit :typeof GETBIT,   GETDEL :typeof GETDEL,   getDel :typeof GETDEL,   GETEX :typeof GETEX,   getEx :typeof GETEX,   GETRANGE :typeof GETRANGE,   getRange :typeof GETRANGE,   GETSET :typeof GETSET,   getSet :typeof GETSET,   HDEL :typeof HDEL,   hDel :typeof HDEL,   HEXISTS :typeof HEXISTS,   hExists :typeof HEXISTS,   HGET :typeof HGET,   hGet :typeof HGET,   HGETALL :typeof HGETALL,   hGetAll :typeof HGETALL,   HINCRBY :typeof HINCRBY,   hIncrBy :typeof HINCRBY,   HINCRBYFLOAT :typeof HINCRBYFLOAT,   hIncrByFloat :typeof HINCRBYFLOAT,   HKEYS :typeof HKEYS,   hKeys :typeof HKEYS,   HLEN :typeof HLEN,   hLen :typeof HLEN,   HMGET :typeof HMGET,   hmGet :typeof HMGET,   HRANDFIELD_COUNT_WITHVALUES :typeof HRANDFIELD_COUNT_WITHVALUES,   hRandFieldCountWithValues :typeof HRANDFIELD_COUNT_WITHVALUES,   HRANDFIELD_COUNT :typeof HRANDFIELD_COUNT,   hRandFieldCount :typeof HRANDFIELD_COUNT,   HRANDFIELD :typeof HRANDFIELD,   hRandField :typeof HRANDFIELD,   HSCAN :typeof HSCAN,   hScan :typeof HSCAN,   HSET :typeof HSET,   hSet :typeof HSET,   HSETNX :typeof HSETNX,   hSetNX :typeof HSETNX,   HSTRLEN :typeof HSTRLEN,   hStrLen :typeof HSTRLEN,   HVALS :typeof HVALS,   hVals :typeof HVALS,   INCR :typeof INCR,   incr :typeof INCR,   INCRBY :typeof INCRBY,   incrBy :typeof INCRBY,   INCRBYFLOAT :typeof INCRBYFLOAT,   incrByFloat :typeof INCRBYFLOAT,   LCS_IDX_WITHMATCHLEN :typeof LCS_IDX_WITHMATCHLEN,   lcsIdxWithMatchLen :typeof LCS_IDX_WITHMATCHLEN,   LCS_IDX :typeof LCS_IDX,   lcsIdx :typeof LCS_IDX,   LCS_LEN :typeof LCS_LEN,   lcsLen :typeof LCS_LEN,   LCS :typeof LCS,   lcs :typeof LCS,   LINDEX :typeof LINDEX,   lIndex :typeof LINDEX,   LINSERT :typeof LINSERT,   lInsert :typeof LINSERT,   LLEN :typeof LLEN,   lLen :typeof LLEN,   LMOVE :typeof LMOVE,   lMove :typeof LMOVE,   LMPOP :typeof LMPOP,   lmPop :typeof LMPOP,   LPOP_COUNT :typeof LPOP_COUNT,   lPopCount :typeof LPOP_COUNT,   LPOP :typeof LPOP,   lPop :typeof LPOP,   LPOS_COUNT :typeof LPOS_COUNT,   lPosCount :typeof LPOS_COUNT,   LPOS :typeof LPOS,   lPos :typeof LPOS,   LPUSH :typeof LPUSH,   lPush :typeof LPUSH,   LPUSHX :typeof LPUSHX,   lPushX :typeof LPUSHX,   LRANGE :typeof LRANGE,   lRange :typeof LRANGE,   LREM :typeof LREM,   lRem :typeof LREM,   LSET :typeof LSET,   lSet :typeof LSET,   LTRIM :typeof LTRIM,   lTrim :typeof LTRIM,   MGET :typeof MGET,   mGet :typeof MGET,   MIGRATE :typeof MIGRATE,   migrate :typeof MIGRATE,   MSET :typeof MSET,   mSet :typeof MSET,   MSETNX :typeof MSETNX,   mSetNX :typeof MSETNX,   OBJECT_ENCODING :typeof OBJECT_ENCODING,   objectEncoding :typeof OBJECT_ENCODING,   OBJECT_FREQ :typeof OBJECT_FREQ,   objectFreq :typeof OBJECT_FREQ,   OBJECT_IDLETIME :typeof OBJECT_IDLETIME,   objectIdleTime :typeof OBJECT_IDLETIME,   OBJECT_REFCOUNT :typeof OBJECT_REFCOUNT,   objectRefCount :typeof OBJECT_REFCOUNT,   PERSIST :typeof PERSIST,   persist :typeof PERSIST,   PEXPIRE :typeof PEXPIRE,   pExpire :typeof PEXPIRE,   PEXPIREAT :typeof PEXPIREAT,   pExpireAt :typeof PEXPIREAT,   PEXPIRETIME :typeof PEXPIRETIME,   pExpireTime :typeof PEXPIRETIME,   PFADD :typeof PFADD,   pfAdd :typeof PFADD,   PFCOUNT :typeof PFCOUNT,   pfCount :typeof PFCOUNT,   PFMERGE :typeof PFMERGE,   pfMerge :typeof PFMERGE,   PSETEX :typeof PSETEX,   pSetEx :typeof PSETEX,   PTTL :typeof PTTL,   pTTL :typeof PTTL,   PUBLISH :typeof PUBLISH,   publish :typeof PUBLISH,   RENAME :typeof RENAME,   rename :typeof RENAME,   RENAMENX :typeof RENAMENX,   renameNX :typeof RENAMENX,   RPOP_COUNT :typeof RPOP_COUNT,   rPopCount :typeof RPOP_COUNT,   RPOP :typeof RPOP,   rPop :typeof RPOP,   RPOPLPUSH :typeof RPOPLPUSH,   rPopLPush :typeof RPOPLPUSH,   RPUSH :typeof RPUSH,   rPush :typeof RPUSH,   RPUSHX :typeof RPUSHX,   rPushX :typeof RPUSHX,   SADD :typeof SADD,   sAdd :typeof SADD,   SCARD :typeof SCARD,   sCard :typeof SCARD,   SDIFF :typeof SDIFF,   sDiff :typeof SDIFF,   SDIFFSTORE :typeof SDIFFSTORE,   sDiffStore :typeof SDIFFSTORE,   SINTER :typeof SINTER,   sInter :typeof SINTER,   SINTERCARD :typeof SINTERCARD,   sInterCard :typeof SINTERCARD,   SINTERSTORE :typeof SINTERSTORE,   sInterStore :typeof SINTERSTORE,   SET :typeof SET,   set :typeof SET,   SETBIT :typeof SETBIT,   setBit :typeof SETBIT,   SETEX :typeof SETEX,   setEx :typeof SETEX,   SETNX :typeof SETNX,   setNX :typeof SETNX,   SETRANGE :typeof SETRANGE,   setRange :typeof SETRANGE,   SISMEMBER :typeof SISMEMBER,   sIsMember :typeof SISMEMBER,   SMEMBERS :typeof SMEMBERS,   sMembers :typeof SMEMBERS,   SMISMEMBER :typeof SMISMEMBER,   smIsMember :typeof SMISMEMBER,   SMOVE :typeof SMOVE,   sMove :typeof SMOVE,   SORT_RO :typeof SORT_RO,   sortRo :typeof SORT_RO,   SORT_STORE :typeof SORT_STORE,   sortStore :typeof SORT_STORE,   SORT :typeof SORT,   sort :typeof SORT,   SPOP :typeof SPOP,   sPop :typeof SPOP,   SRANDMEMBER_COUNT :typeof SRANDMEMBER_COUNT,   sRandMemberCount :typeof SRANDMEMBER_COUNT,   SRANDMEMBER :typeof SRANDMEMBER,   sRandMember :typeof SRANDMEMBER,   SREM :typeof SREM,   sRem :typeof SREM,   SSCAN :typeof SSCAN,   sScan :typeof SSCAN,   STRLEN :typeof STRLEN,   strLen :typeof STRLEN,   SUNION :typeof SUNION,   sUnion :typeof SUNION,   SUNIONSTORE :typeof SUNIONSTORE,   sUnionStore :typeof SUNIONSTORE,   TOUCH :typeof TOUCH,   touch :typeof TOUCH,   TTL :typeof TTL,   ttl :typeof TTL,   TYPE :typeof TYPE,   type :typeof TYPE,   UNLINK :typeof UNLINK,   unlink :typeof UNLINK,   WATCH :typeof WATCH,   watch :typeof WATCH,   XACK :typeof XACK,   xAck :typeof XACK,   XADD :typeof XADD,   xAdd :typeof XADD,   XAUTOCLAIM_JUSTID :typeof XAUTOCLAIM_JUSTID,   xAutoClaimJustId :typeof XAUTOCLAIM_JUSTID,   XAUTOCLAIM :typeof XAUTOCLAIM,   xAutoClaim :typeof XAUTOCLAIM,   XCLAIM :typeof XCLAIM,   xClaim :typeof XCLAIM,   XCLAIM_JUSTID :typeof XCLAIM_JUSTID,   xClaimJustId :typeof XCLAIM_JUSTID,   XDEL :typeof XDEL,   xDel :typeof XDEL,   XGROUP_CREATE :typeof XGROUP_CREATE,   xGroupCreate :typeof XGROUP_CREATE,   XGROUP_CREATECONSUMER :typeof XGROUP_CREATECONSUMER,   xGroupCreateConsumer :typeof XGROUP_CREATECONSUMER,   XGROUP_DELCONSUMER :typeof XGROUP_DELCONSUMER,   xGroupDelConsumer :typeof XGROUP_DELCONSUMER,   XGROUP_DESTROY :typeof XGROUP_DESTROY,   xGroupDestroy :typeof XGROUP_DESTROY,   XGROUP_SETID :typeof XGROUP_SETID,   xGroupSetId :typeof XGROUP_SETID,   XINFO_CONSUMERS :typeof XINFO_CONSUMERS,   xInfoConsumers :typeof XINFO_CONSUMERS,   XINFO_GROUPS :typeof XINFO_GROUPS,   xInfoGroups :typeof XINFO_GROUPS,   XINFO_STREAM :typeof XINFO_STREAM,   xInfoStream :typeof XINFO_STREAM,   XLEN :typeof XLEN,   xLen :typeof XLEN,   XPENDING_RANGE :typeof XPENDING_RANGE,   xPendingRange :typeof XPENDING_RANGE,   XPENDING :typeof XPENDING,   xPending :typeof XPENDING,   XRANGE :typeof XRANGE,   xRange :typeof XRANGE,   XREAD :typeof XREAD,   xRead :typeof XREAD,   XREADGROUP :typeof XREADGROUP,   xReadGroup :typeof XREADGROUP,   XREVRANGE :typeof XREVRANGE,   xRevRange :typeof XREVRANGE,   XSETID :typeof XSETID,   xSetId :typeof XSETID,   XTRIM :typeof XTRIM,   xTrim :typeof XTRIM,   ZADD :typeof ZADD,   zAdd :typeof ZADD,   ZCARD :typeof ZCARD,   zCard :typeof ZCARD,   ZCOUNT :typeof ZCOUNT,   zCount :typeof ZCOUNT,   ZDIFF_WITHSCORES :typeof ZDIFF_WITHSCORES,   zDiffWithScores :typeof ZDIFF_WITHSCORES,   ZDIFF :typeof ZDIFF,   zDiff :typeof ZDIFF,   ZDIFFSTORE :typeof ZDIFFSTORE,   zDiffStore :typeof ZDIFFSTORE,   ZINCRBY :typeof ZINCRBY,   zIncrBy :typeof ZINCRBY,   ZINTER_WITHSCORES :typeof ZINTER_WITHSCORES,   zInterWithScores :typeof ZINTER_WITHSCORES,   ZINTER :typeof ZINTER,   zInter :typeof ZINTER,   ZINTERCARD :typeof ZINTERCARD,   zInterCard :typeof ZINTERCARD,   ZINTERSTORE :typeof ZINTERSTORE,   zInterStore :typeof ZINTERSTORE,   ZLEXCOUNT :typeof ZLEXCOUNT,   zLexCount :typeof ZLEXCOUNT,   ZMPOP :typeof ZMPOP,   zmPop :typeof ZMPOP,   ZMSCORE :typeof ZMSCORE,   zmScore :typeof ZMSCORE,   ZPOPMAX_COUNT :typeof ZPOPMAX_COUNT,   zPopMaxCount :typeof ZPOPMAX_COUNT,   ZPOPMAX :typeof ZPOPMAX,   zPopMax :typeof ZPOPMAX,   ZPOPMIN_COUNT :typeof ZPOPMIN_COUNT,   zPopMinCount :typeof ZPOPMIN_COUNT,   ZPOPMIN :typeof ZPOPMIN,   zPopMin :typeof ZPOPMIN,   ZRANDMEMBER_COUNT_WITHSCORES :typeof ZRANDMEMBER_COUNT_WITHSCORES,   zRandMemberCountWithScores :typeof ZRANDMEMBER_COUNT_WITHSCORES,   ZRANDMEMBER_COUNT :typeof ZRANDMEMBER_COUNT,   zRandMemberCount :typeof ZRANDMEMBER_COUNT,   ZRANDMEMBER :typeof ZRANDMEMBER,   zRandMember :typeof ZRANDMEMBER,   ZRANGE_WITHSCORES :typeof ZRANGE_WITHSCORES,   zRangeWithScores :typeof ZRANGE_WITHSCORES,   ZRANGE :typeof ZRANGE,   zRange :typeof ZRANGE,   ZRANGEBYLEX :typeof ZRANGEBYLEX,   zRangeByLex :typeof ZRANGEBYLEX,   ZRANGEBYSCORE_WITHSCORES :typeof ZRANGEBYSCORE_WITHSCORES,   zRangeByScoreWithScores :typeof ZRANGEBYSCORE_WITHSCORES,   ZRANGEBYSCORE :typeof ZRANGEBYSCORE,   zRangeByScore :typeof ZRANGEBYSCORE,   ZRANGESTORE :typeof ZRANGESTORE,   zRangeStore :typeof ZRANGESTORE,   ZRANK :typeof ZRANK,   zRank :typeof ZRANK,   ZREM :typeof ZREM,   zRem :typeof ZREM,   ZREMRANGEBYLEX :typeof ZREMRANGEBYLEX,   zRemRangeByLex :typeof ZREMRANGEBYLEX,   ZREMRANGEBYRANK :typeof ZREMRANGEBYRANK,   zRemRangeByRank :typeof ZREMRANGEBYRANK,   ZREMRANGEBYSCORE :typeof ZREMRANGEBYSCORE,   zRemRangeByScore :typeof ZREMRANGEBYSCORE,   ZREVRANK :typeof ZREVRANK,   zRevRank :typeof ZREVRANK,   ZSCAN :typeof ZSCAN,   zScan :typeof ZSCAN,   ZSCORE :typeof ZSCORE,   zScore :typeof ZSCORE,   ZUNION_WITHSCORES :typeof ZUNION_WITHSCORES,   zUnionWithScores :typeof ZUNION_WITHSCORES,   ZUNION :typeof ZUNION,   zUnion :typeof ZUNION,   ZUNIONSTORE :typeof ZUNIONSTORE,   zUnionStore :typeof ZUNIONSTORE} ]: @redis/client.@redis/client/dist/lib/commands.RedisCommandSignature<{  APPEND :typeof APPEND,   append :typeof APPEND,   BITCOUNT :typeof BITCOUNT,   bitCount :typeof BITCOUNT,   BITFIELD_RO :typeof BITFIELD_RO,   bitFieldRo :typeof BITFIELD_RO,   BITFIELD :typeof BITFIELD,   bitField :typeof BITFIELD,   BITOP :typeof BITOP,   bitOp :typeof BITOP,   BITPOS :typeof BITPOS,   bitPos :typeof BITPOS,   BLMOVE :typeof BLMOVE,   blMove :typeof BLMOVE,   BLMPOP :typeof BLMPOP,   blmPop :typeof BLMPOP,   BLPOP :typeof BLPOP,   blPop :typeof BLPOP,   BRPOP :typeof BRPOP,   brPop :typeof BRPOP,   BRPOPLPUSH :typeof BRPOPLPUSH,   brPopLPush :typeof BRPOPLPUSH,   BZMPOP :typeof BZMPOP,   bzmPop :typeof BZMPOP,   BZPOPMAX :typeof BZPOPMAX,   bzPopMax :typeof BZPOPMAX,   BZPOPMIN :typeof BZPOPMIN,   bzPopMin :typeof BZPOPMIN,   COPY :typeof COPY,   copy :typeof COPY,   DECR :typeof DECR,   decr :typeof DECR,   DECRBY :typeof DECRBY,   decrBy :typeof DECRBY,   DEL :typeof DEL,   del :typeof DEL,   DUMP :typeof DUMP,   dump :typeof DUMP,   EVAL_RO :typeof EVAL_RO,   evalRo :typeof EVAL_RO,   EVAL :typeof EVAL,   eval :typeof EVAL,   EVALSHA :typeof EVALSHA,   evalSha :typeof EVALSHA,   EVALSHA_RO :typeof EVALSHA_RO,   evalShaRo :typeof EVALSHA_RO,   EXISTS :typeof EXISTS,   exists :typeof EXISTS,   EXPIRE :typeof EXPIRE,   expire :typeof EXPIRE,   EXPIREAT :typeof EXPIREAT,   expireAt :typeof EXPIREAT,   EXPIRETIME :typeof EXPIRETIME,   expireTime :typeof EXPIRETIME,   FCALL_RO :typeof FCALL_RO,   fCallRo :typeof FCALL_RO,   FCALL :typeof FCALL,   fCall :typeof FCALL,   GEOADD :typeof GEOADD,   geoAdd :typeof GEOADD,   GEODIST :typeof GEODIST,   geoDist :typeof GEODIST,   GEOHASH :typeof GEOHASH,   geoHash :typeof GEOHASH,   GEOPOS :typeof GEOPOS,   geoPos :typeof GEOPOS,   GEORADIUS_RO_WITH :typeof GEORADIUS_RO_WITH,   geoRadiusRoWith :typeof GEORADIUS_RO_WITH,   GEORADIUS_RO :typeof GEORADIUS_RO,   geoRadiusRo :typeof GEORADIUS_RO,   GEORADIUS_WITH :typeof GEORADIUS_WITH,   geoRadiusWith :typeof GEORADIUS_WITH,   GEORADIUS :typeof GEORADIUS,   geoRadius :typeof GEORADIUS,   GEORADIUSBYMEMBER_RO_WITH :typeof GEORADIUSBYMEMBER_RO_WITH,   geoRadiusByMemberRoWith :typeof GEORADIUSBYMEMBER_RO_WITH,   GEORADIUSBYMEMBER_RO :typeof GEORADIUSBYMEMBER_RO,   geoRadiusByMemberRo :typeof GEORADIUSBYMEMBER_RO,   GEORADIUSBYMEMBER_WITH :typeof GEORADIUSBYMEMBER_WITH,   geoRadiusByMemberWith :typeof GEORADIUSBYMEMBER_WITH,   GEORADIUSBYMEMBER :typeof GEORADIUSBYMEMBER,   geoRadiusByMember :typeof GEORADIUSBYMEMBER,   GEORADIUSBYMEMBERSTORE :typeof GEORADIUSBYMEMBERSTORE,   geoRadiusByMemberStore :typeof GEORADIUSBYMEMBERSTORE,   GEORADIUSSTORE :typeof GEORADIUSSTORE,   geoRadiusStore :typeof GEORADIUSSTORE,   GEOSEARCH_WITH :typeof GEOSEARCH_WITH,   geoSearchWith :typeof GEOSEARCH_WITH,   GEOSEARCH :typeof GEOSEARCH,   geoSearch :typeof GEOSEARCH,   GEOSEARCHSTORE :typeof GEOSEARCHSTORE,   geoSearchStore :typeof GEOSEARCHSTORE,   GET :typeof GET,   get :typeof GET,   GETBIT :typeof GETBIT,   getBit :typeof GETBIT,   GETDEL :typeof GETDEL,   getDel :typeof GETDEL,   GETEX :typeof GETEX,   getEx :typeof GETEX,   GETRANGE :typeof GETRANGE,   getRange :typeof GETRANGE,   GETSET :typeof GETSET,   getSet :typeof GETSET,   HDEL :typeof HDEL,   hDel :typeof HDEL,   HEXISTS :typeof HEXISTS,   hExists :typeof HEXISTS,   HGET :typeof HGET,   hGet :typeof HGET,   HGETALL :typeof HGETALL,   hGetAll :typeof HGETALL,   HINCRBY :typeof HINCRBY,   hIncrBy :typeof HINCRBY,   HINCRBYFLOAT :typeof HINCRBYFLOAT,   hIncrByFloat :typeof HINCRBYFLOAT,   HKEYS :typeof HKEYS,   hKeys :typeof HKEYS,   HLEN :typeof HLEN,   hLen :typeof HLEN,   HMGET :typeof HMGET,   hmGet :typeof HMGET,   HRANDFIELD_COUNT_WITHVALUES :typeof HRANDFIELD_COUNT_WITHVALUES,   hRandFieldCountWithValues :typeof HRANDFIELD_COUNT_WITHVALUES,   HRANDFIELD_COUNT :typeof HRANDFIELD_COUNT,   hRandFieldCount :typeof HRANDFIELD_COUNT,   HRANDFIELD :typeof HRANDFIELD,   hRandField :typeof HRANDFIELD,   HSCAN :typeof HSCAN,   hScan :typeof HSCAN,   HSET :typeof HSET,   hSet :typeof HSET,   HSETNX :typeof HSETNX,   hSetNX :typeof HSETNX,   HSTRLEN :typeof HSTRLEN,   hStrLen :typeof HSTRLEN,   HVALS :typeof HVALS,   hVals :typeof HVALS,   INCR :typeof INCR,   incr :typeof INCR,   INCRBY :typeof INCRBY,   incrBy :typeof INCRBY,   INCRBYFLOAT :typeof INCRBYFLOAT,   incrByFloat :typeof INCRBYFLOAT,   LCS_IDX_WITHMATCHLEN :typeof LCS_IDX_WITHMATCHLEN,   lcsIdxWithMatchLen :typeof LCS_IDX_WITHMATCHLEN,   LCS_IDX :typeof LCS_IDX,   lcsIdx :typeof LCS_IDX,   LCS_LEN :typeof LCS_LEN,   lcsLen :typeof LCS_LEN,   LCS :typeof LCS,   lcs :typeof LCS,   LINDEX :typeof LINDEX,   lIndex :typeof LINDEX,   LINSERT :typeof LINSERT,   lInsert :typeof LINSERT,   LLEN :typeof LLEN,   lLen :typeof LLEN,   LMOVE :typeof LMOVE,   lMove :typeof LMOVE,   LMPOP :typeof LMPOP,   lmPop :typeof LMPOP,   LPOP_COUNT :typeof LPOP_COUNT,   lPopCount :typeof LPOP_COUNT,   LPOP :typeof LPOP,   lPop :typeof LPOP,   LPOS_COUNT :typeof LPOS_COUNT,   lPosCount :typeof LPOS_COUNT,   LPOS :typeof LPOS,   lPos :typeof LPOS,   LPUSH :typeof LPUSH,   lPush :typeof LPUSH,   LPUSHX :typeof LPUSHX,   lPushX :typeof LPUSHX,   LRANGE :typeof LRANGE,   lRange :typeof LRANGE,   LREM :typeof LREM,   lRem :typeof LREM,   LSET :typeof LSET,   lSet :typeof LSET,   LTRIM :typeof LTRIM,   lTrim :typeof LTRIM,   MGET :typeof MGET,   mGet :typeof MGET,   MIGRATE :typeof MIGRATE,   migrate :typeof MIGRATE,   MSET :typeof MSET,   mSet :typeof MSET,   MSETNX :typeof MSETNX,   mSetNX :typeof MSETNX,   OBJECT_ENCODING :typeof OBJECT_ENCODING,   objectEncoding :typeof OBJECT_ENCODING,   OBJECT_FREQ :typeof OBJECT_FREQ,   objectFreq :typeof OBJECT_FREQ,   OBJECT_IDLETIME :typeof OBJECT_IDLETIME,   objectIdleTime :typeof OBJECT_IDLETIME,   OBJECT_REFCOUNT :typeof OBJECT_REFCOUNT,   objectRefCount :typeof OBJECT_REFCOUNT,   PERSIST :typeof PERSIST,   persist :typeof PERSIST,   PEXPIRE :typeof PEXPIRE,   pExpire :typeof PEXPIRE,   PEXPIREAT :typeof PEXPIREAT,   pExpireAt :typeof PEXPIREAT,   PEXPIRETIME :typeof PEXPIRETIME,   pExpireTime :typeof PEXPIRETIME,   PFADD :typeof PFADD,   pfAdd :typeof PFADD,   PFCOUNT :typeof PFCOUNT,   pfCount :typeof PFCOUNT,   PFMERGE :typeof PFMERGE,   pfMerge :typeof PFMERGE,   PSETEX :typeof PSETEX,   pSetEx :typeof PSETEX,   PTTL :typeof PTTL,   pTTL :typeof PTTL,   PUBLISH :typeof PUBLISH,   publish :typeof PUBLISH,   RENAME :typeof RENAME,   rename :typeof RENAME,   RENAMENX :typeof RENAMENX,   renameNX :typeof RENAMENX,   RPOP_COUNT :typeof RPOP_COUNT,   rPopCount :typeof RPOP_COUNT,   RPOP :typeof RPOP,   rPop :typeof RPOP,   RPOPLPUSH :typeof RPOPLPUSH,   rPopLPush :typeof RPOPLPUSH,   RPUSH :typeof RPUSH,   rPush :typeof RPUSH,   RPUSHX :typeof RPUSHX,   rPushX :typeof RPUSHX,   SADD :typeof SADD,   sAdd :typeof SADD,   SCARD :typeof SCARD,   sCard :typeof SCARD,   SDIFF :typeof SDIFF,   sDiff :typeof SDIFF,   SDIFFSTORE :typeof SDIFFSTORE,   sDiffStore :typeof SDIFFSTORE,   SINTER :typeof SINTER,   sInter :typeof SINTER,   SINTERCARD :typeof SINTERCARD,   sInterCard :typeof SINTERCARD,   SINTERSTORE :typeof SINTERSTORE,   sInterStore :typeof SINTERSTORE,   SET :typeof SET,   set :typeof SET,   SETBIT :typeof SETBIT,   setBit :typeof SETBIT,   SETEX :typeof SETEX,   setEx :typeof SETEX,   SETNX :typeof SETNX,   setNX :typeof SETNX,   SETRANGE :typeof SETRANGE,   setRange :typeof SETRANGE,   SISMEMBER :typeof SISMEMBER,   sIsMember :typeof SISMEMBER,   SMEMBERS :typeof SMEMBERS,   sMembers :typeof SMEMBERS,   SMISMEMBER :typeof SMISMEMBER,   smIsMember :typeof SMISMEMBER,   SMOVE :typeof SMOVE,   sMove :typeof SMOVE,   SORT_RO :typeof SORT_RO,   sortRo :typeof SORT_RO,   SORT_STORE :typeof SORT_STORE,   sortStore :typeof SORT_STORE,   SORT :typeof SORT,   sort :typeof SORT,   SPOP :typeof SPOP,   sPop :typeof SPOP,   SRANDMEMBER_COUNT :typeof SRANDMEMBER_COUNT,   sRandMemberCount :typeof SRANDMEMBER_COUNT,   SRANDMEMBER :typeof SRANDMEMBER,   sRandMember :typeof SRANDMEMBER,   SREM :typeof SREM,   sRem :typeof SREM,   SSCAN :typeof SSCAN,   sScan :typeof SSCAN,   STRLEN :typeof STRLEN,   strLen :typeof STRLEN,   SUNION :typeof SUNION,   sUnion :typeof SUNION,   SUNIONSTORE :typeof SUNIONSTORE,   sUnionStore :typeof SUNIONSTORE,   TOUCH :typeof TOUCH,   touch :typeof TOUCH,   TTL :typeof TTL,   ttl :typeof TTL,   TYPE :typeof TYPE,   type :typeof TYPE,   UNLINK :typeof UNLINK,   unlink :typeof UNLINK,   WATCH :typeof WATCH,   watch :typeof WATCH,   XACK :typeof XACK,   xAck :typeof XACK,   XADD :typeof XADD,   xAdd :typeof XADD,   XAUTOCLAIM_JUSTID :typeof XAUTOCLAIM_JUSTID,   xAutoClaimJustId :typeof XAUTOCLAIM_JUSTID,   XAUTOCLAIM :typeof XAUTOCLAIM,   xAutoClaim :typeof XAUTOCLAIM,   XCLAIM :typeof XCLAIM,   xClaim :typeof XCLAIM,   XCLAIM_JUSTID :typeof XCLAIM_JUSTID,   xClaimJustId :typeof XCLAIM_JUSTID,   XDEL :typeof XDEL,   xDel :typeof XDEL,   XGROUP_CREATE :typeof XGROUP_CREATE,   xGroupCreate :typeof XGROUP_CREATE,   XGROUP_CREATECONSUMER :typeof XGROUP_CREATECONSUMER,   xGroupCreateConsumer :typeof XGROUP_CREATECONSUMER,   XGROUP_DELCONSUMER :typeof XGROUP_DELCONSUMER,   xGroupDelConsumer :typeof XGROUP_DELCONSUMER,   XGROUP_DESTROY :typeof XGROUP_DESTROY,   xGroupDestroy :typeof XGROUP_DESTROY,   XGROUP_SETID :typeof XGROUP_SETID,   xGroupSetId :typeof XGROUP_SETID,   XINFO_CONSUMERS :typeof XINFO_CONSUMERS,   xInfoConsumers :typeof XINFO_CONSUMERS,   XINFO_GROUPS :typeof XINFO_GROUPS,   xInfoGroups :typeof XINFO_GROUPS,   XINFO_STREAM :typeof XINFO_STREAM,   xInfoStream :typeof XINFO_STREAM,   XLEN :typeof XLEN,   xLen :typeof XLEN,   XPENDING_RANGE :typeof XPENDING_RANGE,   xPendingRange :typeof XPENDING_RANGE,   XPENDING :typeof XPENDING,   xPending :typeof XPENDING,   XRANGE :typeof XRANGE,   xRange :typeof XRANGE,   XREAD :typeof XREAD,   xRead :typeof XREAD,   XREADGROUP :typeof XREADGROUP,   xReadGroup :typeof XREADGROUP,   XREVRANGE :typeof XREVRANGE,   xRevRange :typeof XREVRANGE,   XSETID :typeof XSETID,   xSetId :typeof XSETID,   XTRIM :typeof XTRIM,   xTrim :typeof XTRIM,   ZADD :typeof ZADD,   zAdd :typeof ZADD,   ZCARD :typeof ZCARD,   zCard :typeof ZCARD,   ZCOUNT :typeof ZCOUNT,   zCount :typeof ZCOUNT,   ZDIFF_WITHSCORES :typeof ZDIFF_WITHSCORES,   zDiffWithScores :typeof ZDIFF_WITHSCORES,   ZDIFF :typeof ZDIFF,   zDiff :typeof ZDIFF,   ZDIFFSTORE :typeof ZDIFFSTORE,   zDiffStore :typeof ZDIFFSTORE,   ZINCRBY :typeof ZINCRBY,   zIncrBy :typeof ZINCRBY,   ZINTER_WITHSCORES :typeof ZINTER_WITHSCORES,   zInterWithScores :typeof ZINTER_WITHSCORES,   ZINTER :typeof ZINTER,   zInter :typeof ZINTER,   ZINTERCARD :typeof ZINTERCARD,   zInterCard :typeof ZINTERCARD,   ZINTERSTORE :typeof ZINTERSTORE,   zInterStore :typeof ZINTERSTORE,   ZLEXCOUNT :typeof ZLEXCOUNT,   zLexCount :typeof ZLEXCOUNT,   ZMPOP :typeof ZMPOP,   zmPop :typeof ZMPOP,   ZMSCORE :typeof ZMSCORE,   zmScore :typeof ZMSCORE,   ZPOPMAX_COUNT :typeof ZPOPMAX_COUNT,   zPopMaxCount :typeof ZPOPMAX_COUNT,   ZPOPMAX :typeof ZPOPMAX,   zPopMax :typeof ZPOPMAX,   ZPOPMIN_COUNT :typeof ZPOPMIN_COUNT,   zPopMinCount :typeof ZPOPMIN_COUNT,   ZPOPMIN :typeof ZPOPMIN,   zPopMin :typeof ZPOPMIN,   ZRANDMEMBER_COUNT_WITHSCORES :typeof ZRANDMEMBER_COUNT_WITHSCORES,   zRandMemberCountWithScores :typeof ZRANDMEMBER_COUNT_WITHSCORES,   ZRANDMEMBER_COUNT :typeof ZRANDMEMBER_COUNT,   zRandMemberCount :typeof ZRANDMEMBER_COUNT,   ZRANDMEMBER :typeof ZRANDMEMBER,   zRandMember :typeof ZRANDMEMBER,   ZRANGE_WITHSCORES :typeof ZRANGE_WITHSCORES,   zRangeWithScores :typeof ZRANGE_WITHSCORES,   ZRANGE :typeof ZRANGE,   zRange :typeof ZRANGE,   ZRANGEBYLEX :typeof ZRANGEBYLEX,   zRangeByLex :typeof ZRANGEBYLEX,   ZRANGEBYSCORE_WITHSCORES :typeof ZRANGEBYSCORE_WITHSCORES,   zRangeByScoreWithScores :typeof ZRANGEBYSCORE_WITHSCORES,   ZRANGEBYSCORE :typeof ZRANGEBYSCORE,   zRangeByScore :typeof ZRANGEBYSCORE,   ZRANGESTORE :typeof ZRANGESTORE,   zRangeStore :typeof ZRANGESTORE,   ZRANK :typeof ZRANK,   zRank :typeof ZRANK,   ZREM :typeof ZREM,   zRem :typeof ZREM,   ZREMRANGEBYLEX :typeof ZREMRANGEBYLEX,   zRemRangeByLex :typeof ZREMRANGEBYLEX,   ZREMRANGEBYRANK :typeof ZREMRANGEBYRANK,   zRemRangeByRank :typeof ZREMRANGEBYRANK,   ZREMRANGEBYSCORE :typeof ZREMRANGEBYSCORE,   zRemRangeByScore :typeof ZREMRANGEBYSCORE,   ZREVRANK :typeof ZREVRANK,   zRevRank :typeof ZREVRANK,   ZSCAN :typeof ZSCAN,   zScan :typeof ZSCAN,   ZSCORE :typeof ZSCORE,   zScore :typeof ZSCORE,   ZUNION_WITHSCORES :typeof ZUNION_WITHSCORES,   zUnionWithScores :typeof ZUNION_WITHSCORES,   ZUNION :typeof ZUNION,   zUnion :typeof ZUNION,   ZUNIONSTORE :typeof ZUNIONSTORE,   zUnionStore :typeof ZUNIONSTORE}[P], std.Parameters<{  APPEND :typeof APPEND,   append :typeof APPEND,   BITCOUNT :typeof BITCOUNT,   bitCount :typeof BITCOUNT,   BITFIELD_RO :typeof BITFIELD_RO,   bitFieldRo :typeof BITFIELD_RO,   BITFIELD :typeof BITFIELD,   bitField :typeof BITFIELD,   BITOP :typeof BITOP,   bitOp :typeof BITOP,   BITPOS :typeof BITPOS,   bitPos :typeof BITPOS,   BLMOVE :typeof BLMOVE,   blMove :typeof BLMOVE,   BLMPOP :typeof BLMPOP,   blmPop :typeof BLMPOP,   BLPOP :typeof BLPOP,   blPop :typeof BLPOP,   BRPOP :typeof BRPOP,   brPop :typeof BRPOP,   BRPOPLPUSH :typeof BRPOPLPUSH,   brPopLPush :typeof BRPOPLPUSH,   BZMPOP :typeof BZMPOP,   bzmPop :typeof BZMPOP,   BZPOPMAX :typeof BZPOPMAX,   bzPopMax :typeof BZPOPMAX,   BZPOPMIN :typeof BZPOPMIN,   bzPopMin :typeof BZPOPMIN,   COPY :typeof COPY,   copy :typeof COPY,   DECR :typeof DECR,   decr :typeof DECR,   DECRBY :typeof DECRBY,   decrBy :typeof DECRBY,   DEL :typeof DEL,   del :typeof DEL,   DUMP :typeof DUMP,   dump :typeof DUMP,   EVAL_RO :typeof EVAL_RO,   evalRo :typeof EVAL_RO,   EVAL :typeof EVAL,   eval :typeof EVAL,   EVALSHA :typeof EVALSHA,   evalSha :typeof EVALSHA,   EVALSHA_RO :typeof EVALSHA_RO,   evalShaRo :typeof EVALSHA_RO,   EXISTS :typeof EXISTS,   exists :typeof EXISTS,   EXPIRE :typeof EXPIRE,   expire :typeof EXPIRE,   EXPIREAT :typeof EXPIREAT,   expireAt :typeof EXPIREAT,   EXPIRETIME :typeof EXPIRETIME,   expireTime :typeof EXPIRETIME,   FCALL_RO :typeof FCALL_RO,   fCallRo :typeof FCALL_RO,   FCALL :typeof FCALL,   fCall :typeof FCALL,   GEOADD :typeof GEOADD,   geoAdd :typeof GEOADD,   GEODIST :typeof GEODIST,   geoDist :typeof GEODIST,   GEOHASH :typeof GEOHASH,   geoHash :typeof GEOHASH,   GEOPOS :typeof GEOPOS,   geoPos :typeof GEOPOS,   GEORADIUS_RO_WITH :typeof GEORADIUS_RO_WITH,   geoRadiusRoWith :typeof GEORADIUS_RO_WITH,   GEORADIUS_RO :typeof GEORADIUS_RO,   geoRadiusRo :typeof GEORADIUS_RO,   GEORADIUS_WITH :typeof GEORADIUS_WITH,   geoRadiusWith :typeof GEORADIUS_WITH,   GEORADIUS :typeof GEORADIUS,   geoRadius :typeof GEORADIUS,   GEORADIUSBYMEMBER_RO_WITH :typeof GEORADIUSBYMEMBER_RO_WITH,   geoRadiusByMemberRoWith :typeof GEORADIUSBYMEMBER_RO_WITH,   GEORADIUSBYMEMBER_RO :typeof GEORADIUSBYMEMBER_RO,   geoRadiusByMemberRo :typeof GEORADIUSBYMEMBER_RO,   GEORADIUSBYMEMBER_WITH :typeof GEORADIUSBYMEMBER_WITH,   geoRadiusByMemberWith :typeof GEORADIUSBYMEMBER_WITH,   GEORADIUSBYMEMBER :typeof GEORADIUSBYMEMBER,   geoRadiusByMember :typeof GEORADIUSBYMEMBER,   GEORADIUSBYMEMBERSTORE :typeof GEORADIUSBYMEMBERSTORE,   geoRadiusByMemberStore :typeof GEORADIUSBYMEMBERSTORE,   GEORADIUSSTORE :typeof GEORADIUSSTORE,   geoRadiusStore :typeof GEORADIUSSTORE,   GEOSEARCH_WITH :typeof GEOSEARCH_WITH,   geoSearchWith :typeof GEOSEARCH_WITH,   GEOSEARCH :typeof GEOSEARCH,   geoSearch :typeof GEOSEARCH,   GEOSEARCHSTORE :typeof GEOSEARCHSTORE,   geoSearchStore :typeof GEOSEARCHSTORE,   GET :typeof GET,   get :typeof GET,   GETBIT :typeof GETBIT,   getBit :typeof GETBIT,   GETDEL :typeof GETDEL,   getDel :typeof GETDEL,   GETEX :typeof GETEX,   getEx :typeof GETEX,   GETRANGE :typeof GETRANGE,   getRange :typeof GETRANGE,   GETSET :typeof GETSET,   getSet :typeof GETSET,   HDEL :typeof HDEL,   hDel :typeof HDEL,   HEXISTS :typeof HEXISTS,   hExists :typeof HEXISTS,   HGET :typeof HGET,   hGet :typeof HGET,   HGETALL :typeof HGETALL,   hGetAll :typeof HGETALL,   HINCRBY :typeof HINCRBY,   hIncrBy :typeof HINCRBY,   HINCRBYFLOAT :typeof HINCRBYFLOAT,   hIncrByFloat :typeof HINCRBYFLOAT,   HKEYS :typeof HKEYS,   hKeys :typeof HKEYS,   HLEN :typeof HLEN,   hLen :typeof HLEN,   HMGET :typeof HMGET,   hmGet :typeof HMGET,   HRANDFIELD_COUNT_WITHVALUES :typeof HRANDFIELD_COUNT_WITHVALUES,   hRandFieldCountWithValues :typeof HRANDFIELD_COUNT_WITHVALUES,   HRANDFIELD_COUNT :typeof HRANDFIELD_COUNT,   hRandFieldCount :typeof HRANDFIELD_COUNT,   HRANDFIELD :typeof HRANDFIELD,   hRandField :typeof HRANDFIELD,   HSCAN :typeof HSCAN,   hScan :typeof HSCAN,   HSET :typeof HSET,   hSet :typeof HSET,   HSETNX :typeof HSETNX,   hSetNX :typeof HSETNX,   HSTRLEN :typeof HSTRLEN,   hStrLen :typeof HSTRLEN,   HVALS :typeof HVALS,   hVals :typeof HVALS,   INCR :typeof INCR,   incr :typeof INCR,   INCRBY :typeof INCRBY,   incrBy :typeof INCRBY,   INCRBYFLOAT :typeof INCRBYFLOAT,   incrByFloat :typeof INCRBYFLOAT,   LCS_IDX_WITHMATCHLEN :typeof LCS_IDX_WITHMATCHLEN,   lcsIdxWithMatchLen :typeof LCS_IDX_WITHMATCHLEN,   LCS_IDX :typeof LCS_IDX,   lcsIdx :typeof LCS_IDX,   LCS_LEN :typeof LCS_LEN,   lcsLen :typeof LCS_LEN,   LCS :typeof LCS,   lcs :typeof LCS,   LINDEX :typeof LINDEX,   lIndex :typeof LINDEX,   LINSERT :typeof LINSERT,   lInsert :typeof LINSERT,   LLEN :typeof LLEN,   lLen :typeof LLEN,   LMOVE :typeof LMOVE,   lMove :typeof LMOVE,   LMPOP :typeof LMPOP,   lmPop :typeof LMPOP,   LPOP_COUNT :typeof LPOP_COUNT,   lPopCount :typeof LPOP_COUNT,   LPOP :typeof LPOP,   lPop :typeof LPOP,   LPOS_COUNT :typeof LPOS_COUNT,   lPosCount :typeof LPOS_COUNT,   LPOS :typeof LPOS,   lPos :typeof LPOS,   LPUSH :typeof LPUSH,   lPush :typeof LPUSH,   LPUSHX :typeof LPUSHX,   lPushX :typeof LPUSHX,   LRANGE :typeof LRANGE,   lRange :typeof LRANGE,   LREM :typeof LREM,   lRem :typeof LREM,   LSET :typeof LSET,   lSet :typeof LSET,   LTRIM :typeof LTRIM,   lTrim :typeof LTRIM,   MGET :typeof MGET,   mGet :typeof MGET,   MIGRATE :typeof MIGRATE,   migrate :typeof MIGRATE,   MSET :typeof MSET,   mSet :typeof MSET,   MSETNX :typeof MSETNX,   mSetNX :typeof MSETNX,   OBJECT_ENCODING :typeof OBJECT_ENCODING,   objectEncoding :typeof OBJECT_ENCODING,   OBJECT_FREQ :typeof OBJECT_FREQ,   objectFreq :typeof OBJECT_FREQ,   OBJECT_IDLETIME :typeof OBJECT_IDLETIME,   objectIdleTime :typeof OBJECT_IDLETIME,   OBJECT_REFCOUNT :typeof OBJECT_REFCOUNT,   objectRefCount :typeof OBJECT_REFCOUNT,   PERSIST :typeof PERSIST,   persist :typeof PERSIST,   PEXPIRE :typeof PEXPIRE,   pExpire :typeof PEXPIRE,   PEXPIREAT :typeof PEXPIREAT,   pExpireAt :typeof PEXPIREAT,   PEXPIRETIME :typeof PEXPIRETIME,   pExpireTime :typeof PEXPIRETIME,   PFADD :typeof PFADD,   pfAdd :typeof PFADD,   PFCOUNT :typeof PFCOUNT,   pfCount :typeof PFCOUNT,   PFMERGE :typeof PFMERGE,   pfMerge :typeof PFMERGE,   PSETEX :typeof PSETEX,   pSetEx :typeof PSETEX,   PTTL :typeof PTTL,   pTTL :typeof PTTL,   PUBLISH :typeof PUBLISH,   publish :typeof PUBLISH,   RENAME :typeof RENAME,   rename :typeof RENAME,   RENAMENX :typeof RENAMENX,   renameNX :typeof RENAMENX,   RPOP_COUNT :typeof RPOP_COUNT,   rPopCount :typeof RPOP_COUNT,   RPOP :typeof RPOP,   rPop :typeof RPOP,   RPOPLPUSH :typeof RPOPLPUSH,   rPopLPush :typeof RPOPLPUSH,   RPUSH :typeof RPUSH,   rPush :typeof RPUSH,   RPUSHX :typeof RPUSHX,   rPushX :typeof RPUSHX,   SADD :typeof SADD,   sAdd :typeof SADD,   SCARD :typeof SCARD,   sCard :typeof SCARD,   SDIFF :typeof SDIFF,   sDiff :typeof SDIFF,   SDIFFSTORE :typeof SDIFFSTORE,   sDiffStore :typeof SDIFFSTORE,   SINTER :typeof SINTER,   sInter :typeof SINTER,   SINTERCARD :typeof SINTERCARD,   sInterCard :typeof SINTERCARD,   SINTERSTORE :typeof SINTERSTORE,   sInterStore :typeof SINTERSTORE,   SET :typeof SET,   set :typeof SET,   SETBIT :typeof SETBIT,   setBit :typeof SETBIT,   SETEX :typeof SETEX,   setEx :typeof SETEX,   SETNX :typeof SETNX,   setNX :typeof SETNX,   SETRANGE :typeof SETRANGE,   setRange :typeof SETRANGE,   SISMEMBER :typeof SISMEMBER,   sIsMember :typeof SISMEMBER,   SMEMBERS :typeof SMEMBERS,   sMembers :typeof SMEMBERS,   SMISMEMBER :typeof SMISMEMBER,   smIsMember :typeof SMISMEMBER,   SMOVE :typeof SMOVE,   sMove :typeof SMOVE,   SORT_RO :typeof SORT_RO,   sortRo :typeof SORT_RO,   SORT_STORE :typeof SORT_STORE,   sortStore :typeof SORT_STORE,   SORT :typeof SORT,   sort :typeof SORT,   SPOP :typeof SPOP,   sPop :typeof SPOP,   SRANDMEMBER_COUNT :typeof SRANDMEMBER_COUNT,   sRandMemberCount :typeof SRANDMEMBER_COUNT,   SRANDMEMBER :typeof SRANDMEMBER,   sRandMember :typeof SRANDMEMBER,   SREM :typeof SREM,   sRem :typeof SREM,   SSCAN :typeof SSCAN,   sScan :typeof SSCAN,   STRLEN :typeof STRLEN,   strLen :typeof STRLEN,   SUNION :typeof SUNION,   sUnion :typeof SUNION,   SUNIONSTORE :typeof SUNIONSTORE,   sUnionStore :typeof SUNIONSTORE,   TOUCH :typeof TOUCH,   touch :typeof TOUCH,   TTL :typeof TTL,   ttl :typeof TTL,   TYPE :typeof TYPE,   type :typeof TYPE,   UNLINK :typeof UNLINK,   unlink :typeof UNLINK,   WATCH :typeof WATCH,   watch :typeof WATCH,   XACK :typeof XACK,   xAck :typeof XACK,   XADD :typeof XADD,   xAdd :typeof XADD,   XAUTOCLAIM_JUSTID :typeof XAUTOCLAIM_JUSTID,   xAutoClaimJustId :typeof XAUTOCLAIM_JUSTID,   XAUTOCLAIM :typeof XAUTOCLAIM,   xAutoClaim :typeof XAUTOCLAIM,   XCLAIM :typeof XCLAIM,   xClaim :typeof XCLAIM,   XCLAIM_JUSTID :typeof XCLAIM_JUSTID,   xClaimJustId :typeof XCLAIM_JUSTID,   XDEL :typeof XDEL,   xDel :typeof XDEL,   XGROUP_CREATE :typeof XGROUP_CREATE,   xGroupCreate :typeof XGROUP_CREATE,   XGROUP_CREATECONSUMER :typeof XGROUP_CREATECONSUMER,   xGroupCreateConsumer :typeof XGROUP_CREATECONSUMER,   XGROUP_DELCONSUMER :typeof XGROUP_DELCONSUMER,   xGroupDelConsumer :typeof XGROUP_DELCONSUMER,   XGROUP_DESTROY :typeof XGROUP_DESTROY,   xGroupDestroy :typeof XGROUP_DESTROY,   XGROUP_SETID :typeof XGROUP_SETID,   xGroupSetId :typeof XGROUP_SETID,   XINFO_CONSUMERS :typeof XINFO_CONSUMERS,   xInfoConsumers :typeof XINFO_CONSUMERS,   XINFO_GROUPS :typeof XINFO_GROUPS,   xInfoGroups :typeof XINFO_GROUPS,   XINFO_STREAM :typeof XINFO_STREAM,   xInfoStream :typeof XINFO_STREAM,   XLEN :typeof XLEN,   xLen :typeof XLEN,   XPENDING_RANGE :typeof XPENDING_RANGE,   xPendingRange :typeof XPENDING_RANGE,   XPENDING :typeof XPENDING,   xPending :typeof XPENDING,   XRANGE :typeof XRANGE,   xRange :typeof XRANGE,   XREAD :typeof XREAD,   xRead :typeof XREAD,   XREADGROUP :typeof XREADGROUP,   xReadGroup :typeof XREADGROUP,   XREVRANGE :typeof XREVRANGE,   xRevRange :typeof XREVRANGE,   XSETID :typeof XSETID,   xSetId :typeof XSETID,   XTRIM :typeof XTRIM,   xTrim :typeof XTRIM,   ZADD :typeof ZADD,   zAdd :typeof ZADD,   ZCARD :typeof ZCARD,   zCard :typeof ZCARD,   ZCOUNT :typeof ZCOUNT,   zCount :typeof ZCOUNT,   ZDIFF_WITHSCORES :typeof ZDIFF_WITHSCORES,   zDiffWithScores :typeof ZDIFF_WITHSCORES,   ZDIFF :typeof ZDIFF,   zDiff :typeof ZDIFF,   ZDIFFSTORE :typeof ZDIFFSTORE,   zDiffStore :typeof ZDIFFSTORE,   ZINCRBY :typeof ZINCRBY,   zIncrBy :typeof ZINCRBY,   ZINTER_WITHSCORES :typeof ZINTER_WITHSCORES,   zInterWithScores :typeof ZINTER_WITHSCORES,   ZINTER :typeof ZINTER,   zInter :typeof ZINTER,   ZINTERCARD :typeof ZINTERCARD,   zInterCard :typeof ZINTERCARD,   ZINTERSTORE :typeof ZINTERSTORE,   zInterStore :typeof ZINTERSTORE,   ZLEXCOUNT :typeof ZLEXCOUNT,   zLexCount :typeof ZLEXCOUNT,   ZMPOP :typeof ZMPOP,   zmPop :typeof ZMPOP,   ZMSCORE :typeof ZMSCORE,   zmScore :typeof ZMSCORE,   ZPOPMAX_COUNT :typeof ZPOPMAX_COUNT,   zPopMaxCount :typeof ZPOPMAX_COUNT,   ZPOPMAX :typeof ZPOPMAX,   zPopMax :typeof ZPOPMAX,   ZPOPMIN_COUNT :typeof ZPOPMIN_COUNT,   zPopMinCount :typeof ZPOPMIN_COUNT,   ZPOPMIN :typeof ZPOPMIN,   zPopMin :typeof ZPOPMIN,   ZRANDMEMBER_COUNT_WITHSCORES :typeof ZRANDMEMBER_COUNT_WITHSCORES,   zRandMemberCountWithScores :typeof ZRANDMEMBER_COUNT_WITHSCORES,   ZRANDMEMBER_COUNT :typeof ZRANDMEMBER_COUNT,   zRandMemberCount :typeof ZRANDMEMBER_COUNT,   ZRANDMEMBER :typeof ZRANDMEMBER,   zRandMember :typeof ZRANDMEMBER,   ZRANGE_WITHSCORES :typeof ZRANGE_WITHSCORES,   zRangeWithScores :typeof ZRANGE_WITHSCORES,   ZRANGE :typeof ZRANGE,   zRange :typeof ZRANGE,   ZRANGEBYLEX :typeof ZRANGEBYLEX,   zRangeByLex :typeof ZRANGEBYLEX,   ZRANGEBYSCORE_WITHSCORES :typeof ZRANGEBYSCORE_WITHSCORES,   zRangeByScoreWithScores :typeof ZRANGEBYSCORE_WITHSCORES,   ZRANGEBYSCORE :typeof ZRANGEBYSCORE,   zRangeByScore :typeof ZRANGEBYSCORE,   ZRANGESTORE :typeof ZRANGESTORE,   zRangeStore :typeof ZRANGESTORE,   ZRANK :typeof ZRANK,   zRank :typeof ZRANK,   ZREM :typeof ZREM,   zRem :typeof ZREM,   ZREMRANGEBYLEX :typeof ZREMRANGEBYLEX,   zRemRangeByLex :typeof ZREMRANGEBYLEX,   ZREMRANGEBYRANK :typeof ZREMRANGEBYRANK,   zRemRangeByRank :typeof ZREMRANGEBYRANK,   ZREMRANGEBYSCORE :typeof ZREMRANGEBYSCORE,   zRemRangeByScore :typeof ZREMRANGEBYSCORE,   ZREVRANK :typeof ZREVRANK,   zRevRank :typeof ZREVRANK,   ZSCAN :typeof ZSCAN,   zScan :typeof ZSCAN,   ZSCORE :typeof ZSCORE,   zScore :typeof ZSCORE,   ZUNION_WITHSCORES :typeof ZUNION_WITHSCORES,   zUnionWithScores :typeof ZUNION_WITHSCORES,   ZUNION :typeof ZUNION,   zUnion :typeof ZUNION,   ZUNIONSTORE :typeof ZUNIONSTORE,   zUnionStore :typeof ZUNIONSTORE}[P]['transformArguments']>>} */
  trait WithCommands extends StObject {
    
    @JSName("APPEND")
    var APPEND_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND['transformArguments'] */ js.Any
        ]
      ]
    @JSName("APPEND")
    def APPEND_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof APPEND['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("APPEND")
    def APPEND_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BITCOUNT")
    var BITCOUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BITCOUNT")
    def BITCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BITCOUNT")
    def BITCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BITFIELD")
    var BITFIELD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("BITFIELD_RO")
    var BITFIELD_RO_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BITFIELD_RO")
    def BITFIELD_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITFIELD_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BITFIELD_RO")
    def BITFIELD_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BITFIELD")
    def BITFIELD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITFIELD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BITFIELD")
    def BITFIELD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BITOP")
    var BITOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BITOP")
    def BITOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BITOP")
    def BITOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BITPOS")
    var BITPOS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BITPOS")
    def BITPOS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITPOS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BITPOS")
    def BITPOS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BLMOVE")
    var BLMOVE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BLMOVE")
    def BLMOVE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BLMOVE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BLMOVE")
    def BLMOVE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BLMPOP")
    var BLMPOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BLMPOP")
    def BLMPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BLMPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BLMPOP")
    def BLMPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BLPOP")
    var BLPOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BLPOP")
    def BLPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BLPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BLPOP")
    def BLPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BRPOPLPUSH")
    var BRPOPLPUSH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BRPOPLPUSH")
    def BRPOPLPUSH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BRPOPLPUSH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BRPOPLPUSH")
    def BRPOPLPUSH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BRPOP")
    var BRPOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BRPOP")
    def BRPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BRPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BRPOP")
    def BRPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BZMPOP")
    var BZMPOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BZMPOP")
    def BZMPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BZMPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BZMPOP")
    def BZMPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BZPOPMAX")
    var BZPOPMAX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BZPOPMAX")
    def BZPOPMAX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BZPOPMAX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BZPOPMAX")
    def BZPOPMAX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("BZPOPMIN")
    var BZPOPMIN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("BZPOPMIN")
    def BZPOPMIN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BZPOPMIN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("BZPOPMIN")
    def BZPOPMIN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("COPY")
    var COPY_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("COPY")
    def COPY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof COPY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("COPY")
    def COPY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("DECRBY")
    var DECRBY_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("DECRBY")
    def DECRBY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof DECRBY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("DECRBY")
    def DECRBY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("DECR")
    var DECR_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR['transformArguments'] */ js.Any
        ]
      ]
    @JSName("DECR")
    def DECR_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof DECR['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("DECR")
    def DECR_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("DEL")
    var DEL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("DEL")
    def DEL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof DEL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("DEL")
    def DEL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("DUMP")
    var DUMP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("DUMP")
    def DUMP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof DUMP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("DUMP")
    def DUMP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("EVALSHA")
    var EVALSHA_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("EVALSHA_RO")
    var EVALSHA_RO_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("EVALSHA_RO")
    def EVALSHA_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EVALSHA_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("EVALSHA_RO")
    def EVALSHA_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("EVALSHA")
    def EVALSHA_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EVALSHA['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("EVALSHA")
    def EVALSHA_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("EVAL")
    var EVAL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("EVAL_RO")
    var EVAL_RO_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("EVAL_RO")
    def EVAL_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EVAL_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("EVAL_RO")
    def EVAL_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("EVAL")
    def EVAL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EVAL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("EVAL")
    def EVAL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("EXISTS")
    var EXISTS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("EXISTS")
    def EXISTS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EXISTS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("EXISTS")
    def EXISTS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("EXPIREAT")
    var EXPIREAT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("EXPIREAT")
    def EXPIREAT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EXPIREAT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("EXPIREAT")
    def EXPIREAT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("EXPIRETIME")
    var EXPIRETIME_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME['transformArguments'] */ js.Any
        ]
      ]
    @JSName("EXPIRETIME")
    def EXPIRETIME_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EXPIRETIME['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("EXPIRETIME")
    def EXPIRETIME_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("EXPIRE")
    var EXPIRE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("EXPIRE")
    def EXPIRE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EXPIRE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("EXPIRE")
    def EXPIRE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("FCALL")
    var FCALL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("FCALL_RO")
    var FCALL_RO_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("FCALL_RO")
    def FCALL_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof FCALL_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("FCALL_RO")
    def FCALL_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("FCALL")
    def FCALL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof FCALL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("FCALL")
    def FCALL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEOADD")
    var GEOADD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEOADD")
    def GEOADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEOADD")
    def GEOADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEODIST")
    var GEODIST_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEODIST")
    def GEODIST_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEODIST['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEODIST")
    def GEODIST_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEOHASH")
    var GEOHASH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEOHASH")
    def GEOHASH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOHASH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEOHASH")
    def GEOHASH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEOPOS")
    var GEOPOS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEOPOS")
    def GEOPOS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOPOS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEOPOS")
    def GEOPOS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUSBYMEMBERSTORE")
    var GEORADIUSBYMEMBERSTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEORADIUSBYMEMBERSTORE")
    def GEORADIUSBYMEMBERSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUSBYMEMBERSTORE")
    def GEORADIUSBYMEMBERSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUSBYMEMBER")
    var GEORADIUSBYMEMBER_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("GEORADIUSBYMEMBER_RO")
    var GEORADIUSBYMEMBER_RO_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("GEORADIUSBYMEMBER_RO_WITH")
    var GEORADIUSBYMEMBER_RO_WITH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEORADIUSBYMEMBER_RO_WITH")
    def GEORADIUSBYMEMBER_RO_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUSBYMEMBER_RO_WITH")
    def GEORADIUSBYMEMBER_RO_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUSBYMEMBER_RO")
    def GEORADIUSBYMEMBER_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBER_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUSBYMEMBER_RO")
    def GEORADIUSBYMEMBER_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUSBYMEMBER_WITH")
    var GEORADIUSBYMEMBER_WITH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEORADIUSBYMEMBER_WITH")
    def GEORADIUSBYMEMBER_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUSBYMEMBER_WITH")
    def GEORADIUSBYMEMBER_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUSBYMEMBER")
    def GEORADIUSBYMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUSBYMEMBER")
    def GEORADIUSBYMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUSSTORE")
    var GEORADIUSSTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEORADIUSSTORE")
    def GEORADIUSSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUSSTORE")
    def GEORADIUSSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUS")
    var GEORADIUS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("GEORADIUS_RO")
    var GEORADIUS_RO_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("GEORADIUS_RO_WITH")
    var GEORADIUS_RO_WITH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEORADIUS_RO_WITH")
    def GEORADIUS_RO_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUS_RO_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUS_RO_WITH")
    def GEORADIUS_RO_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUS_RO")
    def GEORADIUS_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUS_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUS_RO")
    def GEORADIUS_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUS_WITH")
    var GEORADIUS_WITH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEORADIUS_WITH")
    def GEORADIUS_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUS_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUS_WITH")
    def GEORADIUS_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEORADIUS")
    def GEORADIUS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEORADIUS")
    def GEORADIUS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEOSEARCHSTORE")
    var GEOSEARCHSTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEOSEARCHSTORE")
    def GEOSEARCHSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOSEARCHSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEOSEARCHSTORE")
    def GEOSEARCHSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEOSEARCH")
    var GEOSEARCH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("GEOSEARCH_WITH")
    var GEOSEARCH_WITH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GEOSEARCH_WITH")
    def GEOSEARCH_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOSEARCH_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEOSEARCH_WITH")
    def GEOSEARCH_WITH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GEOSEARCH")
    def GEOSEARCH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOSEARCH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GEOSEARCH")
    def GEOSEARCH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GETBIT")
    var GETBIT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GETBIT")
    def GETBIT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETBIT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GETBIT")
    def GETBIT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GETDEL")
    var GETDEL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GETDEL")
    def GETDEL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETDEL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GETDEL")
    def GETDEL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GETEX")
    var GETEX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GETEX")
    def GETEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GETEX")
    def GETEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GETRANGE")
    var GETRANGE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GETRANGE")
    def GETRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GETRANGE")
    def GETRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GETSET")
    var GETSET_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GETSET")
    def GETSET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETSET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GETSET")
    def GETSET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("GET")
    var GET_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("GET")
    def GET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("GET")
    def GET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HDEL")
    var HDEL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HDEL")
    def HDEL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HDEL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HDEL")
    def HDEL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HEXISTS")
    var HEXISTS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HEXISTS")
    def HEXISTS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HEXISTS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HEXISTS")
    def HEXISTS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HGETALL")
    var HGETALL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HGETALL")
    def HGETALL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HGETALL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HGETALL")
    def HGETALL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HGET")
    var HGET_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HGET")
    def HGET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HGET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HGET")
    def HGET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HINCRBYFLOAT")
    var HINCRBYFLOAT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HINCRBYFLOAT")
    def HINCRBYFLOAT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HINCRBYFLOAT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HINCRBYFLOAT")
    def HINCRBYFLOAT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HINCRBY")
    var HINCRBY_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HINCRBY")
    def HINCRBY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HINCRBY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HINCRBY")
    def HINCRBY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HKEYS")
    var HKEYS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HKEYS")
    def HKEYS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HKEYS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HKEYS")
    def HKEYS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HLEN")
    var HLEN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HLEN")
    def HLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HLEN")
    def HLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HMGET")
    var HMGET_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HMGET")
    def HMGET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HMGET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HMGET")
    def HMGET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HRANDFIELD_COUNT")
    var HRANDFIELD_COUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("HRANDFIELD_COUNT_WITHVALUES")
    var HRANDFIELD_COUNT_WITHVALUES_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HRANDFIELD_COUNT_WITHVALUES")
    def HRANDFIELD_COUNT_WITHVALUES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HRANDFIELD_COUNT_WITHVALUES")
    def HRANDFIELD_COUNT_WITHVALUES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HRANDFIELD_COUNT")
    def HRANDFIELD_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HRANDFIELD_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HRANDFIELD_COUNT")
    def HRANDFIELD_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HRANDFIELD")
    var HRANDFIELD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HRANDFIELD")
    def HRANDFIELD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HRANDFIELD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HRANDFIELD")
    def HRANDFIELD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HSCAN")
    var HSCAN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HSCAN")
    def HSCAN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HSCAN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HSCAN")
    def HSCAN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HSETNX")
    var HSETNX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HSETNX")
    def HSETNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HSETNX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HSETNX")
    def HSETNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HSET")
    var HSET_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HSET")
    def HSET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HSET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HSET")
    def HSET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HSTRLEN")
    var HSTRLEN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HSTRLEN")
    def HSTRLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HSTRLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HSTRLEN")
    def HSTRLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("HVALS")
    var HVALS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("HVALS")
    def HVALS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HVALS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("HVALS")
    def HVALS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("INCRBYFLOAT")
    var INCRBYFLOAT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("INCRBYFLOAT")
    def INCRBYFLOAT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof INCRBYFLOAT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("INCRBYFLOAT")
    def INCRBYFLOAT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("INCRBY")
    var INCRBY_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("INCRBY")
    def INCRBY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof INCRBY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("INCRBY")
    def INCRBY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("INCR")
    var INCR_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR['transformArguments'] */ js.Any
        ]
      ]
    @JSName("INCR")
    def INCR_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof INCR['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("INCR")
    def INCR_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LCS_IDX")
    var LCS_IDX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("LCS_IDX_WITHMATCHLEN")
    var LCS_IDX_WITHMATCHLEN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LCS_IDX_WITHMATCHLEN")
    def LCS_IDX_WITHMATCHLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LCS_IDX_WITHMATCHLEN")
    def LCS_IDX_WITHMATCHLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LCS_IDX")
    def LCS_IDX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LCS_IDX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LCS_IDX")
    def LCS_IDX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LCS_LEN")
    var LCS_LEN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LCS_LEN")
    def LCS_LEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LCS_LEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LCS_LEN")
    def LCS_LEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LCS")
    var LCS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LCS")
    def LCS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LCS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LCS")
    def LCS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LINDEX")
    var LINDEX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LINDEX")
    def LINDEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LINDEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LINDEX")
    def LINDEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LINSERT")
    var LINSERT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LINSERT")
    def LINSERT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LINSERT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LINSERT")
    def LINSERT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LLEN")
    var LLEN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LLEN")
    def LLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LLEN")
    def LLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LMOVE")
    var LMOVE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LMOVE")
    def LMOVE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LMOVE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LMOVE")
    def LMOVE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LMPOP")
    var LMPOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LMPOP")
    def LMPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LMPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LMPOP")
    def LMPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LPOP_COUNT")
    var LPOP_COUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LPOP_COUNT")
    def LPOP_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPOP_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LPOP_COUNT")
    def LPOP_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LPOP")
    var LPOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LPOP")
    def LPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LPOP")
    def LPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LPOS_COUNT")
    var LPOS_COUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LPOS_COUNT")
    def LPOS_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPOS_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LPOS_COUNT")
    def LPOS_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LPOS")
    var LPOS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LPOS")
    def LPOS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPOS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LPOS")
    def LPOS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LPUSHX")
    var LPUSHX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LPUSHX")
    def LPUSHX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPUSHX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LPUSHX")
    def LPUSHX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LPUSH")
    var LPUSH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LPUSH")
    def LPUSH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPUSH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LPUSH")
    def LPUSH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LRANGE")
    var LRANGE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LRANGE")
    def LRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LRANGE")
    def LRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LREM")
    var LREM_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LREM")
    def LREM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LREM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LREM")
    def LREM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LSET")
    var LSET_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LSET")
    def LSET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LSET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LSET")
    def LSET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("LTRIM")
    var LTRIM_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("LTRIM")
    def LTRIM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LTRIM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("LTRIM")
    def LTRIM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("MGET")
    var MGET_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("MGET")
    def MGET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof MGET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("MGET")
    def MGET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("MIGRATE")
    var MIGRATE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("MIGRATE")
    def MIGRATE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof MIGRATE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("MIGRATE")
    def MIGRATE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("MSETNX")
    var MSETNX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("MSETNX")
    def MSETNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof MSETNX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("MSETNX")
    def MSETNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("MSET")
    var MSET_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("MSET")
    def MSET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof MSET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("MSET")
    def MSET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("OBJECT_ENCODING")
    var OBJECT_ENCODING_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING['transformArguments'] */ js.Any
        ]
      ]
    @JSName("OBJECT_ENCODING")
    def OBJECT_ENCODING_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof OBJECT_ENCODING['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("OBJECT_ENCODING")
    def OBJECT_ENCODING_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("OBJECT_FREQ")
    var OBJECT_FREQ_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ['transformArguments'] */ js.Any
        ]
      ]
    @JSName("OBJECT_FREQ")
    def OBJECT_FREQ_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof OBJECT_FREQ['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("OBJECT_FREQ")
    def OBJECT_FREQ_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("OBJECT_IDLETIME")
    var OBJECT_IDLETIME_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME['transformArguments'] */ js.Any
        ]
      ]
    @JSName("OBJECT_IDLETIME")
    def OBJECT_IDLETIME_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof OBJECT_IDLETIME['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("OBJECT_IDLETIME")
    def OBJECT_IDLETIME_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("OBJECT_REFCOUNT")
    var OBJECT_REFCOUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("OBJECT_REFCOUNT")
    def OBJECT_REFCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof OBJECT_REFCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("OBJECT_REFCOUNT")
    def OBJECT_REFCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PERSIST")
    var PERSIST_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PERSIST")
    def PERSIST_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PERSIST['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PERSIST")
    def PERSIST_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PEXPIREAT")
    var PEXPIREAT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PEXPIREAT")
    def PEXPIREAT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PEXPIREAT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PEXPIREAT")
    def PEXPIREAT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PEXPIRETIME")
    var PEXPIRETIME_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PEXPIRETIME")
    def PEXPIRETIME_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PEXPIRETIME['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PEXPIRETIME")
    def PEXPIRETIME_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PEXPIRE")
    var PEXPIRE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PEXPIRE")
    def PEXPIRE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PEXPIRE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PEXPIRE")
    def PEXPIRE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PFADD")
    var PFADD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PFADD")
    def PFADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PFADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PFADD")
    def PFADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PFCOUNT")
    var PFCOUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PFCOUNT")
    def PFCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PFCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PFCOUNT")
    def PFCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PFMERGE")
    var PFMERGE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PFMERGE")
    def PFMERGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PFMERGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PFMERGE")
    def PFMERGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PSETEX")
    var PSETEX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PSETEX")
    def PSETEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PSETEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PSETEX")
    def PSETEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PTTL")
    var PTTL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PTTL")
    def PTTL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PTTL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PTTL")
    def PTTL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("PUBLISH")
    var PUBLISH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("PUBLISH")
    def PUBLISH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PUBLISH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("PUBLISH")
    def PUBLISH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("RENAMENX")
    var RENAMENX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("RENAMENX")
    def RENAMENX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RENAMENX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("RENAMENX")
    def RENAMENX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("RENAME")
    var RENAME_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME['transformArguments'] */ js.Any
        ]
      ]
    @JSName("RENAME")
    def RENAME_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RENAME['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("RENAME")
    def RENAME_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("RPOPLPUSH")
    var RPOPLPUSH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("RPOPLPUSH")
    def RPOPLPUSH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPOPLPUSH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("RPOPLPUSH")
    def RPOPLPUSH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("RPOP_COUNT")
    var RPOP_COUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("RPOP_COUNT")
    def RPOP_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPOP_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("RPOP_COUNT")
    def RPOP_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("RPOP")
    var RPOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("RPOP")
    def RPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("RPOP")
    def RPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("RPUSHX")
    var RPUSHX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("RPUSHX")
    def RPUSHX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPUSHX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("RPUSHX")
    def RPUSHX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("RPUSH")
    var RPUSH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("RPUSH")
    def RPUSH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPUSH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("RPUSH")
    def RPUSH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SADD")
    var SADD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SADD")
    def SADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SADD")
    def SADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SCARD")
    var SCARD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SCARD")
    def SCARD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SCARD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SCARD")
    def SCARD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SDIFFSTORE")
    var SDIFFSTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SDIFFSTORE")
    def SDIFFSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SDIFFSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SDIFFSTORE")
    def SDIFFSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SDIFF")
    var SDIFF_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SDIFF")
    def SDIFF_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SDIFF['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SDIFF")
    def SDIFF_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SETBIT")
    var SETBIT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SETBIT")
    def SETBIT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SETBIT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SETBIT")
    def SETBIT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SETEX")
    var SETEX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SETEX")
    def SETEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SETEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SETEX")
    def SETEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SETNX")
    var SETNX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SETNX")
    def SETNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SETNX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SETNX")
    def SETNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SETRANGE")
    var SETRANGE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SETRANGE")
    def SETRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SETRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SETRANGE")
    def SETRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SET")
    var SET_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SET")
    def SET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SET")
    def SET_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SINTERCARD")
    var SINTERCARD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SINTERCARD")
    def SINTERCARD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SINTERCARD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SINTERCARD")
    def SINTERCARD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SINTERSTORE")
    var SINTERSTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SINTERSTORE")
    def SINTERSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SINTERSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SINTERSTORE")
    def SINTERSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SINTER")
    var SINTER_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SINTER")
    def SINTER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SINTER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SINTER")
    def SINTER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SISMEMBER")
    var SISMEMBER_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SISMEMBER")
    def SISMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SISMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SISMEMBER")
    def SISMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SMEMBERS")
    var SMEMBERS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SMEMBERS")
    def SMEMBERS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SMEMBERS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SMEMBERS")
    def SMEMBERS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SMISMEMBER")
    var SMISMEMBER_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SMISMEMBER")
    def SMISMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SMISMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SMISMEMBER")
    def SMISMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SMOVE")
    var SMOVE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SMOVE")
    def SMOVE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SMOVE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SMOVE")
    def SMOVE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SORT")
    var SORT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("SORT_RO")
    var SORT_RO_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SORT_RO")
    def SORT_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SORT_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SORT_RO")
    def SORT_RO_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SORT_STORE")
    var SORT_STORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SORT_STORE")
    def SORT_STORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SORT_STORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SORT_STORE")
    def SORT_STORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SORT")
    def SORT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SORT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SORT")
    def SORT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SPOP")
    var SPOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SPOP")
    def SPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SPOP")
    def SPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SRANDMEMBER_COUNT")
    var SRANDMEMBER_COUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SRANDMEMBER_COUNT")
    def SRANDMEMBER_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SRANDMEMBER_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SRANDMEMBER_COUNT")
    def SRANDMEMBER_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SRANDMEMBER")
    var SRANDMEMBER_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SRANDMEMBER")
    def SRANDMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SRANDMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SRANDMEMBER")
    def SRANDMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SREM")
    var SREM_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SREM")
    def SREM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SREM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SREM")
    def SREM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SSCAN")
    var SSCAN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SSCAN")
    def SSCAN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SSCAN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SSCAN")
    def SSCAN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("STRLEN")
    var STRLEN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("STRLEN")
    def STRLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof STRLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("STRLEN")
    def STRLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SUNIONSTORE")
    var SUNIONSTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SUNIONSTORE")
    def SUNIONSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SUNIONSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SUNIONSTORE")
    def SUNIONSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("SUNION")
    var SUNION_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION['transformArguments'] */ js.Any
        ]
      ]
    @JSName("SUNION")
    def SUNION_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SUNION['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("SUNION")
    def SUNION_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("TOUCH")
    var TOUCH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("TOUCH")
    def TOUCH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof TOUCH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("TOUCH")
    def TOUCH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("TTL")
    var TTL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("TTL")
    def TTL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof TTL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("TTL")
    def TTL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("TYPE")
    var TYPE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("TYPE")
    def TYPE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof TYPE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("TYPE")
    def TYPE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("UNLINK")
    var UNLINK_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("UNLINK")
    def UNLINK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof UNLINK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("UNLINK")
    def UNLINK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("WATCH")
    var WATCH_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("WATCH")
    def WATCH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof WATCH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("WATCH")
    def WATCH_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XACK")
    var XACK_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XACK")
    def XACK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XACK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XACK")
    def XACK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XADD")
    var XADD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XADD")
    def XADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XADD")
    def XADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XAUTOCLAIM_JUSTID")
    var XAUTOCLAIM_JUSTID_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XAUTOCLAIM_JUSTID")
    def XAUTOCLAIM_JUSTID_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XAUTOCLAIM_JUSTID['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XAUTOCLAIM_JUSTID")
    def XAUTOCLAIM_JUSTID_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XAUTOCLAIM")
    var XAUTOCLAIM_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XAUTOCLAIM")
    def XAUTOCLAIM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XAUTOCLAIM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XAUTOCLAIM")
    def XAUTOCLAIM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XCLAIM_JUSTID")
    var XCLAIM_JUSTID_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XCLAIM_JUSTID")
    def XCLAIM_JUSTID_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XCLAIM_JUSTID['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XCLAIM_JUSTID")
    def XCLAIM_JUSTID_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XCLAIM")
    var XCLAIM_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XCLAIM")
    def XCLAIM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XCLAIM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XCLAIM")
    def XCLAIM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XDEL")
    var XDEL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XDEL")
    def XDEL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XDEL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XDEL")
    def XDEL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XGROUP_CREATECONSUMER")
    var XGROUP_CREATECONSUMER_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XGROUP_CREATECONSUMER")
    def XGROUP_CREATECONSUMER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_CREATECONSUMER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XGROUP_CREATECONSUMER")
    def XGROUP_CREATECONSUMER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XGROUP_CREATE")
    var XGROUP_CREATE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XGROUP_CREATE")
    def XGROUP_CREATE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_CREATE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XGROUP_CREATE")
    def XGROUP_CREATE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XGROUP_DELCONSUMER")
    var XGROUP_DELCONSUMER_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XGROUP_DELCONSUMER")
    def XGROUP_DELCONSUMER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_DELCONSUMER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XGROUP_DELCONSUMER")
    def XGROUP_DELCONSUMER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XGROUP_DESTROY")
    var XGROUP_DESTROY_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XGROUP_DESTROY")
    def XGROUP_DESTROY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_DESTROY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XGROUP_DESTROY")
    def XGROUP_DESTROY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XGROUP_SETID")
    var XGROUP_SETID_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XGROUP_SETID")
    def XGROUP_SETID_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_SETID['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XGROUP_SETID")
    def XGROUP_SETID_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XINFO_CONSUMERS")
    var XINFO_CONSUMERS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XINFO_CONSUMERS")
    def XINFO_CONSUMERS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XINFO_CONSUMERS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XINFO_CONSUMERS")
    def XINFO_CONSUMERS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XINFO_GROUPS")
    var XINFO_GROUPS_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XINFO_GROUPS")
    def XINFO_GROUPS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XINFO_GROUPS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XINFO_GROUPS")
    def XINFO_GROUPS_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XINFO_STREAM")
    var XINFO_STREAM_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XINFO_STREAM")
    def XINFO_STREAM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XINFO_STREAM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XINFO_STREAM")
    def XINFO_STREAM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XLEN")
    var XLEN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XLEN")
    def XLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XLEN")
    def XLEN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XPENDING")
    var XPENDING_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("XPENDING_RANGE")
    var XPENDING_RANGE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XPENDING_RANGE")
    def XPENDING_RANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XPENDING_RANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XPENDING_RANGE")
    def XPENDING_RANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XPENDING")
    def XPENDING_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XPENDING['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XPENDING")
    def XPENDING_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XRANGE")
    var XRANGE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XRANGE")
    def XRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XRANGE")
    def XRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XREADGROUP")
    var XREADGROUP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XREADGROUP")
    def XREADGROUP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XREADGROUP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XREADGROUP")
    def XREADGROUP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XREAD")
    var XREAD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XREAD")
    def XREAD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XREAD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XREAD")
    def XREAD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XREVRANGE")
    var XREVRANGE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XREVRANGE")
    def XREVRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XREVRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XREVRANGE")
    def XREVRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XSETID")
    var XSETID_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XSETID")
    def XSETID_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XSETID['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XSETID")
    def XSETID_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("XTRIM")
    var XTRIM_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("XTRIM")
    def XTRIM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XTRIM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("XTRIM")
    def XTRIM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZADD")
    var ZADD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZADD")
    def ZADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZADD")
    def ZADD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZCARD")
    var ZCARD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZCARD")
    def ZCARD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZCARD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZCARD")
    def ZCARD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZCOUNT")
    var ZCOUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZCOUNT")
    def ZCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZCOUNT")
    def ZCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZDIFFSTORE")
    var ZDIFFSTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZDIFFSTORE")
    def ZDIFFSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZDIFFSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZDIFFSTORE")
    def ZDIFFSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZDIFF")
    var ZDIFF_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("ZDIFF_WITHSCORES")
    var ZDIFF_WITHSCORES_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZDIFF_WITHSCORES")
    def ZDIFF_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZDIFF_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZDIFF_WITHSCORES")
    def ZDIFF_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZDIFF")
    def ZDIFF_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZDIFF['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZDIFF")
    def ZDIFF_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZINCRBY")
    var ZINCRBY_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZINCRBY")
    def ZINCRBY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINCRBY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZINCRBY")
    def ZINCRBY_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZINTERCARD")
    var ZINTERCARD_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZINTERCARD")
    def ZINTERCARD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINTERCARD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZINTERCARD")
    def ZINTERCARD_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZINTERSTORE")
    var ZINTERSTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZINTERSTORE")
    def ZINTERSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINTERSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZINTERSTORE")
    def ZINTERSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZINTER")
    var ZINTER_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("ZINTER_WITHSCORES")
    var ZINTER_WITHSCORES_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZINTER_WITHSCORES")
    def ZINTER_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINTER_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZINTER_WITHSCORES")
    def ZINTER_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZINTER")
    def ZINTER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINTER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZINTER")
    def ZINTER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZLEXCOUNT")
    var ZLEXCOUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZLEXCOUNT")
    def ZLEXCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZLEXCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZLEXCOUNT")
    def ZLEXCOUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZMPOP")
    var ZMPOP_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZMPOP")
    def ZMPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZMPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZMPOP")
    def ZMPOP_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZMSCORE")
    var ZMSCORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZMSCORE")
    def ZMSCORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZMSCORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZMSCORE")
    def ZMSCORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZPOPMAX_COUNT")
    var ZPOPMAX_COUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZPOPMAX_COUNT")
    def ZPOPMAX_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZPOPMAX_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZPOPMAX_COUNT")
    def ZPOPMAX_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZPOPMAX")
    var ZPOPMAX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZPOPMAX")
    def ZPOPMAX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZPOPMAX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZPOPMAX")
    def ZPOPMAX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZPOPMIN_COUNT")
    var ZPOPMIN_COUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZPOPMIN_COUNT")
    def ZPOPMIN_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZPOPMIN_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZPOPMIN_COUNT")
    def ZPOPMIN_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZPOPMIN")
    var ZPOPMIN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZPOPMIN")
    def ZPOPMIN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZPOPMIN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZPOPMIN")
    def ZPOPMIN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANDMEMBER_COUNT")
    var ZRANDMEMBER_COUNT_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("ZRANDMEMBER_COUNT_WITHSCORES")
    var ZRANDMEMBER_COUNT_WITHSCORES_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZRANDMEMBER_COUNT_WITHSCORES")
    def ZRANDMEMBER_COUNT_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANDMEMBER_COUNT_WITHSCORES")
    def ZRANDMEMBER_COUNT_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANDMEMBER_COUNT")
    def ZRANDMEMBER_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANDMEMBER_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANDMEMBER_COUNT")
    def ZRANDMEMBER_COUNT_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANDMEMBER")
    var ZRANDMEMBER_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZRANDMEMBER")
    def ZRANDMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANDMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANDMEMBER")
    def ZRANDMEMBER_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANGEBYLEX")
    var ZRANGEBYLEX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZRANGEBYLEX")
    def ZRANGEBYLEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGEBYLEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANGEBYLEX")
    def ZRANGEBYLEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANGEBYSCORE")
    var ZRANGEBYSCORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("ZRANGEBYSCORE_WITHSCORES")
    var ZRANGEBYSCORE_WITHSCORES_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZRANGEBYSCORE_WITHSCORES")
    def ZRANGEBYSCORE_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANGEBYSCORE_WITHSCORES")
    def ZRANGEBYSCORE_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANGEBYSCORE")
    def ZRANGEBYSCORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGEBYSCORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANGEBYSCORE")
    def ZRANGEBYSCORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANGESTORE")
    var ZRANGESTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZRANGESTORE")
    def ZRANGESTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGESTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANGESTORE")
    def ZRANGESTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANGE")
    var ZRANGE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("ZRANGE_WITHSCORES")
    var ZRANGE_WITHSCORES_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZRANGE_WITHSCORES")
    def ZRANGE_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGE_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANGE_WITHSCORES")
    def ZRANGE_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANGE")
    def ZRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANGE")
    def ZRANGE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZRANK")
    var ZRANK_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZRANK")
    def ZRANK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZRANK")
    def ZRANK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZREMRANGEBYLEX")
    var ZREMRANGEBYLEX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZREMRANGEBYLEX")
    def ZREMRANGEBYLEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREMRANGEBYLEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZREMRANGEBYLEX")
    def ZREMRANGEBYLEX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZREMRANGEBYRANK")
    var ZREMRANGEBYRANK_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZREMRANGEBYRANK")
    def ZREMRANGEBYRANK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREMRANGEBYRANK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZREMRANGEBYRANK")
    def ZREMRANGEBYRANK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZREMRANGEBYSCORE")
    var ZREMRANGEBYSCORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZREMRANGEBYSCORE")
    def ZREMRANGEBYSCORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREMRANGEBYSCORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZREMRANGEBYSCORE")
    def ZREMRANGEBYSCORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZREM")
    var ZREM_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZREM")
    def ZREM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZREM")
    def ZREM_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZREVRANK")
    var ZREVRANK_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZREVRANK")
    def ZREVRANK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREVRANK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZREVRANK")
    def ZREVRANK_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZSCAN")
    var ZSCAN_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZSCAN")
    def ZSCAN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZSCAN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZSCAN")
    def ZSCAN_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZSCORE")
    var ZSCORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZSCORE")
    def ZSCORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZSCORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZSCORE")
    def ZSCORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZUNIONSTORE")
    var ZUNIONSTORE_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZUNIONSTORE")
    def ZUNIONSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZUNIONSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZUNIONSTORE")
    def ZUNIONSTORE_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZUNION")
    var ZUNION_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION['transformArguments'] */ js.Any
        ]
      ]
    
    @JSName("ZUNION_WITHSCORES")
    var ZUNION_WITHSCORES_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ZUNION_WITHSCORES")
    def ZUNION_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZUNION_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZUNION_WITHSCORES")
    def ZUNION_WITHSCORES_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ZUNION")
    def ZUNION_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZUNION['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ZUNION")
    def ZUNION_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("append")
    var append_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND['transformArguments'] */ js.Any
        ]
      ]
    @JSName("append")
    def append_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof APPEND['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("append")
    def append_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("bitCount")
    var bitCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("bitCount")
    def bitCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("bitCount")
    def bitCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("bitFieldRo")
    var bitFieldRo_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("bitFieldRo")
    def bitFieldRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITFIELD_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("bitFieldRo")
    def bitFieldRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("bitField")
    var bitField_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("bitField")
    def bitField_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITFIELD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("bitField")
    def bitField_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("bitOp")
    var bitOp_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("bitOp")
    def bitOp_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("bitOp")
    def bitOp_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("bitPos")
    var bitPos_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("bitPos")
    def bitPos_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BITPOS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("bitPos")
    def bitPos_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("blMove")
    var blMove_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("blMove")
    def blMove_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BLMOVE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("blMove")
    def blMove_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("blPop")
    var blPop_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("blPop")
    def blPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BLPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("blPop")
    def blPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("blmPop")
    var blmPop_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("blmPop")
    def blmPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BLMPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("blmPop")
    def blmPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("brPopLPush")
    var brPopLPush_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("brPopLPush")
    def brPopLPush_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BRPOPLPUSH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("brPopLPush")
    def brPopLPush_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("brPop")
    var brPop_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("brPop")
    def brPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BRPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("brPop")
    def brPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("bzPopMax")
    var bzPopMax_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("bzPopMax")
    def bzPopMax_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BZPOPMAX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("bzPopMax")
    def bzPopMax_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("bzPopMin")
    var bzPopMin_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("bzPopMin")
    def bzPopMin_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BZPOPMIN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("bzPopMin")
    def bzPopMin_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("bzmPop")
    var bzmPop_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("bzmPop")
    def bzmPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof BZMPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("bzmPop")
    def bzmPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("copy")
    var copy_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("copy")
    def copy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof COPY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("copy")
    def copy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("decrBy")
    var decrBy_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("decrBy")
    def decrBy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof DECRBY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("decrBy")
    def decrBy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("decr")
    var decr_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR['transformArguments'] */ js.Any
        ]
      ]
    @JSName("decr")
    def decr_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof DECR['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("decr")
    def decr_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("del")
    var del_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("del")
    def del_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof DEL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("del")
    def del_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("dump")
    var dump_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("dump")
    def dump_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof DUMP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("dump")
    def dump_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("evalRo")
    var evalRo_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("evalRo")
    def evalRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EVAL_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("evalRo")
    def evalRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("evalShaRo")
    var evalShaRo_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("evalShaRo")
    def evalShaRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EVALSHA_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("evalShaRo")
    def evalShaRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("evalSha")
    var evalSha_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA['transformArguments'] */ js.Any
        ]
      ]
    @JSName("evalSha")
    def evalSha_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EVALSHA['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("evalSha")
    def evalSha_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("eval")
    var eval_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("eval")
    def eval_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EVAL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("eval")
    def eval_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("exists")
    var exists_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("exists")
    def exists_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EXISTS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("exists")
    def exists_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("expireAt")
    var expireAt_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("expireAt")
    def expireAt_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EXPIREAT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("expireAt")
    def expireAt_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("expireTime")
    var expireTime_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME['transformArguments'] */ js.Any
        ]
      ]
    @JSName("expireTime")
    def expireTime_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EXPIRETIME['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("expireTime")
    def expireTime_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("expire")
    var expire_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("expire")
    def expire_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof EXPIRE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("expire")
    def expire_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("fCallRo")
    var fCallRo_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("fCallRo")
    def fCallRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof FCALL_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("fCallRo")
    def fCallRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("fCall")
    var fCall_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("fCall")
    def fCall_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof FCALL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("fCall")
    def fCall_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoAdd")
    var geoAdd_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoAdd")
    def geoAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoAdd")
    def geoAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoDist")
    var geoDist_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoDist")
    def geoDist_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEODIST['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoDist")
    def geoDist_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoHash")
    var geoHash_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoHash")
    def geoHash_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOHASH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoHash")
    def geoHash_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoPos")
    var geoPos_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoPos")
    def geoPos_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOPOS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoPos")
    def geoPos_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadiusByMemberRoWith")
    var geoRadiusByMemberRoWith_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadiusByMemberRoWith")
    def geoRadiusByMemberRoWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadiusByMemberRoWith")
    def geoRadiusByMemberRoWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadiusByMemberRo")
    var geoRadiusByMemberRo_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadiusByMemberRo")
    def geoRadiusByMemberRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBER_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadiusByMemberRo")
    def geoRadiusByMemberRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadiusByMemberStore")
    var geoRadiusByMemberStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadiusByMemberStore")
    def geoRadiusByMemberStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadiusByMemberStore")
    def geoRadiusByMemberStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadiusByMemberWith")
    var geoRadiusByMemberWith_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadiusByMemberWith")
    def geoRadiusByMemberWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadiusByMemberWith")
    def geoRadiusByMemberWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadiusByMember")
    var geoRadiusByMember_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadiusByMember")
    def geoRadiusByMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSBYMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadiusByMember")
    def geoRadiusByMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadiusRoWith")
    var geoRadiusRoWith_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadiusRoWith")
    def geoRadiusRoWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUS_RO_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadiusRoWith")
    def geoRadiusRoWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadiusRo")
    var geoRadiusRo_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadiusRo")
    def geoRadiusRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUS_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadiusRo")
    def geoRadiusRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadiusStore")
    var geoRadiusStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadiusStore")
    def geoRadiusStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUSSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadiusStore")
    def geoRadiusStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadiusWith")
    var geoRadiusWith_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadiusWith")
    def geoRadiusWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUS_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadiusWith")
    def geoRadiusWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoRadius")
    var geoRadius_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoRadius")
    def geoRadius_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEORADIUS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoRadius")
    def geoRadius_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoSearchStore")
    var geoSearchStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoSearchStore")
    def geoSearchStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOSEARCHSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoSearchStore")
    def geoSearchStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoSearchWith")
    var geoSearchWith_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoSearchWith")
    def geoSearchWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOSEARCH_WITH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoSearchWith")
    def geoSearchWith_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("geoSearch")
    var geoSearch_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("geoSearch")
    def geoSearch_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GEOSEARCH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("geoSearch")
    def geoSearch_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("getBit")
    var getBit_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("getBit")
    def getBit_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETBIT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("getBit")
    def getBit_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("getDel")
    var getDel_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("getDel")
    def getDel_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETDEL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("getDel")
    def getDel_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("getEx")
    var getEx_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("getEx")
    def getEx_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("getEx")
    def getEx_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("getRange")
    var getRange_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("getRange")
    def getRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("getRange")
    def getRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("getSet")
    var getSet_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("getSet")
    def getSet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GETSET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("getSet")
    def getSet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("get")
    var get_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("get")
    def get_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof GET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("get")
    def get_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hDel")
    var hDel_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hDel")
    def hDel_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HDEL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hDel")
    def hDel_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hExists")
    var hExists_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hExists")
    def hExists_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HEXISTS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hExists")
    def hExists_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hGetAll")
    var hGetAll_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hGetAll")
    def hGetAll_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HGETALL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hGetAll")
    def hGetAll_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hGet")
    var hGet_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hGet")
    def hGet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HGET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hGet")
    def hGet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hIncrByFloat")
    var hIncrByFloat_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hIncrByFloat")
    def hIncrByFloat_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HINCRBYFLOAT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hIncrByFloat")
    def hIncrByFloat_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hIncrBy")
    var hIncrBy_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hIncrBy")
    def hIncrBy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HINCRBY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hIncrBy")
    def hIncrBy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hKeys")
    var hKeys_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hKeys")
    def hKeys_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HKEYS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hKeys")
    def hKeys_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hLen")
    var hLen_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hLen")
    def hLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hLen")
    def hLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hRandFieldCountWithValues")
    var hRandFieldCountWithValues_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hRandFieldCountWithValues")
    def hRandFieldCountWithValues_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hRandFieldCountWithValues")
    def hRandFieldCountWithValues_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hRandFieldCount")
    var hRandFieldCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hRandFieldCount")
    def hRandFieldCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HRANDFIELD_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hRandFieldCount")
    def hRandFieldCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hRandField")
    var hRandField_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hRandField")
    def hRandField_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HRANDFIELD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hRandField")
    def hRandField_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hScan")
    var hScan_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hScan")
    def hScan_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HSCAN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hScan")
    def hScan_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hSetNX")
    var hSetNX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hSetNX")
    def hSetNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HSETNX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hSetNX")
    def hSetNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hSet")
    var hSet_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hSet")
    def hSet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HSET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hSet")
    def hSet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hStrLen")
    var hStrLen_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hStrLen")
    def hStrLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HSTRLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hStrLen")
    def hStrLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hVals")
    var hVals_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hVals")
    def hVals_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HVALS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hVals")
    def hVals_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("hmGet")
    var hmGet_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("hmGet")
    def hmGet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof HMGET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("hmGet")
    def hmGet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("incrByFloat")
    var incrByFloat_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("incrByFloat")
    def incrByFloat_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof INCRBYFLOAT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("incrByFloat")
    def incrByFloat_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("incrBy")
    var incrBy_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("incrBy")
    def incrBy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof INCRBY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("incrBy")
    def incrBy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("incr")
    var incr_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR['transformArguments'] */ js.Any
        ]
      ]
    @JSName("incr")
    def incr_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof INCR['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("incr")
    def incr_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lIndex")
    var lIndex_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lIndex")
    def lIndex_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LINDEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lIndex")
    def lIndex_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lInsert")
    var lInsert_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lInsert")
    def lInsert_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LINSERT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lInsert")
    def lInsert_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lLen")
    var lLen_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lLen")
    def lLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lLen")
    def lLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lMove")
    var lMove_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lMove")
    def lMove_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LMOVE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lMove")
    def lMove_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lPopCount")
    var lPopCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lPopCount")
    def lPopCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPOP_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lPopCount")
    def lPopCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lPop")
    var lPop_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lPop")
    def lPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lPop")
    def lPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lPosCount")
    var lPosCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lPosCount")
    def lPosCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPOS_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lPosCount")
    def lPosCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lPos")
    var lPos_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lPos")
    def lPos_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPOS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lPos")
    def lPos_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lPushX")
    var lPushX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lPushX")
    def lPushX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPUSHX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lPushX")
    def lPushX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lPush")
    var lPush_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lPush")
    def lPush_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LPUSH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lPush")
    def lPush_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lRange")
    var lRange_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lRange")
    def lRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lRange")
    def lRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lRem")
    var lRem_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lRem")
    def lRem_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LREM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lRem")
    def lRem_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lSet")
    var lSet_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lSet")
    def lSet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LSET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lSet")
    def lSet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lTrim")
    var lTrim_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lTrim")
    def lTrim_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LTRIM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lTrim")
    def lTrim_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lcsIdxWithMatchLen")
    var lcsIdxWithMatchLen_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lcsIdxWithMatchLen")
    def lcsIdxWithMatchLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lcsIdxWithMatchLen")
    def lcsIdxWithMatchLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lcsIdx")
    var lcsIdx_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lcsIdx")
    def lcsIdx_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LCS_IDX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lcsIdx")
    def lcsIdx_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lcsLen")
    var lcsLen_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lcsLen")
    def lcsLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LCS_LEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lcsLen")
    def lcsLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lcs")
    var lcs_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lcs")
    def lcs_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LCS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lcs")
    def lcs_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("lmPop")
    var lmPop_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("lmPop")
    def lmPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof LMPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("lmPop")
    def lmPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("mGet")
    var mGet_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("mGet")
    def mGet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof MGET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("mGet")
    def mGet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("mSetNX")
    var mSetNX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("mSetNX")
    def mSetNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof MSETNX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("mSetNX")
    def mSetNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("mSet")
    var mSet_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("mSet")
    def mSet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof MSET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("mSet")
    def mSet_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("migrate")
    var migrate_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("migrate")
    def migrate_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof MIGRATE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("migrate")
    def migrate_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("objectEncoding")
    var objectEncoding_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING['transformArguments'] */ js.Any
        ]
      ]
    @JSName("objectEncoding")
    def objectEncoding_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof OBJECT_ENCODING['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("objectEncoding")
    def objectEncoding_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("objectFreq")
    var objectFreq_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ['transformArguments'] */ js.Any
        ]
      ]
    @JSName("objectFreq")
    def objectFreq_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof OBJECT_FREQ['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("objectFreq")
    def objectFreq_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("objectIdleTime")
    var objectIdleTime_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME['transformArguments'] */ js.Any
        ]
      ]
    @JSName("objectIdleTime")
    def objectIdleTime_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof OBJECT_IDLETIME['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("objectIdleTime")
    def objectIdleTime_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("objectRefCount")
    var objectRefCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("objectRefCount")
    def objectRefCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof OBJECT_REFCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("objectRefCount")
    def objectRefCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("pExpireAt")
    var pExpireAt_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("pExpireAt")
    def pExpireAt_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PEXPIREAT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("pExpireAt")
    def pExpireAt_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("pExpireTime")
    var pExpireTime_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME['transformArguments'] */ js.Any
        ]
      ]
    @JSName("pExpireTime")
    def pExpireTime_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PEXPIRETIME['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("pExpireTime")
    def pExpireTime_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("pExpire")
    var pExpire_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("pExpire")
    def pExpire_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PEXPIRE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("pExpire")
    def pExpire_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("pSetEx")
    var pSetEx_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("pSetEx")
    def pSetEx_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PSETEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("pSetEx")
    def pSetEx_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("pTTL")
    var pTTL_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("pTTL")
    def pTTL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PTTL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("pTTL")
    def pTTL_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("persist")
    var persist_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST['transformArguments'] */ js.Any
        ]
      ]
    @JSName("persist")
    def persist_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PERSIST['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("persist")
    def persist_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("pfAdd")
    var pfAdd_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("pfAdd")
    def pfAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PFADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("pfAdd")
    def pfAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("pfCount")
    var pfCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("pfCount")
    def pfCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PFCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("pfCount")
    def pfCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("pfMerge")
    var pfMerge_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("pfMerge")
    def pfMerge_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PFMERGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("pfMerge")
    def pfMerge_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("publish")
    var publish_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("publish")
    def publish_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof PUBLISH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("publish")
    def publish_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("rPopCount")
    var rPopCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("rPopCount")
    def rPopCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPOP_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("rPopCount")
    def rPopCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("rPopLPush")
    var rPopLPush_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("rPopLPush")
    def rPopLPush_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPOPLPUSH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("rPopLPush")
    def rPopLPush_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("rPop")
    var rPop_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("rPop")
    def rPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("rPop")
    def rPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("rPushX")
    var rPushX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("rPushX")
    def rPushX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPUSHX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("rPushX")
    def rPushX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("rPush")
    var rPush_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("rPush")
    def rPush_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RPUSH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("rPush")
    def rPush_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("renameNX")
    var renameNX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("renameNX")
    def renameNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RENAMENX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("renameNX")
    def renameNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("rename")
    var rename_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME['transformArguments'] */ js.Any
        ]
      ]
    @JSName("rename")
    def rename_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof RENAME['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("rename")
    def rename_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sAdd")
    var sAdd_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sAdd")
    def sAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sAdd")
    def sAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sCard")
    var sCard_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sCard")
    def sCard_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SCARD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sCard")
    def sCard_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sDiffStore")
    var sDiffStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sDiffStore")
    def sDiffStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SDIFFSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sDiffStore")
    def sDiffStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sDiff")
    var sDiff_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sDiff")
    def sDiff_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SDIFF['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sDiff")
    def sDiff_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sInterCard")
    var sInterCard_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sInterCard")
    def sInterCard_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SINTERCARD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sInterCard")
    def sInterCard_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sInterStore")
    var sInterStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sInterStore")
    def sInterStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SINTERSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sInterStore")
    def sInterStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sInter")
    var sInter_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sInter")
    def sInter_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SINTER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sInter")
    def sInter_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sIsMember")
    var sIsMember_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sIsMember")
    def sIsMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SISMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sIsMember")
    def sIsMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sMembers")
    var sMembers_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sMembers")
    def sMembers_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SMEMBERS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sMembers")
    def sMembers_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sMove")
    var sMove_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sMove")
    def sMove_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SMOVE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sMove")
    def sMove_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sPop")
    var sPop_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sPop")
    def sPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sPop")
    def sPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sRandMemberCount")
    var sRandMemberCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sRandMemberCount")
    def sRandMemberCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SRANDMEMBER_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sRandMemberCount")
    def sRandMemberCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sRandMember")
    var sRandMember_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sRandMember")
    def sRandMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SRANDMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sRandMember")
    def sRandMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sRem")
    var sRem_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sRem")
    def sRem_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SREM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sRem")
    def sRem_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sScan")
    var sScan_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sScan")
    def sScan_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SSCAN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sScan")
    def sScan_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sUnionStore")
    var sUnionStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sUnionStore")
    def sUnionStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SUNIONSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sUnionStore")
    def sUnionStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sUnion")
    var sUnion_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sUnion")
    def sUnion_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SUNION['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sUnion")
    def sUnion_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("setBit")
    var setBit_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("setBit")
    def setBit_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SETBIT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("setBit")
    def setBit_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("setEx")
    var setEx_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("setEx")
    def setEx_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SETEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("setEx")
    def setEx_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("setNX")
    var setNX_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("setNX")
    def setNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SETNX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("setNX")
    def setNX_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("setRange")
    var setRange_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("setRange")
    def setRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SETRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("setRange")
    def setRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("set")
    var set_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SET['transformArguments'] */ js.Any
        ]
      ]
    @JSName("set")
    def set_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SET['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("set")
    def set_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SET['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("smIsMember")
    var smIsMember_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("smIsMember")
    def smIsMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SMISMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("smIsMember")
    def smIsMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sortRo")
    var sortRo_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sortRo")
    def sortRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SORT_RO['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sortRo")
    def sortRo_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sortStore")
    var sortStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sortStore")
    def sortStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SORT_STORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sortStore")
    def sortStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("sort")
    var sort_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("sort")
    def sort_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof SORT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("sort")
    def sort_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("strLen")
    var strLen_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("strLen")
    def strLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof STRLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("strLen")
    def strLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("touch")
    var touch_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("touch")
    def touch_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof TOUCH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("touch")
    def touch_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("ttl")
    var ttl_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("ttl")
    def ttl_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof TTL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("ttl")
    def ttl_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("type")
    var type_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("type")
    def type_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof TYPE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("type")
    def type_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("unlink")
    var unlink_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("unlink")
    def unlink_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof UNLINK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("unlink")
    def unlink_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("watch")
    var watch_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH['transformArguments'] */ js.Any
        ]
      ]
    @JSName("watch")
    def watch_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof WATCH['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("watch")
    def watch_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xAck")
    var xAck_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xAck")
    def xAck_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XACK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xAck")
    def xAck_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xAdd")
    var xAdd_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xAdd")
    def xAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xAdd")
    def xAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xAutoClaimJustId")
    var xAutoClaimJustId_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xAutoClaimJustId")
    def xAutoClaimJustId_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XAUTOCLAIM_JUSTID['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xAutoClaimJustId")
    def xAutoClaimJustId_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xAutoClaim")
    var xAutoClaim_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xAutoClaim")
    def xAutoClaim_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XAUTOCLAIM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xAutoClaim")
    def xAutoClaim_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xClaimJustId")
    var xClaimJustId_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xClaimJustId")
    def xClaimJustId_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XCLAIM_JUSTID['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xClaimJustId")
    def xClaimJustId_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xClaim")
    var xClaim_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xClaim")
    def xClaim_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XCLAIM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xClaim")
    def xClaim_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xDel")
    var xDel_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xDel")
    def xDel_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XDEL['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xDel")
    def xDel_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xGroupCreateConsumer")
    var xGroupCreateConsumer_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xGroupCreateConsumer")
    def xGroupCreateConsumer_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_CREATECONSUMER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xGroupCreateConsumer")
    def xGroupCreateConsumer_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xGroupCreate")
    var xGroupCreate_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xGroupCreate")
    def xGroupCreate_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_CREATE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xGroupCreate")
    def xGroupCreate_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xGroupDelConsumer")
    var xGroupDelConsumer_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xGroupDelConsumer")
    def xGroupDelConsumer_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_DELCONSUMER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xGroupDelConsumer")
    def xGroupDelConsumer_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xGroupDestroy")
    var xGroupDestroy_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xGroupDestroy")
    def xGroupDestroy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_DESTROY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xGroupDestroy")
    def xGroupDestroy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xGroupSetId")
    var xGroupSetId_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xGroupSetId")
    def xGroupSetId_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XGROUP_SETID['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xGroupSetId")
    def xGroupSetId_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xInfoConsumers")
    var xInfoConsumers_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xInfoConsumers")
    def xInfoConsumers_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XINFO_CONSUMERS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xInfoConsumers")
    def xInfoConsumers_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xInfoGroups")
    var xInfoGroups_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xInfoGroups")
    def xInfoGroups_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XINFO_GROUPS['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xInfoGroups")
    def xInfoGroups_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xInfoStream")
    var xInfoStream_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xInfoStream")
    def xInfoStream_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XINFO_STREAM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xInfoStream")
    def xInfoStream_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xLen")
    var xLen_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xLen")
    def xLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XLEN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xLen")
    def xLen_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xPendingRange")
    var xPendingRange_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xPendingRange")
    def xPendingRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XPENDING_RANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xPendingRange")
    def xPendingRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xPending")
    var xPending_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xPending")
    def xPending_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XPENDING['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xPending")
    def xPending_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xRange")
    var xRange_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xRange")
    def xRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xRange")
    def xRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xReadGroup")
    var xReadGroup_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xReadGroup")
    def xReadGroup_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XREADGROUP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xReadGroup")
    def xReadGroup_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xRead")
    var xRead_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xRead")
    def xRead_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XREAD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xRead")
    def xRead_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xRevRange")
    var xRevRange_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xRevRange")
    def xRevRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XREVRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xRevRange")
    def xRevRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xSetId")
    var xSetId_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xSetId")
    def xSetId_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XSETID['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xSetId")
    def xSetId_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("xTrim")
    var xTrim_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("xTrim")
    def xTrim_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof XTRIM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("xTrim")
    def xTrim_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zAdd")
    var zAdd_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zAdd")
    def zAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZADD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zAdd")
    def zAdd_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zCard")
    var zCard_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zCard")
    def zCard_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZCARD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zCard")
    def zCard_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zCount")
    var zCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zCount")
    def zCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zCount")
    def zCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zDiffStore")
    var zDiffStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zDiffStore")
    def zDiffStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZDIFFSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zDiffStore")
    def zDiffStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zDiffWithScores")
    var zDiffWithScores_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zDiffWithScores")
    def zDiffWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZDIFF_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zDiffWithScores")
    def zDiffWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zDiff")
    var zDiff_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zDiff")
    def zDiff_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZDIFF['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zDiff")
    def zDiff_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zIncrBy")
    var zIncrBy_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zIncrBy")
    def zIncrBy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINCRBY['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zIncrBy")
    def zIncrBy_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zInterCard")
    var zInterCard_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zInterCard")
    def zInterCard_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINTERCARD['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zInterCard")
    def zInterCard_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zInterStore")
    var zInterStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zInterStore")
    def zInterStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINTERSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zInterStore")
    def zInterStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zInterWithScores")
    var zInterWithScores_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zInterWithScores")
    def zInterWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINTER_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zInterWithScores")
    def zInterWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zInter")
    var zInter_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zInter")
    def zInter_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZINTER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zInter")
    def zInter_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zLexCount")
    var zLexCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zLexCount")
    def zLexCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZLEXCOUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zLexCount")
    def zLexCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zPopMaxCount")
    var zPopMaxCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zPopMaxCount")
    def zPopMaxCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZPOPMAX_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zPopMaxCount")
    def zPopMaxCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zPopMax")
    var zPopMax_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zPopMax")
    def zPopMax_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZPOPMAX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zPopMax")
    def zPopMax_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zPopMinCount")
    var zPopMinCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zPopMinCount")
    def zPopMinCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZPOPMIN_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zPopMinCount")
    def zPopMinCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zPopMin")
    var zPopMin_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zPopMin")
    def zPopMin_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZPOPMIN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zPopMin")
    def zPopMin_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRandMemberCountWithScores")
    var zRandMemberCountWithScores_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRandMemberCountWithScores")
    def zRandMemberCountWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRandMemberCountWithScores")
    def zRandMemberCountWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRandMemberCount")
    var zRandMemberCount_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRandMemberCount")
    def zRandMemberCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANDMEMBER_COUNT['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRandMemberCount")
    def zRandMemberCount_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRandMember")
    var zRandMember_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRandMember")
    def zRandMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANDMEMBER['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRandMember")
    def zRandMember_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRangeByLex")
    var zRangeByLex_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRangeByLex")
    def zRangeByLex_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGEBYLEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRangeByLex")
    def zRangeByLex_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRangeByScoreWithScores")
    var zRangeByScoreWithScores_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRangeByScoreWithScores")
    def zRangeByScoreWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRangeByScoreWithScores")
    def zRangeByScoreWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRangeByScore")
    var zRangeByScore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRangeByScore")
    def zRangeByScore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGEBYSCORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRangeByScore")
    def zRangeByScore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRangeStore")
    var zRangeStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRangeStore")
    def zRangeStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGESTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRangeStore")
    def zRangeStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRangeWithScores")
    var zRangeWithScores_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRangeWithScores")
    def zRangeWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGE_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRangeWithScores")
    def zRangeWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRange")
    var zRange_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRange")
    def zRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANGE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRange")
    def zRange_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRank")
    var zRank_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRank")
    def zRank_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZRANK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRank")
    def zRank_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRemRangeByLex")
    var zRemRangeByLex_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRemRangeByLex")
    def zRemRangeByLex_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREMRANGEBYLEX['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRemRangeByLex")
    def zRemRangeByLex_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRemRangeByRank")
    var zRemRangeByRank_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRemRangeByRank")
    def zRemRangeByRank_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREMRANGEBYRANK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRemRangeByRank")
    def zRemRangeByRank_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRemRangeByScore")
    var zRemRangeByScore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRemRangeByScore")
    def zRemRangeByScore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREMRANGEBYSCORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRemRangeByScore")
    def zRemRangeByScore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRem")
    var zRem_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRem")
    def zRem_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREM['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRem")
    def zRem_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zRevRank")
    var zRevRank_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zRevRank")
    def zRevRank_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZREVRANK['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zRevRank")
    def zRevRank_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zScan")
    var zScan_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zScan")
    def zScan_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZSCAN['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zScan")
    def zScan_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zScore")
    var zScore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zScore")
    def zScore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZSCORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zScore")
    def zScore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zUnionStore")
    var zUnionStore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zUnionStore")
    def zUnionStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZUNIONSTORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zUnionStore")
    def zUnionStore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zUnionWithScores")
    var zUnionWithScores_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zUnionWithScores")
    def zUnionWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZUNION_WITHSCORES['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zUnionWithScores")
    def zUnionWithScores_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zUnion")
    var zUnion_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zUnion")
    def zUnion_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZUNION['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zUnion")
    def zUnion_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zmPop")
    var zmPop_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zmPop")
    def zmPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZMPOP['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zmPop")
    def zmPop_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any
          ], 
          String | Buffer
        ]
      ]
    
    @JSName("zmScore")
    var zmScore_Original: RedisCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any, 
        Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE['transformArguments'] */ js.Any
        ]
      ]
    @JSName("zmScore")
    def zmScore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: typeof ZMSCORE['transformArguments'] extends (args : infer P): any ? any : never */ /* rest */ js.Array[Any]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
    @JSName("zmScore")
    def zmScore_transformArguments[Options /* <: CommandOptionsClientComma */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params | [options: Options, rest: ...Params] is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE['transformArguments'] */ js.Any
        ]
    ): js.Promise[
        ConvertArgumentType[
          RedisCommandReply[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any
          ], 
          String | Buffer
        ]
      ]
  }
  object WithCommands {
    
    inline def apply(
      APPEND: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND['transformArguments'] */ js.Any
          ]
        ],
      BITCOUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT['transformArguments'] */ js.Any
          ]
        ],
      BITFIELD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD['transformArguments'] */ js.Any
          ]
        ],
      BITFIELD_RO: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
          ]
        ],
      BITOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP['transformArguments'] */ js.Any
          ]
        ],
      BITPOS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS['transformArguments'] */ js.Any
          ]
        ],
      BLMOVE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE['transformArguments'] */ js.Any
          ]
        ],
      BLMPOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP['transformArguments'] */ js.Any
          ]
        ],
      BLPOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP['transformArguments'] */ js.Any
          ]
        ],
      BRPOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP['transformArguments'] */ js.Any
          ]
        ],
      BRPOPLPUSH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH['transformArguments'] */ js.Any
          ]
        ],
      BZMPOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP['transformArguments'] */ js.Any
          ]
        ],
      BZPOPMAX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX['transformArguments'] */ js.Any
          ]
        ],
      BZPOPMIN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN['transformArguments'] */ js.Any
          ]
        ],
      COPY: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY['transformArguments'] */ js.Any
          ]
        ],
      DECR: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR['transformArguments'] */ js.Any
          ]
        ],
      DECRBY: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY['transformArguments'] */ js.Any
          ]
        ],
      DEL: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL['transformArguments'] */ js.Any
          ]
        ],
      DUMP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP['transformArguments'] */ js.Any
          ]
        ],
      EVAL: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL['transformArguments'] */ js.Any
          ]
        ],
      EVALSHA: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA['transformArguments'] */ js.Any
          ]
        ],
      EVALSHA_RO: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
          ]
        ],
      EVAL_RO: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
          ]
        ],
      EXISTS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS['transformArguments'] */ js.Any
          ]
        ],
      EXPIRE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE['transformArguments'] */ js.Any
          ]
        ],
      EXPIREAT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT['transformArguments'] */ js.Any
          ]
        ],
      EXPIRETIME: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME['transformArguments'] */ js.Any
          ]
        ],
      FCALL: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL['transformArguments'] */ js.Any
          ]
        ],
      FCALL_RO: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
          ]
        ],
      GEOADD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD['transformArguments'] */ js.Any
          ]
        ],
      GEODIST: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST['transformArguments'] */ js.Any
          ]
        ],
      GEOHASH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH['transformArguments'] */ js.Any
          ]
        ],
      GEOPOS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUSBYMEMBER: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUSBYMEMBERSTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUSBYMEMBER_RO: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUSBYMEMBER_RO_WITH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUSBYMEMBER_WITH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUSSTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUS_RO: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUS_RO_WITH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
          ]
        ],
      GEORADIUS_WITH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
          ]
        ],
      GEOSEARCH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH['transformArguments'] */ js.Any
          ]
        ],
      GEOSEARCHSTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE['transformArguments'] */ js.Any
          ]
        ],
      GEOSEARCH_WITH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH['transformArguments'] */ js.Any
          ]
        ],
      GET: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GET['transformArguments'] */ js.Any
          ]
        ],
      GETBIT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT['transformArguments'] */ js.Any
          ]
        ],
      GETDEL: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL['transformArguments'] */ js.Any
          ]
        ],
      GETEX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX['transformArguments'] */ js.Any
          ]
        ],
      GETRANGE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE['transformArguments'] */ js.Any
          ]
        ],
      GETSET: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET['transformArguments'] */ js.Any
          ]
        ],
      HDEL: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL['transformArguments'] */ js.Any
          ]
        ],
      HEXISTS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS['transformArguments'] */ js.Any
          ]
        ],
      HGET: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET['transformArguments'] */ js.Any
          ]
        ],
      HGETALL: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL['transformArguments'] */ js.Any
          ]
        ],
      HINCRBY: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY['transformArguments'] */ js.Any
          ]
        ],
      HINCRBYFLOAT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT['transformArguments'] */ js.Any
          ]
        ],
      HKEYS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS['transformArguments'] */ js.Any
          ]
        ],
      HLEN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN['transformArguments'] */ js.Any
          ]
        ],
      HMGET: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET['transformArguments'] */ js.Any
          ]
        ],
      HRANDFIELD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD['transformArguments'] */ js.Any
          ]
        ],
      HRANDFIELD_COUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT['transformArguments'] */ js.Any
          ]
        ],
      HRANDFIELD_COUNT_WITHVALUES: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
          ]
        ],
      HSCAN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN['transformArguments'] */ js.Any
          ]
        ],
      HSET: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET['transformArguments'] */ js.Any
          ]
        ],
      HSETNX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX['transformArguments'] */ js.Any
          ]
        ],
      HSTRLEN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN['transformArguments'] */ js.Any
          ]
        ],
      HVALS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS['transformArguments'] */ js.Any
          ]
        ],
      INCR: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR['transformArguments'] */ js.Any
          ]
        ],
      INCRBY: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY['transformArguments'] */ js.Any
          ]
        ],
      INCRBYFLOAT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT['transformArguments'] */ js.Any
          ]
        ],
      LCS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS['transformArguments'] */ js.Any
          ]
        ],
      LCS_IDX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX['transformArguments'] */ js.Any
          ]
        ],
      LCS_IDX_WITHMATCHLEN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
          ]
        ],
      LCS_LEN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN['transformArguments'] */ js.Any
          ]
        ],
      LINDEX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX['transformArguments'] */ js.Any
          ]
        ],
      LINSERT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT['transformArguments'] */ js.Any
          ]
        ],
      LLEN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN['transformArguments'] */ js.Any
          ]
        ],
      LMOVE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE['transformArguments'] */ js.Any
          ]
        ],
      LMPOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP['transformArguments'] */ js.Any
          ]
        ],
      LPOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP['transformArguments'] */ js.Any
          ]
        ],
      LPOP_COUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT['transformArguments'] */ js.Any
          ]
        ],
      LPOS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS['transformArguments'] */ js.Any
          ]
        ],
      LPOS_COUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT['transformArguments'] */ js.Any
          ]
        ],
      LPUSH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH['transformArguments'] */ js.Any
          ]
        ],
      LPUSHX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX['transformArguments'] */ js.Any
          ]
        ],
      LRANGE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE['transformArguments'] */ js.Any
          ]
        ],
      LREM: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM['transformArguments'] */ js.Any
          ]
        ],
      LSET: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET['transformArguments'] */ js.Any
          ]
        ],
      LTRIM: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM['transformArguments'] */ js.Any
          ]
        ],
      MGET: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET['transformArguments'] */ js.Any
          ]
        ],
      MIGRATE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE['transformArguments'] */ js.Any
          ]
        ],
      MSET: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET['transformArguments'] */ js.Any
          ]
        ],
      MSETNX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX['transformArguments'] */ js.Any
          ]
        ],
      OBJECT_ENCODING: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING['transformArguments'] */ js.Any
          ]
        ],
      OBJECT_FREQ: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ['transformArguments'] */ js.Any
          ]
        ],
      OBJECT_IDLETIME: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME['transformArguments'] */ js.Any
          ]
        ],
      OBJECT_REFCOUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT['transformArguments'] */ js.Any
          ]
        ],
      PERSIST: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST['transformArguments'] */ js.Any
          ]
        ],
      PEXPIRE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE['transformArguments'] */ js.Any
          ]
        ],
      PEXPIREAT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT['transformArguments'] */ js.Any
          ]
        ],
      PEXPIRETIME: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME['transformArguments'] */ js.Any
          ]
        ],
      PFADD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD['transformArguments'] */ js.Any
          ]
        ],
      PFCOUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT['transformArguments'] */ js.Any
          ]
        ],
      PFMERGE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE['transformArguments'] */ js.Any
          ]
        ],
      PSETEX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX['transformArguments'] */ js.Any
          ]
        ],
      PTTL: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL['transformArguments'] */ js.Any
          ]
        ],
      PUBLISH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH['transformArguments'] */ js.Any
          ]
        ],
      RENAME: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME['transformArguments'] */ js.Any
          ]
        ],
      RENAMENX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX['transformArguments'] */ js.Any
          ]
        ],
      RPOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP['transformArguments'] */ js.Any
          ]
        ],
      RPOPLPUSH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH['transformArguments'] */ js.Any
          ]
        ],
      RPOP_COUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT['transformArguments'] */ js.Any
          ]
        ],
      RPUSH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH['transformArguments'] */ js.Any
          ]
        ],
      RPUSHX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX['transformArguments'] */ js.Any
          ]
        ],
      SADD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD['transformArguments'] */ js.Any
          ]
        ],
      SCARD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD['transformArguments'] */ js.Any
          ]
        ],
      SDIFF: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF['transformArguments'] */ js.Any
          ]
        ],
      SDIFFSTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE['transformArguments'] */ js.Any
          ]
        ],
      SET: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SET['transformArguments'] */ js.Any
          ]
        ],
      SETBIT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT['transformArguments'] */ js.Any
          ]
        ],
      SETEX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX['transformArguments'] */ js.Any
          ]
        ],
      SETNX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX['transformArguments'] */ js.Any
          ]
        ],
      SETRANGE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE['transformArguments'] */ js.Any
          ]
        ],
      SINTER: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER['transformArguments'] */ js.Any
          ]
        ],
      SINTERCARD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD['transformArguments'] */ js.Any
          ]
        ],
      SINTERSTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE['transformArguments'] */ js.Any
          ]
        ],
      SISMEMBER: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER['transformArguments'] */ js.Any
          ]
        ],
      SMEMBERS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS['transformArguments'] */ js.Any
          ]
        ],
      SMISMEMBER: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER['transformArguments'] */ js.Any
          ]
        ],
      SMOVE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE['transformArguments'] */ js.Any
          ]
        ],
      SORT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT['transformArguments'] */ js.Any
          ]
        ],
      SORT_RO: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO['transformArguments'] */ js.Any
          ]
        ],
      SORT_STORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE['transformArguments'] */ js.Any
          ]
        ],
      SPOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP['transformArguments'] */ js.Any
          ]
        ],
      SRANDMEMBER: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER['transformArguments'] */ js.Any
          ]
        ],
      SRANDMEMBER_COUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT['transformArguments'] */ js.Any
          ]
        ],
      SREM: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM['transformArguments'] */ js.Any
          ]
        ],
      SSCAN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN['transformArguments'] */ js.Any
          ]
        ],
      STRLEN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN['transformArguments'] */ js.Any
          ]
        ],
      SUNION: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION['transformArguments'] */ js.Any
          ]
        ],
      SUNIONSTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE['transformArguments'] */ js.Any
          ]
        ],
      TOUCH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH['transformArguments'] */ js.Any
          ]
        ],
      TTL: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL['transformArguments'] */ js.Any
          ]
        ],
      TYPE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE['transformArguments'] */ js.Any
          ]
        ],
      UNLINK: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK['transformArguments'] */ js.Any
          ]
        ],
      WATCH: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH['transformArguments'] */ js.Any
          ]
        ],
      XACK: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK['transformArguments'] */ js.Any
          ]
        ],
      XADD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD['transformArguments'] */ js.Any
          ]
        ],
      XAUTOCLAIM: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM['transformArguments'] */ js.Any
          ]
        ],
      XAUTOCLAIM_JUSTID: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
          ]
        ],
      XCLAIM: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM['transformArguments'] */ js.Any
          ]
        ],
      XCLAIM_JUSTID: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID['transformArguments'] */ js.Any
          ]
        ],
      XDEL: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL['transformArguments'] */ js.Any
          ]
        ],
      XGROUP_CREATE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE['transformArguments'] */ js.Any
          ]
        ],
      XGROUP_CREATECONSUMER: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
          ]
        ],
      XGROUP_DELCONSUMER: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER['transformArguments'] */ js.Any
          ]
        ],
      XGROUP_DESTROY: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY['transformArguments'] */ js.Any
          ]
        ],
      XGROUP_SETID: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID['transformArguments'] */ js.Any
          ]
        ],
      XINFO_CONSUMERS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS['transformArguments'] */ js.Any
          ]
        ],
      XINFO_GROUPS: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS['transformArguments'] */ js.Any
          ]
        ],
      XINFO_STREAM: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM['transformArguments'] */ js.Any
          ]
        ],
      XLEN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN['transformArguments'] */ js.Any
          ]
        ],
      XPENDING: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING['transformArguments'] */ js.Any
          ]
        ],
      XPENDING_RANGE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE['transformArguments'] */ js.Any
          ]
        ],
      XRANGE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE['transformArguments'] */ js.Any
          ]
        ],
      XREAD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD['transformArguments'] */ js.Any
          ]
        ],
      XREADGROUP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP['transformArguments'] */ js.Any
          ]
        ],
      XREVRANGE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE['transformArguments'] */ js.Any
          ]
        ],
      XSETID: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID['transformArguments'] */ js.Any
          ]
        ],
      XTRIM: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM['transformArguments'] */ js.Any
          ]
        ],
      ZADD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD['transformArguments'] */ js.Any
          ]
        ],
      ZCARD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD['transformArguments'] */ js.Any
          ]
        ],
      ZCOUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT['transformArguments'] */ js.Any
          ]
        ],
      ZDIFF: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF['transformArguments'] */ js.Any
          ]
        ],
      ZDIFFSTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE['transformArguments'] */ js.Any
          ]
        ],
      ZDIFF_WITHSCORES: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES['transformArguments'] */ js.Any
          ]
        ],
      ZINCRBY: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY['transformArguments'] */ js.Any
          ]
        ],
      ZINTER: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER['transformArguments'] */ js.Any
          ]
        ],
      ZINTERCARD: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD['transformArguments'] */ js.Any
          ]
        ],
      ZINTERSTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE['transformArguments'] */ js.Any
          ]
        ],
      ZINTER_WITHSCORES: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES['transformArguments'] */ js.Any
          ]
        ],
      ZLEXCOUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT['transformArguments'] */ js.Any
          ]
        ],
      ZMPOP: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP['transformArguments'] */ js.Any
          ]
        ],
      ZMSCORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE['transformArguments'] */ js.Any
          ]
        ],
      ZPOPMAX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX['transformArguments'] */ js.Any
          ]
        ],
      ZPOPMAX_COUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT['transformArguments'] */ js.Any
          ]
        ],
      ZPOPMIN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN['transformArguments'] */ js.Any
          ]
        ],
      ZPOPMIN_COUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT['transformArguments'] */ js.Any
          ]
        ],
      ZRANDMEMBER: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER['transformArguments'] */ js.Any
          ]
        ],
      ZRANDMEMBER_COUNT: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
          ]
        ],
      ZRANDMEMBER_COUNT_WITHSCORES: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
          ]
        ],
      ZRANGE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE['transformArguments'] */ js.Any
          ]
        ],
      ZRANGEBYLEX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX['transformArguments'] */ js.Any
          ]
        ],
      ZRANGEBYSCORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE['transformArguments'] */ js.Any
          ]
        ],
      ZRANGEBYSCORE_WITHSCORES: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
          ]
        ],
      ZRANGESTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE['transformArguments'] */ js.Any
          ]
        ],
      ZRANGE_WITHSCORES: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES['transformArguments'] */ js.Any
          ]
        ],
      ZRANK: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK['transformArguments'] */ js.Any
          ]
        ],
      ZREM: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM['transformArguments'] */ js.Any
          ]
        ],
      ZREMRANGEBYLEX: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX['transformArguments'] */ js.Any
          ]
        ],
      ZREMRANGEBYRANK: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK['transformArguments'] */ js.Any
          ]
        ],
      ZREMRANGEBYSCORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE['transformArguments'] */ js.Any
          ]
        ],
      ZREVRANK: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK['transformArguments'] */ js.Any
          ]
        ],
      ZSCAN: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN['transformArguments'] */ js.Any
          ]
        ],
      ZSCORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE['transformArguments'] */ js.Any
          ]
        ],
      ZUNION: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION['transformArguments'] */ js.Any
          ]
        ],
      ZUNIONSTORE: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE['transformArguments'] */ js.Any
          ]
        ],
      ZUNION_WITHSCORES: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES['transformArguments'] */ js.Any
          ]
        ],
      append: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND['transformArguments'] */ js.Any
          ]
        ],
      bitCount: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT['transformArguments'] */ js.Any
          ]
        ],
      bitField: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD['transformArguments'] */ js.Any
          ]
        ],
      bitFieldRo: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
          ]
        ],
      bitOp: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP['transformArguments'] */ js.Any
          ]
        ],
      bitPos: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS['transformArguments'] */ js.Any
          ]
        ],
      blMove: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE['transformArguments'] */ js.Any
          ]
        ],
      blPop: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP['transformArguments'] */ js.Any
          ]
        ],
      blmPop: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP['transformArguments'] */ js.Any
          ]
        ],
      brPop: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP['transformArguments'] */ js.Any
          ]
        ],
      brPopLPush: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH['transformArguments'] */ js.Any
          ]
        ],
      bzPopMax: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX['transformArguments'] */ js.Any
          ]
        ],
      bzPopMin: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN['transformArguments'] */ js.Any
          ]
        ],
      bzmPop: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP['transformArguments'] */ js.Any
          ]
        ],
      copy: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY['transformArguments'] */ js.Any
          ]
        ],
      decr: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR['transformArguments'] */ js.Any
          ]
        ],
      decrBy: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY['transformArguments'] */ js.Any
          ]
        ],
      del: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL['transformArguments'] */ js.Any
          ]
        ],
      dump: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP['transformArguments'] */ js.Any
          ]
        ],
      eval: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL['transformArguments'] */ js.Any
          ]
        ],
      evalRo: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
          ]
        ],
      evalSha: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA['transformArguments'] */ js.Any
          ]
        ],
      evalShaRo: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
          ]
        ],
      exists: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS['transformArguments'] */ js.Any
          ]
        ],
      expire: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE['transformArguments'] */ js.Any
          ]
        ],
      expireAt: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT['transformArguments'] */ js.Any
          ]
        ],
      expireTime: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME['transformArguments'] */ js.Any
          ]
        ],
      fCall: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL['transformArguments'] */ js.Any
          ]
        ],
      fCallRo: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
          ]
        ],
      geoAdd: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD['transformArguments'] */ js.Any
          ]
        ],
      geoDist: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST['transformArguments'] */ js.Any
          ]
        ],
      geoHash: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH['transformArguments'] */ js.Any
          ]
        ],
      geoPos: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS['transformArguments'] */ js.Any
          ]
        ],
      geoRadius: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS['transformArguments'] */ js.Any
          ]
        ],
      geoRadiusByMember: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER['transformArguments'] */ js.Any
          ]
        ],
      geoRadiusByMemberRo: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
          ]
        ],
      geoRadiusByMemberRoWith: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
          ]
        ],
      geoRadiusByMemberStore: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
          ]
        ],
      geoRadiusByMemberWith: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
          ]
        ],
      geoRadiusRo: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
          ]
        ],
      geoRadiusRoWith: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
          ]
        ],
      geoRadiusStore: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE['transformArguments'] */ js.Any
          ]
        ],
      geoRadiusWith: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
          ]
        ],
      geoSearch: RedisCommandSignature[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH['transformArguments'] */ js.Any
          ]
        ]
    ): WithCommands = {
      val __obj = js.Dynamic.literal(APPEND = APPEND.asInstanceOf[js.Any], BITCOUNT = BITCOUNT.asInstanceOf[js.Any], BITFIELD = BITFIELD.asInstanceOf[js.Any], BITFIELD_RO = BITFIELD_RO.asInstanceOf[js.Any], BITOP = BITOP.asInstanceOf[js.Any], BITPOS = BITPOS.asInstanceOf[js.Any], BLMOVE = BLMOVE.asInstanceOf[js.Any], BLMPOP = BLMPOP.asInstanceOf[js.Any], BLPOP = BLPOP.asInstanceOf[js.Any], BRPOP = BRPOP.asInstanceOf[js.Any], BRPOPLPUSH = BRPOPLPUSH.asInstanceOf[js.Any], BZMPOP = BZMPOP.asInstanceOf[js.Any], BZPOPMAX = BZPOPMAX.asInstanceOf[js.Any], BZPOPMIN = BZPOPMIN.asInstanceOf[js.Any], COPY = COPY.asInstanceOf[js.Any], DECR = DECR.asInstanceOf[js.Any], DECRBY = DECRBY.asInstanceOf[js.Any], DEL = DEL.asInstanceOf[js.Any], DUMP = DUMP.asInstanceOf[js.Any], EVAL = EVAL.asInstanceOf[js.Any], EVALSHA = EVALSHA.asInstanceOf[js.Any], EVALSHA_RO = EVALSHA_RO.asInstanceOf[js.Any], EVAL_RO = EVAL_RO.asInstanceOf[js.Any], EXISTS = EXISTS.asInstanceOf[js.Any], EXPIRE = EXPIRE.asInstanceOf[js.Any], EXPIREAT = EXPIREAT.asInstanceOf[js.Any], EXPIRETIME = EXPIRETIME.asInstanceOf[js.Any], FCALL = FCALL.asInstanceOf[js.Any], FCALL_RO = FCALL_RO.asInstanceOf[js.Any], GEOADD = GEOADD.asInstanceOf[js.Any], GEODIST = GEODIST.asInstanceOf[js.Any], GEOHASH = GEOHASH.asInstanceOf[js.Any], GEOPOS = GEOPOS.asInstanceOf[js.Any], GEORADIUS = GEORADIUS.asInstanceOf[js.Any], GEORADIUSBYMEMBER = GEORADIUSBYMEMBER.asInstanceOf[js.Any], GEORADIUSBYMEMBERSTORE = GEORADIUSBYMEMBERSTORE.asInstanceOf[js.Any], GEORADIUSBYMEMBER_RO = GEORADIUSBYMEMBER_RO.asInstanceOf[js.Any], GEORADIUSBYMEMBER_RO_WITH = GEORADIUSBYMEMBER_RO_WITH.asInstanceOf[js.Any], GEORADIUSBYMEMBER_WITH = GEORADIUSBYMEMBER_WITH.asInstanceOf[js.Any], GEORADIUSSTORE = GEORADIUSSTORE.asInstanceOf[js.Any], GEORADIUS_RO = GEORADIUS_RO.asInstanceOf[js.Any], GEORADIUS_RO_WITH = GEORADIUS_RO_WITH.asInstanceOf[js.Any], GEORADIUS_WITH = GEORADIUS_WITH.asInstanceOf[js.Any], GEOSEARCH = GEOSEARCH.asInstanceOf[js.Any], GEOSEARCHSTORE = GEOSEARCHSTORE.asInstanceOf[js.Any], GEOSEARCH_WITH = GEOSEARCH_WITH.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], GETBIT = GETBIT.asInstanceOf[js.Any], GETDEL = GETDEL.asInstanceOf[js.Any], GETEX = GETEX.asInstanceOf[js.Any], GETRANGE = GETRANGE.asInstanceOf[js.Any], GETSET = GETSET.asInstanceOf[js.Any], HDEL = HDEL.asInstanceOf[js.Any], HEXISTS = HEXISTS.asInstanceOf[js.Any], HGET = HGET.asInstanceOf[js.Any], HGETALL = HGETALL.asInstanceOf[js.Any], HINCRBY = HINCRBY.asInstanceOf[js.Any], HINCRBYFLOAT = HINCRBYFLOAT.asInstanceOf[js.Any], HKEYS = HKEYS.asInstanceOf[js.Any], HLEN = HLEN.asInstanceOf[js.Any], HMGET = HMGET.asInstanceOf[js.Any], HRANDFIELD = HRANDFIELD.asInstanceOf[js.Any], HRANDFIELD_COUNT = HRANDFIELD_COUNT.asInstanceOf[js.Any], HRANDFIELD_COUNT_WITHVALUES = HRANDFIELD_COUNT_WITHVALUES.asInstanceOf[js.Any], HSCAN = HSCAN.asInstanceOf[js.Any], HSET = HSET.asInstanceOf[js.Any], HSETNX = HSETNX.asInstanceOf[js.Any], HSTRLEN = HSTRLEN.asInstanceOf[js.Any], HVALS = HVALS.asInstanceOf[js.Any], INCR = INCR.asInstanceOf[js.Any], INCRBY = INCRBY.asInstanceOf[js.Any], INCRBYFLOAT = INCRBYFLOAT.asInstanceOf[js.Any], LCS = LCS.asInstanceOf[js.Any], LCS_IDX = LCS_IDX.asInstanceOf[js.Any], LCS_IDX_WITHMATCHLEN = LCS_IDX_WITHMATCHLEN.asInstanceOf[js.Any], LCS_LEN = LCS_LEN.asInstanceOf[js.Any], LINDEX = LINDEX.asInstanceOf[js.Any], LINSERT = LINSERT.asInstanceOf[js.Any], LLEN = LLEN.asInstanceOf[js.Any], LMOVE = LMOVE.asInstanceOf[js.Any], LMPOP = LMPOP.asInstanceOf[js.Any], LPOP = LPOP.asInstanceOf[js.Any], LPOP_COUNT = LPOP_COUNT.asInstanceOf[js.Any], LPOS = LPOS.asInstanceOf[js.Any], LPOS_COUNT = LPOS_COUNT.asInstanceOf[js.Any], LPUSH = LPUSH.asInstanceOf[js.Any], LPUSHX = LPUSHX.asInstanceOf[js.Any], LRANGE = LRANGE.asInstanceOf[js.Any], LREM = LREM.asInstanceOf[js.Any], LSET = LSET.asInstanceOf[js.Any], LTRIM = LTRIM.asInstanceOf[js.Any], MGET = MGET.asInstanceOf[js.Any], MIGRATE = MIGRATE.asInstanceOf[js.Any], MSET = MSET.asInstanceOf[js.Any], MSETNX = MSETNX.asInstanceOf[js.Any], OBJECT_ENCODING = OBJECT_ENCODING.asInstanceOf[js.Any], OBJECT_FREQ = OBJECT_FREQ.asInstanceOf[js.Any], OBJECT_IDLETIME = OBJECT_IDLETIME.asInstanceOf[js.Any], OBJECT_REFCOUNT = OBJECT_REFCOUNT.asInstanceOf[js.Any], PERSIST = PERSIST.asInstanceOf[js.Any], PEXPIRE = PEXPIRE.asInstanceOf[js.Any], PEXPIREAT = PEXPIREAT.asInstanceOf[js.Any], PEXPIRETIME = PEXPIRETIME.asInstanceOf[js.Any], PFADD = PFADD.asInstanceOf[js.Any], PFCOUNT = PFCOUNT.asInstanceOf[js.Any], PFMERGE = PFMERGE.asInstanceOf[js.Any], PSETEX = PSETEX.asInstanceOf[js.Any], PTTL = PTTL.asInstanceOf[js.Any], PUBLISH = PUBLISH.asInstanceOf[js.Any], RENAME = RENAME.asInstanceOf[js.Any], RENAMENX = RENAMENX.asInstanceOf[js.Any], RPOP = RPOP.asInstanceOf[js.Any], RPOPLPUSH = RPOPLPUSH.asInstanceOf[js.Any], RPOP_COUNT = RPOP_COUNT.asInstanceOf[js.Any], RPUSH = RPUSH.asInstanceOf[js.Any], RPUSHX = RPUSHX.asInstanceOf[js.Any], SADD = SADD.asInstanceOf[js.Any], SCARD = SCARD.asInstanceOf[js.Any], SDIFF = SDIFF.asInstanceOf[js.Any], SDIFFSTORE = SDIFFSTORE.asInstanceOf[js.Any], SET = SET.asInstanceOf[js.Any], SETBIT = SETBIT.asInstanceOf[js.Any], SETEX = SETEX.asInstanceOf[js.Any], SETNX = SETNX.asInstanceOf[js.Any], SETRANGE = SETRANGE.asInstanceOf[js.Any], SINTER = SINTER.asInstanceOf[js.Any], SINTERCARD = SINTERCARD.asInstanceOf[js.Any], SINTERSTORE = SINTERSTORE.asInstanceOf[js.Any], SISMEMBER = SISMEMBER.asInstanceOf[js.Any], SMEMBERS = SMEMBERS.asInstanceOf[js.Any], SMISMEMBER = SMISMEMBER.asInstanceOf[js.Any], SMOVE = SMOVE.asInstanceOf[js.Any], SORT = SORT.asInstanceOf[js.Any], SORT_RO = SORT_RO.asInstanceOf[js.Any], SORT_STORE = SORT_STORE.asInstanceOf[js.Any], SPOP = SPOP.asInstanceOf[js.Any], SRANDMEMBER = SRANDMEMBER.asInstanceOf[js.Any], SRANDMEMBER_COUNT = SRANDMEMBER_COUNT.asInstanceOf[js.Any], SREM = SREM.asInstanceOf[js.Any], SSCAN = SSCAN.asInstanceOf[js.Any], STRLEN = STRLEN.asInstanceOf[js.Any], SUNION = SUNION.asInstanceOf[js.Any], SUNIONSTORE = SUNIONSTORE.asInstanceOf[js.Any], TOUCH = TOUCH.asInstanceOf[js.Any], TTL = TTL.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any], UNLINK = UNLINK.asInstanceOf[js.Any], WATCH = WATCH.asInstanceOf[js.Any], XACK = XACK.asInstanceOf[js.Any], XADD = XADD.asInstanceOf[js.Any], XAUTOCLAIM = XAUTOCLAIM.asInstanceOf[js.Any], XAUTOCLAIM_JUSTID = XAUTOCLAIM_JUSTID.asInstanceOf[js.Any], XCLAIM = XCLAIM.asInstanceOf[js.Any], XCLAIM_JUSTID = XCLAIM_JUSTID.asInstanceOf[js.Any], XDEL = XDEL.asInstanceOf[js.Any], XGROUP_CREATE = XGROUP_CREATE.asInstanceOf[js.Any], XGROUP_CREATECONSUMER = XGROUP_CREATECONSUMER.asInstanceOf[js.Any], XGROUP_DELCONSUMER = XGROUP_DELCONSUMER.asInstanceOf[js.Any], XGROUP_DESTROY = XGROUP_DESTROY.asInstanceOf[js.Any], XGROUP_SETID = XGROUP_SETID.asInstanceOf[js.Any], XINFO_CONSUMERS = XINFO_CONSUMERS.asInstanceOf[js.Any], XINFO_GROUPS = XINFO_GROUPS.asInstanceOf[js.Any], XINFO_STREAM = XINFO_STREAM.asInstanceOf[js.Any], XLEN = XLEN.asInstanceOf[js.Any], XPENDING = XPENDING.asInstanceOf[js.Any], XPENDING_RANGE = XPENDING_RANGE.asInstanceOf[js.Any], XRANGE = XRANGE.asInstanceOf[js.Any], XREAD = XREAD.asInstanceOf[js.Any], XREADGROUP = XREADGROUP.asInstanceOf[js.Any], XREVRANGE = XREVRANGE.asInstanceOf[js.Any], XSETID = XSETID.asInstanceOf[js.Any], XTRIM = XTRIM.asInstanceOf[js.Any], ZADD = ZADD.asInstanceOf[js.Any], ZCARD = ZCARD.asInstanceOf[js.Any], ZCOUNT = ZCOUNT.asInstanceOf[js.Any], ZDIFF = ZDIFF.asInstanceOf[js.Any], ZDIFFSTORE = ZDIFFSTORE.asInstanceOf[js.Any], ZDIFF_WITHSCORES = ZDIFF_WITHSCORES.asInstanceOf[js.Any], ZINCRBY = ZINCRBY.asInstanceOf[js.Any], ZINTER = ZINTER.asInstanceOf[js.Any], ZINTERCARD = ZINTERCARD.asInstanceOf[js.Any], ZINTERSTORE = ZINTERSTORE.asInstanceOf[js.Any], ZINTER_WITHSCORES = ZINTER_WITHSCORES.asInstanceOf[js.Any], ZLEXCOUNT = ZLEXCOUNT.asInstanceOf[js.Any], ZMPOP = ZMPOP.asInstanceOf[js.Any], ZMSCORE = ZMSCORE.asInstanceOf[js.Any], ZPOPMAX = ZPOPMAX.asInstanceOf[js.Any], ZPOPMAX_COUNT = ZPOPMAX_COUNT.asInstanceOf[js.Any], ZPOPMIN = ZPOPMIN.asInstanceOf[js.Any], ZPOPMIN_COUNT = ZPOPMIN_COUNT.asInstanceOf[js.Any], ZRANDMEMBER = ZRANDMEMBER.asInstanceOf[js.Any], ZRANDMEMBER_COUNT = ZRANDMEMBER_COUNT.asInstanceOf[js.Any], ZRANDMEMBER_COUNT_WITHSCORES = ZRANDMEMBER_COUNT_WITHSCORES.asInstanceOf[js.Any], ZRANGE = ZRANGE.asInstanceOf[js.Any], ZRANGEBYLEX = ZRANGEBYLEX.asInstanceOf[js.Any], ZRANGEBYSCORE = ZRANGEBYSCORE.asInstanceOf[js.Any], ZRANGEBYSCORE_WITHSCORES = ZRANGEBYSCORE_WITHSCORES.asInstanceOf[js.Any], ZRANGESTORE = ZRANGESTORE.asInstanceOf[js.Any], ZRANGE_WITHSCORES = ZRANGE_WITHSCORES.asInstanceOf[js.Any], ZRANK = ZRANK.asInstanceOf[js.Any], ZREM = ZREM.asInstanceOf[js.Any], ZREMRANGEBYLEX = ZREMRANGEBYLEX.asInstanceOf[js.Any], ZREMRANGEBYRANK = ZREMRANGEBYRANK.asInstanceOf[js.Any], ZREMRANGEBYSCORE = ZREMRANGEBYSCORE.asInstanceOf[js.Any], ZREVRANK = ZREVRANK.asInstanceOf[js.Any], ZSCAN = ZSCAN.asInstanceOf[js.Any], ZSCORE = ZSCORE.asInstanceOf[js.Any], ZUNION = ZUNION.asInstanceOf[js.Any], ZUNIONSTORE = ZUNIONSTORE.asInstanceOf[js.Any], ZUNION_WITHSCORES = ZUNION_WITHSCORES.asInstanceOf[js.Any], append = append.asInstanceOf[js.Any], bitCount = bitCount.asInstanceOf[js.Any], bitField = bitField.asInstanceOf[js.Any], bitFieldRo = bitFieldRo.asInstanceOf[js.Any], bitOp = bitOp.asInstanceOf[js.Any], bitPos = bitPos.asInstanceOf[js.Any], blMove = blMove.asInstanceOf[js.Any], blPop = blPop.asInstanceOf[js.Any], blmPop = blmPop.asInstanceOf[js.Any], brPop = brPop.asInstanceOf[js.Any], brPopLPush = brPopLPush.asInstanceOf[js.Any], bzPopMax = bzPopMax.asInstanceOf[js.Any], bzPopMin = bzPopMin.asInstanceOf[js.Any], bzmPop = bzmPop.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], decr = decr.asInstanceOf[js.Any], decrBy = decrBy.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], dump = dump.asInstanceOf[js.Any], eval = eval.asInstanceOf[js.Any], evalRo = evalRo.asInstanceOf[js.Any], evalSha = evalSha.asInstanceOf[js.Any], evalShaRo = evalShaRo.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], expireAt = expireAt.asInstanceOf[js.Any], expireTime = expireTime.asInstanceOf[js.Any], fCall = fCall.asInstanceOf[js.Any], fCallRo = fCallRo.asInstanceOf[js.Any], geoAdd = geoAdd.asInstanceOf[js.Any], geoDist = geoDist.asInstanceOf[js.Any], geoHash = geoHash.asInstanceOf[js.Any], geoPos = geoPos.asInstanceOf[js.Any], geoRadius = geoRadius.asInstanceOf[js.Any], geoRadiusByMember = geoRadiusByMember.asInstanceOf[js.Any], geoRadiusByMemberRo = geoRadiusByMemberRo.asInstanceOf[js.Any], geoRadiusByMemberRoWith = geoRadiusByMemberRoWith.asInstanceOf[js.Any], geoRadiusByMemberStore = geoRadiusByMemberStore.asInstanceOf[js.Any], geoRadiusByMemberWith = geoRadiusByMemberWith.asInstanceOf[js.Any], geoRadiusRo = geoRadiusRo.asInstanceOf[js.Any], geoRadiusRoWith = geoRadiusRoWith.asInstanceOf[js.Any], geoRadiusStore = geoRadiusStore.asInstanceOf[js.Any], geoRadiusWith = geoRadiusWith.asInstanceOf[js.Any], geoSearch = geoSearch.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithCommands]
    }
    
    extension [Self <: WithCommands](x: Self) {
      
      inline def setAPPEND(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "APPEND", value.asInstanceOf[js.Any])
      
      inline def setBITCOUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BITCOUNT", value.asInstanceOf[js.Any])
      
      inline def setBITFIELD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BITFIELD", value.asInstanceOf[js.Any])
      
      inline def setBITFIELD_RO(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BITFIELD_RO", value.asInstanceOf[js.Any])
      
      inline def setBITOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BITOP", value.asInstanceOf[js.Any])
      
      inline def setBITPOS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BITPOS", value.asInstanceOf[js.Any])
      
      inline def setBLMOVE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BLMOVE", value.asInstanceOf[js.Any])
      
      inline def setBLMPOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BLMPOP", value.asInstanceOf[js.Any])
      
      inline def setBLPOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BLPOP", value.asInstanceOf[js.Any])
      
      inline def setBRPOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BRPOP", value.asInstanceOf[js.Any])
      
      inline def setBRPOPLPUSH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BRPOPLPUSH", value.asInstanceOf[js.Any])
      
      inline def setBZMPOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BZMPOP", value.asInstanceOf[js.Any])
      
      inline def setBZPOPMAX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BZPOPMAX", value.asInstanceOf[js.Any])
      
      inline def setBZPOPMIN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "BZPOPMIN", value.asInstanceOf[js.Any])
      
      inline def setBitFieldRo(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "bitFieldRo", value.asInstanceOf[js.Any])
      
      inline def setCOPY(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "COPY", value.asInstanceOf[js.Any])
      
      inline def setDECR(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "DECR", value.asInstanceOf[js.Any])
      
      inline def setDECRBY(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "DECRBY", value.asInstanceOf[js.Any])
      
      inline def setDEL(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "DEL", value.asInstanceOf[js.Any])
      
      inline def setDUMP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "DUMP", value.asInstanceOf[js.Any])
      
      inline def setEVAL(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "EVAL", value.asInstanceOf[js.Any])
      
      inline def setEVALSHA(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "EVALSHA", value.asInstanceOf[js.Any])
      
      inline def setEVALSHA_RO(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "EVALSHA_RO", value.asInstanceOf[js.Any])
      
      inline def setEVAL_RO(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "EVAL_RO", value.asInstanceOf[js.Any])
      
      inline def setEXISTS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "EXISTS", value.asInstanceOf[js.Any])
      
      inline def setEXPIRE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "EXPIRE", value.asInstanceOf[js.Any])
      
      inline def setEXPIREAT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "EXPIREAT", value.asInstanceOf[js.Any])
      
      inline def setEXPIRETIME(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "EXPIRETIME", value.asInstanceOf[js.Any])
      
      inline def setEvalRo(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "evalRo", value.asInstanceOf[js.Any])
      
      inline def setEvalShaRo(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "evalShaRo", value.asInstanceOf[js.Any])
      
      inline def setFCALL(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "FCALL", value.asInstanceOf[js.Any])
      
      inline def setFCALL_RO(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "FCALL_RO", value.asInstanceOf[js.Any])
      
      inline def setFCallRo(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "fCallRo", value.asInstanceOf[js.Any])
      
      inline def setGEOADD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEOADD", value.asInstanceOf[js.Any])
      
      inline def setGEODIST(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEODIST", value.asInstanceOf[js.Any])
      
      inline def setGEOHASH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEOHASH", value.asInstanceOf[js.Any])
      
      inline def setGEOPOS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEOPOS", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUS", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUSBYMEMBER(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUSBYMEMBERSTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBERSTORE", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUSBYMEMBER_RO(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER_RO", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUSBYMEMBER_RO_WITH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER_RO_WITH", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUSBYMEMBER_WITH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER_WITH", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUSSTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUSSTORE", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUS_RO(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUS_RO", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUS_RO_WITH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUS_RO_WITH", value.asInstanceOf[js.Any])
      
      inline def setGEORADIUS_WITH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEORADIUS_WITH", value.asInstanceOf[js.Any])
      
      inline def setGEOSEARCH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEOSEARCH", value.asInstanceOf[js.Any])
      
      inline def setGEOSEARCHSTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEOSEARCHSTORE", value.asInstanceOf[js.Any])
      
      inline def setGEOSEARCH_WITH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GEOSEARCH_WITH", value.asInstanceOf[js.Any])
      
      inline def setGET(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GET['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      inline def setGETBIT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GETBIT", value.asInstanceOf[js.Any])
      
      inline def setGETDEL(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GETDEL", value.asInstanceOf[js.Any])
      
      inline def setGETEX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GETEX", value.asInstanceOf[js.Any])
      
      inline def setGETRANGE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GETRANGE", value.asInstanceOf[js.Any])
      
      inline def setGETSET(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "GETSET", value.asInstanceOf[js.Any])
      
      inline def setGeoRadiusByMemberRo(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "geoRadiusByMemberRo", value.asInstanceOf[js.Any])
      
      inline def setGeoRadiusByMemberRoWith(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "geoRadiusByMemberRoWith", value.asInstanceOf[js.Any])
      
      inline def setGeoRadiusByMemberWith(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "geoRadiusByMemberWith", value.asInstanceOf[js.Any])
      
      inline def setGeoRadiusRo(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "geoRadiusRo", value.asInstanceOf[js.Any])
      
      inline def setGeoRadiusRoWith(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "geoRadiusRoWith", value.asInstanceOf[js.Any])
      
      inline def setGeoRadiusWith(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "geoRadiusWith", value.asInstanceOf[js.Any])
      
      inline def setGeoSearchWith(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "geoSearchWith", value.asInstanceOf[js.Any])
      
      inline def setHDEL(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HDEL", value.asInstanceOf[js.Any])
      
      inline def setHEXISTS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HEXISTS", value.asInstanceOf[js.Any])
      
      inline def setHGET(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HGET", value.asInstanceOf[js.Any])
      
      inline def setHGETALL(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HGETALL", value.asInstanceOf[js.Any])
      
      inline def setHINCRBY(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HINCRBY", value.asInstanceOf[js.Any])
      
      inline def setHINCRBYFLOAT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HINCRBYFLOAT", value.asInstanceOf[js.Any])
      
      inline def setHKEYS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HKEYS", value.asInstanceOf[js.Any])
      
      inline def setHLEN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HLEN", value.asInstanceOf[js.Any])
      
      inline def setHMGET(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HMGET", value.asInstanceOf[js.Any])
      
      inline def setHRANDFIELD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HRANDFIELD", value.asInstanceOf[js.Any])
      
      inline def setHRANDFIELD_COUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HRANDFIELD_COUNT", value.asInstanceOf[js.Any])
      
      inline def setHRANDFIELD_COUNT_WITHVALUES(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HRANDFIELD_COUNT_WITHVALUES", value.asInstanceOf[js.Any])
      
      inline def setHRandFieldCount(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "hRandFieldCount", value.asInstanceOf[js.Any])
      
      inline def setHRandFieldCountWithValues(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "hRandFieldCountWithValues", value.asInstanceOf[js.Any])
      
      inline def setHSCAN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HSCAN", value.asInstanceOf[js.Any])
      
      inline def setHSET(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HSET", value.asInstanceOf[js.Any])
      
      inline def setHSETNX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HSETNX", value.asInstanceOf[js.Any])
      
      inline def setHSTRLEN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HSTRLEN", value.asInstanceOf[js.Any])
      
      inline def setHVALS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "HVALS", value.asInstanceOf[js.Any])
      
      inline def setINCR(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "INCR", value.asInstanceOf[js.Any])
      
      inline def setINCRBY(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "INCRBY", value.asInstanceOf[js.Any])
      
      inline def setINCRBYFLOAT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "INCRBYFLOAT", value.asInstanceOf[js.Any])
      
      inline def setLCS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LCS", value.asInstanceOf[js.Any])
      
      inline def setLCS_IDX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LCS_IDX", value.asInstanceOf[js.Any])
      
      inline def setLCS_IDX_WITHMATCHLEN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LCS_IDX_WITHMATCHLEN", value.asInstanceOf[js.Any])
      
      inline def setLCS_LEN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LCS_LEN", value.asInstanceOf[js.Any])
      
      inline def setLINDEX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LINDEX", value.asInstanceOf[js.Any])
      
      inline def setLINSERT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LINSERT", value.asInstanceOf[js.Any])
      
      inline def setLLEN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LLEN", value.asInstanceOf[js.Any])
      
      inline def setLMOVE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LMOVE", value.asInstanceOf[js.Any])
      
      inline def setLMPOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LMPOP", value.asInstanceOf[js.Any])
      
      inline def setLPOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LPOP", value.asInstanceOf[js.Any])
      
      inline def setLPOP_COUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LPOP_COUNT", value.asInstanceOf[js.Any])
      
      inline def setLPOS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LPOS", value.asInstanceOf[js.Any])
      
      inline def setLPOS_COUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LPOS_COUNT", value.asInstanceOf[js.Any])
      
      inline def setLPUSH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LPUSH", value.asInstanceOf[js.Any])
      
      inline def setLPUSHX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LPUSHX", value.asInstanceOf[js.Any])
      
      inline def setLPopCount(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "lPopCount", value.asInstanceOf[js.Any])
      
      inline def setLPosCount(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "lPosCount", value.asInstanceOf[js.Any])
      
      inline def setLRANGE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LRANGE", value.asInstanceOf[js.Any])
      
      inline def setLREM(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LREM", value.asInstanceOf[js.Any])
      
      inline def setLSET(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LSET", value.asInstanceOf[js.Any])
      
      inline def setLTRIM(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "LTRIM", value.asInstanceOf[js.Any])
      
      inline def setLcsIdx(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "lcsIdx", value.asInstanceOf[js.Any])
      
      inline def setLcsIdxWithMatchLen(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "lcsIdxWithMatchLen", value.asInstanceOf[js.Any])
      
      inline def setLcsLen(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "lcsLen", value.asInstanceOf[js.Any])
      
      inline def setMGET(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "MGET", value.asInstanceOf[js.Any])
      
      inline def setMIGRATE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "MIGRATE", value.asInstanceOf[js.Any])
      
      inline def setMSET(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "MSET", value.asInstanceOf[js.Any])
      
      inline def setMSETNX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "MSETNX", value.asInstanceOf[js.Any])
      
      inline def setOBJECT_ENCODING(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "OBJECT_ENCODING", value.asInstanceOf[js.Any])
      
      inline def setOBJECT_FREQ(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "OBJECT_FREQ", value.asInstanceOf[js.Any])
      
      inline def setOBJECT_IDLETIME(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "OBJECT_IDLETIME", value.asInstanceOf[js.Any])
      
      inline def setOBJECT_REFCOUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "OBJECT_REFCOUNT", value.asInstanceOf[js.Any])
      
      inline def setObjectEncoding(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "objectEncoding", value.asInstanceOf[js.Any])
      
      inline def setObjectFreq(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "objectFreq", value.asInstanceOf[js.Any])
      
      inline def setObjectIdleTime(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "objectIdleTime", value.asInstanceOf[js.Any])
      
      inline def setObjectRefCount(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "objectRefCount", value.asInstanceOf[js.Any])
      
      inline def setPERSIST(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PERSIST", value.asInstanceOf[js.Any])
      
      inline def setPEXPIRE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PEXPIRE", value.asInstanceOf[js.Any])
      
      inline def setPEXPIREAT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PEXPIREAT", value.asInstanceOf[js.Any])
      
      inline def setPEXPIRETIME(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PEXPIRETIME", value.asInstanceOf[js.Any])
      
      inline def setPFADD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PFADD", value.asInstanceOf[js.Any])
      
      inline def setPFCOUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PFCOUNT", value.asInstanceOf[js.Any])
      
      inline def setPFMERGE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PFMERGE", value.asInstanceOf[js.Any])
      
      inline def setPSETEX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PSETEX", value.asInstanceOf[js.Any])
      
      inline def setPTTL(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PTTL", value.asInstanceOf[js.Any])
      
      inline def setPUBLISH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "PUBLISH", value.asInstanceOf[js.Any])
      
      inline def setRENAME(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "RENAME", value.asInstanceOf[js.Any])
      
      inline def setRENAMENX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "RENAMENX", value.asInstanceOf[js.Any])
      
      inline def setRPOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "RPOP", value.asInstanceOf[js.Any])
      
      inline def setRPOPLPUSH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "RPOPLPUSH", value.asInstanceOf[js.Any])
      
      inline def setRPOP_COUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "RPOP_COUNT", value.asInstanceOf[js.Any])
      
      inline def setRPUSH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "RPUSH", value.asInstanceOf[js.Any])
      
      inline def setRPUSHX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "RPUSHX", value.asInstanceOf[js.Any])
      
      inline def setRPopCount(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "rPopCount", value.asInstanceOf[js.Any])
      
      inline def setSADD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SADD", value.asInstanceOf[js.Any])
      
      inline def setSCARD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SCARD", value.asInstanceOf[js.Any])
      
      inline def setSDIFF(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SDIFF", value.asInstanceOf[js.Any])
      
      inline def setSDIFFSTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SDIFFSTORE", value.asInstanceOf[js.Any])
      
      inline def setSET(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SET['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SET", value.asInstanceOf[js.Any])
      
      inline def setSETBIT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SETBIT", value.asInstanceOf[js.Any])
      
      inline def setSETEX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SETEX", value.asInstanceOf[js.Any])
      
      inline def setSETNX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SETNX", value.asInstanceOf[js.Any])
      
      inline def setSETRANGE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SETRANGE", value.asInstanceOf[js.Any])
      
      inline def setSINTER(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SINTER", value.asInstanceOf[js.Any])
      
      inline def setSINTERCARD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SINTERCARD", value.asInstanceOf[js.Any])
      
      inline def setSINTERSTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SINTERSTORE", value.asInstanceOf[js.Any])
      
      inline def setSISMEMBER(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SISMEMBER", value.asInstanceOf[js.Any])
      
      inline def setSMEMBERS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SMEMBERS", value.asInstanceOf[js.Any])
      
      inline def setSMISMEMBER(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SMISMEMBER", value.asInstanceOf[js.Any])
      
      inline def setSMOVE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SMOVE", value.asInstanceOf[js.Any])
      
      inline def setSORT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SORT", value.asInstanceOf[js.Any])
      
      inline def setSORT_RO(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SORT_RO", value.asInstanceOf[js.Any])
      
      inline def setSORT_STORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SORT_STORE", value.asInstanceOf[js.Any])
      
      inline def setSPOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SPOP", value.asInstanceOf[js.Any])
      
      inline def setSRANDMEMBER(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SRANDMEMBER", value.asInstanceOf[js.Any])
      
      inline def setSRANDMEMBER_COUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SRANDMEMBER_COUNT", value.asInstanceOf[js.Any])
      
      inline def setSREM(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SREM", value.asInstanceOf[js.Any])
      
      inline def setSRandMemberCount(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "sRandMemberCount", value.asInstanceOf[js.Any])
      
      inline def setSSCAN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SSCAN", value.asInstanceOf[js.Any])
      
      inline def setSTRLEN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "STRLEN", value.asInstanceOf[js.Any])
      
      inline def setSUNION(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SUNION", value.asInstanceOf[js.Any])
      
      inline def setSUNIONSTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "SUNIONSTORE", value.asInstanceOf[js.Any])
      
      inline def setSortRo(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "sortRo", value.asInstanceOf[js.Any])
      
      inline def setSortStore(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "sortStore", value.asInstanceOf[js.Any])
      
      inline def setTOUCH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "TOUCH", value.asInstanceOf[js.Any])
      
      inline def setTTL(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
      
      inline def setTYPE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setUNLINK(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "UNLINK", value.asInstanceOf[js.Any])
      
      inline def setWATCH(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "WATCH", value.asInstanceOf[js.Any])
      
      inline def setXACK(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XACK", value.asInstanceOf[js.Any])
      
      inline def setXADD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XADD", value.asInstanceOf[js.Any])
      
      inline def setXAUTOCLAIM(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XAUTOCLAIM", value.asInstanceOf[js.Any])
      
      inline def setXAUTOCLAIM_JUSTID(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XAUTOCLAIM_JUSTID", value.asInstanceOf[js.Any])
      
      inline def setXAutoClaimJustId(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xAutoClaimJustId", value.asInstanceOf[js.Any])
      
      inline def setXCLAIM(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XCLAIM", value.asInstanceOf[js.Any])
      
      inline def setXCLAIM_JUSTID(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XCLAIM_JUSTID", value.asInstanceOf[js.Any])
      
      inline def setXClaimJustId(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xClaimJustId", value.asInstanceOf[js.Any])
      
      inline def setXDEL(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XDEL", value.asInstanceOf[js.Any])
      
      inline def setXGROUP_CREATE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XGROUP_CREATE", value.asInstanceOf[js.Any])
      
      inline def setXGROUP_CREATECONSUMER(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XGROUP_CREATECONSUMER", value.asInstanceOf[js.Any])
      
      inline def setXGROUP_DELCONSUMER(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XGROUP_DELCONSUMER", value.asInstanceOf[js.Any])
      
      inline def setXGROUP_DESTROY(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XGROUP_DESTROY", value.asInstanceOf[js.Any])
      
      inline def setXGROUP_SETID(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XGROUP_SETID", value.asInstanceOf[js.Any])
      
      inline def setXGroupCreate(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xGroupCreate", value.asInstanceOf[js.Any])
      
      inline def setXGroupCreateConsumer(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xGroupCreateConsumer", value.asInstanceOf[js.Any])
      
      inline def setXGroupDelConsumer(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xGroupDelConsumer", value.asInstanceOf[js.Any])
      
      inline def setXGroupDestroy(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xGroupDestroy", value.asInstanceOf[js.Any])
      
      inline def setXGroupSetId(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xGroupSetId", value.asInstanceOf[js.Any])
      
      inline def setXINFO_CONSUMERS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XINFO_CONSUMERS", value.asInstanceOf[js.Any])
      
      inline def setXINFO_GROUPS(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XINFO_GROUPS", value.asInstanceOf[js.Any])
      
      inline def setXINFO_STREAM(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XINFO_STREAM", value.asInstanceOf[js.Any])
      
      inline def setXInfoConsumers(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xInfoConsumers", value.asInstanceOf[js.Any])
      
      inline def setXInfoGroups(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xInfoGroups", value.asInstanceOf[js.Any])
      
      inline def setXInfoStream(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xInfoStream", value.asInstanceOf[js.Any])
      
      inline def setXLEN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XLEN", value.asInstanceOf[js.Any])
      
      inline def setXPENDING(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XPENDING", value.asInstanceOf[js.Any])
      
      inline def setXPENDING_RANGE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XPENDING_RANGE", value.asInstanceOf[js.Any])
      
      inline def setXPendingRange(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "xPendingRange", value.asInstanceOf[js.Any])
      
      inline def setXRANGE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XRANGE", value.asInstanceOf[js.Any])
      
      inline def setXREAD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XREAD", value.asInstanceOf[js.Any])
      
      inline def setXREADGROUP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XREADGROUP", value.asInstanceOf[js.Any])
      
      inline def setXREVRANGE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XREVRANGE", value.asInstanceOf[js.Any])
      
      inline def setXSETID(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XSETID", value.asInstanceOf[js.Any])
      
      inline def setXTRIM(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "XTRIM", value.asInstanceOf[js.Any])
      
      inline def setZADD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZADD", value.asInstanceOf[js.Any])
      
      inline def setZCARD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZCARD", value.asInstanceOf[js.Any])
      
      inline def setZCOUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZCOUNT", value.asInstanceOf[js.Any])
      
      inline def setZDIFF(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZDIFF", value.asInstanceOf[js.Any])
      
      inline def setZDIFFSTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZDIFFSTORE", value.asInstanceOf[js.Any])
      
      inline def setZDIFF_WITHSCORES(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZDIFF_WITHSCORES", value.asInstanceOf[js.Any])
      
      inline def setZDiffWithScores(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "zDiffWithScores", value.asInstanceOf[js.Any])
      
      inline def setZINCRBY(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZINCRBY", value.asInstanceOf[js.Any])
      
      inline def setZINTER(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZINTER", value.asInstanceOf[js.Any])
      
      inline def setZINTERCARD(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZINTERCARD", value.asInstanceOf[js.Any])
      
      inline def setZINTERSTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZINTERSTORE", value.asInstanceOf[js.Any])
      
      inline def setZINTER_WITHSCORES(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZINTER_WITHSCORES", value.asInstanceOf[js.Any])
      
      inline def setZInterWithScores(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "zInterWithScores", value.asInstanceOf[js.Any])
      
      inline def setZLEXCOUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZLEXCOUNT", value.asInstanceOf[js.Any])
      
      inline def setZMPOP(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZMPOP", value.asInstanceOf[js.Any])
      
      inline def setZMSCORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZMSCORE", value.asInstanceOf[js.Any])
      
      inline def setZPOPMAX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZPOPMAX", value.asInstanceOf[js.Any])
      
      inline def setZPOPMAX_COUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZPOPMAX_COUNT", value.asInstanceOf[js.Any])
      
      inline def setZPOPMIN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZPOPMIN", value.asInstanceOf[js.Any])
      
      inline def setZPOPMIN_COUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZPOPMIN_COUNT", value.asInstanceOf[js.Any])
      
      inline def setZPopMaxCount(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "zPopMaxCount", value.asInstanceOf[js.Any])
      
      inline def setZPopMinCount(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "zPopMinCount", value.asInstanceOf[js.Any])
      
      inline def setZRANDMEMBER(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANDMEMBER", value.asInstanceOf[js.Any])
      
      inline def setZRANDMEMBER_COUNT(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANDMEMBER_COUNT", value.asInstanceOf[js.Any])
      
      inline def setZRANDMEMBER_COUNT_WITHSCORES(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANDMEMBER_COUNT_WITHSCORES", value.asInstanceOf[js.Any])
      
      inline def setZRANGE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANGE", value.asInstanceOf[js.Any])
      
      inline def setZRANGEBYLEX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANGEBYLEX", value.asInstanceOf[js.Any])
      
      inline def setZRANGEBYSCORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANGEBYSCORE", value.asInstanceOf[js.Any])
      
      inline def setZRANGEBYSCORE_WITHSCORES(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANGEBYSCORE_WITHSCORES", value.asInstanceOf[js.Any])
      
      inline def setZRANGESTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANGESTORE", value.asInstanceOf[js.Any])
      
      inline def setZRANGE_WITHSCORES(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANGE_WITHSCORES", value.asInstanceOf[js.Any])
      
      inline def setZRANK(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZRANK", value.asInstanceOf[js.Any])
      
      inline def setZREM(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZREM", value.asInstanceOf[js.Any])
      
      inline def setZREMRANGEBYLEX(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZREMRANGEBYLEX", value.asInstanceOf[js.Any])
      
      inline def setZREMRANGEBYRANK(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZREMRANGEBYRANK", value.asInstanceOf[js.Any])
      
      inline def setZREMRANGEBYSCORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZREMRANGEBYSCORE", value.asInstanceOf[js.Any])
      
      inline def setZREVRANK(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZREVRANK", value.asInstanceOf[js.Any])
      
      inline def setZRandMemberCount(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "zRandMemberCount", value.asInstanceOf[js.Any])
      
      inline def setZRandMemberCountWithScores(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "zRandMemberCountWithScores", value.asInstanceOf[js.Any])
      
      inline def setZRangeByScoreWithScores(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "zRangeByScoreWithScores", value.asInstanceOf[js.Any])
      
      inline def setZRangeWithScores(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "zRangeWithScores", value.asInstanceOf[js.Any])
      
      inline def setZSCAN(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZSCAN", value.asInstanceOf[js.Any])
      
      inline def setZSCORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZSCORE", value.asInstanceOf[js.Any])
      
      inline def setZUNION(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZUNION", value.asInstanceOf[js.Any])
      
      inline def setZUNIONSTORE(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZUNIONSTORE", value.asInstanceOf[js.Any])
      
      inline def setZUNION_WITHSCORES(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "ZUNION_WITHSCORES", value.asInstanceOf[js.Any])
      
      inline def setZUnionWithScores(
        value: RedisCommandSignature[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any, 
              Parameters[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES['transformArguments'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "zUnionWithScores", value.asInstanceOf[js.Any])
    }
  }
}

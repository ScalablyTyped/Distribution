package typings.redisClient

import org.scalablytyped.runtime.Instantiable1
import typings.redisClient.anon.TypeofRedisClusterMultiCo
import typings.redisClient.distLibCommandsMod.RedisCommand
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsMod.RedisCommandRawReply
import typings.redisClient.distLibCommandsMod.RedisExtensions
import typings.redisClient.distLibCommandsMod.RedisFunction
import typings.redisClient.distLibCommandsMod.RedisFunctions
import typings.redisClient.distLibCommandsMod.RedisModules
import typings.redisClient.distLibCommandsMod.RedisScript
import typings.redisClient.distLibCommandsMod.RedisScripts
import typings.redisClient.distLibMultiCommandMod.RedisMultiQueuedCommand
import typings.std.ConstructorParameters
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClusterMultiCommandMod {
  
  @JSImport("@redis/client/dist/lib/cluster/multi-command", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RedisClusterMultiCommand {
    def this(executor: RedisClusterMultiExecutor) = this()
    def this(executor: RedisClusterMultiExecutor, firstKey: RedisCommandArgument) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@redis/client/dist/lib/cluster/multi-command", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): InstantiableRedisClusterMultiCommandType[M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[InstantiableRedisClusterMultiCommandType[M, F, S]]
    inline def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](extensions: RedisExtensions[M, F, S]): InstantiableRedisClusterMultiCommandType[M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(extensions.asInstanceOf[js.Any]).asInstanceOf[InstantiableRedisClusterMultiCommandType[M, F, S]]
  }
  
  type InstantiableRedisClusterMultiCommandType[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] = Instantiable1[
    /* args */ ConstructorParameters[TypeofRedisClusterMultiCo], 
    RedisClusterMultiCommandType[M, F, S]
  ]
  
  @js.native
  trait RedisClusterMultiCommand extends StObject {
    
    def EXEC(): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    def EXEC(execAsPipeline: Boolean): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    
    def addCommand(firstKey: Unit, args: RedisCommandArguments): this.type = js.native
    def addCommand(
      firstKey: Unit,
      args: RedisCommandArguments,
      transformReply: js.UndefOr[
          js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]
        ]
    ): this.type = js.native
    def addCommand(firstKey: RedisCommandArgument, args: RedisCommandArguments): this.type = js.native
    def addCommand(
      firstKey: RedisCommandArgument,
      args: RedisCommandArguments,
      transformReply: js.UndefOr[
          js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]
        ]
    ): this.type = js.native
    
    def commandsExecutor(command: RedisCommand, args: js.Array[Any]): this.type = js.native
    
    def exec(): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    def exec(execAsPipeline: Boolean): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    
    def execAsPipeline(): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    
    def functionsExecutor(fn: RedisFunction, args: js.Array[Any], name: String): this.type = js.native
    
    /* private */ var `private`: Any = js.native
    
    def scriptsExecutor(script: RedisScript, args: js.Array[Any]): this.type = js.native
  }
  
  type RedisClusterMultiCommandSignature[C /* <: RedisCommand */, M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] = js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
    ], 
    RedisClusterMultiCommandType[M, F, S]
  ]
  
  type RedisClusterMultiCommandType[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] = RedisClusterMultiCommand & (WithCommands[M, F, S]) & (WithModules[M, F, S]) & (WithFunctions[M, F, S]) & (WithScripts[M, F, S])
  
  @js.native
  trait RedisClusterMultiExecutor extends StObject {
    
    def apply(queue: js.Array[RedisMultiQueuedCommand]): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    def apply(queue: js.Array[RedisMultiQueuedCommand], firstKey: Unit, chainId: js.Symbol): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    def apply(queue: js.Array[RedisMultiQueuedCommand], firstKey: RedisCommandArgument): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    def apply(queue: js.Array[RedisMultiQueuedCommand], firstKey: RedisCommandArgument, chainId: js.Symbol): js.Promise[js.Array[RedisCommandRawReply]] = js.native
  }
  
  /* Inlined {[ P in keyof {  APPEND :typeof APPEND,   append :typeof APPEND,   BITCOUNT :typeof BITCOUNT,   bitCount :typeof BITCOUNT,   BITFIELD_RO :typeof BITFIELD_RO,   bitFieldRo :typeof BITFIELD_RO,   BITFIELD :typeof BITFIELD,   bitField :typeof BITFIELD,   BITOP :typeof BITOP,   bitOp :typeof BITOP,   BITPOS :typeof BITPOS,   bitPos :typeof BITPOS,   BLMOVE :typeof BLMOVE,   blMove :typeof BLMOVE,   BLMPOP :typeof BLMPOP,   blmPop :typeof BLMPOP,   BLPOP :typeof BLPOP,   blPop :typeof BLPOP,   BRPOP :typeof BRPOP,   brPop :typeof BRPOP,   BRPOPLPUSH :typeof BRPOPLPUSH,   brPopLPush :typeof BRPOPLPUSH,   BZMPOP :typeof BZMPOP,   bzmPop :typeof BZMPOP,   BZPOPMAX :typeof BZPOPMAX,   bzPopMax :typeof BZPOPMAX,   BZPOPMIN :typeof BZPOPMIN,   bzPopMin :typeof BZPOPMIN,   COPY :typeof COPY,   copy :typeof COPY,   DECR :typeof DECR,   decr :typeof DECR,   DECRBY :typeof DECRBY,   decrBy :typeof DECRBY,   DEL :typeof DEL,   del :typeof DEL,   DUMP :typeof DUMP,   dump :typeof DUMP,   EVAL_RO :typeof EVAL_RO,   evalRo :typeof EVAL_RO,   EVAL :typeof EVAL,   eval :typeof EVAL,   EVALSHA :typeof EVALSHA,   evalSha :typeof EVALSHA,   EVALSHA_RO :typeof EVALSHA_RO,   evalShaRo :typeof EVALSHA_RO,   EXISTS :typeof EXISTS,   exists :typeof EXISTS,   EXPIRE :typeof EXPIRE,   expire :typeof EXPIRE,   EXPIREAT :typeof EXPIREAT,   expireAt :typeof EXPIREAT,   EXPIRETIME :typeof EXPIRETIME,   expireTime :typeof EXPIRETIME,   FCALL_RO :typeof FCALL_RO,   fCallRo :typeof FCALL_RO,   FCALL :typeof FCALL,   fCall :typeof FCALL,   GEOADD :typeof GEOADD,   geoAdd :typeof GEOADD,   GEODIST :typeof GEODIST,   geoDist :typeof GEODIST,   GEOHASH :typeof GEOHASH,   geoHash :typeof GEOHASH,   GEOPOS :typeof GEOPOS,   geoPos :typeof GEOPOS,   GEORADIUS_RO_WITH :typeof GEORADIUS_RO_WITH,   geoRadiusRoWith :typeof GEORADIUS_RO_WITH,   GEORADIUS_RO :typeof GEORADIUS_RO,   geoRadiusRo :typeof GEORADIUS_RO,   GEORADIUS_WITH :typeof GEORADIUS_WITH,   geoRadiusWith :typeof GEORADIUS_WITH,   GEORADIUS :typeof GEORADIUS,   geoRadius :typeof GEORADIUS,   GEORADIUSBYMEMBER_RO_WITH :typeof GEORADIUSBYMEMBER_RO_WITH,   geoRadiusByMemberRoWith :typeof GEORADIUSBYMEMBER_RO_WITH,   GEORADIUSBYMEMBER_RO :typeof GEORADIUSBYMEMBER_RO,   geoRadiusByMemberRo :typeof GEORADIUSBYMEMBER_RO,   GEORADIUSBYMEMBER_WITH :typeof GEORADIUSBYMEMBER_WITH,   geoRadiusByMemberWith :typeof GEORADIUSBYMEMBER_WITH,   GEORADIUSBYMEMBER :typeof GEORADIUSBYMEMBER,   geoRadiusByMember :typeof GEORADIUSBYMEMBER,   GEORADIUSBYMEMBERSTORE :typeof GEORADIUSBYMEMBERSTORE,   geoRadiusByMemberStore :typeof GEORADIUSBYMEMBERSTORE,   GEORADIUSSTORE :typeof GEORADIUSSTORE,   geoRadiusStore :typeof GEORADIUSSTORE,   GEOSEARCH_WITH :typeof GEOSEARCH_WITH,   geoSearchWith :typeof GEOSEARCH_WITH,   GEOSEARCH :typeof GEOSEARCH,   geoSearch :typeof GEOSEARCH,   GEOSEARCHSTORE :typeof GEOSEARCHSTORE,   geoSearchStore :typeof GEOSEARCHSTORE,   GET :typeof GET,   get :typeof GET,   GETBIT :typeof GETBIT,   getBit :typeof GETBIT,   GETDEL :typeof GETDEL,   getDel :typeof GETDEL,   GETEX :typeof GETEX,   getEx :typeof GETEX,   GETRANGE :typeof GETRANGE,   getRange :typeof GETRANGE,   GETSET :typeof GETSET,   getSet :typeof GETSET,   HDEL :typeof HDEL,   hDel :typeof HDEL,   HEXISTS :typeof HEXISTS,   hExists :typeof HEXISTS,   HGET :typeof HGET,   hGet :typeof HGET,   HGETALL :typeof HGETALL,   hGetAll :typeof HGETALL,   HINCRBY :typeof HINCRBY,   hIncrBy :typeof HINCRBY,   HINCRBYFLOAT :typeof HINCRBYFLOAT,   hIncrByFloat :typeof HINCRBYFLOAT,   HKEYS :typeof HKEYS,   hKeys :typeof HKEYS,   HLEN :typeof HLEN,   hLen :typeof HLEN,   HMGET :typeof HMGET,   hmGet :typeof HMGET,   HRANDFIELD_COUNT_WITHVALUES :typeof HRANDFIELD_COUNT_WITHVALUES,   hRandFieldCountWithValues :typeof HRANDFIELD_COUNT_WITHVALUES,   HRANDFIELD_COUNT :typeof HRANDFIELD_COUNT,   hRandFieldCount :typeof HRANDFIELD_COUNT,   HRANDFIELD :typeof HRANDFIELD,   hRandField :typeof HRANDFIELD,   HSCAN :typeof HSCAN,   hScan :typeof HSCAN,   HSET :typeof HSET,   hSet :typeof HSET,   HSETNX :typeof HSETNX,   hSetNX :typeof HSETNX,   HSTRLEN :typeof HSTRLEN,   hStrLen :typeof HSTRLEN,   HVALS :typeof HVALS,   hVals :typeof HVALS,   INCR :typeof INCR,   incr :typeof INCR,   INCRBY :typeof INCRBY,   incrBy :typeof INCRBY,   INCRBYFLOAT :typeof INCRBYFLOAT,   incrByFloat :typeof INCRBYFLOAT,   LCS_IDX_WITHMATCHLEN :typeof LCS_IDX_WITHMATCHLEN,   lcsIdxWithMatchLen :typeof LCS_IDX_WITHMATCHLEN,   LCS_IDX :typeof LCS_IDX,   lcsIdx :typeof LCS_IDX,   LCS_LEN :typeof LCS_LEN,   lcsLen :typeof LCS_LEN,   LCS :typeof LCS,   lcs :typeof LCS,   LINDEX :typeof LINDEX,   lIndex :typeof LINDEX,   LINSERT :typeof LINSERT,   lInsert :typeof LINSERT,   LLEN :typeof LLEN,   lLen :typeof LLEN,   LMOVE :typeof LMOVE,   lMove :typeof LMOVE,   LMPOP :typeof LMPOP,   lmPop :typeof LMPOP,   LPOP_COUNT :typeof LPOP_COUNT,   lPopCount :typeof LPOP_COUNT,   LPOP :typeof LPOP,   lPop :typeof LPOP,   LPOS_COUNT :typeof LPOS_COUNT,   lPosCount :typeof LPOS_COUNT,   LPOS :typeof LPOS,   lPos :typeof LPOS,   LPUSH :typeof LPUSH,   lPush :typeof LPUSH,   LPUSHX :typeof LPUSHX,   lPushX :typeof LPUSHX,   LRANGE :typeof LRANGE,   lRange :typeof LRANGE,   LREM :typeof LREM,   lRem :typeof LREM,   LSET :typeof LSET,   lSet :typeof LSET,   LTRIM :typeof LTRIM,   lTrim :typeof LTRIM,   MGET :typeof MGET,   mGet :typeof MGET,   MIGRATE :typeof MIGRATE,   migrate :typeof MIGRATE,   MSET :typeof MSET,   mSet :typeof MSET,   MSETNX :typeof MSETNX,   mSetNX :typeof MSETNX,   OBJECT_ENCODING :typeof OBJECT_ENCODING,   objectEncoding :typeof OBJECT_ENCODING,   OBJECT_FREQ :typeof OBJECT_FREQ,   objectFreq :typeof OBJECT_FREQ,   OBJECT_IDLETIME :typeof OBJECT_IDLETIME,   objectIdleTime :typeof OBJECT_IDLETIME,   OBJECT_REFCOUNT :typeof OBJECT_REFCOUNT,   objectRefCount :typeof OBJECT_REFCOUNT,   PERSIST :typeof PERSIST,   persist :typeof PERSIST,   PEXPIRE :typeof PEXPIRE,   pExpire :typeof PEXPIRE,   PEXPIREAT :typeof PEXPIREAT,   pExpireAt :typeof PEXPIREAT,   PEXPIRETIME :typeof PEXPIRETIME,   pExpireTime :typeof PEXPIRETIME,   PFADD :typeof PFADD,   pfAdd :typeof PFADD,   PFCOUNT :typeof PFCOUNT,   pfCount :typeof PFCOUNT,   PFMERGE :typeof PFMERGE,   pfMerge :typeof PFMERGE,   PSETEX :typeof PSETEX,   pSetEx :typeof PSETEX,   PTTL :typeof PTTL,   pTTL :typeof PTTL,   PUBLISH :typeof PUBLISH,   publish :typeof PUBLISH,   RENAME :typeof RENAME,   rename :typeof RENAME,   RENAMENX :typeof RENAMENX,   renameNX :typeof RENAMENX,   RPOP_COUNT :typeof RPOP_COUNT,   rPopCount :typeof RPOP_COUNT,   RPOP :typeof RPOP,   rPop :typeof RPOP,   RPOPLPUSH :typeof RPOPLPUSH,   rPopLPush :typeof RPOPLPUSH,   RPUSH :typeof RPUSH,   rPush :typeof RPUSH,   RPUSHX :typeof RPUSHX,   rPushX :typeof RPUSHX,   SADD :typeof SADD,   sAdd :typeof SADD,   SCARD :typeof SCARD,   sCard :typeof SCARD,   SDIFF :typeof SDIFF,   sDiff :typeof SDIFF,   SDIFFSTORE :typeof SDIFFSTORE,   sDiffStore :typeof SDIFFSTORE,   SINTER :typeof SINTER,   sInter :typeof SINTER,   SINTERCARD :typeof SINTERCARD,   sInterCard :typeof SINTERCARD,   SINTERSTORE :typeof SINTERSTORE,   sInterStore :typeof SINTERSTORE,   SET :typeof SET,   set :typeof SET,   SETBIT :typeof SETBIT,   setBit :typeof SETBIT,   SETEX :typeof SETEX,   setEx :typeof SETEX,   SETNX :typeof SETNX,   setNX :typeof SETNX,   SETRANGE :typeof SETRANGE,   setRange :typeof SETRANGE,   SISMEMBER :typeof SISMEMBER,   sIsMember :typeof SISMEMBER,   SMEMBERS :typeof SMEMBERS,   sMembers :typeof SMEMBERS,   SMISMEMBER :typeof SMISMEMBER,   smIsMember :typeof SMISMEMBER,   SMOVE :typeof SMOVE,   sMove :typeof SMOVE,   SORT_RO :typeof SORT_RO,   sortRo :typeof SORT_RO,   SORT_STORE :typeof SORT_STORE,   sortStore :typeof SORT_STORE,   SORT :typeof SORT,   sort :typeof SORT,   SPOP :typeof SPOP,   sPop :typeof SPOP,   SRANDMEMBER_COUNT :typeof SRANDMEMBER_COUNT,   sRandMemberCount :typeof SRANDMEMBER_COUNT,   SRANDMEMBER :typeof SRANDMEMBER,   sRandMember :typeof SRANDMEMBER,   SREM :typeof SREM,   sRem :typeof SREM,   SSCAN :typeof SSCAN,   sScan :typeof SSCAN,   STRLEN :typeof STRLEN,   strLen :typeof STRLEN,   SUNION :typeof SUNION,   sUnion :typeof SUNION,   SUNIONSTORE :typeof SUNIONSTORE,   sUnionStore :typeof SUNIONSTORE,   TOUCH :typeof TOUCH,   touch :typeof TOUCH,   TTL :typeof TTL,   ttl :typeof TTL,   TYPE :typeof TYPE,   type :typeof TYPE,   UNLINK :typeof UNLINK,   unlink :typeof UNLINK,   WATCH :typeof WATCH,   watch :typeof WATCH,   XACK :typeof XACK,   xAck :typeof XACK,   XADD :typeof XADD,   xAdd :typeof XADD,   XAUTOCLAIM_JUSTID :typeof XAUTOCLAIM_JUSTID,   xAutoClaimJustId :typeof XAUTOCLAIM_JUSTID,   XAUTOCLAIM :typeof XAUTOCLAIM,   xAutoClaim :typeof XAUTOCLAIM,   XCLAIM :typeof XCLAIM,   xClaim :typeof XCLAIM,   XCLAIM_JUSTID :typeof XCLAIM_JUSTID,   xClaimJustId :typeof XCLAIM_JUSTID,   XDEL :typeof XDEL,   xDel :typeof XDEL,   XGROUP_CREATE :typeof XGROUP_CREATE,   xGroupCreate :typeof XGROUP_CREATE,   XGROUP_CREATECONSUMER :typeof XGROUP_CREATECONSUMER,   xGroupCreateConsumer :typeof XGROUP_CREATECONSUMER,   XGROUP_DELCONSUMER :typeof XGROUP_DELCONSUMER,   xGroupDelConsumer :typeof XGROUP_DELCONSUMER,   XGROUP_DESTROY :typeof XGROUP_DESTROY,   xGroupDestroy :typeof XGROUP_DESTROY,   XGROUP_SETID :typeof XGROUP_SETID,   xGroupSetId :typeof XGROUP_SETID,   XINFO_CONSUMERS :typeof XINFO_CONSUMERS,   xInfoConsumers :typeof XINFO_CONSUMERS,   XINFO_GROUPS :typeof XINFO_GROUPS,   xInfoGroups :typeof XINFO_GROUPS,   XINFO_STREAM :typeof XINFO_STREAM,   xInfoStream :typeof XINFO_STREAM,   XLEN :typeof XLEN,   xLen :typeof XLEN,   XPENDING_RANGE :typeof XPENDING_RANGE,   xPendingRange :typeof XPENDING_RANGE,   XPENDING :typeof XPENDING,   xPending :typeof XPENDING,   XRANGE :typeof XRANGE,   xRange :typeof XRANGE,   XREAD :typeof XREAD,   xRead :typeof XREAD,   XREADGROUP :typeof XREADGROUP,   xReadGroup :typeof XREADGROUP,   XREVRANGE :typeof XREVRANGE,   xRevRange :typeof XREVRANGE,   XSETID :typeof XSETID,   xSetId :typeof XSETID,   XTRIM :typeof XTRIM,   xTrim :typeof XTRIM,   ZADD :typeof ZADD,   zAdd :typeof ZADD,   ZCARD :typeof ZCARD,   zCard :typeof ZCARD,   ZCOUNT :typeof ZCOUNT,   zCount :typeof ZCOUNT,   ZDIFF_WITHSCORES :typeof ZDIFF_WITHSCORES,   zDiffWithScores :typeof ZDIFF_WITHSCORES,   ZDIFF :typeof ZDIFF,   zDiff :typeof ZDIFF,   ZDIFFSTORE :typeof ZDIFFSTORE,   zDiffStore :typeof ZDIFFSTORE,   ZINCRBY :typeof ZINCRBY,   zIncrBy :typeof ZINCRBY,   ZINTER_WITHSCORES :typeof ZINTER_WITHSCORES,   zInterWithScores :typeof ZINTER_WITHSCORES,   ZINTER :typeof ZINTER,   zInter :typeof ZINTER,   ZINTERCARD :typeof ZINTERCARD,   zInterCard :typeof ZINTERCARD,   ZINTERSTORE :typeof ZINTERSTORE,   zInterStore :typeof ZINTERSTORE,   ZLEXCOUNT :typeof ZLEXCOUNT,   zLexCount :typeof ZLEXCOUNT,   ZMPOP :typeof ZMPOP,   zmPop :typeof ZMPOP,   ZMSCORE :typeof ZMSCORE,   zmScore :typeof ZMSCORE,   ZPOPMAX_COUNT :typeof ZPOPMAX_COUNT,   zPopMaxCount :typeof ZPOPMAX_COUNT,   ZPOPMAX :typeof ZPOPMAX,   zPopMax :typeof ZPOPMAX,   ZPOPMIN_COUNT :typeof ZPOPMIN_COUNT,   zPopMinCount :typeof ZPOPMIN_COUNT,   ZPOPMIN :typeof ZPOPMIN,   zPopMin :typeof ZPOPMIN,   ZRANDMEMBER_COUNT_WITHSCORES :typeof ZRANDMEMBER_COUNT_WITHSCORES,   zRandMemberCountWithScores :typeof ZRANDMEMBER_COUNT_WITHSCORES,   ZRANDMEMBER_COUNT :typeof ZRANDMEMBER_COUNT,   zRandMemberCount :typeof ZRANDMEMBER_COUNT,   ZRANDMEMBER :typeof ZRANDMEMBER,   zRandMember :typeof ZRANDMEMBER,   ZRANGE_WITHSCORES :typeof ZRANGE_WITHSCORES,   zRangeWithScores :typeof ZRANGE_WITHSCORES,   ZRANGE :typeof ZRANGE,   zRange :typeof ZRANGE,   ZRANGEBYLEX :typeof ZRANGEBYLEX,   zRangeByLex :typeof ZRANGEBYLEX,   ZRANGEBYSCORE_WITHSCORES :typeof ZRANGEBYSCORE_WITHSCORES,   zRangeByScoreWithScores :typeof ZRANGEBYSCORE_WITHSCORES,   ZRANGEBYSCORE :typeof ZRANGEBYSCORE,   zRangeByScore :typeof ZRANGEBYSCORE,   ZRANGESTORE :typeof ZRANGESTORE,   zRangeStore :typeof ZRANGESTORE,   ZRANK :typeof ZRANK,   zRank :typeof ZRANK,   ZREM :typeof ZREM,   zRem :typeof ZREM,   ZREMRANGEBYLEX :typeof ZREMRANGEBYLEX,   zRemRangeByLex :typeof ZREMRANGEBYLEX,   ZREMRANGEBYRANK :typeof ZREMRANGEBYRANK,   zRemRangeByRank :typeof ZREMRANGEBYRANK,   ZREMRANGEBYSCORE :typeof ZREMRANGEBYSCORE,   zRemRangeByScore :typeof ZREMRANGEBYSCORE,   ZREVRANK :typeof ZREVRANK,   zRevRank :typeof ZREVRANK,   ZSCAN :typeof ZSCAN,   zScan :typeof ZSCAN,   ZSCORE :typeof ZSCORE,   zScore :typeof ZSCORE,   ZUNION_WITHSCORES :typeof ZUNION_WITHSCORES,   zUnionWithScores :typeof ZUNION_WITHSCORES,   ZUNION :typeof ZUNION,   zUnion :typeof ZUNION,   ZUNIONSTORE :typeof ZUNIONSTORE,   zUnionStore :typeof ZUNIONSTORE} ]: @redis/client.@redis/client/dist/lib/cluster/multi-command.RedisClusterMultiCommandSignature<{  APPEND :typeof APPEND,   append :typeof APPEND,   BITCOUNT :typeof BITCOUNT,   bitCount :typeof BITCOUNT,   BITFIELD_RO :typeof BITFIELD_RO,   bitFieldRo :typeof BITFIELD_RO,   BITFIELD :typeof BITFIELD,   bitField :typeof BITFIELD,   BITOP :typeof BITOP,   bitOp :typeof BITOP,   BITPOS :typeof BITPOS,   bitPos :typeof BITPOS,   BLMOVE :typeof BLMOVE,   blMove :typeof BLMOVE,   BLMPOP :typeof BLMPOP,   blmPop :typeof BLMPOP,   BLPOP :typeof BLPOP,   blPop :typeof BLPOP,   BRPOP :typeof BRPOP,   brPop :typeof BRPOP,   BRPOPLPUSH :typeof BRPOPLPUSH,   brPopLPush :typeof BRPOPLPUSH,   BZMPOP :typeof BZMPOP,   bzmPop :typeof BZMPOP,   BZPOPMAX :typeof BZPOPMAX,   bzPopMax :typeof BZPOPMAX,   BZPOPMIN :typeof BZPOPMIN,   bzPopMin :typeof BZPOPMIN,   COPY :typeof COPY,   copy :typeof COPY,   DECR :typeof DECR,   decr :typeof DECR,   DECRBY :typeof DECRBY,   decrBy :typeof DECRBY,   DEL :typeof DEL,   del :typeof DEL,   DUMP :typeof DUMP,   dump :typeof DUMP,   EVAL_RO :typeof EVAL_RO,   evalRo :typeof EVAL_RO,   EVAL :typeof EVAL,   eval :typeof EVAL,   EVALSHA :typeof EVALSHA,   evalSha :typeof EVALSHA,   EVALSHA_RO :typeof EVALSHA_RO,   evalShaRo :typeof EVALSHA_RO,   EXISTS :typeof EXISTS,   exists :typeof EXISTS,   EXPIRE :typeof EXPIRE,   expire :typeof EXPIRE,   EXPIREAT :typeof EXPIREAT,   expireAt :typeof EXPIREAT,   EXPIRETIME :typeof EXPIRETIME,   expireTime :typeof EXPIRETIME,   FCALL_RO :typeof FCALL_RO,   fCallRo :typeof FCALL_RO,   FCALL :typeof FCALL,   fCall :typeof FCALL,   GEOADD :typeof GEOADD,   geoAdd :typeof GEOADD,   GEODIST :typeof GEODIST,   geoDist :typeof GEODIST,   GEOHASH :typeof GEOHASH,   geoHash :typeof GEOHASH,   GEOPOS :typeof GEOPOS,   geoPos :typeof GEOPOS,   GEORADIUS_RO_WITH :typeof GEORADIUS_RO_WITH,   geoRadiusRoWith :typeof GEORADIUS_RO_WITH,   GEORADIUS_RO :typeof GEORADIUS_RO,   geoRadiusRo :typeof GEORADIUS_RO,   GEORADIUS_WITH :typeof GEORADIUS_WITH,   geoRadiusWith :typeof GEORADIUS_WITH,   GEORADIUS :typeof GEORADIUS,   geoRadius :typeof GEORADIUS,   GEORADIUSBYMEMBER_RO_WITH :typeof GEORADIUSBYMEMBER_RO_WITH,   geoRadiusByMemberRoWith :typeof GEORADIUSBYMEMBER_RO_WITH,   GEORADIUSBYMEMBER_RO :typeof GEORADIUSBYMEMBER_RO,   geoRadiusByMemberRo :typeof GEORADIUSBYMEMBER_RO,   GEORADIUSBYMEMBER_WITH :typeof GEORADIUSBYMEMBER_WITH,   geoRadiusByMemberWith :typeof GEORADIUSBYMEMBER_WITH,   GEORADIUSBYMEMBER :typeof GEORADIUSBYMEMBER,   geoRadiusByMember :typeof GEORADIUSBYMEMBER,   GEORADIUSBYMEMBERSTORE :typeof GEORADIUSBYMEMBERSTORE,   geoRadiusByMemberStore :typeof GEORADIUSBYMEMBERSTORE,   GEORADIUSSTORE :typeof GEORADIUSSTORE,   geoRadiusStore :typeof GEORADIUSSTORE,   GEOSEARCH_WITH :typeof GEOSEARCH_WITH,   geoSearchWith :typeof GEOSEARCH_WITH,   GEOSEARCH :typeof GEOSEARCH,   geoSearch :typeof GEOSEARCH,   GEOSEARCHSTORE :typeof GEOSEARCHSTORE,   geoSearchStore :typeof GEOSEARCHSTORE,   GET :typeof GET,   get :typeof GET,   GETBIT :typeof GETBIT,   getBit :typeof GETBIT,   GETDEL :typeof GETDEL,   getDel :typeof GETDEL,   GETEX :typeof GETEX,   getEx :typeof GETEX,   GETRANGE :typeof GETRANGE,   getRange :typeof GETRANGE,   GETSET :typeof GETSET,   getSet :typeof GETSET,   HDEL :typeof HDEL,   hDel :typeof HDEL,   HEXISTS :typeof HEXISTS,   hExists :typeof HEXISTS,   HGET :typeof HGET,   hGet :typeof HGET,   HGETALL :typeof HGETALL,   hGetAll :typeof HGETALL,   HINCRBY :typeof HINCRBY,   hIncrBy :typeof HINCRBY,   HINCRBYFLOAT :typeof HINCRBYFLOAT,   hIncrByFloat :typeof HINCRBYFLOAT,   HKEYS :typeof HKEYS,   hKeys :typeof HKEYS,   HLEN :typeof HLEN,   hLen :typeof HLEN,   HMGET :typeof HMGET,   hmGet :typeof HMGET,   HRANDFIELD_COUNT_WITHVALUES :typeof HRANDFIELD_COUNT_WITHVALUES,   hRandFieldCountWithValues :typeof HRANDFIELD_COUNT_WITHVALUES,   HRANDFIELD_COUNT :typeof HRANDFIELD_COUNT,   hRandFieldCount :typeof HRANDFIELD_COUNT,   HRANDFIELD :typeof HRANDFIELD,   hRandField :typeof HRANDFIELD,   HSCAN :typeof HSCAN,   hScan :typeof HSCAN,   HSET :typeof HSET,   hSet :typeof HSET,   HSETNX :typeof HSETNX,   hSetNX :typeof HSETNX,   HSTRLEN :typeof HSTRLEN,   hStrLen :typeof HSTRLEN,   HVALS :typeof HVALS,   hVals :typeof HVALS,   INCR :typeof INCR,   incr :typeof INCR,   INCRBY :typeof INCRBY,   incrBy :typeof INCRBY,   INCRBYFLOAT :typeof INCRBYFLOAT,   incrByFloat :typeof INCRBYFLOAT,   LCS_IDX_WITHMATCHLEN :typeof LCS_IDX_WITHMATCHLEN,   lcsIdxWithMatchLen :typeof LCS_IDX_WITHMATCHLEN,   LCS_IDX :typeof LCS_IDX,   lcsIdx :typeof LCS_IDX,   LCS_LEN :typeof LCS_LEN,   lcsLen :typeof LCS_LEN,   LCS :typeof LCS,   lcs :typeof LCS,   LINDEX :typeof LINDEX,   lIndex :typeof LINDEX,   LINSERT :typeof LINSERT,   lInsert :typeof LINSERT,   LLEN :typeof LLEN,   lLen :typeof LLEN,   LMOVE :typeof LMOVE,   lMove :typeof LMOVE,   LMPOP :typeof LMPOP,   lmPop :typeof LMPOP,   LPOP_COUNT :typeof LPOP_COUNT,   lPopCount :typeof LPOP_COUNT,   LPOP :typeof LPOP,   lPop :typeof LPOP,   LPOS_COUNT :typeof LPOS_COUNT,   lPosCount :typeof LPOS_COUNT,   LPOS :typeof LPOS,   lPos :typeof LPOS,   LPUSH :typeof LPUSH,   lPush :typeof LPUSH,   LPUSHX :typeof LPUSHX,   lPushX :typeof LPUSHX,   LRANGE :typeof LRANGE,   lRange :typeof LRANGE,   LREM :typeof LREM,   lRem :typeof LREM,   LSET :typeof LSET,   lSet :typeof LSET,   LTRIM :typeof LTRIM,   lTrim :typeof LTRIM,   MGET :typeof MGET,   mGet :typeof MGET,   MIGRATE :typeof MIGRATE,   migrate :typeof MIGRATE,   MSET :typeof MSET,   mSet :typeof MSET,   MSETNX :typeof MSETNX,   mSetNX :typeof MSETNX,   OBJECT_ENCODING :typeof OBJECT_ENCODING,   objectEncoding :typeof OBJECT_ENCODING,   OBJECT_FREQ :typeof OBJECT_FREQ,   objectFreq :typeof OBJECT_FREQ,   OBJECT_IDLETIME :typeof OBJECT_IDLETIME,   objectIdleTime :typeof OBJECT_IDLETIME,   OBJECT_REFCOUNT :typeof OBJECT_REFCOUNT,   objectRefCount :typeof OBJECT_REFCOUNT,   PERSIST :typeof PERSIST,   persist :typeof PERSIST,   PEXPIRE :typeof PEXPIRE,   pExpire :typeof PEXPIRE,   PEXPIREAT :typeof PEXPIREAT,   pExpireAt :typeof PEXPIREAT,   PEXPIRETIME :typeof PEXPIRETIME,   pExpireTime :typeof PEXPIRETIME,   PFADD :typeof PFADD,   pfAdd :typeof PFADD,   PFCOUNT :typeof PFCOUNT,   pfCount :typeof PFCOUNT,   PFMERGE :typeof PFMERGE,   pfMerge :typeof PFMERGE,   PSETEX :typeof PSETEX,   pSetEx :typeof PSETEX,   PTTL :typeof PTTL,   pTTL :typeof PTTL,   PUBLISH :typeof PUBLISH,   publish :typeof PUBLISH,   RENAME :typeof RENAME,   rename :typeof RENAME,   RENAMENX :typeof RENAMENX,   renameNX :typeof RENAMENX,   RPOP_COUNT :typeof RPOP_COUNT,   rPopCount :typeof RPOP_COUNT,   RPOP :typeof RPOP,   rPop :typeof RPOP,   RPOPLPUSH :typeof RPOPLPUSH,   rPopLPush :typeof RPOPLPUSH,   RPUSH :typeof RPUSH,   rPush :typeof RPUSH,   RPUSHX :typeof RPUSHX,   rPushX :typeof RPUSHX,   SADD :typeof SADD,   sAdd :typeof SADD,   SCARD :typeof SCARD,   sCard :typeof SCARD,   SDIFF :typeof SDIFF,   sDiff :typeof SDIFF,   SDIFFSTORE :typeof SDIFFSTORE,   sDiffStore :typeof SDIFFSTORE,   SINTER :typeof SINTER,   sInter :typeof SINTER,   SINTERCARD :typeof SINTERCARD,   sInterCard :typeof SINTERCARD,   SINTERSTORE :typeof SINTERSTORE,   sInterStore :typeof SINTERSTORE,   SET :typeof SET,   set :typeof SET,   SETBIT :typeof SETBIT,   setBit :typeof SETBIT,   SETEX :typeof SETEX,   setEx :typeof SETEX,   SETNX :typeof SETNX,   setNX :typeof SETNX,   SETRANGE :typeof SETRANGE,   setRange :typeof SETRANGE,   SISMEMBER :typeof SISMEMBER,   sIsMember :typeof SISMEMBER,   SMEMBERS :typeof SMEMBERS,   sMembers :typeof SMEMBERS,   SMISMEMBER :typeof SMISMEMBER,   smIsMember :typeof SMISMEMBER,   SMOVE :typeof SMOVE,   sMove :typeof SMOVE,   SORT_RO :typeof SORT_RO,   sortRo :typeof SORT_RO,   SORT_STORE :typeof SORT_STORE,   sortStore :typeof SORT_STORE,   SORT :typeof SORT,   sort :typeof SORT,   SPOP :typeof SPOP,   sPop :typeof SPOP,   SRANDMEMBER_COUNT :typeof SRANDMEMBER_COUNT,   sRandMemberCount :typeof SRANDMEMBER_COUNT,   SRANDMEMBER :typeof SRANDMEMBER,   sRandMember :typeof SRANDMEMBER,   SREM :typeof SREM,   sRem :typeof SREM,   SSCAN :typeof SSCAN,   sScan :typeof SSCAN,   STRLEN :typeof STRLEN,   strLen :typeof STRLEN,   SUNION :typeof SUNION,   sUnion :typeof SUNION,   SUNIONSTORE :typeof SUNIONSTORE,   sUnionStore :typeof SUNIONSTORE,   TOUCH :typeof TOUCH,   touch :typeof TOUCH,   TTL :typeof TTL,   ttl :typeof TTL,   TYPE :typeof TYPE,   type :typeof TYPE,   UNLINK :typeof UNLINK,   unlink :typeof UNLINK,   WATCH :typeof WATCH,   watch :typeof WATCH,   XACK :typeof XACK,   xAck :typeof XACK,   XADD :typeof XADD,   xAdd :typeof XADD,   XAUTOCLAIM_JUSTID :typeof XAUTOCLAIM_JUSTID,   xAutoClaimJustId :typeof XAUTOCLAIM_JUSTID,   XAUTOCLAIM :typeof XAUTOCLAIM,   xAutoClaim :typeof XAUTOCLAIM,   XCLAIM :typeof XCLAIM,   xClaim :typeof XCLAIM,   XCLAIM_JUSTID :typeof XCLAIM_JUSTID,   xClaimJustId :typeof XCLAIM_JUSTID,   XDEL :typeof XDEL,   xDel :typeof XDEL,   XGROUP_CREATE :typeof XGROUP_CREATE,   xGroupCreate :typeof XGROUP_CREATE,   XGROUP_CREATECONSUMER :typeof XGROUP_CREATECONSUMER,   xGroupCreateConsumer :typeof XGROUP_CREATECONSUMER,   XGROUP_DELCONSUMER :typeof XGROUP_DELCONSUMER,   xGroupDelConsumer :typeof XGROUP_DELCONSUMER,   XGROUP_DESTROY :typeof XGROUP_DESTROY,   xGroupDestroy :typeof XGROUP_DESTROY,   XGROUP_SETID :typeof XGROUP_SETID,   xGroupSetId :typeof XGROUP_SETID,   XINFO_CONSUMERS :typeof XINFO_CONSUMERS,   xInfoConsumers :typeof XINFO_CONSUMERS,   XINFO_GROUPS :typeof XINFO_GROUPS,   xInfoGroups :typeof XINFO_GROUPS,   XINFO_STREAM :typeof XINFO_STREAM,   xInfoStream :typeof XINFO_STREAM,   XLEN :typeof XLEN,   xLen :typeof XLEN,   XPENDING_RANGE :typeof XPENDING_RANGE,   xPendingRange :typeof XPENDING_RANGE,   XPENDING :typeof XPENDING,   xPending :typeof XPENDING,   XRANGE :typeof XRANGE,   xRange :typeof XRANGE,   XREAD :typeof XREAD,   xRead :typeof XREAD,   XREADGROUP :typeof XREADGROUP,   xReadGroup :typeof XREADGROUP,   XREVRANGE :typeof XREVRANGE,   xRevRange :typeof XREVRANGE,   XSETID :typeof XSETID,   xSetId :typeof XSETID,   XTRIM :typeof XTRIM,   xTrim :typeof XTRIM,   ZADD :typeof ZADD,   zAdd :typeof ZADD,   ZCARD :typeof ZCARD,   zCard :typeof ZCARD,   ZCOUNT :typeof ZCOUNT,   zCount :typeof ZCOUNT,   ZDIFF_WITHSCORES :typeof ZDIFF_WITHSCORES,   zDiffWithScores :typeof ZDIFF_WITHSCORES,   ZDIFF :typeof ZDIFF,   zDiff :typeof ZDIFF,   ZDIFFSTORE :typeof ZDIFFSTORE,   zDiffStore :typeof ZDIFFSTORE,   ZINCRBY :typeof ZINCRBY,   zIncrBy :typeof ZINCRBY,   ZINTER_WITHSCORES :typeof ZINTER_WITHSCORES,   zInterWithScores :typeof ZINTER_WITHSCORES,   ZINTER :typeof ZINTER,   zInter :typeof ZINTER,   ZINTERCARD :typeof ZINTERCARD,   zInterCard :typeof ZINTERCARD,   ZINTERSTORE :typeof ZINTERSTORE,   zInterStore :typeof ZINTERSTORE,   ZLEXCOUNT :typeof ZLEXCOUNT,   zLexCount :typeof ZLEXCOUNT,   ZMPOP :typeof ZMPOP,   zmPop :typeof ZMPOP,   ZMSCORE :typeof ZMSCORE,   zmScore :typeof ZMSCORE,   ZPOPMAX_COUNT :typeof ZPOPMAX_COUNT,   zPopMaxCount :typeof ZPOPMAX_COUNT,   ZPOPMAX :typeof ZPOPMAX,   zPopMax :typeof ZPOPMAX,   ZPOPMIN_COUNT :typeof ZPOPMIN_COUNT,   zPopMinCount :typeof ZPOPMIN_COUNT,   ZPOPMIN :typeof ZPOPMIN,   zPopMin :typeof ZPOPMIN,   ZRANDMEMBER_COUNT_WITHSCORES :typeof ZRANDMEMBER_COUNT_WITHSCORES,   zRandMemberCountWithScores :typeof ZRANDMEMBER_COUNT_WITHSCORES,   ZRANDMEMBER_COUNT :typeof ZRANDMEMBER_COUNT,   zRandMemberCount :typeof ZRANDMEMBER_COUNT,   ZRANDMEMBER :typeof ZRANDMEMBER,   zRandMember :typeof ZRANDMEMBER,   ZRANGE_WITHSCORES :typeof ZRANGE_WITHSCORES,   zRangeWithScores :typeof ZRANGE_WITHSCORES,   ZRANGE :typeof ZRANGE,   zRange :typeof ZRANGE,   ZRANGEBYLEX :typeof ZRANGEBYLEX,   zRangeByLex :typeof ZRANGEBYLEX,   ZRANGEBYSCORE_WITHSCORES :typeof ZRANGEBYSCORE_WITHSCORES,   zRangeByScoreWithScores :typeof ZRANGEBYSCORE_WITHSCORES,   ZRANGEBYSCORE :typeof ZRANGEBYSCORE,   zRangeByScore :typeof ZRANGEBYSCORE,   ZRANGESTORE :typeof ZRANGESTORE,   zRangeStore :typeof ZRANGESTORE,   ZRANK :typeof ZRANK,   zRank :typeof ZRANK,   ZREM :typeof ZREM,   zRem :typeof ZREM,   ZREMRANGEBYLEX :typeof ZREMRANGEBYLEX,   zRemRangeByLex :typeof ZREMRANGEBYLEX,   ZREMRANGEBYRANK :typeof ZREMRANGEBYRANK,   zRemRangeByRank :typeof ZREMRANGEBYRANK,   ZREMRANGEBYSCORE :typeof ZREMRANGEBYSCORE,   zRemRangeByScore :typeof ZREMRANGEBYSCORE,   ZREVRANK :typeof ZREVRANK,   zRevRank :typeof ZREVRANK,   ZSCAN :typeof ZSCAN,   zScan :typeof ZSCAN,   ZSCORE :typeof ZSCORE,   zScore :typeof ZSCORE,   ZUNION_WITHSCORES :typeof ZUNION_WITHSCORES,   zUnionWithScores :typeof ZUNION_WITHSCORES,   ZUNION :typeof ZUNION,   zUnion :typeof ZUNION,   ZUNIONSTORE :typeof ZUNIONSTORE,   zUnionStore :typeof ZUNIONSTORE}[P], M, F, S>} */
  trait WithCommands[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    @JSName("APPEND")
    var APPEND_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("APPEND")
    def APPEND_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BITCOUNT")
    var BITCOUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BITCOUNT")
    def BITCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BITFIELD")
    var BITFIELD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("BITFIELD_RO")
    var BITFIELD_RO_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BITFIELD_RO")
    def BITFIELD_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BITFIELD")
    def BITFIELD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BITOP")
    var BITOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BITOP")
    def BITOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BITPOS")
    var BITPOS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BITPOS")
    def BITPOS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BLMOVE")
    var BLMOVE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BLMOVE")
    def BLMOVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BLMPOP")
    var BLMPOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BLMPOP")
    def BLMPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BLPOP")
    var BLPOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BLPOP")
    def BLPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BRPOPLPUSH")
    var BRPOPLPUSH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BRPOPLPUSH")
    def BRPOPLPUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BRPOP")
    var BRPOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BRPOP")
    def BRPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BZMPOP")
    var BZMPOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BZMPOP")
    def BZMPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BZPOPMAX")
    var BZPOPMAX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BZPOPMAX")
    def BZPOPMAX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("BZPOPMIN")
    var BZPOPMIN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BZPOPMIN")
    def BZPOPMIN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("COPY")
    var COPY_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("COPY")
    def COPY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("DECRBY")
    var DECRBY_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DECRBY")
    def DECRBY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("DECR")
    var DECR_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DECR")
    def DECR_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("DEL")
    var DEL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DEL")
    def DEL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("DUMP")
    var DUMP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DUMP")
    def DUMP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("EVALSHA")
    var EVALSHA_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("EVALSHA_RO")
    var EVALSHA_RO_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EVALSHA_RO")
    def EVALSHA_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("EVALSHA")
    def EVALSHA_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("EVAL")
    var EVAL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("EVAL_RO")
    var EVAL_RO_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EVAL_RO")
    def EVAL_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("EVAL")
    def EVAL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("EXISTS")
    var EXISTS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EXISTS")
    def EXISTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("EXPIREAT")
    var EXPIREAT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EXPIREAT")
    def EXPIREAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("EXPIRETIME")
    var EXPIRETIME_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EXPIRETIME")
    def EXPIRETIME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("EXPIRE")
    var EXPIRE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EXPIRE")
    def EXPIRE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("FCALL")
    var FCALL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("FCALL_RO")
    var FCALL_RO_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FCALL_RO")
    def FCALL_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("FCALL")
    def FCALL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEOADD")
    var GEOADD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOADD")
    def GEOADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEODIST")
    var GEODIST_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEODIST")
    def GEODIST_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEOHASH")
    var GEOHASH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOHASH")
    def GEOHASH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEOPOS")
    var GEOPOS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOPOS")
    def GEOPOS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBERSTORE")
    var GEORADIUSBYMEMBERSTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUSBYMEMBERSTORE")
    def GEORADIUSBYMEMBERSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBER")
    var GEORADIUSBYMEMBER_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEORADIUSBYMEMBER_RO")
    var GEORADIUSBYMEMBER_RO_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEORADIUSBYMEMBER_RO_WITH")
    var GEORADIUSBYMEMBER_RO_WITH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUSBYMEMBER_RO_WITH")
    def GEORADIUSBYMEMBER_RO_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBER_RO")
    def GEORADIUSBYMEMBER_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBER_WITH")
    var GEORADIUSBYMEMBER_WITH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUSBYMEMBER_WITH")
    def GEORADIUSBYMEMBER_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBER")
    def GEORADIUSBYMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSSTORE")
    var GEORADIUSSTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUSSTORE")
    def GEORADIUSSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUS")
    var GEORADIUS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEORADIUS_RO")
    var GEORADIUS_RO_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEORADIUS_RO_WITH")
    var GEORADIUS_RO_WITH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUS_RO_WITH")
    def GEORADIUS_RO_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUS_RO")
    def GEORADIUS_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUS_WITH")
    var GEORADIUS_WITH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUS_WITH")
    def GEORADIUS_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEORADIUS")
    def GEORADIUS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEOSEARCHSTORE")
    var GEOSEARCHSTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOSEARCHSTORE")
    def GEOSEARCHSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEOSEARCH")
    var GEOSEARCH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEOSEARCH_WITH")
    var GEOSEARCH_WITH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOSEARCH_WITH")
    def GEOSEARCH_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GEOSEARCH")
    def GEOSEARCH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GETBIT")
    var GETBIT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETBIT")
    def GETBIT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GETDEL")
    var GETDEL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETDEL")
    def GETDEL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GETEX")
    var GETEX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETEX")
    def GETEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GETRANGE")
    var GETRANGE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETRANGE")
    def GETRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GETSET")
    var GETSET_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETSET")
    def GETSET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("GET")
    var GET_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GET")
    def GET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HDEL")
    var HDEL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HDEL")
    def HDEL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HEXISTS")
    var HEXISTS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HEXISTS")
    def HEXISTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HGETALL")
    var HGETALL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HGETALL")
    def HGETALL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HGET")
    var HGET_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HGET")
    def HGET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HINCRBYFLOAT")
    var HINCRBYFLOAT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HINCRBYFLOAT")
    def HINCRBYFLOAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HINCRBY")
    var HINCRBY_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HINCRBY")
    def HINCRBY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HKEYS")
    var HKEYS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HKEYS")
    def HKEYS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HLEN")
    var HLEN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HLEN")
    def HLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HMGET")
    var HMGET_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HMGET")
    def HMGET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HRANDFIELD_COUNT")
    var HRANDFIELD_COUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("HRANDFIELD_COUNT_WITHVALUES")
    var HRANDFIELD_COUNT_WITHVALUES_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HRANDFIELD_COUNT_WITHVALUES")
    def HRANDFIELD_COUNT_WITHVALUES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HRANDFIELD_COUNT")
    def HRANDFIELD_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HRANDFIELD")
    var HRANDFIELD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HRANDFIELD")
    def HRANDFIELD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HSCAN")
    var HSCAN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HSCAN")
    def HSCAN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HSETNX")
    var HSETNX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HSETNX")
    def HSETNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HSET")
    var HSET_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HSET")
    def HSET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HSTRLEN")
    var HSTRLEN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HSTRLEN")
    def HSTRLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("HVALS")
    var HVALS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HVALS")
    def HVALS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("INCRBYFLOAT")
    var INCRBYFLOAT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("INCRBYFLOAT")
    def INCRBYFLOAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("INCRBY")
    var INCRBY_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("INCRBY")
    def INCRBY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("INCR")
    var INCR_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("INCR")
    def INCR_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LCS_IDX")
    var LCS_IDX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("LCS_IDX_WITHMATCHLEN")
    var LCS_IDX_WITHMATCHLEN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LCS_IDX_WITHMATCHLEN")
    def LCS_IDX_WITHMATCHLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LCS_IDX")
    def LCS_IDX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LCS_LEN")
    var LCS_LEN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LCS_LEN")
    def LCS_LEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LCS")
    var LCS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LCS")
    def LCS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LINDEX")
    var LINDEX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LINDEX")
    def LINDEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LINSERT")
    var LINSERT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LINSERT")
    def LINSERT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LLEN")
    var LLEN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LLEN")
    def LLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LMOVE")
    var LMOVE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LMOVE")
    def LMOVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LMPOP")
    var LMPOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LMPOP")
    def LMPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LPOP_COUNT")
    var LPOP_COUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPOP_COUNT")
    def LPOP_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LPOP")
    var LPOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPOP")
    def LPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LPOS_COUNT")
    var LPOS_COUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPOS_COUNT")
    def LPOS_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LPOS")
    var LPOS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPOS")
    def LPOS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LPUSHX")
    var LPUSHX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPUSHX")
    def LPUSHX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LPUSH")
    var LPUSH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPUSH")
    def LPUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LRANGE")
    var LRANGE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LRANGE")
    def LRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LREM")
    var LREM_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LREM")
    def LREM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LSET")
    var LSET_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LSET")
    def LSET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("LTRIM")
    var LTRIM_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LTRIM")
    def LTRIM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("MGET")
    var MGET_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MGET")
    def MGET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("MIGRATE")
    var MIGRATE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MIGRATE")
    def MIGRATE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("MSETNX")
    var MSETNX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MSETNX")
    def MSETNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("MSET")
    var MSET_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MSET")
    def MSET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("OBJECT_ENCODING")
    var OBJECT_ENCODING_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("OBJECT_ENCODING")
    def OBJECT_ENCODING_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("OBJECT_FREQ")
    var OBJECT_FREQ_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("OBJECT_FREQ")
    def OBJECT_FREQ_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("OBJECT_IDLETIME")
    var OBJECT_IDLETIME_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("OBJECT_IDLETIME")
    def OBJECT_IDLETIME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("OBJECT_REFCOUNT")
    var OBJECT_REFCOUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("OBJECT_REFCOUNT")
    def OBJECT_REFCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PERSIST")
    var PERSIST_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PERSIST")
    def PERSIST_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PEXPIREAT")
    var PEXPIREAT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PEXPIREAT")
    def PEXPIREAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PEXPIRETIME")
    var PEXPIRETIME_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PEXPIRETIME")
    def PEXPIRETIME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PEXPIRE")
    var PEXPIRE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PEXPIRE")
    def PEXPIRE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PFADD")
    var PFADD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PFADD")
    def PFADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PFCOUNT")
    var PFCOUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PFCOUNT")
    def PFCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PFMERGE")
    var PFMERGE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PFMERGE")
    def PFMERGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PSETEX")
    var PSETEX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PSETEX")
    def PSETEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PTTL")
    var PTTL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PTTL")
    def PTTL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("PUBLISH")
    var PUBLISH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PUBLISH")
    def PUBLISH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("RENAMENX")
    var RENAMENX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RENAMENX")
    def RENAMENX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("RENAME")
    var RENAME_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RENAME")
    def RENAME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("RPOPLPUSH")
    var RPOPLPUSH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPOPLPUSH")
    def RPOPLPUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("RPOP_COUNT")
    var RPOP_COUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPOP_COUNT")
    def RPOP_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("RPOP")
    var RPOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPOP")
    def RPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("RPUSHX")
    var RPUSHX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPUSHX")
    def RPUSHX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("RPUSH")
    var RPUSH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPUSH")
    def RPUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SADD")
    var SADD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SADD")
    def SADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SCARD")
    var SCARD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SCARD")
    def SCARD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SDIFFSTORE")
    var SDIFFSTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SDIFFSTORE")
    def SDIFFSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SDIFF")
    var SDIFF_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SDIFF")
    def SDIFF_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SETBIT")
    var SETBIT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SETBIT")
    def SETBIT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SETEX")
    var SETEX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SETEX")
    def SETEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SETNX")
    var SETNX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SETNX")
    def SETNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SETRANGE")
    var SETRANGE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SETRANGE")
    def SETRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SET")
    var SET_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SET")
    def SET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SINTERCARD")
    var SINTERCARD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SINTERCARD")
    def SINTERCARD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SINTERSTORE")
    var SINTERSTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SINTERSTORE")
    def SINTERSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SINTER")
    var SINTER_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SINTER")
    def SINTER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SISMEMBER")
    var SISMEMBER_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SISMEMBER")
    def SISMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SMEMBERS")
    var SMEMBERS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SMEMBERS")
    def SMEMBERS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SMISMEMBER")
    var SMISMEMBER_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SMISMEMBER")
    def SMISMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SMOVE")
    var SMOVE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SMOVE")
    def SMOVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SORT")
    var SORT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("SORT_RO")
    var SORT_RO_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SORT_RO")
    def SORT_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SORT_STORE")
    var SORT_STORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SORT_STORE")
    def SORT_STORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SORT")
    def SORT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SPOP")
    var SPOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SPOP")
    def SPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SRANDMEMBER_COUNT")
    var SRANDMEMBER_COUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SRANDMEMBER_COUNT")
    def SRANDMEMBER_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SRANDMEMBER")
    var SRANDMEMBER_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SRANDMEMBER")
    def SRANDMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SREM")
    var SREM_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SREM")
    def SREM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SSCAN")
    var SSCAN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SSCAN")
    def SSCAN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("STRLEN")
    var STRLEN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("STRLEN")
    def STRLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SUNIONSTORE")
    var SUNIONSTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SUNIONSTORE")
    def SUNIONSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("SUNION")
    var SUNION_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SUNION")
    def SUNION_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("TOUCH")
    var TOUCH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("TOUCH")
    def TOUCH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("TTL")
    var TTL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("TTL")
    def TTL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("TYPE")
    var TYPE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("TYPE")
    def TYPE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("UNLINK")
    var UNLINK_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("UNLINK")
    def UNLINK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("WATCH")
    var WATCH_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("WATCH")
    def WATCH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XACK")
    var XACK_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XACK")
    def XACK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XADD")
    var XADD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XADD")
    def XADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XAUTOCLAIM_JUSTID")
    var XAUTOCLAIM_JUSTID_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XAUTOCLAIM_JUSTID")
    def XAUTOCLAIM_JUSTID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XAUTOCLAIM")
    var XAUTOCLAIM_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XAUTOCLAIM")
    def XAUTOCLAIM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XCLAIM_JUSTID")
    var XCLAIM_JUSTID_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XCLAIM_JUSTID")
    def XCLAIM_JUSTID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XCLAIM")
    var XCLAIM_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XCLAIM")
    def XCLAIM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XDEL")
    var XDEL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XDEL")
    def XDEL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XGROUP_CREATECONSUMER")
    var XGROUP_CREATECONSUMER_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_CREATECONSUMER")
    def XGROUP_CREATECONSUMER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XGROUP_CREATE")
    var XGROUP_CREATE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_CREATE")
    def XGROUP_CREATE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XGROUP_DELCONSUMER")
    var XGROUP_DELCONSUMER_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_DELCONSUMER")
    def XGROUP_DELCONSUMER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XGROUP_DESTROY")
    var XGROUP_DESTROY_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_DESTROY")
    def XGROUP_DESTROY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XGROUP_SETID")
    var XGROUP_SETID_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_SETID")
    def XGROUP_SETID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XINFO_CONSUMERS")
    var XINFO_CONSUMERS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XINFO_CONSUMERS")
    def XINFO_CONSUMERS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XINFO_GROUPS")
    var XINFO_GROUPS_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XINFO_GROUPS")
    def XINFO_GROUPS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XINFO_STREAM")
    var XINFO_STREAM_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XINFO_STREAM")
    def XINFO_STREAM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XLEN")
    var XLEN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XLEN")
    def XLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XPENDING")
    var XPENDING_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("XPENDING_RANGE")
    var XPENDING_RANGE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XPENDING_RANGE")
    def XPENDING_RANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XPENDING")
    def XPENDING_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XRANGE")
    var XRANGE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XRANGE")
    def XRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XREADGROUP")
    var XREADGROUP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XREADGROUP")
    def XREADGROUP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XREAD")
    var XREAD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XREAD")
    def XREAD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XREVRANGE")
    var XREVRANGE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XREVRANGE")
    def XREVRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XSETID")
    var XSETID_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XSETID")
    def XSETID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("XTRIM")
    var XTRIM_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XTRIM")
    def XTRIM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZADD")
    var ZADD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZADD")
    def ZADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZCARD")
    var ZCARD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZCARD")
    def ZCARD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZCOUNT")
    var ZCOUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZCOUNT")
    def ZCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZDIFFSTORE")
    var ZDIFFSTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZDIFFSTORE")
    def ZDIFFSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZDIFF")
    var ZDIFF_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZDIFF_WITHSCORES")
    var ZDIFF_WITHSCORES_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZDIFF_WITHSCORES")
    def ZDIFF_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZDIFF")
    def ZDIFF_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZINCRBY")
    var ZINCRBY_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZINCRBY")
    def ZINCRBY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZINTERCARD")
    var ZINTERCARD_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZINTERCARD")
    def ZINTERCARD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZINTERSTORE")
    var ZINTERSTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZINTERSTORE")
    def ZINTERSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZINTER")
    var ZINTER_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZINTER_WITHSCORES")
    var ZINTER_WITHSCORES_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZINTER_WITHSCORES")
    def ZINTER_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZINTER")
    def ZINTER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZLEXCOUNT")
    var ZLEXCOUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZLEXCOUNT")
    def ZLEXCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZMPOP")
    var ZMPOP_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZMPOP")
    def ZMPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZMSCORE")
    var ZMSCORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZMSCORE")
    def ZMSCORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZPOPMAX_COUNT")
    var ZPOPMAX_COUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZPOPMAX_COUNT")
    def ZPOPMAX_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZPOPMAX")
    var ZPOPMAX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZPOPMAX")
    def ZPOPMAX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZPOPMIN_COUNT")
    var ZPOPMIN_COUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZPOPMIN_COUNT")
    def ZPOPMIN_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZPOPMIN")
    var ZPOPMIN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZPOPMIN")
    def ZPOPMIN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANDMEMBER_COUNT")
    var ZRANDMEMBER_COUNT_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZRANDMEMBER_COUNT_WITHSCORES")
    var ZRANDMEMBER_COUNT_WITHSCORES_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANDMEMBER_COUNT_WITHSCORES")
    def ZRANDMEMBER_COUNT_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANDMEMBER_COUNT")
    def ZRANDMEMBER_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANDMEMBER")
    var ZRANDMEMBER_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANDMEMBER")
    def ZRANDMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANGEBYLEX")
    var ZRANGEBYLEX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANGEBYLEX")
    def ZRANGEBYLEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANGEBYSCORE")
    var ZRANGEBYSCORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZRANGEBYSCORE_WITHSCORES")
    var ZRANGEBYSCORE_WITHSCORES_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANGEBYSCORE_WITHSCORES")
    def ZRANGEBYSCORE_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANGEBYSCORE")
    def ZRANGEBYSCORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANGESTORE")
    var ZRANGESTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANGESTORE")
    def ZRANGESTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANGE")
    var ZRANGE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZRANGE_WITHSCORES")
    var ZRANGE_WITHSCORES_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANGE_WITHSCORES")
    def ZRANGE_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANGE")
    def ZRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZRANK")
    var ZRANK_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANK")
    def ZRANK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZREMRANGEBYLEX")
    var ZREMRANGEBYLEX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREMRANGEBYLEX")
    def ZREMRANGEBYLEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZREMRANGEBYRANK")
    var ZREMRANGEBYRANK_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREMRANGEBYRANK")
    def ZREMRANGEBYRANK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZREMRANGEBYSCORE")
    var ZREMRANGEBYSCORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREMRANGEBYSCORE")
    def ZREMRANGEBYSCORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZREM")
    var ZREM_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREM")
    def ZREM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZREVRANK")
    var ZREVRANK_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREVRANK")
    def ZREVRANK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZSCAN")
    var ZSCAN_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZSCAN")
    def ZSCAN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZSCORE")
    var ZSCORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZSCORE")
    def ZSCORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZUNIONSTORE")
    var ZUNIONSTORE_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZUNIONSTORE")
    def ZUNIONSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZUNION")
    var ZUNION_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZUNION_WITHSCORES")
    var ZUNION_WITHSCORES_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZUNION_WITHSCORES")
    def ZUNION_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ZUNION")
    def ZUNION_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("append")
    var append_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("append")
    def append_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof APPEND['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("bitCount")
    var bitCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitCount")
    def bitCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("bitFieldRo")
    var bitFieldRo_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitFieldRo")
    def bitFieldRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("bitField")
    var bitField_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitField")
    def bitField_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITFIELD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("bitOp")
    var bitOp_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitOp")
    def bitOp_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("bitPos")
    var bitPos_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitPos")
    def bitPos_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BITPOS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("blMove")
    var blMove_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("blMove")
    def blMove_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("blPop")
    var blPop_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("blPop")
    def blPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("blmPop")
    var blmPop_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("blmPop")
    def blmPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BLMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("brPopLPush")
    var brPopLPush_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("brPopLPush")
    def brPopLPush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("brPop")
    var brPop_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("brPop")
    def brPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BRPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("bzPopMax")
    var bzPopMax_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bzPopMax")
    def bzPopMax_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMAX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("bzPopMin")
    var bzPopMin_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bzPopMin")
    def bzPopMin_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZPOPMIN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("bzmPop")
    var bzmPop_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bzmPop")
    def bzmPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BZMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("copy")
    var copy_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("copy")
    def copy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COPY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("decrBy")
    var decrBy_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("decrBy")
    def decrBy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECRBY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("decr")
    var decr_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("decr")
    def decr_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DECR['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("del")
    var del_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("del")
    def del_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DEL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("dump")
    var dump_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("dump")
    def dump_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DUMP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("evalRo")
    var evalRo_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("evalRo")
    def evalRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("evalShaRo")
    var evalShaRo_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("evalShaRo")
    def evalShaRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("evalSha")
    var evalSha_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("evalSha")
    def evalSha_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVALSHA['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("eval")
    var eval_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("eval")
    def eval_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EVAL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("exists")
    var exists_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("exists")
    def exists_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("expireAt")
    var expireAt_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("expireAt")
    def expireAt_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIREAT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("expireTime")
    var expireTime_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("expireTime")
    def expireTime_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRETIME['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("expire")
    var expire_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("expire")
    def expire_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EXPIRE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("fCallRo")
    var fCallRo_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("fCallRo")
    def fCallRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("fCall")
    var fCall_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("fCall")
    def fCall_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FCALL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoAdd")
    var geoAdd_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoAdd")
    def geoAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoDist")
    var geoDist_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoDist")
    def geoDist_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEODIST['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoHash")
    var geoHash_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoHash")
    def geoHash_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOHASH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoPos")
    var geoPos_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoPos")
    def geoPos_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOPOS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMemberRoWith")
    var geoRadiusByMemberRoWith_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMemberRoWith")
    def geoRadiusByMemberRoWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMemberRo")
    var geoRadiusByMemberRo_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMemberRo")
    def geoRadiusByMemberRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMemberStore")
    var geoRadiusByMemberStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMemberStore")
    def geoRadiusByMemberStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMemberWith")
    var geoRadiusByMemberWith_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMemberWith")
    def geoRadiusByMemberWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMember")
    var geoRadiusByMember_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMember")
    def geoRadiusByMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSBYMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadiusRoWith")
    var geoRadiusRoWith_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusRoWith")
    def geoRadiusRoWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadiusRo")
    var geoRadiusRo_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusRo")
    def geoRadiusRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadiusStore")
    var geoRadiusStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusStore")
    def geoRadiusStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUSSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadiusWith")
    var geoRadiusWith_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusWith")
    def geoRadiusWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoRadius")
    var geoRadius_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadius")
    def geoRadius_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEORADIUS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoSearchStore")
    var geoSearchStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoSearchStore")
    def geoSearchStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCHSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoSearchWith")
    var geoSearchWith_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoSearchWith")
    def geoSearchWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("geoSearch")
    var geoSearch_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoSearch")
    def geoSearch_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GEOSEARCH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("getBit")
    var getBit_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getBit")
    def getBit_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETBIT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("getDel")
    var getDel_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getDel")
    def getDel_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETDEL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("getEx")
    var getEx_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getEx")
    def getEx_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("getRange")
    var getRange_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getRange")
    def getRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("getSet")
    var getSet_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getSet")
    def getSet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GETSET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("get")
    var get_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof GET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("get")
    def get_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof GET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hDel")
    var hDel_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hDel")
    def hDel_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HDEL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hExists")
    var hExists_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hExists")
    def hExists_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HEXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hGetAll")
    var hGetAll_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hGetAll")
    def hGetAll_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGETALL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hGet")
    var hGet_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hGet")
    def hGet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HGET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hIncrByFloat")
    var hIncrByFloat_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hIncrByFloat")
    def hIncrByFloat_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hIncrBy")
    var hIncrBy_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hIncrBy")
    def hIncrBy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HINCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hKeys")
    var hKeys_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hKeys")
    def hKeys_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HKEYS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hLen")
    var hLen_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hLen")
    def hLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hRandFieldCountWithValues")
    var hRandFieldCountWithValues_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hRandFieldCountWithValues")
    def hRandFieldCountWithValues_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hRandFieldCount")
    var hRandFieldCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hRandFieldCount")
    def hRandFieldCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hRandField")
    var hRandField_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hRandField")
    def hRandField_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HRANDFIELD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hScan")
    var hScan_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hScan")
    def hScan_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hSetNX")
    var hSetNX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hSetNX")
    def hSetNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSETNX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hSet")
    var hSet_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hSet")
    def hSet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hStrLen")
    var hStrLen_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hStrLen")
    def hStrLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HSTRLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hVals")
    var hVals_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hVals")
    def hVals_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HVALS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("hmGet")
    var hmGet_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hmGet")
    def hmGet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HMGET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("incrByFloat")
    var incrByFloat_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("incrByFloat")
    def incrByFloat_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("incrBy")
    var incrBy_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("incrBy")
    def incrBy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("incr")
    var incr_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("incr")
    def incr_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INCR['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lIndex")
    var lIndex_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lIndex")
    def lIndex_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINDEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lInsert")
    var lInsert_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lInsert")
    def lInsert_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LINSERT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lLen")
    var lLen_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lLen")
    def lLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lMove")
    var lMove_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lMove")
    def lMove_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lPopCount")
    var lPopCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPopCount")
    def lPopCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lPop")
    var lPop_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPop")
    def lPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lPosCount")
    var lPosCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPosCount")
    def lPosCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lPos")
    var lPos_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPos")
    def lPos_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPOS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lPushX")
    var lPushX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPushX")
    def lPushX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSHX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lPush")
    var lPush_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPush")
    def lPush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lRange")
    var lRange_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lRange")
    def lRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lRem")
    var lRem_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lRem")
    def lRem_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LREM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lSet")
    var lSet_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lSet")
    def lSet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LSET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lTrim")
    var lTrim_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lTrim")
    def lTrim_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LTRIM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lcsIdxWithMatchLen")
    var lcsIdxWithMatchLen_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lcsIdxWithMatchLen")
    def lcsIdxWithMatchLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lcsIdx")
    var lcsIdx_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lcsIdx")
    def lcsIdx_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_IDX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lcsLen")
    var lcsLen_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lcsLen")
    def lcsLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS_LEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lcs")
    var lcs_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lcs")
    def lcs_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LCS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("lmPop")
    var lmPop_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lmPop")
    def lmPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("mGet")
    var mGet_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("mGet")
    def mGet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MGET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("mSetNX")
    var mSetNX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("mSetNX")
    def mSetNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSETNX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("mSet")
    var mSet_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("mSet")
    def mSet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MSET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("migrate")
    var migrate_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("migrate")
    def migrate_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MIGRATE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("objectEncoding")
    var objectEncoding_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("objectEncoding")
    def objectEncoding_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_ENCODING['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("objectFreq")
    var objectFreq_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("objectFreq")
    def objectFreq_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_FREQ['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("objectIdleTime")
    var objectIdleTime_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("objectIdleTime")
    def objectIdleTime_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_IDLETIME['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("objectRefCount")
    var objectRefCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("objectRefCount")
    def objectRefCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof OBJECT_REFCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("pExpireAt")
    var pExpireAt_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pExpireAt")
    def pExpireAt_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIREAT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("pExpireTime")
    var pExpireTime_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pExpireTime")
    def pExpireTime_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRETIME['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("pExpire")
    var pExpire_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pExpire")
    def pExpire_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PEXPIRE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("pSetEx")
    var pSetEx_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pSetEx")
    def pSetEx_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PSETEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("pTTL")
    var pTTL_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pTTL")
    def pTTL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PTTL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("persist")
    var persist_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("persist")
    def persist_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PERSIST['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("pfAdd")
    var pfAdd_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pfAdd")
    def pfAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("pfCount")
    var pfCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pfCount")
    def pfCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("pfMerge")
    var pfMerge_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pfMerge")
    def pfMerge_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PFMERGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("publish")
    var publish_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("publish")
    def publish_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBLISH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("rPopCount")
    var rPopCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPopCount")
    def rPopCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("rPopLPush")
    var rPopLPush_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPopLPush")
    def rPopLPush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("rPop")
    var rPop_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPop")
    def rPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("rPushX")
    var rPushX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPushX")
    def rPushX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSHX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("rPush")
    var rPush_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPush")
    def rPush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("renameNX")
    var renameNX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("renameNX")
    def renameNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAMENX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("rename")
    var rename_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rename")
    def rename_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RENAME['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sAdd")
    var sAdd_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sAdd")
    def sAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sCard")
    var sCard_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sCard")
    def sCard_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCARD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sDiffStore")
    var sDiffStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sDiffStore")
    def sDiffStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sDiff")
    var sDiff_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sDiff")
    def sDiff_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SDIFF['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sInterCard")
    var sInterCard_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sInterCard")
    def sInterCard_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERCARD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sInterStore")
    var sInterStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sInterStore")
    def sInterStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sInter")
    var sInter_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sInter")
    def sInter_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SINTER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sIsMember")
    var sIsMember_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sIsMember")
    def sIsMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SISMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sMembers")
    var sMembers_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sMembers")
    def sMembers_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMEMBERS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sMove")
    var sMove_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sMove")
    def sMove_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sPop")
    var sPop_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sPop")
    def sPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sRandMemberCount")
    var sRandMemberCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sRandMemberCount")
    def sRandMemberCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sRandMember")
    var sRandMember_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sRandMember")
    def sRandMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sRem")
    var sRem_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sRem")
    def sRem_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SREM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sScan")
    var sScan_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sScan")
    def sScan_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sUnionStore")
    var sUnionStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sUnionStore")
    def sUnionStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sUnion")
    var sUnion_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sUnion")
    def sUnion_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SUNION['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("setBit")
    var setBit_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("setBit")
    def setBit_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETBIT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("setEx")
    var setEx_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("setEx")
    def setEx_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("setNX")
    var setNX_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("setNX")
    def setNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETNX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("setRange")
    var setRange_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("setRange")
    def setRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SETRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("set")
    var set_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("set")
    def set_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SET['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("smIsMember")
    var smIsMember_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("smIsMember")
    def smIsMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SMISMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sortRo")
    var sortRo_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sortRo")
    def sortRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_RO['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sortStore")
    var sortStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sortStore")
    def sortStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT_STORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("sort")
    var sort_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sort")
    def sort_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SORT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("strLen")
    var strLen_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("strLen")
    def strLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof STRLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("touch")
    var touch_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("touch")
    def touch_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TOUCH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("ttl")
    var ttl_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ttl")
    def ttl_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TTL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("type")
    var type_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("type")
    def type_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TYPE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("unlink")
    var unlink_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("unlink")
    def unlink_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UNLINK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("watch")
    var watch_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("watch")
    def watch_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof WATCH['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xAck")
    var xAck_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xAck")
    def xAck_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XACK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xAdd")
    var xAdd_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xAdd")
    def xAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xAutoClaimJustId")
    var xAutoClaimJustId_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xAutoClaimJustId")
    def xAutoClaimJustId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xAutoClaim")
    var xAutoClaim_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xAutoClaim")
    def xAutoClaim_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XAUTOCLAIM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xClaimJustId")
    var xClaimJustId_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xClaimJustId")
    def xClaimJustId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xClaim")
    var xClaim_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xClaim")
    def xClaim_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XCLAIM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xDel")
    var xDel_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xDel")
    def xDel_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XDEL['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xGroupCreateConsumer")
    var xGroupCreateConsumer_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupCreateConsumer")
    def xGroupCreateConsumer_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xGroupCreate")
    var xGroupCreate_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupCreate")
    def xGroupCreate_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_CREATE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xGroupDelConsumer")
    var xGroupDelConsumer_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupDelConsumer")
    def xGroupDelConsumer_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DELCONSUMER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xGroupDestroy")
    var xGroupDestroy_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupDestroy")
    def xGroupDestroy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_DESTROY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xGroupSetId")
    var xGroupSetId_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupSetId")
    def xGroupSetId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XGROUP_SETID['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xInfoConsumers")
    var xInfoConsumers_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xInfoConsumers")
    def xInfoConsumers_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_CONSUMERS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xInfoGroups")
    var xInfoGroups_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xInfoGroups")
    def xInfoGroups_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_GROUPS['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xInfoStream")
    var xInfoStream_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xInfoStream")
    def xInfoStream_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XINFO_STREAM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xLen")
    var xLen_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xLen")
    def xLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XLEN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xPendingRange")
    var xPendingRange_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xPendingRange")
    def xPendingRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING_RANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xPending")
    var xPending_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xPending")
    def xPending_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XPENDING['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xRange")
    var xRange_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xRange")
    def xRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xReadGroup")
    var xReadGroup_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xReadGroup")
    def xReadGroup_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREADGROUP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xRead")
    var xRead_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xRead")
    def xRead_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREAD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xRevRange")
    var xRevRange_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xRevRange")
    def xRevRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XREVRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xSetId")
    var xSetId_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xSetId")
    def xSetId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XSETID['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("xTrim")
    var xTrim_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xTrim")
    def xTrim_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof XTRIM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zAdd")
    var zAdd_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zAdd")
    def zAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZADD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zCard")
    var zCard_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zCard")
    def zCard_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCARD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zCount")
    var zCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zCount")
    def zCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zDiffStore")
    var zDiffStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zDiffStore")
    def zDiffStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zDiffWithScores")
    var zDiffWithScores_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zDiffWithScores")
    def zDiffWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zDiff")
    var zDiff_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zDiff")
    def zDiff_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZDIFF['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zIncrBy")
    var zIncrBy_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zIncrBy")
    def zIncrBy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zInterCard")
    var zInterCard_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zInterCard")
    def zInterCard_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERCARD['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zInterStore")
    var zInterStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zInterStore")
    def zInterStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zInterWithScores")
    var zInterWithScores_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zInterWithScores")
    def zInterWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zInter")
    var zInter_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zInter")
    def zInter_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZINTER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zLexCount")
    var zLexCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zLexCount")
    def zLexCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZLEXCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zPopMaxCount")
    var zPopMaxCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zPopMaxCount")
    def zPopMaxCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zPopMax")
    var zPopMax_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zPopMax")
    def zPopMax_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMAX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zPopMinCount")
    var zPopMinCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zPopMinCount")
    def zPopMinCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zPopMin")
    var zPopMin_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zPopMin")
    def zPopMin_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZPOPMIN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRandMemberCountWithScores")
    var zRandMemberCountWithScores_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRandMemberCountWithScores")
    def zRandMemberCountWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRandMemberCount")
    var zRandMemberCount_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRandMemberCount")
    def zRandMemberCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRandMember")
    var zRandMember_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRandMember")
    def zRandMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRangeByLex")
    var zRangeByLex_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeByLex")
    def zRangeByLex_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRangeByScoreWithScores")
    var zRangeByScoreWithScores_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeByScoreWithScores")
    def zRangeByScoreWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRangeByScore")
    var zRangeByScore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeByScore")
    def zRangeByScore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRangeStore")
    var zRangeStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeStore")
    def zRangeStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGESTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRangeWithScores")
    var zRangeWithScores_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeWithScores")
    def zRangeWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRange")
    var zRange_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRange")
    def zRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRank")
    var zRank_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRank")
    def zRank_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZRANK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRemRangeByLex")
    var zRemRangeByLex_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRemRangeByLex")
    def zRemRangeByLex_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRemRangeByRank")
    var zRemRangeByRank_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRemRangeByRank")
    def zRemRangeByRank_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYRANK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRemRangeByScore")
    var zRemRangeByScore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRemRangeByScore")
    def zRemRangeByScore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREMRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRem")
    var zRem_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRem")
    def zRem_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREM['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zRevRank")
    var zRevRank_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRevRank")
    def zRevRank_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZREVRANK['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zScan")
    var zScan_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zScan")
    def zScan_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zScore")
    var zScore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zScore")
    def zScore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zUnionStore")
    var zUnionStore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zUnionStore")
    def zUnionStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zUnionWithScores")
    var zUnionWithScores_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zUnionWithScores")
    def zUnionWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zUnion")
    var zUnion_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zUnion")
    def zUnion_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZUNION['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zmPop")
    var zmPop_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zmPop")
    def zmPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
    
    @JSName("zmScore")
    var zmScore_Original: RedisClusterMultiCommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zmScore")
    def zmScore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ZMSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClusterMultiCommandType[M, F, S]
  }
  object WithCommands {
    
    extension [Self <: WithCommands[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](x: Self & (WithCommands[M, F, S])) {
      
      inline def setAPPEND(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "APPEND", js.Any.fromFunction1(value))
      
      inline def setBITCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITCOUNT", js.Any.fromFunction1(value))
      
      inline def setBITFIELD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITFIELD", js.Any.fromFunction1(value))
      
      inline def setBITFIELD_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITFIELD_RO", js.Any.fromFunction1(value))
      
      inline def setBITOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITOP", js.Any.fromFunction1(value))
      
      inline def setBITPOS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITPOS", js.Any.fromFunction1(value))
      
      inline def setBLMOVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BLMOVE", js.Any.fromFunction1(value))
      
      inline def setBLMPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BLMPOP", js.Any.fromFunction1(value))
      
      inline def setBLPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BLPOP", js.Any.fromFunction1(value))
      
      inline def setBRPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BRPOP", js.Any.fromFunction1(value))
      
      inline def setBRPOPLPUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BRPOPLPUSH", js.Any.fromFunction1(value))
      
      inline def setBZMPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BZMPOP", js.Any.fromFunction1(value))
      
      inline def setBZPOPMAX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BZPOPMAX", js.Any.fromFunction1(value))
      
      inline def setBZPOPMIN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BZPOPMIN", js.Any.fromFunction1(value))
      
      inline def setBitFieldRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "bitFieldRo", js.Any.fromFunction1(value))
      
      inline def setCOPY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "COPY", js.Any.fromFunction1(value))
      
      inline def setDECR(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DECR", js.Any.fromFunction1(value))
      
      inline def setDECRBY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DECRBY", js.Any.fromFunction1(value))
      
      inline def setDEL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DEL", js.Any.fromFunction1(value))
      
      inline def setDUMP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DUMP", js.Any.fromFunction1(value))
      
      inline def setEVAL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EVAL", js.Any.fromFunction1(value))
      
      inline def setEVALSHA(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EVALSHA", js.Any.fromFunction1(value))
      
      inline def setEVALSHA_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EVALSHA_RO", js.Any.fromFunction1(value))
      
      inline def setEVAL_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EVAL_RO", js.Any.fromFunction1(value))
      
      inline def setEXISTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EXISTS", js.Any.fromFunction1(value))
      
      inline def setEXPIRE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EXPIRE", js.Any.fromFunction1(value))
      
      inline def setEXPIREAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EXPIREAT", js.Any.fromFunction1(value))
      
      inline def setEXPIRETIME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EXPIRETIME", js.Any.fromFunction1(value))
      
      inline def setEvalRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "evalRo", js.Any.fromFunction1(value))
      
      inline def setEvalShaRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "evalShaRo", js.Any.fromFunction1(value))
      
      inline def setFCALL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FCALL", js.Any.fromFunction1(value))
      
      inline def setFCALL_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FCALL_RO", js.Any.fromFunction1(value))
      
      inline def setFCallRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "fCallRo", js.Any.fromFunction1(value))
      
      inline def setGEOADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOADD", js.Any.fromFunction1(value))
      
      inline def setGEODIST(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEODIST", js.Any.fromFunction1(value))
      
      inline def setGEOHASH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOHASH", js.Any.fromFunction1(value))
      
      inline def setGEOPOS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOPOS", js.Any.fromFunction1(value))
      
      inline def setGEORADIUS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUS", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBERSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBERSTORE", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBER_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER_RO", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBER_RO_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER_RO_WITH", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBER_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER_WITH", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSSTORE", js.Any.fromFunction1(value))
      
      inline def setGEORADIUS_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUS_RO", js.Any.fromFunction1(value))
      
      inline def setGEORADIUS_RO_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUS_RO_WITH", js.Any.fromFunction1(value))
      
      inline def setGEORADIUS_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUS_WITH", js.Any.fromFunction1(value))
      
      inline def setGEOSEARCH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOSEARCH", js.Any.fromFunction1(value))
      
      inline def setGEOSEARCHSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOSEARCHSTORE", js.Any.fromFunction1(value))
      
      inline def setGEOSEARCH_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOSEARCH_WITH", js.Any.fromFunction1(value))
      
      inline def setGET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GET", js.Any.fromFunction1(value))
      
      inline def setGETBIT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETBIT", js.Any.fromFunction1(value))
      
      inline def setGETDEL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETDEL", js.Any.fromFunction1(value))
      
      inline def setGETEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETEX", js.Any.fromFunction1(value))
      
      inline def setGETRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETRANGE", js.Any.fromFunction1(value))
      
      inline def setGETSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETSET", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusByMemberRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusByMemberRo", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusByMemberRoWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusByMemberRoWith", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusByMemberWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusByMemberWith", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusRo", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusRoWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusRoWith", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusWith", js.Any.fromFunction1(value))
      
      inline def setGeoSearchWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoSearchWith", js.Any.fromFunction1(value))
      
      inline def setHDEL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HDEL", js.Any.fromFunction1(value))
      
      inline def setHEXISTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HEXISTS", js.Any.fromFunction1(value))
      
      inline def setHGET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HGET", js.Any.fromFunction1(value))
      
      inline def setHGETALL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HGETALL", js.Any.fromFunction1(value))
      
      inline def setHINCRBY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HINCRBY", js.Any.fromFunction1(value))
      
      inline def setHINCRBYFLOAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HINCRBYFLOAT", js.Any.fromFunction1(value))
      
      inline def setHKEYS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HKEYS", js.Any.fromFunction1(value))
      
      inline def setHLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HLEN", js.Any.fromFunction1(value))
      
      inline def setHMGET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HMGET", js.Any.fromFunction1(value))
      
      inline def setHRANDFIELD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HRANDFIELD", js.Any.fromFunction1(value))
      
      inline def setHRANDFIELD_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HRANDFIELD_COUNT", js.Any.fromFunction1(value))
      
      inline def setHRANDFIELD_COUNT_WITHVALUES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HRANDFIELD_COUNT_WITHVALUES", js.Any.fromFunction1(value))
      
      inline def setHRandFieldCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "hRandFieldCount", js.Any.fromFunction1(value))
      
      inline def setHRandFieldCountWithValues(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "hRandFieldCountWithValues", js.Any.fromFunction1(value))
      
      inline def setHSCAN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HSCAN", js.Any.fromFunction1(value))
      
      inline def setHSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HSET", js.Any.fromFunction1(value))
      
      inline def setHSETNX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HSETNX", js.Any.fromFunction1(value))
      
      inline def setHSTRLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HSTRLEN", js.Any.fromFunction1(value))
      
      inline def setHVALS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HVALS", js.Any.fromFunction1(value))
      
      inline def setINCR(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "INCR", js.Any.fromFunction1(value))
      
      inline def setINCRBY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "INCRBY", js.Any.fromFunction1(value))
      
      inline def setINCRBYFLOAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "INCRBYFLOAT", js.Any.fromFunction1(value))
      
      inline def setLCS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LCS", js.Any.fromFunction1(value))
      
      inline def setLCS_IDX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LCS_IDX", js.Any.fromFunction1(value))
      
      inline def setLCS_IDX_WITHMATCHLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LCS_IDX_WITHMATCHLEN", js.Any.fromFunction1(value))
      
      inline def setLCS_LEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LCS_LEN", js.Any.fromFunction1(value))
      
      inline def setLINDEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LINDEX", js.Any.fromFunction1(value))
      
      inline def setLINSERT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LINSERT", js.Any.fromFunction1(value))
      
      inline def setLLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LLEN", js.Any.fromFunction1(value))
      
      inline def setLMOVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LMOVE", js.Any.fromFunction1(value))
      
      inline def setLMPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LMPOP", js.Any.fromFunction1(value))
      
      inline def setLPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPOP", js.Any.fromFunction1(value))
      
      inline def setLPOP_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPOP_COUNT", js.Any.fromFunction1(value))
      
      inline def setLPOS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPOS", js.Any.fromFunction1(value))
      
      inline def setLPOS_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPOS_COUNT", js.Any.fromFunction1(value))
      
      inline def setLPUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPUSH", js.Any.fromFunction1(value))
      
      inline def setLPUSHX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPUSHX", js.Any.fromFunction1(value))
      
      inline def setLPopCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lPopCount", js.Any.fromFunction1(value))
      
      inline def setLPosCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lPosCount", js.Any.fromFunction1(value))
      
      inline def setLRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LRANGE", js.Any.fromFunction1(value))
      
      inline def setLREM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LREM", js.Any.fromFunction1(value))
      
      inline def setLSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LSET", js.Any.fromFunction1(value))
      
      inline def setLTRIM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LTRIM", js.Any.fromFunction1(value))
      
      inline def setLcsIdx(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lcsIdx", js.Any.fromFunction1(value))
      
      inline def setLcsIdxWithMatchLen(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lcsIdxWithMatchLen", js.Any.fromFunction1(value))
      
      inline def setLcsLen(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lcsLen", js.Any.fromFunction1(value))
      
      inline def setMGET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MGET", js.Any.fromFunction1(value))
      
      inline def setMIGRATE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MIGRATE", js.Any.fromFunction1(value))
      
      inline def setMSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MSET", js.Any.fromFunction1(value))
      
      inline def setMSETNX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MSETNX", js.Any.fromFunction1(value))
      
      inline def setOBJECT_ENCODING(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "OBJECT_ENCODING", js.Any.fromFunction1(value))
      
      inline def setOBJECT_FREQ(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "OBJECT_FREQ", js.Any.fromFunction1(value))
      
      inline def setOBJECT_IDLETIME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "OBJECT_IDLETIME", js.Any.fromFunction1(value))
      
      inline def setOBJECT_REFCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "OBJECT_REFCOUNT", js.Any.fromFunction1(value))
      
      inline def setObjectEncoding(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "objectEncoding", js.Any.fromFunction1(value))
      
      inline def setObjectFreq(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "objectFreq", js.Any.fromFunction1(value))
      
      inline def setObjectIdleTime(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "objectIdleTime", js.Any.fromFunction1(value))
      
      inline def setObjectRefCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "objectRefCount", js.Any.fromFunction1(value))
      
      inline def setPERSIST(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PERSIST", js.Any.fromFunction1(value))
      
      inline def setPEXPIRE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PEXPIRE", js.Any.fromFunction1(value))
      
      inline def setPEXPIREAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PEXPIREAT", js.Any.fromFunction1(value))
      
      inline def setPEXPIRETIME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PEXPIRETIME", js.Any.fromFunction1(value))
      
      inline def setPFADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PFADD", js.Any.fromFunction1(value))
      
      inline def setPFCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PFCOUNT", js.Any.fromFunction1(value))
      
      inline def setPFMERGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PFMERGE", js.Any.fromFunction1(value))
      
      inline def setPSETEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PSETEX", js.Any.fromFunction1(value))
      
      inline def setPTTL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PTTL", js.Any.fromFunction1(value))
      
      inline def setPUBLISH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PUBLISH", js.Any.fromFunction1(value))
      
      inline def setRENAME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RENAME", js.Any.fromFunction1(value))
      
      inline def setRENAMENX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RENAMENX", js.Any.fromFunction1(value))
      
      inline def setRPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPOP", js.Any.fromFunction1(value))
      
      inline def setRPOPLPUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPOPLPUSH", js.Any.fromFunction1(value))
      
      inline def setRPOP_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPOP_COUNT", js.Any.fromFunction1(value))
      
      inline def setRPUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPUSH", js.Any.fromFunction1(value))
      
      inline def setRPUSHX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPUSHX", js.Any.fromFunction1(value))
      
      inline def setRPopCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "rPopCount", js.Any.fromFunction1(value))
      
      inline def setSADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SADD", js.Any.fromFunction1(value))
      
      inline def setSCARD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SCARD", js.Any.fromFunction1(value))
      
      inline def setSDIFF(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SDIFF", js.Any.fromFunction1(value))
      
      inline def setSDIFFSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SDIFFSTORE", js.Any.fromFunction1(value))
      
      inline def setSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SET", js.Any.fromFunction1(value))
      
      inline def setSETBIT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SETBIT", js.Any.fromFunction1(value))
      
      inline def setSETEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SETEX", js.Any.fromFunction1(value))
      
      inline def setSETNX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SETNX", js.Any.fromFunction1(value))
      
      inline def setSETRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SETRANGE", js.Any.fromFunction1(value))
      
      inline def setSINTER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SINTER", js.Any.fromFunction1(value))
      
      inline def setSINTERCARD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SINTERCARD", js.Any.fromFunction1(value))
      
      inline def setSINTERSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SINTERSTORE", js.Any.fromFunction1(value))
      
      inline def setSISMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SISMEMBER", js.Any.fromFunction1(value))
      
      inline def setSMEMBERS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SMEMBERS", js.Any.fromFunction1(value))
      
      inline def setSMISMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SMISMEMBER", js.Any.fromFunction1(value))
      
      inline def setSMOVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SMOVE", js.Any.fromFunction1(value))
      
      inline def setSORT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SORT", js.Any.fromFunction1(value))
      
      inline def setSORT_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SORT_RO", js.Any.fromFunction1(value))
      
      inline def setSORT_STORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SORT_STORE", js.Any.fromFunction1(value))
      
      inline def setSPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SPOP", js.Any.fromFunction1(value))
      
      inline def setSRANDMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SRANDMEMBER", js.Any.fromFunction1(value))
      
      inline def setSRANDMEMBER_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SRANDMEMBER_COUNT", js.Any.fromFunction1(value))
      
      inline def setSREM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SREM", js.Any.fromFunction1(value))
      
      inline def setSRandMemberCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "sRandMemberCount", js.Any.fromFunction1(value))
      
      inline def setSSCAN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SSCAN", js.Any.fromFunction1(value))
      
      inline def setSTRLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "STRLEN", js.Any.fromFunction1(value))
      
      inline def setSUNION(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SUNION", js.Any.fromFunction1(value))
      
      inline def setSUNIONSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SUNIONSTORE", js.Any.fromFunction1(value))
      
      inline def setSortRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "sortRo", js.Any.fromFunction1(value))
      
      inline def setSortStore(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "sortStore", js.Any.fromFunction1(value))
      
      inline def setTOUCH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "TOUCH", js.Any.fromFunction1(value))
      
      inline def setTTL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "TTL", js.Any.fromFunction1(value))
      
      inline def setTYPE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "TYPE", js.Any.fromFunction1(value))
      
      inline def setUNLINK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "UNLINK", js.Any.fromFunction1(value))
      
      inline def setWATCH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "WATCH", js.Any.fromFunction1(value))
      
      inline def setXACK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XACK", js.Any.fromFunction1(value))
      
      inline def setXADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XADD", js.Any.fromFunction1(value))
      
      inline def setXAUTOCLAIM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XAUTOCLAIM", js.Any.fromFunction1(value))
      
      inline def setXAUTOCLAIM_JUSTID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XAUTOCLAIM_JUSTID", js.Any.fromFunction1(value))
      
      inline def setXAutoClaimJustId(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xAutoClaimJustId", js.Any.fromFunction1(value))
      
      inline def setXCLAIM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XCLAIM", js.Any.fromFunction1(value))
      
      inline def setXCLAIM_JUSTID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XCLAIM_JUSTID", js.Any.fromFunction1(value))
      
      inline def setXClaimJustId(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xClaimJustId", js.Any.fromFunction1(value))
      
      inline def setXDEL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XDEL", js.Any.fromFunction1(value))
      
      inline def setXGROUP_CREATE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_CREATE", js.Any.fromFunction1(value))
      
      inline def setXGROUP_CREATECONSUMER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_CREATECONSUMER", js.Any.fromFunction1(value))
      
      inline def setXGROUP_DELCONSUMER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_DELCONSUMER", js.Any.fromFunction1(value))
      
      inline def setXGROUP_DESTROY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_DESTROY", js.Any.fromFunction1(value))
      
      inline def setXGROUP_SETID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_SETID", js.Any.fromFunction1(value))
      
      inline def setXGroupCreate(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupCreate", js.Any.fromFunction1(value))
      
      inline def setXGroupCreateConsumer(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupCreateConsumer", js.Any.fromFunction1(value))
      
      inline def setXGroupDelConsumer(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupDelConsumer", js.Any.fromFunction1(value))
      
      inline def setXGroupDestroy(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupDestroy", js.Any.fromFunction1(value))
      
      inline def setXGroupSetId(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupSetId", js.Any.fromFunction1(value))
      
      inline def setXINFO_CONSUMERS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XINFO_CONSUMERS", js.Any.fromFunction1(value))
      
      inline def setXINFO_GROUPS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XINFO_GROUPS", js.Any.fromFunction1(value))
      
      inline def setXINFO_STREAM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XINFO_STREAM", js.Any.fromFunction1(value))
      
      inline def setXInfoConsumers(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xInfoConsumers", js.Any.fromFunction1(value))
      
      inline def setXInfoGroups(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xInfoGroups", js.Any.fromFunction1(value))
      
      inline def setXInfoStream(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xInfoStream", js.Any.fromFunction1(value))
      
      inline def setXLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XLEN", js.Any.fromFunction1(value))
      
      inline def setXPENDING(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XPENDING", js.Any.fromFunction1(value))
      
      inline def setXPENDING_RANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XPENDING_RANGE", js.Any.fromFunction1(value))
      
      inline def setXPendingRange(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xPendingRange", js.Any.fromFunction1(value))
      
      inline def setXRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XRANGE", js.Any.fromFunction1(value))
      
      inline def setXREAD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XREAD", js.Any.fromFunction1(value))
      
      inline def setXREADGROUP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XREADGROUP", js.Any.fromFunction1(value))
      
      inline def setXREVRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XREVRANGE", js.Any.fromFunction1(value))
      
      inline def setXSETID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XSETID", js.Any.fromFunction1(value))
      
      inline def setXTRIM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XTRIM", js.Any.fromFunction1(value))
      
      inline def setZADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZADD", js.Any.fromFunction1(value))
      
      inline def setZCARD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZCARD", js.Any.fromFunction1(value))
      
      inline def setZCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZCOUNT", js.Any.fromFunction1(value))
      
      inline def setZDIFF(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZDIFF", js.Any.fromFunction1(value))
      
      inline def setZDIFFSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZDIFFSTORE", js.Any.fromFunction1(value))
      
      inline def setZDIFF_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZDIFF_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZDiffWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zDiffWithScores", js.Any.fromFunction1(value))
      
      inline def setZINCRBY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINCRBY", js.Any.fromFunction1(value))
      
      inline def setZINTER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINTER", js.Any.fromFunction1(value))
      
      inline def setZINTERCARD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINTERCARD", js.Any.fromFunction1(value))
      
      inline def setZINTERSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINTERSTORE", js.Any.fromFunction1(value))
      
      inline def setZINTER_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINTER_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZInterWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zInterWithScores", js.Any.fromFunction1(value))
      
      inline def setZLEXCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZLEXCOUNT", js.Any.fromFunction1(value))
      
      inline def setZMPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZMPOP", js.Any.fromFunction1(value))
      
      inline def setZMSCORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZMSCORE", js.Any.fromFunction1(value))
      
      inline def setZPOPMAX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZPOPMAX", js.Any.fromFunction1(value))
      
      inline def setZPOPMAX_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZPOPMAX_COUNT", js.Any.fromFunction1(value))
      
      inline def setZPOPMIN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZPOPMIN", js.Any.fromFunction1(value))
      
      inline def setZPOPMIN_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZPOPMIN_COUNT", js.Any.fromFunction1(value))
      
      inline def setZPopMaxCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zPopMaxCount", js.Any.fromFunction1(value))
      
      inline def setZPopMinCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zPopMinCount", js.Any.fromFunction1(value))
      
      inline def setZRANDMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANDMEMBER", js.Any.fromFunction1(value))
      
      inline def setZRANDMEMBER_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANDMEMBER_COUNT", js.Any.fromFunction1(value))
      
      inline def setZRANDMEMBER_COUNT_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANDMEMBER_COUNT_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGE", js.Any.fromFunction1(value))
      
      inline def setZRANGEBYLEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGEBYLEX", js.Any.fromFunction1(value))
      
      inline def setZRANGEBYSCORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGEBYSCORE", js.Any.fromFunction1(value))
      
      inline def setZRANGEBYSCORE_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGEBYSCORE_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZRANGESTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGESTORE", js.Any.fromFunction1(value))
      
      inline def setZRANGE_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGE_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZRANK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANK", js.Any.fromFunction1(value))
      
      inline def setZREM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREM", js.Any.fromFunction1(value))
      
      inline def setZREMRANGEBYLEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREMRANGEBYLEX", js.Any.fromFunction1(value))
      
      inline def setZREMRANGEBYRANK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREMRANGEBYRANK", js.Any.fromFunction1(value))
      
      inline def setZREMRANGEBYSCORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREMRANGEBYSCORE", js.Any.fromFunction1(value))
      
      inline def setZREVRANK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREVRANK", js.Any.fromFunction1(value))
      
      inline def setZRandMemberCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zRandMemberCount", js.Any.fromFunction1(value))
      
      inline def setZRandMemberCountWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zRandMemberCountWithScores", js.Any.fromFunction1(value))
      
      inline def setZRangeByScoreWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zRangeByScoreWithScores", js.Any.fromFunction1(value))
      
      inline def setZRangeWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zRangeWithScores", js.Any.fromFunction1(value))
      
      inline def setZSCAN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZSCAN", js.Any.fromFunction1(value))
      
      inline def setZSCORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZSCORE", js.Any.fromFunction1(value))
      
      inline def setZUNION(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZUNION", js.Any.fromFunction1(value))
      
      inline def setZUNIONSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZUNIONSTORE", js.Any.fromFunction1(value))
      
      inline def setZUNION_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZUNION_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZUnionWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClusterMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zUnionWithScores", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof F as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<P> ]: {[ FF in keyof F[P] as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<FF> ]: @redis/client.@redis/client/dist/lib/cluster/multi-command.RedisClusterMultiCommandSignature<F[P][FF], M, F, S>}}
    }}}
    */
  @js.native
  trait WithFunctions[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof M as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<P> ]: {[ C in keyof M[P] as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<C> ]: @redis/client.@redis/client/dist/lib/cluster/multi-command.RedisClusterMultiCommandSignature<M[P][C], M, F, S>}}
    }}}
    */
  @js.native
  trait WithModules[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof S as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<P> ]: @redis/client.@redis/client/dist/lib/cluster/multi-command.RedisClusterMultiCommandSignature<S[P], M, F, S>}
    }}}
    */
  @js.native
  trait WithScripts[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject
}

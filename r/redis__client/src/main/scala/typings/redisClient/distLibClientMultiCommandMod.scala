package typings.redisClient

import org.scalablytyped.runtime.Instantiable1
import typings.redisClient.anon.TypeofRedisClientMultiCom
import typings.redisClient.distLibCommandsMod.RedisCommand
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
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientMultiCommandMod {
  
  @JSImport("@redis/client/dist/lib/client/multi-command", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RedisClientMultiCommand {
    def this(executor: RedisClientMultiExecutor) = this()
    def this(executor: RedisClientMultiExecutor, legacyMode: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@redis/client/dist/lib/client/multi-command", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): InstantiableRedisMultiCommand[M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[InstantiableRedisMultiCommand[M, F, S]]
    inline def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](extensions: RedisExtensions[M, F, S]): InstantiableRedisMultiCommand[M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(extensions.asInstanceOf[js.Any]).asInstanceOf[InstantiableRedisMultiCommand[M, F, S]]
  }
  
  type CommandSignature[C /* <: RedisCommand */, M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] = js.Function1[
    /* args */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
    ], 
    RedisClientMultiCommandType[M, F, S]
  ]
  
  type InstantiableRedisMultiCommand[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] = Instantiable1[
    /* args */ ConstructorParameters[TypeofRedisClientMultiCom], 
    RedisClientMultiCommandType[M, F, S]
  ]
  
  @js.native
  trait RedisClientMultiCommand extends StObject {
    
    def EXEC(): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    def EXEC(execAsPipeline: Boolean): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    
    def SELECT(db: Double): this.type = js.native
    def SELECT(
      db: Double,
      transformReply: js.UndefOr[
          js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]
        ]
    ): this.type = js.native
    
    def addCommand(args: RedisCommandArguments): this.type = js.native
    def addCommand(
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
    
    def select(db: Double): this.type = js.native
    def select(
      db: Double,
      transformReply: js.UndefOr[
          js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]
        ]
    ): this.type = js.native
    
    val v4: Record[String, Any] = js.native
  }
  
  type RedisClientMultiCommandType[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] = RedisClientMultiCommand & (WithCommands[M, F, S]) & (WithModules[M, F, S]) & (WithFunctions[M, F, S]) & (WithScripts[M, F, S])
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type RedisClientMultiExecutor = (queue : std.Array<@redis/client.@redis/client/dist/lib/multi-command.RedisMultiQueuedCommand>, selectedDB : number | undefined, chainId : symbol | undefined): std.Promise<std.Array<@redis/client.@redis/client/dist/lib/commands.RedisCommandRawReply>>
  }}}
  to avoid circular code involving: 
  - @redis/client.@redis/client/dist/lib/client/multi-command.RedisClientMultiExecutor
  - @redis/client.@redis/client/dist/lib/commands.RedisCommandRawReply
  */
  @js.native
  trait RedisClientMultiExecutor extends StObject {
    
    def apply(queue: js.Array[RedisMultiQueuedCommand]): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    def apply(queue: js.Array[RedisMultiQueuedCommand], selectedDB: Double): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    def apply(queue: js.Array[RedisMultiQueuedCommand], selectedDB: Double, chainId: js.Symbol): js.Promise[js.Array[RedisCommandRawReply]] = js.native
    def apply(queue: js.Array[RedisMultiQueuedCommand], selectedDB: Unit, chainId: js.Symbol): js.Promise[js.Array[RedisCommandRawReply]] = js.native
  }
  
  /* Inlined {[ P in keyof {  ACL_CAT :typeof ACL_CAT,   aclCat :typeof ACL_CAT,   ACL_DELUSER :typeof ACL_DELUSER,   aclDelUser :typeof ACL_DELUSER,   ACL_DRYRUN :typeof ACL_DRYRUN,   aclDryRun :typeof ACL_DRYRUN,   ACL_GENPASS :typeof ACL_GENPASS,   aclGenPass :typeof ACL_GENPASS,   ACL_GETUSER :typeof ACL_GETUSER,   aclGetUser :typeof ACL_GETUSER,   ACL_LIST :typeof ACL_LIST,   aclList :typeof ACL_LIST,   ACL_LOAD :typeof ACL_LOAD,   aclLoad :typeof ACL_LOAD,   ACL_LOG_RESET :typeof ACL_LOG_RESET,   aclLogReset :typeof ACL_LOG_RESET,   ACL_LOG :typeof ACL_LOG,   aclLog :typeof ACL_LOG,   ACL_SAVE :typeof ACL_SAVE,   aclSave :typeof ACL_SAVE,   ACL_SETUSER :typeof ACL_SETUSER,   aclSetUser :typeof ACL_SETUSER,   ACL_USERS :typeof ACL_USERS,   aclUsers :typeof ACL_USERS,   ACL_WHOAMI :typeof ACL_WHOAMI,   aclWhoAmI :typeof ACL_WHOAMI,   ASKING :typeof ASKING,   asking :typeof ASKING,   AUTH :typeof AUTH,   auth :typeof AUTH,   BGREWRITEAOF :typeof BGREWRITEAOF,   bgRewriteAof :typeof BGREWRITEAOF,   BGSAVE :typeof BGSAVE,   bgSave :typeof BGSAVE,   CLIENT_CACHING :typeof CLIENT_CACHING,   clientCaching :typeof CLIENT_CACHING,   CLIENT_GETNAME :typeof CLIENT_GETNAME,   clientGetName :typeof CLIENT_GETNAME,   CLIENT_GETREDIR :typeof CLIENT_GETREDIR,   clientGetRedir :typeof CLIENT_GETREDIR,   CLIENT_ID :typeof CLIENT_ID,   clientId :typeof CLIENT_ID,   CLIENT_KILL :typeof CLIENT_KILL,   clientKill :typeof CLIENT_KILL,   CLIENT_NO-EVICT :typeof CLIENT_NO_EVICT,   clientNoEvict :typeof CLIENT_NO_EVICT,   CLIENT_PAUSE :typeof CLIENT_PAUSE,   clientPause :typeof CLIENT_PAUSE,   CLIENT_SETNAME :typeof CLIENT_SETNAME,   clientSetName :typeof CLIENT_SETNAME,   CLIENT_TRACKING :typeof CLIENT_TRACKING,   clientTracking :typeof CLIENT_TRACKING,   CLIENT_TRACKINGINFO :typeof CLIENT_TRACKINGINFO,   clientTrackingInfo :typeof CLIENT_TRACKINGINFO,   CLIENT_UNPAUSE :typeof CLIENT_UNPAUSE,   clientUnpause :typeof CLIENT_UNPAUSE,   CLIENT_INFO :typeof CLIENT_INFO,   clientInfo :typeof CLIENT_INFO,   CLUSTER_ADDSLOTS :typeof CLUSTER_ADDSLOTS,   clusterAddSlots :typeof CLUSTER_ADDSLOTS,   CLUSTER_ADDSLOTSRANGE :typeof CLUSTER_ADDSLOTSRANGE,   clusterAddSlotsRange :typeof CLUSTER_ADDSLOTSRANGE,   CLUSTER_BUMPEPOCH :typeof CLUSTER_BUMPEPOCH,   clusterBumpEpoch :typeof CLUSTER_BUMPEPOCH,   CLUSTER_COUNT_FAILURE_REPORTS :typeof CLUSTER_COUNT_FAILURE_REPORTS,   clusterCountFailureReports :typeof CLUSTER_COUNT_FAILURE_REPORTS,   CLUSTER_COUNTKEYSINSLOT :typeof CLUSTER_COUNTKEYSINSLOT,   clusterCountKeysInSlot :typeof CLUSTER_COUNTKEYSINSLOT,   CLUSTER_DELSLOTS :typeof CLUSTER_DELSLOTS,   clusterDelSlots :typeof CLUSTER_DELSLOTS,   CLUSTER_DELSLOTSRANGE :typeof CLUSTER_DELSLOTSRANGE,   clusterDelSlotsRange :typeof CLUSTER_DELSLOTSRANGE,   CLUSTER_FAILOVER :typeof CLUSTER_FAILOVER,   clusterFailover :typeof CLUSTER_FAILOVER,   CLUSTER_FLUSHSLOTS :typeof CLUSTER_FLUSHSLOTS,   clusterFlushSlots :typeof CLUSTER_FLUSHSLOTS,   CLUSTER_FORGET :typeof CLUSTER_FORGET,   clusterForget :typeof CLUSTER_FORGET,   CLUSTER_GETKEYSINSLOT :typeof CLUSTER_GETKEYSINSLOT,   clusterGetKeysInSlot :typeof CLUSTER_GETKEYSINSLOT,   CLUSTER_INFO :typeof CLUSTER_INFO,   clusterInfo :typeof CLUSTER_INFO,   CLUSTER_KEYSLOT :typeof CLUSTER_KEYSLOT,   clusterKeySlot :typeof CLUSTER_KEYSLOT,   CLUSTER_LINKS :typeof CLUSTER_LINKS,   clusterLinks :typeof CLUSTER_LINKS,   CLUSTER_MEET :typeof CLUSTER_MEET,   clusterMeet :typeof CLUSTER_MEET,   CLUSTER_MYID :typeof CLUSTER_MYID,   clusterMyId :typeof CLUSTER_MYID,   CLUSTER_NODES :typeof CLUSTER_NODES,   clusterNodes :typeof CLUSTER_NODES,   CLUSTER_REPLICAS :typeof CLUSTER_REPLICAS,   clusterReplicas :typeof CLUSTER_REPLICAS,   CLUSTER_REPLICATE :typeof CLUSTER_REPLICATE,   clusterReplicate :typeof CLUSTER_REPLICATE,   CLUSTER_RESET :typeof CLUSTER_RESET,   clusterReset :typeof CLUSTER_RESET,   CLUSTER_SAVECONFIG :typeof CLUSTER_SAVECONFIG,   clusterSaveConfig :typeof CLUSTER_SAVECONFIG,   CLUSTER_SET_CONFIG_EPOCH :typeof CLUSTER_SET_CONFIG_EPOCH,   clusterSetConfigEpoch :typeof CLUSTER_SET_CONFIG_EPOCH,   CLUSTER_SETSLOT :typeof CLUSTER_SETSLOT,   clusterSetSlot :typeof CLUSTER_SETSLOT,   CLUSTER_SLOTS :typeof CLUSTER_SLOTS,   clusterSlots :typeof CLUSTER_SLOTS,   COMMAND_COUNT :typeof COMMAND_COUNT,   commandCount :typeof COMMAND_COUNT,   COMMAND_GETKEYS :typeof COMMAND_GETKEYS,   commandGetKeys :typeof COMMAND_GETKEYS,   COMMAND_GETKEYSANDFLAGS :typeof COMMAND_GETKEYSANDFLAGS,   commandGetKeysAndFlags :typeof COMMAND_GETKEYSANDFLAGS,   COMMAND_INFO :typeof COMMAND_INFO,   commandInfo :typeof COMMAND_INFO,   COMMAND_LIST :typeof COMMAND_LIST,   commandList :typeof COMMAND_LIST,   COMMAND :typeof COMMAND,   command :typeof COMMAND,   CONFIG_GET :typeof CONFIG_GET,   configGet :typeof CONFIG_GET,   CONFIG_RESETASTAT :typeof CONFIG_RESETASTAT,   configResetStat :typeof CONFIG_RESETASTAT,   CONFIG_REWRITE :typeof CONFIG_REWRITE,   configRewrite :typeof CONFIG_REWRITE,   CONFIG_SET :typeof CONFIG_SET,   configSet :typeof CONFIG_SET,   DBSIZE :typeof DBSIZE,   dbSize :typeof DBSIZE,   DISCARD :typeof DISCARD,   discard :typeof DISCARD,   ECHO :typeof ECHO,   echo :typeof ECHO,   FAILOVER :typeof FAILOVER,   failover :typeof FAILOVER,   FLUSHALL :typeof FLUSHALL,   flushAll :typeof FLUSHALL,   FLUSHDB :typeof FLUSHDB,   flushDb :typeof FLUSHDB,   FUNCTION_DELETE :typeof FUNCTION_DELETE,   functionDelete :typeof FUNCTION_DELETE,   FUNCTION_DUMP :typeof FUNCTION_DUMP,   functionDump :typeof FUNCTION_DUMP,   FUNCTION_FLUSH :typeof FUNCTION_FLUSH,   functionFlush :typeof FUNCTION_FLUSH,   FUNCTION_KILL :typeof FUNCTION_KILL,   functionKill :typeof FUNCTION_KILL,   FUNCTION_LIST_WITHCODE :typeof FUNCTION_LIST_WITHCODE,   functionListWithCode :typeof FUNCTION_LIST_WITHCODE,   FUNCTION_LIST :typeof FUNCTION_LIST,   functionList :typeof FUNCTION_LIST,   FUNCTION_LOAD :typeof FUNCTION_LOAD,   functionLoad :typeof FUNCTION_LOAD,   FUNCTION_RESTORE :typeof FUNCTION_RESTORE,   functionRestore :typeof FUNCTION_RESTORE,   FUNCTION_STATS :typeof FUNCTION_STATS,   functionStats :typeof FUNCTION_STATS,   HELLO :typeof HELLO,   hello :typeof HELLO,   INFO :typeof INFO,   info :typeof INFO,   KEYS :typeof KEYS,   keys :typeof KEYS,   LASTSAVE :typeof LASTSAVE,   lastSave :typeof LASTSAVE,   LATENCY_DOCTOR :typeof LATENCY_DOCTOR,   latencyDoctor :typeof LATENCY_DOCTOR,   LOLWUT :typeof LOLWUT,   lolwut :typeof LOLWUT,   MEMORY_DOCTOR :typeof MEMORY_DOCTOR,   memoryDoctor :typeof MEMORY_DOCTOR,   MEMORY_MALLOC-STATS :typeof MEMORY_MALLOC_STATS,   memoryMallocStats :typeof MEMORY_MALLOC_STATS,   MEMORY_PURGE :typeof MEMORY_PURGE,   memoryPurge :typeof MEMORY_PURGE,   MEMORY_STATS :typeof MEMORY_STATS,   memoryStats :typeof MEMORY_STATS,   MEMORY_USAGE :typeof MEMORY_USAGE,   memoryUsage :typeof MEMORY_USAGE,   MODULE_LIST :typeof MODULE_LIST,   moduleList :typeof MODULE_LIST,   MODULE_LOAD :typeof MODULE_LOAD,   moduleLoad :typeof MODULE_LOAD,   MODULE_UNLOAD :typeof MODULE_UNLOAD,   moduleUnload :typeof MODULE_UNLOAD,   MOVE :typeof MOVE,   move :typeof MOVE,   PING :typeof PING,   ping :typeof PING,   PUBSUB_CHANNELS :typeof PUBSUB_CHANNELS,   pubSubChannels :typeof PUBSUB_CHANNELS,   PUBSUB_NUMPAT :typeof PUBSUB_NUMPAT,   pubSubNumPat :typeof PUBSUB_NUMPAT,   PUBSUB_NUMSUB :typeof PUBSUB_NUMSUB,   pubSubNumSub :typeof PUBSUB_NUMSUB,   RANDOMKEY :typeof RANDOMKEY,   randomKey :typeof RANDOMKEY,   READONLY :typeof READONLY,   readonly :typeof READONLY,   READWRITE :typeof READWRITE,   readwrite :typeof READWRITE,   REPLICAOF :typeof REPLICAOF,   replicaOf :typeof REPLICAOF,   RESTORE-ASKING :typeof RESTORE_ASKING,   restoreAsking :typeof RESTORE_ASKING,   ROLE :typeof ROLE,   role :typeof ROLE,   SAVE :typeof SAVE,   save :typeof SAVE,   SCAN :typeof SCAN,   scan :typeof SCAN,   SCRIPT_DEBUG :typeof SCRIPT_DEBUG,   scriptDebug :typeof SCRIPT_DEBUG,   SCRIPT_EXISTS :typeof SCRIPT_EXISTS,   scriptExists :typeof SCRIPT_EXISTS,   SCRIPT_FLUSH :typeof SCRIPT_FLUSH,   scriptFlush :typeof SCRIPT_FLUSH,   SCRIPT_KILL :typeof SCRIPT_KILL,   scriptKill :typeof SCRIPT_KILL,   SCRIPT_LOAD :typeof SCRIPT_LOAD,   scriptLoad :typeof SCRIPT_LOAD,   SHUTDOWN :typeof SHUTDOWN,   shutdown :typeof SHUTDOWN,   SWAPDB :typeof SWAPDB,   swapDb :typeof SWAPDB,   TIME :typeof TIME,   time :typeof TIME,   UNWATCH :typeof UNWATCH,   unwatch :typeof UNWATCH,   WAIT :typeof WAIT,   wait :typeof WAIT,   APPEND :typeof imported_APPEND,   append :typeof imported_APPEND,   BITCOUNT :typeof imported_BITCOUNT,   bitCount :typeof imported_BITCOUNT,   BITFIELD_RO :typeof imported_BITFIELD_RO,   bitFieldRo :typeof imported_BITFIELD_RO,   BITFIELD :typeof imported_BITFIELD,   bitField :typeof imported_BITFIELD,   BITOP :typeof imported_BITOP,   bitOp :typeof imported_BITOP,   BITPOS :typeof imported_BITPOS,   bitPos :typeof imported_BITPOS,   BLMOVE :typeof imported_BLMOVE,   blMove :typeof imported_BLMOVE,   BLMPOP :typeof imported_BLMPOP,   blmPop :typeof imported_BLMPOP,   BLPOP :typeof imported_BLPOP,   blPop :typeof imported_BLPOP,   BRPOP :typeof imported_BRPOP,   brPop :typeof imported_BRPOP,   BRPOPLPUSH :typeof imported_BRPOPLPUSH,   brPopLPush :typeof imported_BRPOPLPUSH,   BZMPOP :typeof imported_BZMPOP,   bzmPop :typeof imported_BZMPOP,   BZPOPMAX :typeof imported_BZPOPMAX,   bzPopMax :typeof imported_BZPOPMAX,   BZPOPMIN :typeof imported_BZPOPMIN,   bzPopMin :typeof imported_BZPOPMIN,   COPY :typeof imported_COPY,   copy :typeof imported_COPY,   DECR :typeof imported_DECR,   decr :typeof imported_DECR,   DECRBY :typeof imported_DECRBY,   decrBy :typeof imported_DECRBY,   DEL :typeof imported_DEL,   del :typeof imported_DEL,   DUMP :typeof imported_DUMP,   dump :typeof imported_DUMP,   EVAL_RO :typeof imported_EVAL_RO,   evalRo :typeof imported_EVAL_RO,   EVAL :typeof imported_EVAL,   eval :typeof imported_EVAL,   EVALSHA :typeof imported_EVALSHA,   evalSha :typeof imported_EVALSHA,   EVALSHA_RO :typeof imported_EVALSHA_RO,   evalShaRo :typeof imported_EVALSHA_RO,   EXISTS :typeof imported_EXISTS,   exists :typeof imported_EXISTS,   EXPIRE :typeof imported_EXPIRE,   expire :typeof imported_EXPIRE,   EXPIREAT :typeof imported_EXPIREAT,   expireAt :typeof imported_EXPIREAT,   EXPIRETIME :typeof imported_EXPIRETIME,   expireTime :typeof imported_EXPIRETIME,   FCALL_RO :typeof imported_FCALL_RO,   fCallRo :typeof imported_FCALL_RO,   FCALL :typeof imported_FCALL,   fCall :typeof imported_FCALL,   GEOADD :typeof imported_GEOADD,   geoAdd :typeof imported_GEOADD,   GEODIST :typeof imported_GEODIST,   geoDist :typeof imported_GEODIST,   GEOHASH :typeof imported_GEOHASH,   geoHash :typeof imported_GEOHASH,   GEOPOS :typeof imported_GEOPOS,   geoPos :typeof imported_GEOPOS,   GEORADIUS_RO_WITH :typeof imported_GEORADIUS_RO_WITH,   geoRadiusRoWith :typeof imported_GEORADIUS_RO_WITH,   GEORADIUS_RO :typeof imported_GEORADIUS_RO,   geoRadiusRo :typeof imported_GEORADIUS_RO,   GEORADIUS_WITH :typeof imported_GEORADIUS_WITH,   geoRadiusWith :typeof imported_GEORADIUS_WITH,   GEORADIUS :typeof imported_GEORADIUS,   geoRadius :typeof imported_GEORADIUS,   GEORADIUSBYMEMBER_RO_WITH :typeof imported_GEORADIUSBYMEMBER_RO_WITH,   geoRadiusByMemberRoWith :typeof imported_GEORADIUSBYMEMBER_RO_WITH,   GEORADIUSBYMEMBER_RO :typeof imported_GEORADIUSBYMEMBER_RO,   geoRadiusByMemberRo :typeof imported_GEORADIUSBYMEMBER_RO,   GEORADIUSBYMEMBER_WITH :typeof imported_GEORADIUSBYMEMBER_WITH,   geoRadiusByMemberWith :typeof imported_GEORADIUSBYMEMBER_WITH,   GEORADIUSBYMEMBER :typeof imported_GEORADIUSBYMEMBER,   geoRadiusByMember :typeof imported_GEORADIUSBYMEMBER,   GEORADIUSBYMEMBERSTORE :typeof imported_GEORADIUSBYMEMBERSTORE,   geoRadiusByMemberStore :typeof imported_GEORADIUSBYMEMBERSTORE,   GEORADIUSSTORE :typeof imported_GEORADIUSSTORE,   geoRadiusStore :typeof imported_GEORADIUSSTORE,   GEOSEARCH_WITH :typeof imported_GEOSEARCH_WITH,   geoSearchWith :typeof imported_GEOSEARCH_WITH,   GEOSEARCH :typeof imported_GEOSEARCH,   geoSearch :typeof imported_GEOSEARCH,   GEOSEARCHSTORE :typeof imported_GEOSEARCHSTORE,   geoSearchStore :typeof imported_GEOSEARCHSTORE,   GET :typeof imported_GET,   get :typeof imported_GET,   GETBIT :typeof imported_GETBIT,   getBit :typeof imported_GETBIT,   GETDEL :typeof imported_GETDEL,   getDel :typeof imported_GETDEL,   GETEX :typeof imported_GETEX,   getEx :typeof imported_GETEX,   GETRANGE :typeof imported_GETRANGE,   getRange :typeof imported_GETRANGE,   GETSET :typeof imported_GETSET,   getSet :typeof imported_GETSET,   HDEL :typeof imported_HDEL,   hDel :typeof imported_HDEL,   HEXISTS :typeof imported_HEXISTS,   hExists :typeof imported_HEXISTS,   HGET :typeof imported_HGET,   hGet :typeof imported_HGET,   HGETALL :typeof imported_HGETALL,   hGetAll :typeof imported_HGETALL,   HINCRBY :typeof imported_HINCRBY,   hIncrBy :typeof imported_HINCRBY,   HINCRBYFLOAT :typeof imported_HINCRBYFLOAT,   hIncrByFloat :typeof imported_HINCRBYFLOAT,   HKEYS :typeof imported_HKEYS,   hKeys :typeof imported_HKEYS,   HLEN :typeof imported_HLEN,   hLen :typeof imported_HLEN,   HMGET :typeof imported_HMGET,   hmGet :typeof imported_HMGET,   HRANDFIELD_COUNT_WITHVALUES :typeof imported_HRANDFIELD_COUNT_WITHVALUES,   hRandFieldCountWithValues :typeof imported_HRANDFIELD_COUNT_WITHVALUES,   HRANDFIELD_COUNT :typeof imported_HRANDFIELD_COUNT,   hRandFieldCount :typeof imported_HRANDFIELD_COUNT,   HRANDFIELD :typeof imported_HRANDFIELD,   hRandField :typeof imported_HRANDFIELD,   HSCAN :typeof imported_HSCAN,   hScan :typeof imported_HSCAN,   HSET :typeof imported_HSET,   hSet :typeof imported_HSET,   HSETNX :typeof imported_HSETNX,   hSetNX :typeof imported_HSETNX,   HSTRLEN :typeof imported_HSTRLEN,   hStrLen :typeof imported_HSTRLEN,   HVALS :typeof imported_HVALS,   hVals :typeof imported_HVALS,   INCR :typeof imported_INCR,   incr :typeof imported_INCR,   INCRBY :typeof imported_INCRBY,   incrBy :typeof imported_INCRBY,   INCRBYFLOAT :typeof imported_INCRBYFLOAT,   incrByFloat :typeof imported_INCRBYFLOAT,   LCS_IDX_WITHMATCHLEN :typeof imported_LCS_IDX_WITHMATCHLEN,   lcsIdxWithMatchLen :typeof imported_LCS_IDX_WITHMATCHLEN,   LCS_IDX :typeof imported_LCS_IDX,   lcsIdx :typeof imported_LCS_IDX,   LCS_LEN :typeof imported_LCS_LEN,   lcsLen :typeof imported_LCS_LEN,   LCS :typeof imported_LCS,   lcs :typeof imported_LCS,   LINDEX :typeof imported_LINDEX,   lIndex :typeof imported_LINDEX,   LINSERT :typeof imported_LINSERT,   lInsert :typeof imported_LINSERT,   LLEN :typeof imported_LLEN,   lLen :typeof imported_LLEN,   LMOVE :typeof imported_LMOVE,   lMove :typeof imported_LMOVE,   LMPOP :typeof imported_LMPOP,   lmPop :typeof imported_LMPOP,   LPOP_COUNT :typeof imported_LPOP_COUNT,   lPopCount :typeof imported_LPOP_COUNT,   LPOP :typeof imported_LPOP,   lPop :typeof imported_LPOP,   LPOS_COUNT :typeof imported_LPOS_COUNT,   lPosCount :typeof imported_LPOS_COUNT,   LPOS :typeof imported_LPOS,   lPos :typeof imported_LPOS,   LPUSH :typeof imported_LPUSH,   lPush :typeof imported_LPUSH,   LPUSHX :typeof imported_LPUSHX,   lPushX :typeof imported_LPUSHX,   LRANGE :typeof imported_LRANGE,   lRange :typeof imported_LRANGE,   LREM :typeof imported_LREM,   lRem :typeof imported_LREM,   LSET :typeof imported_LSET,   lSet :typeof imported_LSET,   LTRIM :typeof imported_LTRIM,   lTrim :typeof imported_LTRIM,   MGET :typeof imported_MGET,   mGet :typeof imported_MGET,   MIGRATE :typeof imported_MIGRATE,   migrate :typeof imported_MIGRATE,   MSET :typeof imported_MSET,   mSet :typeof imported_MSET,   MSETNX :typeof imported_MSETNX,   mSetNX :typeof imported_MSETNX,   OBJECT_ENCODING :typeof imported_OBJECT_ENCODING,   objectEncoding :typeof imported_OBJECT_ENCODING,   OBJECT_FREQ :typeof imported_OBJECT_FREQ,   objectFreq :typeof imported_OBJECT_FREQ,   OBJECT_IDLETIME :typeof imported_OBJECT_IDLETIME,   objectIdleTime :typeof imported_OBJECT_IDLETIME,   OBJECT_REFCOUNT :typeof imported_OBJECT_REFCOUNT,   objectRefCount :typeof imported_OBJECT_REFCOUNT,   PERSIST :typeof imported_PERSIST,   persist :typeof imported_PERSIST,   PEXPIRE :typeof imported_PEXPIRE,   pExpire :typeof imported_PEXPIRE,   PEXPIREAT :typeof imported_PEXPIREAT,   pExpireAt :typeof imported_PEXPIREAT,   PEXPIRETIME :typeof imported_PEXPIRETIME,   pExpireTime :typeof imported_PEXPIRETIME,   PFADD :typeof imported_PFADD,   pfAdd :typeof imported_PFADD,   PFCOUNT :typeof imported_PFCOUNT,   pfCount :typeof imported_PFCOUNT,   PFMERGE :typeof imported_PFMERGE,   pfMerge :typeof imported_PFMERGE,   PSETEX :typeof imported_PSETEX,   pSetEx :typeof imported_PSETEX,   PTTL :typeof imported_PTTL,   pTTL :typeof imported_PTTL,   PUBLISH :typeof imported_PUBLISH,   publish :typeof imported_PUBLISH,   RENAME :typeof imported_RENAME,   rename :typeof imported_RENAME,   RENAMENX :typeof imported_RENAMENX,   renameNX :typeof imported_RENAMENX,   RPOP_COUNT :typeof imported_RPOP_COUNT,   rPopCount :typeof imported_RPOP_COUNT,   RPOP :typeof imported_RPOP,   rPop :typeof imported_RPOP,   RPOPLPUSH :typeof imported_RPOPLPUSH,   rPopLPush :typeof imported_RPOPLPUSH,   RPUSH :typeof imported_RPUSH,   rPush :typeof imported_RPUSH,   RPUSHX :typeof imported_RPUSHX,   rPushX :typeof imported_RPUSHX,   SADD :typeof imported_SADD,   sAdd :typeof imported_SADD,   SCARD :typeof imported_SCARD,   sCard :typeof imported_SCARD,   SDIFF :typeof imported_SDIFF,   sDiff :typeof imported_SDIFF,   SDIFFSTORE :typeof imported_SDIFFSTORE,   sDiffStore :typeof imported_SDIFFSTORE,   SINTER :typeof imported_SINTER,   sInter :typeof imported_SINTER,   SINTERCARD :typeof imported_SINTERCARD,   sInterCard :typeof imported_SINTERCARD,   SINTERSTORE :typeof imported_SINTERSTORE,   sInterStore :typeof imported_SINTERSTORE,   SET :typeof imported_SET,   set :typeof imported_SET,   SETBIT :typeof imported_SETBIT,   setBit :typeof imported_SETBIT,   SETEX :typeof imported_SETEX,   setEx :typeof imported_SETEX,   SETNX :typeof imported_SETNX,   setNX :typeof imported_SETNX,   SETRANGE :typeof imported_SETRANGE,   setRange :typeof imported_SETRANGE,   SISMEMBER :typeof imported_SISMEMBER,   sIsMember :typeof imported_SISMEMBER,   SMEMBERS :typeof imported_SMEMBERS,   sMembers :typeof imported_SMEMBERS,   SMISMEMBER :typeof imported_SMISMEMBER,   smIsMember :typeof imported_SMISMEMBER,   SMOVE :typeof imported_SMOVE,   sMove :typeof imported_SMOVE,   SORT_RO :typeof imported_SORT_RO,   sortRo :typeof imported_SORT_RO,   SORT_STORE :typeof imported_SORT_STORE,   sortStore :typeof imported_SORT_STORE,   SORT :typeof imported_SORT,   sort :typeof imported_SORT,   SPOP :typeof imported_SPOP,   sPop :typeof imported_SPOP,   SRANDMEMBER_COUNT :typeof imported_SRANDMEMBER_COUNT,   sRandMemberCount :typeof imported_SRANDMEMBER_COUNT,   SRANDMEMBER :typeof imported_SRANDMEMBER,   sRandMember :typeof imported_SRANDMEMBER,   SREM :typeof imported_SREM,   sRem :typeof imported_SREM,   SSCAN :typeof imported_SSCAN,   sScan :typeof imported_SSCAN,   STRLEN :typeof imported_STRLEN,   strLen :typeof imported_STRLEN,   SUNION :typeof imported_SUNION,   sUnion :typeof imported_SUNION,   SUNIONSTORE :typeof imported_SUNIONSTORE,   sUnionStore :typeof imported_SUNIONSTORE,   TOUCH :typeof imported_TOUCH,   touch :typeof imported_TOUCH,   TTL :typeof imported_TTL,   ttl :typeof imported_TTL,   TYPE :typeof imported_TYPE,   type :typeof imported_TYPE,   UNLINK :typeof imported_UNLINK,   unlink :typeof imported_UNLINK,   WATCH :typeof imported_WATCH,   watch :typeof imported_WATCH,   XACK :typeof imported_XACK,   xAck :typeof imported_XACK,   XADD :typeof imported_XADD,   xAdd :typeof imported_XADD,   XAUTOCLAIM_JUSTID :typeof imported_XAUTOCLAIM_JUSTID,   xAutoClaimJustId :typeof imported_XAUTOCLAIM_JUSTID,   XAUTOCLAIM :typeof imported_XAUTOCLAIM,   xAutoClaim :typeof imported_XAUTOCLAIM,   XCLAIM :typeof imported_XCLAIM,   xClaim :typeof imported_XCLAIM,   XCLAIM_JUSTID :typeof imported_XCLAIM_JUSTID,   xClaimJustId :typeof imported_XCLAIM_JUSTID,   XDEL :typeof imported_XDEL,   xDel :typeof imported_XDEL,   XGROUP_CREATE :typeof imported_XGROUP_CREATE,   xGroupCreate :typeof imported_XGROUP_CREATE,   XGROUP_CREATECONSUMER :typeof imported_XGROUP_CREATECONSUMER,   xGroupCreateConsumer :typeof imported_XGROUP_CREATECONSUMER,   XGROUP_DELCONSUMER :typeof imported_XGROUP_DELCONSUMER,   xGroupDelConsumer :typeof imported_XGROUP_DELCONSUMER,   XGROUP_DESTROY :typeof imported_XGROUP_DESTROY,   xGroupDestroy :typeof imported_XGROUP_DESTROY,   XGROUP_SETID :typeof imported_XGROUP_SETID,   xGroupSetId :typeof imported_XGROUP_SETID,   XINFO_CONSUMERS :typeof imported_XINFO_CONSUMERS,   xInfoConsumers :typeof imported_XINFO_CONSUMERS,   XINFO_GROUPS :typeof imported_XINFO_GROUPS,   xInfoGroups :typeof imported_XINFO_GROUPS,   XINFO_STREAM :typeof imported_XINFO_STREAM,   xInfoStream :typeof imported_XINFO_STREAM,   XLEN :typeof imported_XLEN,   xLen :typeof imported_XLEN,   XPENDING_RANGE :typeof imported_XPENDING_RANGE,   xPendingRange :typeof imported_XPENDING_RANGE,   XPENDING :typeof imported_XPENDING,   xPending :typeof imported_XPENDING,   XRANGE :typeof imported_XRANGE,   xRange :typeof imported_XRANGE,   XREAD :typeof imported_XREAD,   xRead :typeof imported_XREAD,   XREADGROUP :typeof imported_XREADGROUP,   xReadGroup :typeof imported_XREADGROUP,   XREVRANGE :typeof imported_XREVRANGE,   xRevRange :typeof imported_XREVRANGE,   XSETID :typeof imported_XSETID,   xSetId :typeof imported_XSETID,   XTRIM :typeof imported_XTRIM,   xTrim :typeof imported_XTRIM,   ZADD :typeof imported_ZADD,   zAdd :typeof imported_ZADD,   ZCARD :typeof imported_ZCARD,   zCard :typeof imported_ZCARD,   ZCOUNT :typeof imported_ZCOUNT,   zCount :typeof imported_ZCOUNT,   ZDIFF_WITHSCORES :typeof imported_ZDIFF_WITHSCORES,   zDiffWithScores :typeof imported_ZDIFF_WITHSCORES,   ZDIFF :typeof imported_ZDIFF,   zDiff :typeof imported_ZDIFF,   ZDIFFSTORE :typeof imported_ZDIFFSTORE,   zDiffStore :typeof imported_ZDIFFSTORE,   ZINCRBY :typeof imported_ZINCRBY,   zIncrBy :typeof imported_ZINCRBY,   ZINTER_WITHSCORES :typeof imported_ZINTER_WITHSCORES,   zInterWithScores :typeof imported_ZINTER_WITHSCORES,   ZINTER :typeof imported_ZINTER,   zInter :typeof imported_ZINTER,   ZINTERCARD :typeof imported_ZINTERCARD,   zInterCard :typeof imported_ZINTERCARD,   ZINTERSTORE :typeof imported_ZINTERSTORE,   zInterStore :typeof imported_ZINTERSTORE,   ZLEXCOUNT :typeof imported_ZLEXCOUNT,   zLexCount :typeof imported_ZLEXCOUNT,   ZMPOP :typeof imported_ZMPOP,   zmPop :typeof imported_ZMPOP,   ZMSCORE :typeof imported_ZMSCORE,   zmScore :typeof imported_ZMSCORE,   ZPOPMAX_COUNT :typeof imported_ZPOPMAX_COUNT,   zPopMaxCount :typeof imported_ZPOPMAX_COUNT,   ZPOPMAX :typeof imported_ZPOPMAX,   zPopMax :typeof imported_ZPOPMAX,   ZPOPMIN_COUNT :typeof imported_ZPOPMIN_COUNT,   zPopMinCount :typeof imported_ZPOPMIN_COUNT,   ZPOPMIN :typeof imported_ZPOPMIN,   zPopMin :typeof imported_ZPOPMIN,   ZRANDMEMBER_COUNT_WITHSCORES :typeof imported_ZRANDMEMBER_COUNT_WITHSCORES,   zRandMemberCountWithScores :typeof imported_ZRANDMEMBER_COUNT_WITHSCORES,   ZRANDMEMBER_COUNT :typeof imported_ZRANDMEMBER_COUNT,   zRandMemberCount :typeof imported_ZRANDMEMBER_COUNT,   ZRANDMEMBER :typeof imported_ZRANDMEMBER,   zRandMember :typeof imported_ZRANDMEMBER,   ZRANGE_WITHSCORES :typeof imported_ZRANGE_WITHSCORES,   zRangeWithScores :typeof imported_ZRANGE_WITHSCORES,   ZRANGE :typeof imported_ZRANGE,   zRange :typeof imported_ZRANGE,   ZRANGEBYLEX :typeof imported_ZRANGEBYLEX,   zRangeByLex :typeof imported_ZRANGEBYLEX,   ZRANGEBYSCORE_WITHSCORES :typeof imported_ZRANGEBYSCORE_WITHSCORES,   zRangeByScoreWithScores :typeof imported_ZRANGEBYSCORE_WITHSCORES,   ZRANGEBYSCORE :typeof imported_ZRANGEBYSCORE,   zRangeByScore :typeof imported_ZRANGEBYSCORE,   ZRANGESTORE :typeof imported_ZRANGESTORE,   zRangeStore :typeof imported_ZRANGESTORE,   ZRANK :typeof imported_ZRANK,   zRank :typeof imported_ZRANK,   ZREM :typeof imported_ZREM,   zRem :typeof imported_ZREM,   ZREMRANGEBYLEX :typeof imported_ZREMRANGEBYLEX,   zRemRangeByLex :typeof imported_ZREMRANGEBYLEX,   ZREMRANGEBYRANK :typeof imported_ZREMRANGEBYRANK,   zRemRangeByRank :typeof imported_ZREMRANGEBYRANK,   ZREMRANGEBYSCORE :typeof imported_ZREMRANGEBYSCORE,   zRemRangeByScore :typeof imported_ZREMRANGEBYSCORE,   ZREVRANK :typeof imported_ZREVRANK,   zRevRank :typeof imported_ZREVRANK,   ZSCAN :typeof imported_ZSCAN,   zScan :typeof imported_ZSCAN,   ZSCORE :typeof imported_ZSCORE,   zScore :typeof imported_ZSCORE,   ZUNION_WITHSCORES :typeof imported_ZUNION_WITHSCORES,   zUnionWithScores :typeof imported_ZUNION_WITHSCORES,   ZUNION :typeof imported_ZUNION,   zUnion :typeof imported_ZUNION,   ZUNIONSTORE :typeof imported_ZUNIONSTORE,   zUnionStore :typeof imported_ZUNIONSTORE} ]: @redis/client.@redis/client/dist/lib/client/multi-command.CommandSignature<{  ACL_CAT :typeof ACL_CAT,   aclCat :typeof ACL_CAT,   ACL_DELUSER :typeof ACL_DELUSER,   aclDelUser :typeof ACL_DELUSER,   ACL_DRYRUN :typeof ACL_DRYRUN,   aclDryRun :typeof ACL_DRYRUN,   ACL_GENPASS :typeof ACL_GENPASS,   aclGenPass :typeof ACL_GENPASS,   ACL_GETUSER :typeof ACL_GETUSER,   aclGetUser :typeof ACL_GETUSER,   ACL_LIST :typeof ACL_LIST,   aclList :typeof ACL_LIST,   ACL_LOAD :typeof ACL_LOAD,   aclLoad :typeof ACL_LOAD,   ACL_LOG_RESET :typeof ACL_LOG_RESET,   aclLogReset :typeof ACL_LOG_RESET,   ACL_LOG :typeof ACL_LOG,   aclLog :typeof ACL_LOG,   ACL_SAVE :typeof ACL_SAVE,   aclSave :typeof ACL_SAVE,   ACL_SETUSER :typeof ACL_SETUSER,   aclSetUser :typeof ACL_SETUSER,   ACL_USERS :typeof ACL_USERS,   aclUsers :typeof ACL_USERS,   ACL_WHOAMI :typeof ACL_WHOAMI,   aclWhoAmI :typeof ACL_WHOAMI,   ASKING :typeof ASKING,   asking :typeof ASKING,   AUTH :typeof AUTH,   auth :typeof AUTH,   BGREWRITEAOF :typeof BGREWRITEAOF,   bgRewriteAof :typeof BGREWRITEAOF,   BGSAVE :typeof BGSAVE,   bgSave :typeof BGSAVE,   CLIENT_CACHING :typeof CLIENT_CACHING,   clientCaching :typeof CLIENT_CACHING,   CLIENT_GETNAME :typeof CLIENT_GETNAME,   clientGetName :typeof CLIENT_GETNAME,   CLIENT_GETREDIR :typeof CLIENT_GETREDIR,   clientGetRedir :typeof CLIENT_GETREDIR,   CLIENT_ID :typeof CLIENT_ID,   clientId :typeof CLIENT_ID,   CLIENT_KILL :typeof CLIENT_KILL,   clientKill :typeof CLIENT_KILL,   CLIENT_NO-EVICT :typeof CLIENT_NO_EVICT,   clientNoEvict :typeof CLIENT_NO_EVICT,   CLIENT_PAUSE :typeof CLIENT_PAUSE,   clientPause :typeof CLIENT_PAUSE,   CLIENT_SETNAME :typeof CLIENT_SETNAME,   clientSetName :typeof CLIENT_SETNAME,   CLIENT_TRACKING :typeof CLIENT_TRACKING,   clientTracking :typeof CLIENT_TRACKING,   CLIENT_TRACKINGINFO :typeof CLIENT_TRACKINGINFO,   clientTrackingInfo :typeof CLIENT_TRACKINGINFO,   CLIENT_UNPAUSE :typeof CLIENT_UNPAUSE,   clientUnpause :typeof CLIENT_UNPAUSE,   CLIENT_INFO :typeof CLIENT_INFO,   clientInfo :typeof CLIENT_INFO,   CLUSTER_ADDSLOTS :typeof CLUSTER_ADDSLOTS,   clusterAddSlots :typeof CLUSTER_ADDSLOTS,   CLUSTER_ADDSLOTSRANGE :typeof CLUSTER_ADDSLOTSRANGE,   clusterAddSlotsRange :typeof CLUSTER_ADDSLOTSRANGE,   CLUSTER_BUMPEPOCH :typeof CLUSTER_BUMPEPOCH,   clusterBumpEpoch :typeof CLUSTER_BUMPEPOCH,   CLUSTER_COUNT_FAILURE_REPORTS :typeof CLUSTER_COUNT_FAILURE_REPORTS,   clusterCountFailureReports :typeof CLUSTER_COUNT_FAILURE_REPORTS,   CLUSTER_COUNTKEYSINSLOT :typeof CLUSTER_COUNTKEYSINSLOT,   clusterCountKeysInSlot :typeof CLUSTER_COUNTKEYSINSLOT,   CLUSTER_DELSLOTS :typeof CLUSTER_DELSLOTS,   clusterDelSlots :typeof CLUSTER_DELSLOTS,   CLUSTER_DELSLOTSRANGE :typeof CLUSTER_DELSLOTSRANGE,   clusterDelSlotsRange :typeof CLUSTER_DELSLOTSRANGE,   CLUSTER_FAILOVER :typeof CLUSTER_FAILOVER,   clusterFailover :typeof CLUSTER_FAILOVER,   CLUSTER_FLUSHSLOTS :typeof CLUSTER_FLUSHSLOTS,   clusterFlushSlots :typeof CLUSTER_FLUSHSLOTS,   CLUSTER_FORGET :typeof CLUSTER_FORGET,   clusterForget :typeof CLUSTER_FORGET,   CLUSTER_GETKEYSINSLOT :typeof CLUSTER_GETKEYSINSLOT,   clusterGetKeysInSlot :typeof CLUSTER_GETKEYSINSLOT,   CLUSTER_INFO :typeof CLUSTER_INFO,   clusterInfo :typeof CLUSTER_INFO,   CLUSTER_KEYSLOT :typeof CLUSTER_KEYSLOT,   clusterKeySlot :typeof CLUSTER_KEYSLOT,   CLUSTER_LINKS :typeof CLUSTER_LINKS,   clusterLinks :typeof CLUSTER_LINKS,   CLUSTER_MEET :typeof CLUSTER_MEET,   clusterMeet :typeof CLUSTER_MEET,   CLUSTER_MYID :typeof CLUSTER_MYID,   clusterMyId :typeof CLUSTER_MYID,   CLUSTER_NODES :typeof CLUSTER_NODES,   clusterNodes :typeof CLUSTER_NODES,   CLUSTER_REPLICAS :typeof CLUSTER_REPLICAS,   clusterReplicas :typeof CLUSTER_REPLICAS,   CLUSTER_REPLICATE :typeof CLUSTER_REPLICATE,   clusterReplicate :typeof CLUSTER_REPLICATE,   CLUSTER_RESET :typeof CLUSTER_RESET,   clusterReset :typeof CLUSTER_RESET,   CLUSTER_SAVECONFIG :typeof CLUSTER_SAVECONFIG,   clusterSaveConfig :typeof CLUSTER_SAVECONFIG,   CLUSTER_SET_CONFIG_EPOCH :typeof CLUSTER_SET_CONFIG_EPOCH,   clusterSetConfigEpoch :typeof CLUSTER_SET_CONFIG_EPOCH,   CLUSTER_SETSLOT :typeof CLUSTER_SETSLOT,   clusterSetSlot :typeof CLUSTER_SETSLOT,   CLUSTER_SLOTS :typeof CLUSTER_SLOTS,   clusterSlots :typeof CLUSTER_SLOTS,   COMMAND_COUNT :typeof COMMAND_COUNT,   commandCount :typeof COMMAND_COUNT,   COMMAND_GETKEYS :typeof COMMAND_GETKEYS,   commandGetKeys :typeof COMMAND_GETKEYS,   COMMAND_GETKEYSANDFLAGS :typeof COMMAND_GETKEYSANDFLAGS,   commandGetKeysAndFlags :typeof COMMAND_GETKEYSANDFLAGS,   COMMAND_INFO :typeof COMMAND_INFO,   commandInfo :typeof COMMAND_INFO,   COMMAND_LIST :typeof COMMAND_LIST,   commandList :typeof COMMAND_LIST,   COMMAND :typeof COMMAND,   command :typeof COMMAND,   CONFIG_GET :typeof CONFIG_GET,   configGet :typeof CONFIG_GET,   CONFIG_RESETASTAT :typeof CONFIG_RESETASTAT,   configResetStat :typeof CONFIG_RESETASTAT,   CONFIG_REWRITE :typeof CONFIG_REWRITE,   configRewrite :typeof CONFIG_REWRITE,   CONFIG_SET :typeof CONFIG_SET,   configSet :typeof CONFIG_SET,   DBSIZE :typeof DBSIZE,   dbSize :typeof DBSIZE,   DISCARD :typeof DISCARD,   discard :typeof DISCARD,   ECHO :typeof ECHO,   echo :typeof ECHO,   FAILOVER :typeof FAILOVER,   failover :typeof FAILOVER,   FLUSHALL :typeof FLUSHALL,   flushAll :typeof FLUSHALL,   FLUSHDB :typeof FLUSHDB,   flushDb :typeof FLUSHDB,   FUNCTION_DELETE :typeof FUNCTION_DELETE,   functionDelete :typeof FUNCTION_DELETE,   FUNCTION_DUMP :typeof FUNCTION_DUMP,   functionDump :typeof FUNCTION_DUMP,   FUNCTION_FLUSH :typeof FUNCTION_FLUSH,   functionFlush :typeof FUNCTION_FLUSH,   FUNCTION_KILL :typeof FUNCTION_KILL,   functionKill :typeof FUNCTION_KILL,   FUNCTION_LIST_WITHCODE :typeof FUNCTION_LIST_WITHCODE,   functionListWithCode :typeof FUNCTION_LIST_WITHCODE,   FUNCTION_LIST :typeof FUNCTION_LIST,   functionList :typeof FUNCTION_LIST,   FUNCTION_LOAD :typeof FUNCTION_LOAD,   functionLoad :typeof FUNCTION_LOAD,   FUNCTION_RESTORE :typeof FUNCTION_RESTORE,   functionRestore :typeof FUNCTION_RESTORE,   FUNCTION_STATS :typeof FUNCTION_STATS,   functionStats :typeof FUNCTION_STATS,   HELLO :typeof HELLO,   hello :typeof HELLO,   INFO :typeof INFO,   info :typeof INFO,   KEYS :typeof KEYS,   keys :typeof KEYS,   LASTSAVE :typeof LASTSAVE,   lastSave :typeof LASTSAVE,   LATENCY_DOCTOR :typeof LATENCY_DOCTOR,   latencyDoctor :typeof LATENCY_DOCTOR,   LOLWUT :typeof LOLWUT,   lolwut :typeof LOLWUT,   MEMORY_DOCTOR :typeof MEMORY_DOCTOR,   memoryDoctor :typeof MEMORY_DOCTOR,   MEMORY_MALLOC-STATS :typeof MEMORY_MALLOC_STATS,   memoryMallocStats :typeof MEMORY_MALLOC_STATS,   MEMORY_PURGE :typeof MEMORY_PURGE,   memoryPurge :typeof MEMORY_PURGE,   MEMORY_STATS :typeof MEMORY_STATS,   memoryStats :typeof MEMORY_STATS,   MEMORY_USAGE :typeof MEMORY_USAGE,   memoryUsage :typeof MEMORY_USAGE,   MODULE_LIST :typeof MODULE_LIST,   moduleList :typeof MODULE_LIST,   MODULE_LOAD :typeof MODULE_LOAD,   moduleLoad :typeof MODULE_LOAD,   MODULE_UNLOAD :typeof MODULE_UNLOAD,   moduleUnload :typeof MODULE_UNLOAD,   MOVE :typeof MOVE,   move :typeof MOVE,   PING :typeof PING,   ping :typeof PING,   PUBSUB_CHANNELS :typeof PUBSUB_CHANNELS,   pubSubChannels :typeof PUBSUB_CHANNELS,   PUBSUB_NUMPAT :typeof PUBSUB_NUMPAT,   pubSubNumPat :typeof PUBSUB_NUMPAT,   PUBSUB_NUMSUB :typeof PUBSUB_NUMSUB,   pubSubNumSub :typeof PUBSUB_NUMSUB,   RANDOMKEY :typeof RANDOMKEY,   randomKey :typeof RANDOMKEY,   READONLY :typeof READONLY,   readonly :typeof READONLY,   READWRITE :typeof READWRITE,   readwrite :typeof READWRITE,   REPLICAOF :typeof REPLICAOF,   replicaOf :typeof REPLICAOF,   RESTORE-ASKING :typeof RESTORE_ASKING,   restoreAsking :typeof RESTORE_ASKING,   ROLE :typeof ROLE,   role :typeof ROLE,   SAVE :typeof SAVE,   save :typeof SAVE,   SCAN :typeof SCAN,   scan :typeof SCAN,   SCRIPT_DEBUG :typeof SCRIPT_DEBUG,   scriptDebug :typeof SCRIPT_DEBUG,   SCRIPT_EXISTS :typeof SCRIPT_EXISTS,   scriptExists :typeof SCRIPT_EXISTS,   SCRIPT_FLUSH :typeof SCRIPT_FLUSH,   scriptFlush :typeof SCRIPT_FLUSH,   SCRIPT_KILL :typeof SCRIPT_KILL,   scriptKill :typeof SCRIPT_KILL,   SCRIPT_LOAD :typeof SCRIPT_LOAD,   scriptLoad :typeof SCRIPT_LOAD,   SHUTDOWN :typeof SHUTDOWN,   shutdown :typeof SHUTDOWN,   SWAPDB :typeof SWAPDB,   swapDb :typeof SWAPDB,   TIME :typeof TIME,   time :typeof TIME,   UNWATCH :typeof UNWATCH,   unwatch :typeof UNWATCH,   WAIT :typeof WAIT,   wait :typeof WAIT,   APPEND :typeof imported_APPEND,   append :typeof imported_APPEND,   BITCOUNT :typeof imported_BITCOUNT,   bitCount :typeof imported_BITCOUNT,   BITFIELD_RO :typeof imported_BITFIELD_RO,   bitFieldRo :typeof imported_BITFIELD_RO,   BITFIELD :typeof imported_BITFIELD,   bitField :typeof imported_BITFIELD,   BITOP :typeof imported_BITOP,   bitOp :typeof imported_BITOP,   BITPOS :typeof imported_BITPOS,   bitPos :typeof imported_BITPOS,   BLMOVE :typeof imported_BLMOVE,   blMove :typeof imported_BLMOVE,   BLMPOP :typeof imported_BLMPOP,   blmPop :typeof imported_BLMPOP,   BLPOP :typeof imported_BLPOP,   blPop :typeof imported_BLPOP,   BRPOP :typeof imported_BRPOP,   brPop :typeof imported_BRPOP,   BRPOPLPUSH :typeof imported_BRPOPLPUSH,   brPopLPush :typeof imported_BRPOPLPUSH,   BZMPOP :typeof imported_BZMPOP,   bzmPop :typeof imported_BZMPOP,   BZPOPMAX :typeof imported_BZPOPMAX,   bzPopMax :typeof imported_BZPOPMAX,   BZPOPMIN :typeof imported_BZPOPMIN,   bzPopMin :typeof imported_BZPOPMIN,   COPY :typeof imported_COPY,   copy :typeof imported_COPY,   DECR :typeof imported_DECR,   decr :typeof imported_DECR,   DECRBY :typeof imported_DECRBY,   decrBy :typeof imported_DECRBY,   DEL :typeof imported_DEL,   del :typeof imported_DEL,   DUMP :typeof imported_DUMP,   dump :typeof imported_DUMP,   EVAL_RO :typeof imported_EVAL_RO,   evalRo :typeof imported_EVAL_RO,   EVAL :typeof imported_EVAL,   eval :typeof imported_EVAL,   EVALSHA :typeof imported_EVALSHA,   evalSha :typeof imported_EVALSHA,   EVALSHA_RO :typeof imported_EVALSHA_RO,   evalShaRo :typeof imported_EVALSHA_RO,   EXISTS :typeof imported_EXISTS,   exists :typeof imported_EXISTS,   EXPIRE :typeof imported_EXPIRE,   expire :typeof imported_EXPIRE,   EXPIREAT :typeof imported_EXPIREAT,   expireAt :typeof imported_EXPIREAT,   EXPIRETIME :typeof imported_EXPIRETIME,   expireTime :typeof imported_EXPIRETIME,   FCALL_RO :typeof imported_FCALL_RO,   fCallRo :typeof imported_FCALL_RO,   FCALL :typeof imported_FCALL,   fCall :typeof imported_FCALL,   GEOADD :typeof imported_GEOADD,   geoAdd :typeof imported_GEOADD,   GEODIST :typeof imported_GEODIST,   geoDist :typeof imported_GEODIST,   GEOHASH :typeof imported_GEOHASH,   geoHash :typeof imported_GEOHASH,   GEOPOS :typeof imported_GEOPOS,   geoPos :typeof imported_GEOPOS,   GEORADIUS_RO_WITH :typeof imported_GEORADIUS_RO_WITH,   geoRadiusRoWith :typeof imported_GEORADIUS_RO_WITH,   GEORADIUS_RO :typeof imported_GEORADIUS_RO,   geoRadiusRo :typeof imported_GEORADIUS_RO,   GEORADIUS_WITH :typeof imported_GEORADIUS_WITH,   geoRadiusWith :typeof imported_GEORADIUS_WITH,   GEORADIUS :typeof imported_GEORADIUS,   geoRadius :typeof imported_GEORADIUS,   GEORADIUSBYMEMBER_RO_WITH :typeof imported_GEORADIUSBYMEMBER_RO_WITH,   geoRadiusByMemberRoWith :typeof imported_GEORADIUSBYMEMBER_RO_WITH,   GEORADIUSBYMEMBER_RO :typeof imported_GEORADIUSBYMEMBER_RO,   geoRadiusByMemberRo :typeof imported_GEORADIUSBYMEMBER_RO,   GEORADIUSBYMEMBER_WITH :typeof imported_GEORADIUSBYMEMBER_WITH,   geoRadiusByMemberWith :typeof imported_GEORADIUSBYMEMBER_WITH,   GEORADIUSBYMEMBER :typeof imported_GEORADIUSBYMEMBER,   geoRadiusByMember :typeof imported_GEORADIUSBYMEMBER,   GEORADIUSBYMEMBERSTORE :typeof imported_GEORADIUSBYMEMBERSTORE,   geoRadiusByMemberStore :typeof imported_GEORADIUSBYMEMBERSTORE,   GEORADIUSSTORE :typeof imported_GEORADIUSSTORE,   geoRadiusStore :typeof imported_GEORADIUSSTORE,   GEOSEARCH_WITH :typeof imported_GEOSEARCH_WITH,   geoSearchWith :typeof imported_GEOSEARCH_WITH,   GEOSEARCH :typeof imported_GEOSEARCH,   geoSearch :typeof imported_GEOSEARCH,   GEOSEARCHSTORE :typeof imported_GEOSEARCHSTORE,   geoSearchStore :typeof imported_GEOSEARCHSTORE,   GET :typeof imported_GET,   get :typeof imported_GET,   GETBIT :typeof imported_GETBIT,   getBit :typeof imported_GETBIT,   GETDEL :typeof imported_GETDEL,   getDel :typeof imported_GETDEL,   GETEX :typeof imported_GETEX,   getEx :typeof imported_GETEX,   GETRANGE :typeof imported_GETRANGE,   getRange :typeof imported_GETRANGE,   GETSET :typeof imported_GETSET,   getSet :typeof imported_GETSET,   HDEL :typeof imported_HDEL,   hDel :typeof imported_HDEL,   HEXISTS :typeof imported_HEXISTS,   hExists :typeof imported_HEXISTS,   HGET :typeof imported_HGET,   hGet :typeof imported_HGET,   HGETALL :typeof imported_HGETALL,   hGetAll :typeof imported_HGETALL,   HINCRBY :typeof imported_HINCRBY,   hIncrBy :typeof imported_HINCRBY,   HINCRBYFLOAT :typeof imported_HINCRBYFLOAT,   hIncrByFloat :typeof imported_HINCRBYFLOAT,   HKEYS :typeof imported_HKEYS,   hKeys :typeof imported_HKEYS,   HLEN :typeof imported_HLEN,   hLen :typeof imported_HLEN,   HMGET :typeof imported_HMGET,   hmGet :typeof imported_HMGET,   HRANDFIELD_COUNT_WITHVALUES :typeof imported_HRANDFIELD_COUNT_WITHVALUES,   hRandFieldCountWithValues :typeof imported_HRANDFIELD_COUNT_WITHVALUES,   HRANDFIELD_COUNT :typeof imported_HRANDFIELD_COUNT,   hRandFieldCount :typeof imported_HRANDFIELD_COUNT,   HRANDFIELD :typeof imported_HRANDFIELD,   hRandField :typeof imported_HRANDFIELD,   HSCAN :typeof imported_HSCAN,   hScan :typeof imported_HSCAN,   HSET :typeof imported_HSET,   hSet :typeof imported_HSET,   HSETNX :typeof imported_HSETNX,   hSetNX :typeof imported_HSETNX,   HSTRLEN :typeof imported_HSTRLEN,   hStrLen :typeof imported_HSTRLEN,   HVALS :typeof imported_HVALS,   hVals :typeof imported_HVALS,   INCR :typeof imported_INCR,   incr :typeof imported_INCR,   INCRBY :typeof imported_INCRBY,   incrBy :typeof imported_INCRBY,   INCRBYFLOAT :typeof imported_INCRBYFLOAT,   incrByFloat :typeof imported_INCRBYFLOAT,   LCS_IDX_WITHMATCHLEN :typeof imported_LCS_IDX_WITHMATCHLEN,   lcsIdxWithMatchLen :typeof imported_LCS_IDX_WITHMATCHLEN,   LCS_IDX :typeof imported_LCS_IDX,   lcsIdx :typeof imported_LCS_IDX,   LCS_LEN :typeof imported_LCS_LEN,   lcsLen :typeof imported_LCS_LEN,   LCS :typeof imported_LCS,   lcs :typeof imported_LCS,   LINDEX :typeof imported_LINDEX,   lIndex :typeof imported_LINDEX,   LINSERT :typeof imported_LINSERT,   lInsert :typeof imported_LINSERT,   LLEN :typeof imported_LLEN,   lLen :typeof imported_LLEN,   LMOVE :typeof imported_LMOVE,   lMove :typeof imported_LMOVE,   LMPOP :typeof imported_LMPOP,   lmPop :typeof imported_LMPOP,   LPOP_COUNT :typeof imported_LPOP_COUNT,   lPopCount :typeof imported_LPOP_COUNT,   LPOP :typeof imported_LPOP,   lPop :typeof imported_LPOP,   LPOS_COUNT :typeof imported_LPOS_COUNT,   lPosCount :typeof imported_LPOS_COUNT,   LPOS :typeof imported_LPOS,   lPos :typeof imported_LPOS,   LPUSH :typeof imported_LPUSH,   lPush :typeof imported_LPUSH,   LPUSHX :typeof imported_LPUSHX,   lPushX :typeof imported_LPUSHX,   LRANGE :typeof imported_LRANGE,   lRange :typeof imported_LRANGE,   LREM :typeof imported_LREM,   lRem :typeof imported_LREM,   LSET :typeof imported_LSET,   lSet :typeof imported_LSET,   LTRIM :typeof imported_LTRIM,   lTrim :typeof imported_LTRIM,   MGET :typeof imported_MGET,   mGet :typeof imported_MGET,   MIGRATE :typeof imported_MIGRATE,   migrate :typeof imported_MIGRATE,   MSET :typeof imported_MSET,   mSet :typeof imported_MSET,   MSETNX :typeof imported_MSETNX,   mSetNX :typeof imported_MSETNX,   OBJECT_ENCODING :typeof imported_OBJECT_ENCODING,   objectEncoding :typeof imported_OBJECT_ENCODING,   OBJECT_FREQ :typeof imported_OBJECT_FREQ,   objectFreq :typeof imported_OBJECT_FREQ,   OBJECT_IDLETIME :typeof imported_OBJECT_IDLETIME,   objectIdleTime :typeof imported_OBJECT_IDLETIME,   OBJECT_REFCOUNT :typeof imported_OBJECT_REFCOUNT,   objectRefCount :typeof imported_OBJECT_REFCOUNT,   PERSIST :typeof imported_PERSIST,   persist :typeof imported_PERSIST,   PEXPIRE :typeof imported_PEXPIRE,   pExpire :typeof imported_PEXPIRE,   PEXPIREAT :typeof imported_PEXPIREAT,   pExpireAt :typeof imported_PEXPIREAT,   PEXPIRETIME :typeof imported_PEXPIRETIME,   pExpireTime :typeof imported_PEXPIRETIME,   PFADD :typeof imported_PFADD,   pfAdd :typeof imported_PFADD,   PFCOUNT :typeof imported_PFCOUNT,   pfCount :typeof imported_PFCOUNT,   PFMERGE :typeof imported_PFMERGE,   pfMerge :typeof imported_PFMERGE,   PSETEX :typeof imported_PSETEX,   pSetEx :typeof imported_PSETEX,   PTTL :typeof imported_PTTL,   pTTL :typeof imported_PTTL,   PUBLISH :typeof imported_PUBLISH,   publish :typeof imported_PUBLISH,   RENAME :typeof imported_RENAME,   rename :typeof imported_RENAME,   RENAMENX :typeof imported_RENAMENX,   renameNX :typeof imported_RENAMENX,   RPOP_COUNT :typeof imported_RPOP_COUNT,   rPopCount :typeof imported_RPOP_COUNT,   RPOP :typeof imported_RPOP,   rPop :typeof imported_RPOP,   RPOPLPUSH :typeof imported_RPOPLPUSH,   rPopLPush :typeof imported_RPOPLPUSH,   RPUSH :typeof imported_RPUSH,   rPush :typeof imported_RPUSH,   RPUSHX :typeof imported_RPUSHX,   rPushX :typeof imported_RPUSHX,   SADD :typeof imported_SADD,   sAdd :typeof imported_SADD,   SCARD :typeof imported_SCARD,   sCard :typeof imported_SCARD,   SDIFF :typeof imported_SDIFF,   sDiff :typeof imported_SDIFF,   SDIFFSTORE :typeof imported_SDIFFSTORE,   sDiffStore :typeof imported_SDIFFSTORE,   SINTER :typeof imported_SINTER,   sInter :typeof imported_SINTER,   SINTERCARD :typeof imported_SINTERCARD,   sInterCard :typeof imported_SINTERCARD,   SINTERSTORE :typeof imported_SINTERSTORE,   sInterStore :typeof imported_SINTERSTORE,   SET :typeof imported_SET,   set :typeof imported_SET,   SETBIT :typeof imported_SETBIT,   setBit :typeof imported_SETBIT,   SETEX :typeof imported_SETEX,   setEx :typeof imported_SETEX,   SETNX :typeof imported_SETNX,   setNX :typeof imported_SETNX,   SETRANGE :typeof imported_SETRANGE,   setRange :typeof imported_SETRANGE,   SISMEMBER :typeof imported_SISMEMBER,   sIsMember :typeof imported_SISMEMBER,   SMEMBERS :typeof imported_SMEMBERS,   sMembers :typeof imported_SMEMBERS,   SMISMEMBER :typeof imported_SMISMEMBER,   smIsMember :typeof imported_SMISMEMBER,   SMOVE :typeof imported_SMOVE,   sMove :typeof imported_SMOVE,   SORT_RO :typeof imported_SORT_RO,   sortRo :typeof imported_SORT_RO,   SORT_STORE :typeof imported_SORT_STORE,   sortStore :typeof imported_SORT_STORE,   SORT :typeof imported_SORT,   sort :typeof imported_SORT,   SPOP :typeof imported_SPOP,   sPop :typeof imported_SPOP,   SRANDMEMBER_COUNT :typeof imported_SRANDMEMBER_COUNT,   sRandMemberCount :typeof imported_SRANDMEMBER_COUNT,   SRANDMEMBER :typeof imported_SRANDMEMBER,   sRandMember :typeof imported_SRANDMEMBER,   SREM :typeof imported_SREM,   sRem :typeof imported_SREM,   SSCAN :typeof imported_SSCAN,   sScan :typeof imported_SSCAN,   STRLEN :typeof imported_STRLEN,   strLen :typeof imported_STRLEN,   SUNION :typeof imported_SUNION,   sUnion :typeof imported_SUNION,   SUNIONSTORE :typeof imported_SUNIONSTORE,   sUnionStore :typeof imported_SUNIONSTORE,   TOUCH :typeof imported_TOUCH,   touch :typeof imported_TOUCH,   TTL :typeof imported_TTL,   ttl :typeof imported_TTL,   TYPE :typeof imported_TYPE,   type :typeof imported_TYPE,   UNLINK :typeof imported_UNLINK,   unlink :typeof imported_UNLINK,   WATCH :typeof imported_WATCH,   watch :typeof imported_WATCH,   XACK :typeof imported_XACK,   xAck :typeof imported_XACK,   XADD :typeof imported_XADD,   xAdd :typeof imported_XADD,   XAUTOCLAIM_JUSTID :typeof imported_XAUTOCLAIM_JUSTID,   xAutoClaimJustId :typeof imported_XAUTOCLAIM_JUSTID,   XAUTOCLAIM :typeof imported_XAUTOCLAIM,   xAutoClaim :typeof imported_XAUTOCLAIM,   XCLAIM :typeof imported_XCLAIM,   xClaim :typeof imported_XCLAIM,   XCLAIM_JUSTID :typeof imported_XCLAIM_JUSTID,   xClaimJustId :typeof imported_XCLAIM_JUSTID,   XDEL :typeof imported_XDEL,   xDel :typeof imported_XDEL,   XGROUP_CREATE :typeof imported_XGROUP_CREATE,   xGroupCreate :typeof imported_XGROUP_CREATE,   XGROUP_CREATECONSUMER :typeof imported_XGROUP_CREATECONSUMER,   xGroupCreateConsumer :typeof imported_XGROUP_CREATECONSUMER,   XGROUP_DELCONSUMER :typeof imported_XGROUP_DELCONSUMER,   xGroupDelConsumer :typeof imported_XGROUP_DELCONSUMER,   XGROUP_DESTROY :typeof imported_XGROUP_DESTROY,   xGroupDestroy :typeof imported_XGROUP_DESTROY,   XGROUP_SETID :typeof imported_XGROUP_SETID,   xGroupSetId :typeof imported_XGROUP_SETID,   XINFO_CONSUMERS :typeof imported_XINFO_CONSUMERS,   xInfoConsumers :typeof imported_XINFO_CONSUMERS,   XINFO_GROUPS :typeof imported_XINFO_GROUPS,   xInfoGroups :typeof imported_XINFO_GROUPS,   XINFO_STREAM :typeof imported_XINFO_STREAM,   xInfoStream :typeof imported_XINFO_STREAM,   XLEN :typeof imported_XLEN,   xLen :typeof imported_XLEN,   XPENDING_RANGE :typeof imported_XPENDING_RANGE,   xPendingRange :typeof imported_XPENDING_RANGE,   XPENDING :typeof imported_XPENDING,   xPending :typeof imported_XPENDING,   XRANGE :typeof imported_XRANGE,   xRange :typeof imported_XRANGE,   XREAD :typeof imported_XREAD,   xRead :typeof imported_XREAD,   XREADGROUP :typeof imported_XREADGROUP,   xReadGroup :typeof imported_XREADGROUP,   XREVRANGE :typeof imported_XREVRANGE,   xRevRange :typeof imported_XREVRANGE,   XSETID :typeof imported_XSETID,   xSetId :typeof imported_XSETID,   XTRIM :typeof imported_XTRIM,   xTrim :typeof imported_XTRIM,   ZADD :typeof imported_ZADD,   zAdd :typeof imported_ZADD,   ZCARD :typeof imported_ZCARD,   zCard :typeof imported_ZCARD,   ZCOUNT :typeof imported_ZCOUNT,   zCount :typeof imported_ZCOUNT,   ZDIFF_WITHSCORES :typeof imported_ZDIFF_WITHSCORES,   zDiffWithScores :typeof imported_ZDIFF_WITHSCORES,   ZDIFF :typeof imported_ZDIFF,   zDiff :typeof imported_ZDIFF,   ZDIFFSTORE :typeof imported_ZDIFFSTORE,   zDiffStore :typeof imported_ZDIFFSTORE,   ZINCRBY :typeof imported_ZINCRBY,   zIncrBy :typeof imported_ZINCRBY,   ZINTER_WITHSCORES :typeof imported_ZINTER_WITHSCORES,   zInterWithScores :typeof imported_ZINTER_WITHSCORES,   ZINTER :typeof imported_ZINTER,   zInter :typeof imported_ZINTER,   ZINTERCARD :typeof imported_ZINTERCARD,   zInterCard :typeof imported_ZINTERCARD,   ZINTERSTORE :typeof imported_ZINTERSTORE,   zInterStore :typeof imported_ZINTERSTORE,   ZLEXCOUNT :typeof imported_ZLEXCOUNT,   zLexCount :typeof imported_ZLEXCOUNT,   ZMPOP :typeof imported_ZMPOP,   zmPop :typeof imported_ZMPOP,   ZMSCORE :typeof imported_ZMSCORE,   zmScore :typeof imported_ZMSCORE,   ZPOPMAX_COUNT :typeof imported_ZPOPMAX_COUNT,   zPopMaxCount :typeof imported_ZPOPMAX_COUNT,   ZPOPMAX :typeof imported_ZPOPMAX,   zPopMax :typeof imported_ZPOPMAX,   ZPOPMIN_COUNT :typeof imported_ZPOPMIN_COUNT,   zPopMinCount :typeof imported_ZPOPMIN_COUNT,   ZPOPMIN :typeof imported_ZPOPMIN,   zPopMin :typeof imported_ZPOPMIN,   ZRANDMEMBER_COUNT_WITHSCORES :typeof imported_ZRANDMEMBER_COUNT_WITHSCORES,   zRandMemberCountWithScores :typeof imported_ZRANDMEMBER_COUNT_WITHSCORES,   ZRANDMEMBER_COUNT :typeof imported_ZRANDMEMBER_COUNT,   zRandMemberCount :typeof imported_ZRANDMEMBER_COUNT,   ZRANDMEMBER :typeof imported_ZRANDMEMBER,   zRandMember :typeof imported_ZRANDMEMBER,   ZRANGE_WITHSCORES :typeof imported_ZRANGE_WITHSCORES,   zRangeWithScores :typeof imported_ZRANGE_WITHSCORES,   ZRANGE :typeof imported_ZRANGE,   zRange :typeof imported_ZRANGE,   ZRANGEBYLEX :typeof imported_ZRANGEBYLEX,   zRangeByLex :typeof imported_ZRANGEBYLEX,   ZRANGEBYSCORE_WITHSCORES :typeof imported_ZRANGEBYSCORE_WITHSCORES,   zRangeByScoreWithScores :typeof imported_ZRANGEBYSCORE_WITHSCORES,   ZRANGEBYSCORE :typeof imported_ZRANGEBYSCORE,   zRangeByScore :typeof imported_ZRANGEBYSCORE,   ZRANGESTORE :typeof imported_ZRANGESTORE,   zRangeStore :typeof imported_ZRANGESTORE,   ZRANK :typeof imported_ZRANK,   zRank :typeof imported_ZRANK,   ZREM :typeof imported_ZREM,   zRem :typeof imported_ZREM,   ZREMRANGEBYLEX :typeof imported_ZREMRANGEBYLEX,   zRemRangeByLex :typeof imported_ZREMRANGEBYLEX,   ZREMRANGEBYRANK :typeof imported_ZREMRANGEBYRANK,   zRemRangeByRank :typeof imported_ZREMRANGEBYRANK,   ZREMRANGEBYSCORE :typeof imported_ZREMRANGEBYSCORE,   zRemRangeByScore :typeof imported_ZREMRANGEBYSCORE,   ZREVRANK :typeof imported_ZREVRANK,   zRevRank :typeof imported_ZREVRANK,   ZSCAN :typeof imported_ZSCAN,   zScan :typeof imported_ZSCAN,   ZSCORE :typeof imported_ZSCORE,   zScore :typeof imported_ZSCORE,   ZUNION_WITHSCORES :typeof imported_ZUNION_WITHSCORES,   zUnionWithScores :typeof imported_ZUNION_WITHSCORES,   ZUNION :typeof imported_ZUNION,   zUnion :typeof imported_ZUNION,   ZUNIONSTORE :typeof imported_ZUNIONSTORE,   zUnionStore :typeof imported_ZUNIONSTORE}[P], M, F, S>} */
  trait WithCommands[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    @JSName("ACL_CAT")
    var ACL_CAT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_CAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_CAT")
    def ACL_CAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_CAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_DELUSER")
    var ACL_DELUSER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_DELUSER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_DELUSER")
    def ACL_DELUSER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_DELUSER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_DRYRUN")
    var ACL_DRYRUN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_DRYRUN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_DRYRUN")
    def ACL_DRYRUN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_DRYRUN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_GENPASS")
    var ACL_GENPASS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_GENPASS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_GENPASS")
    def ACL_GENPASS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_GENPASS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_GETUSER")
    var ACL_GETUSER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_GETUSER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_GETUSER")
    def ACL_GETUSER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_GETUSER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_LIST")
    var ACL_LIST_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_LIST")
    def ACL_LIST_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_LOAD")
    var ACL_LOAD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_LOAD")
    def ACL_LOAD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_LOG")
    var ACL_LOG_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOG */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ACL_LOG_RESET")
    var ACL_LOG_RESET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOG_RESET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_LOG_RESET")
    def ACL_LOG_RESET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOG_RESET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_LOG")
    def ACL_LOG_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOG['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_SAVE")
    var ACL_SAVE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_SAVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_SAVE")
    def ACL_SAVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_SAVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_SETUSER")
    var ACL_SETUSER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_SETUSER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_SETUSER")
    def ACL_SETUSER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_SETUSER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_USERS")
    var ACL_USERS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_USERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_USERS")
    def ACL_USERS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_USERS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ACL_WHOAMI")
    var ACL_WHOAMI_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_WHOAMI */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ACL_WHOAMI")
    def ACL_WHOAMI_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_WHOAMI['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("APPEND")
    var APPEND_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_APPEND */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("APPEND")
    def APPEND_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_APPEND['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ASKING")
    var ASKING_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ASKING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ASKING")
    def ASKING_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ASKING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("AUTH")
    var AUTH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof AUTH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("AUTH")
    def AUTH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof AUTH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BGREWRITEAOF")
    var BGREWRITEAOF_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BGREWRITEAOF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BGREWRITEAOF")
    def BGREWRITEAOF_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BGREWRITEAOF['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BGSAVE")
    var BGSAVE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BGSAVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BGSAVE")
    def BGSAVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BGSAVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BITCOUNT")
    var BITCOUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BITCOUNT")
    def BITCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BITFIELD")
    var BITFIELD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITFIELD */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("BITFIELD_RO")
    var BITFIELD_RO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITFIELD_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BITFIELD_RO")
    def BITFIELD_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITFIELD_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BITFIELD")
    def BITFIELD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITFIELD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BITOP")
    var BITOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BITOP")
    def BITOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BITPOS")
    var BITPOS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BITPOS")
    def BITPOS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITPOS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BLMOVE")
    var BLMOVE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BLMOVE")
    def BLMOVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BLMPOP")
    var BLMPOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BLMPOP")
    def BLMPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BLPOP")
    var BLPOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BLPOP")
    def BLPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BRPOPLPUSH")
    var BRPOPLPUSH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BRPOPLPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BRPOPLPUSH")
    def BRPOPLPUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BRPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BRPOP")
    var BRPOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BRPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BRPOP")
    def BRPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BRPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BZMPOP")
    var BZMPOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BZMPOP")
    def BZMPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BZPOPMAX")
    var BZPOPMAX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZPOPMAX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BZPOPMAX")
    def BZPOPMAX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZPOPMAX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("BZPOPMIN")
    var BZPOPMIN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZPOPMIN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("BZPOPMIN")
    def BZPOPMIN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZPOPMIN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_CACHING")
    var CLIENT_CACHING_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_CACHING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_CACHING")
    def CLIENT_CACHING_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_CACHING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_GETNAME")
    var CLIENT_GETNAME_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_GETNAME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_GETNAME")
    def CLIENT_GETNAME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_GETNAME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_GETREDIR")
    var CLIENT_GETREDIR_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_GETREDIR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_GETREDIR")
    def CLIENT_GETREDIR_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_GETREDIR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_ID")
    var CLIENT_ID_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_ID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_ID")
    def CLIENT_ID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_ID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_INFO")
    var CLIENT_INFO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_INFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_INFO")
    def CLIENT_INFO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_INFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_KILL")
    var CLIENT_KILL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_KILL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_KILL")
    def CLIENT_KILL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_KILL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_NO-EVICT")
    var `CLIENT_NO-EVICT_Original`: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_NO_EVICT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_NO-EVICT")
    def `CLIENT_NO-EVICT_transformArguments`(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_NO_EVICT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_PAUSE")
    var CLIENT_PAUSE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_PAUSE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_PAUSE")
    def CLIENT_PAUSE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_PAUSE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_SETNAME")
    var CLIENT_SETNAME_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_SETNAME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_SETNAME")
    def CLIENT_SETNAME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_SETNAME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_TRACKINGINFO")
    var CLIENT_TRACKINGINFO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_TRACKINGINFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_TRACKINGINFO")
    def CLIENT_TRACKINGINFO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_TRACKINGINFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_TRACKING")
    var CLIENT_TRACKING_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_TRACKING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_TRACKING")
    def CLIENT_TRACKING_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_TRACKING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLIENT_UNPAUSE")
    var CLIENT_UNPAUSE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_UNPAUSE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLIENT_UNPAUSE")
    def CLIENT_UNPAUSE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_UNPAUSE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_ADDSLOTSRANGE")
    var CLUSTER_ADDSLOTSRANGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_ADDSLOTSRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_ADDSLOTSRANGE")
    def CLUSTER_ADDSLOTSRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_ADDSLOTSRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_ADDSLOTS")
    var CLUSTER_ADDSLOTS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_ADDSLOTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_ADDSLOTS")
    def CLUSTER_ADDSLOTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_ADDSLOTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_BUMPEPOCH")
    var CLUSTER_BUMPEPOCH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_BUMPEPOCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_BUMPEPOCH")
    def CLUSTER_BUMPEPOCH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_BUMPEPOCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_COUNTKEYSINSLOT")
    var CLUSTER_COUNTKEYSINSLOT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_COUNTKEYSINSLOT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_COUNTKEYSINSLOT")
    def CLUSTER_COUNTKEYSINSLOT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_COUNTKEYSINSLOT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_COUNT_FAILURE_REPORTS")
    var CLUSTER_COUNT_FAILURE_REPORTS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_COUNT_FAILURE_REPORTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_COUNT_FAILURE_REPORTS")
    def CLUSTER_COUNT_FAILURE_REPORTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_COUNT_FAILURE_REPORTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_DELSLOTSRANGE")
    var CLUSTER_DELSLOTSRANGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_DELSLOTSRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_DELSLOTSRANGE")
    def CLUSTER_DELSLOTSRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_DELSLOTSRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_DELSLOTS")
    var CLUSTER_DELSLOTS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_DELSLOTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_DELSLOTS")
    def CLUSTER_DELSLOTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_DELSLOTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_FAILOVER")
    var CLUSTER_FAILOVER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FAILOVER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_FAILOVER")
    def CLUSTER_FAILOVER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FAILOVER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_FLUSHSLOTS")
    var CLUSTER_FLUSHSLOTS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FLUSHSLOTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_FLUSHSLOTS")
    def CLUSTER_FLUSHSLOTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FLUSHSLOTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_FORGET")
    var CLUSTER_FORGET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FORGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_FORGET")
    def CLUSTER_FORGET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FORGET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_GETKEYSINSLOT")
    var CLUSTER_GETKEYSINSLOT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_GETKEYSINSLOT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_GETKEYSINSLOT")
    def CLUSTER_GETKEYSINSLOT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_GETKEYSINSLOT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_INFO")
    var CLUSTER_INFO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_INFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_INFO")
    def CLUSTER_INFO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_INFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_KEYSLOT")
    var CLUSTER_KEYSLOT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_KEYSLOT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_KEYSLOT")
    def CLUSTER_KEYSLOT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_KEYSLOT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_LINKS")
    var CLUSTER_LINKS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_LINKS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_LINKS")
    def CLUSTER_LINKS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_LINKS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_MEET")
    var CLUSTER_MEET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_MEET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_MEET")
    def CLUSTER_MEET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_MEET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_MYID")
    var CLUSTER_MYID_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_MYID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_MYID")
    def CLUSTER_MYID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_MYID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_NODES")
    var CLUSTER_NODES_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_NODES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_NODES")
    def CLUSTER_NODES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_NODES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_REPLICAS")
    var CLUSTER_REPLICAS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_REPLICAS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_REPLICAS")
    def CLUSTER_REPLICAS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_REPLICAS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_REPLICATE")
    var CLUSTER_REPLICATE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_REPLICATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_REPLICATE")
    def CLUSTER_REPLICATE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_REPLICATE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_RESET")
    var CLUSTER_RESET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_RESET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_RESET")
    def CLUSTER_RESET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_RESET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_SAVECONFIG")
    var CLUSTER_SAVECONFIG_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SAVECONFIG */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_SAVECONFIG")
    def CLUSTER_SAVECONFIG_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SAVECONFIG['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_SETSLOT")
    var CLUSTER_SETSLOT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SETSLOT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_SETSLOT")
    def CLUSTER_SETSLOT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SETSLOT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_SET_CONFIG_EPOCH")
    var CLUSTER_SET_CONFIG_EPOCH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SET_CONFIG_EPOCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_SET_CONFIG_EPOCH")
    def CLUSTER_SET_CONFIG_EPOCH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SET_CONFIG_EPOCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CLUSTER_SLOTS")
    var CLUSTER_SLOTS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SLOTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CLUSTER_SLOTS")
    def CLUSTER_SLOTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SLOTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("COMMAND_COUNT")
    var COMMAND_COUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("COMMAND_COUNT")
    def COMMAND_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("COMMAND_GETKEYSANDFLAGS")
    var COMMAND_GETKEYSANDFLAGS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_GETKEYSANDFLAGS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("COMMAND_GETKEYSANDFLAGS")
    def COMMAND_GETKEYSANDFLAGS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_GETKEYSANDFLAGS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("COMMAND_GETKEYS")
    var COMMAND_GETKEYS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_GETKEYS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("COMMAND_GETKEYS")
    def COMMAND_GETKEYS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_GETKEYS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("COMMAND_INFO")
    var COMMAND_INFO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_INFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("COMMAND_INFO")
    def COMMAND_INFO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_INFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("COMMAND_LIST")
    var COMMAND_LIST_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_LIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("COMMAND_LIST")
    def COMMAND_LIST_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_LIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("COMMAND")
    var COMMAND_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("COMMAND")
    def COMMAND_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CONFIG_GET")
    var CONFIG_GET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_GET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CONFIG_GET")
    def CONFIG_GET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_GET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CONFIG_RESETASTAT")
    var CONFIG_RESETASTAT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_RESETASTAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CONFIG_RESETASTAT")
    def CONFIG_RESETASTAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_RESETASTAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CONFIG_REWRITE")
    var CONFIG_REWRITE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_REWRITE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CONFIG_REWRITE")
    def CONFIG_REWRITE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_REWRITE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("CONFIG_SET")
    var CONFIG_SET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_SET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("CONFIG_SET")
    def CONFIG_SET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_SET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("COPY")
    var COPY_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_COPY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("COPY")
    def COPY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_COPY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("DBSIZE")
    var DBSIZE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DBSIZE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DBSIZE")
    def DBSIZE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DBSIZE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("DECRBY")
    var DECRBY_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DECRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DECRBY")
    def DECRBY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DECRBY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("DECR")
    var DECR_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DECR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DECR")
    def DECR_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DECR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("DEL")
    var DEL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DEL")
    def DEL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DEL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("DISCARD")
    var DISCARD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DISCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DISCARD")
    def DISCARD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DISCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("DUMP")
    var DUMP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DUMP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("DUMP")
    def DUMP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DUMP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ECHO")
    var ECHO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ECHO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ECHO")
    def ECHO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ECHO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("EVALSHA")
    var EVALSHA_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVALSHA */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("EVALSHA_RO")
    var EVALSHA_RO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVALSHA_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EVALSHA_RO")
    def EVALSHA_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVALSHA_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("EVALSHA")
    def EVALSHA_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVALSHA['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("EVAL")
    var EVAL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVAL */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("EVAL_RO")
    var EVAL_RO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVAL_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EVAL_RO")
    def EVAL_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVAL_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("EVAL")
    def EVAL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVAL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("EXISTS")
    var EXISTS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EXISTS")
    def EXISTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("EXPIREAT")
    var EXPIREAT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIREAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EXPIREAT")
    def EXPIREAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIREAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("EXPIRETIME")
    var EXPIRETIME_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIRETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EXPIRETIME")
    def EXPIRETIME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIRETIME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("EXPIRE")
    var EXPIRE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIRE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("EXPIRE")
    def EXPIRE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIRE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FAILOVER")
    var FAILOVER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FAILOVER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FAILOVER")
    def FAILOVER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FAILOVER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FCALL")
    var FCALL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_FCALL */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("FCALL_RO")
    var FCALL_RO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_FCALL_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FCALL_RO")
    def FCALL_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_FCALL_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FCALL")
    def FCALL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_FCALL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FLUSHALL")
    var FLUSHALL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FLUSHALL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FLUSHALL")
    def FLUSHALL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FLUSHALL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FLUSHDB")
    var FLUSHDB_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FLUSHDB */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FLUSHDB")
    def FLUSHDB_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FLUSHDB['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FUNCTION_DELETE")
    var FUNCTION_DELETE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_DELETE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FUNCTION_DELETE")
    def FUNCTION_DELETE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_DELETE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FUNCTION_DUMP")
    var FUNCTION_DUMP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_DUMP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FUNCTION_DUMP")
    def FUNCTION_DUMP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_DUMP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FUNCTION_FLUSH")
    var FUNCTION_FLUSH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_FLUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FUNCTION_FLUSH")
    def FUNCTION_FLUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_FLUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FUNCTION_KILL")
    var FUNCTION_KILL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_KILL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FUNCTION_KILL")
    def FUNCTION_KILL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_KILL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FUNCTION_LIST")
    var FUNCTION_LIST_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LIST */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("FUNCTION_LIST_WITHCODE")
    var FUNCTION_LIST_WITHCODE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LIST_WITHCODE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FUNCTION_LIST_WITHCODE")
    def FUNCTION_LIST_WITHCODE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LIST_WITHCODE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FUNCTION_LIST")
    def FUNCTION_LIST_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FUNCTION_LOAD")
    var FUNCTION_LOAD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FUNCTION_LOAD")
    def FUNCTION_LOAD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FUNCTION_RESTORE")
    var FUNCTION_RESTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_RESTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FUNCTION_RESTORE")
    def FUNCTION_RESTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_RESTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("FUNCTION_STATS")
    var FUNCTION_STATS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_STATS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("FUNCTION_STATS")
    def FUNCTION_STATS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_STATS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEOADD")
    var GEOADD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOADD")
    def GEOADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEODIST")
    var GEODIST_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEODIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEODIST")
    def GEODIST_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEODIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEOHASH")
    var GEOHASH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOHASH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOHASH")
    def GEOHASH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOHASH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEOPOS")
    var GEOPOS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOPOS")
    def GEOPOS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOPOS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBERSTORE")
    var GEORADIUSBYMEMBERSTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUSBYMEMBERSTORE")
    def GEORADIUSBYMEMBERSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBER")
    var GEORADIUSBYMEMBER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEORADIUSBYMEMBER_RO")
    var GEORADIUSBYMEMBER_RO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEORADIUSBYMEMBER_RO_WITH")
    var GEORADIUSBYMEMBER_RO_WITH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUSBYMEMBER_RO_WITH")
    def GEORADIUSBYMEMBER_RO_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBER_RO")
    def GEORADIUSBYMEMBER_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBER_WITH")
    var GEORADIUSBYMEMBER_WITH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUSBYMEMBER_WITH")
    def GEORADIUSBYMEMBER_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSBYMEMBER")
    def GEORADIUSBYMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUSSTORE")
    var GEORADIUSSTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUSSTORE")
    def GEORADIUSSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUS")
    var GEORADIUS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEORADIUS_RO")
    var GEORADIUS_RO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEORADIUS_RO_WITH")
    var GEORADIUS_RO_WITH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_RO_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUS_RO_WITH")
    def GEORADIUS_RO_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_RO_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUS_RO")
    def GEORADIUS_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUS_WITH")
    var GEORADIUS_WITH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEORADIUS_WITH")
    def GEORADIUS_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEORADIUS")
    def GEORADIUS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEOSEARCHSTORE")
    var GEOSEARCHSTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCHSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOSEARCHSTORE")
    def GEOSEARCHSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCHSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEOSEARCH")
    var GEOSEARCH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCH */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("GEOSEARCH_WITH")
    var GEOSEARCH_WITH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCH_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GEOSEARCH_WITH")
    def GEOSEARCH_WITH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCH_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GEOSEARCH")
    def GEOSEARCH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GETBIT")
    var GETBIT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETBIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETBIT")
    def GETBIT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETBIT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GETDEL")
    var GETDEL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETDEL")
    def GETDEL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETDEL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GETEX")
    var GETEX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETEX")
    def GETEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GETRANGE")
    var GETRANGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETRANGE")
    def GETRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GETSET")
    var GETSET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GETSET")
    def GETSET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETSET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("GET")
    var GET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("GET")
    def GET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HDEL")
    var HDEL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HDEL")
    def HDEL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HDEL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HELLO")
    var HELLO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HELLO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HELLO")
    def HELLO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HELLO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HEXISTS")
    var HEXISTS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HEXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HEXISTS")
    def HEXISTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HEXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HGETALL")
    var HGETALL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HGETALL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HGETALL")
    def HGETALL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HGETALL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HGET")
    var HGET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HGET")
    def HGET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HGET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HINCRBYFLOAT")
    var HINCRBYFLOAT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HINCRBYFLOAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HINCRBYFLOAT")
    def HINCRBYFLOAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HINCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HINCRBY")
    var HINCRBY_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HINCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HINCRBY")
    def HINCRBY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HINCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HKEYS")
    var HKEYS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HKEYS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HKEYS")
    def HKEYS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HKEYS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HLEN")
    var HLEN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HLEN")
    def HLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HMGET")
    var HMGET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HMGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HMGET")
    def HMGET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HMGET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HRANDFIELD_COUNT")
    var HRANDFIELD_COUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("HRANDFIELD_COUNT_WITHVALUES")
    var HRANDFIELD_COUNT_WITHVALUES_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD_COUNT_WITHVALUES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HRANDFIELD_COUNT_WITHVALUES")
    def HRANDFIELD_COUNT_WITHVALUES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HRANDFIELD_COUNT")
    def HRANDFIELD_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HRANDFIELD")
    var HRANDFIELD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HRANDFIELD")
    def HRANDFIELD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HSCAN")
    var HSCAN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HSCAN")
    def HSCAN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HSETNX")
    var HSETNX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HSETNX")
    def HSETNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSETNX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HSET")
    var HSET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HSET")
    def HSET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HSTRLEN")
    var HSTRLEN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSTRLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HSTRLEN")
    def HSTRLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSTRLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("HVALS")
    var HVALS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HVALS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("HVALS")
    def HVALS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HVALS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("INCRBYFLOAT")
    var INCRBYFLOAT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCRBYFLOAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("INCRBYFLOAT")
    def INCRBYFLOAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("INCRBY")
    var INCRBY_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("INCRBY")
    def INCRBY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("INCR")
    var INCR_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("INCR")
    def INCR_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("INFO")
    var INFO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("INFO")
    def INFO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("KEYS")
    var KEYS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof KEYS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("KEYS")
    def KEYS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof KEYS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LASTSAVE")
    var LASTSAVE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LASTSAVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LASTSAVE")
    def LASTSAVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LASTSAVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LATENCY_DOCTOR")
    var LATENCY_DOCTOR_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LATENCY_DOCTOR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LATENCY_DOCTOR")
    def LATENCY_DOCTOR_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LATENCY_DOCTOR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LCS_IDX")
    var LCS_IDX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_IDX */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("LCS_IDX_WITHMATCHLEN")
    var LCS_IDX_WITHMATCHLEN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_IDX_WITHMATCHLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LCS_IDX_WITHMATCHLEN")
    def LCS_IDX_WITHMATCHLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LCS_IDX")
    def LCS_IDX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_IDX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LCS_LEN")
    var LCS_LEN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_LEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LCS_LEN")
    def LCS_LEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_LEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LCS")
    var LCS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LCS")
    def LCS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LINDEX")
    var LINDEX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LINDEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LINDEX")
    def LINDEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LINDEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LINSERT")
    var LINSERT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LINSERT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LINSERT")
    def LINSERT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LINSERT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LLEN")
    var LLEN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LLEN")
    def LLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LMOVE")
    var LMOVE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LMOVE")
    def LMOVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LMPOP")
    var LMPOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LMPOP")
    def LMPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LOLWUT")
    var LOLWUT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LOLWUT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LOLWUT")
    def LOLWUT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LOLWUT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LPOP_COUNT")
    var LPOP_COUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOP_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPOP_COUNT")
    def LPOP_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LPOP")
    var LPOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPOP")
    def LPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LPOS_COUNT")
    var LPOS_COUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOS_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPOS_COUNT")
    def LPOS_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOS_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LPOS")
    var LPOS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPOS")
    def LPOS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LPUSHX")
    var LPUSHX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPUSHX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPUSHX")
    def LPUSHX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPUSHX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LPUSH")
    var LPUSH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LPUSH")
    def LPUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LRANGE")
    var LRANGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LRANGE")
    def LRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LREM")
    var LREM_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LREM")
    def LREM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LREM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LSET")
    var LSET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LSET")
    def LSET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LSET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("LTRIM")
    var LTRIM_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LTRIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("LTRIM")
    def LTRIM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LTRIM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MEMORY_DOCTOR")
    var MEMORY_DOCTOR_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_DOCTOR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MEMORY_DOCTOR")
    def MEMORY_DOCTOR_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_DOCTOR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MEMORY_MALLOC-STATS")
    var `MEMORY_MALLOC-STATS_Original`: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_MALLOC_STATS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MEMORY_MALLOC-STATS")
    def `MEMORY_MALLOC-STATS_transformArguments`(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_MALLOC_STATS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MEMORY_PURGE")
    var MEMORY_PURGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_PURGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MEMORY_PURGE")
    def MEMORY_PURGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_PURGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MEMORY_STATS")
    var MEMORY_STATS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_STATS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MEMORY_STATS")
    def MEMORY_STATS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_STATS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MEMORY_USAGE")
    var MEMORY_USAGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_USAGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MEMORY_USAGE")
    def MEMORY_USAGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_USAGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MGET")
    var MGET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MGET")
    def MGET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MGET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MIGRATE")
    var MIGRATE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MIGRATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MIGRATE")
    def MIGRATE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MIGRATE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MODULE_LIST")
    var MODULE_LIST_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_LIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MODULE_LIST")
    def MODULE_LIST_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_LIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MODULE_LOAD")
    var MODULE_LOAD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_LOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MODULE_LOAD")
    def MODULE_LOAD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_LOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MODULE_UNLOAD")
    var MODULE_UNLOAD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_UNLOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MODULE_UNLOAD")
    def MODULE_UNLOAD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_UNLOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MOVE")
    var MOVE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MOVE")
    def MOVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MOVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MSETNX")
    var MSETNX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MSETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MSETNX")
    def MSETNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MSETNX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("MSET")
    var MSET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("MSET")
    def MSET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MSET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("OBJECT_ENCODING")
    var OBJECT_ENCODING_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_ENCODING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("OBJECT_ENCODING")
    def OBJECT_ENCODING_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_ENCODING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("OBJECT_FREQ")
    var OBJECT_FREQ_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_FREQ */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("OBJECT_FREQ")
    def OBJECT_FREQ_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_FREQ['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("OBJECT_IDLETIME")
    var OBJECT_IDLETIME_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_IDLETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("OBJECT_IDLETIME")
    def OBJECT_IDLETIME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_IDLETIME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("OBJECT_REFCOUNT")
    var OBJECT_REFCOUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_REFCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("OBJECT_REFCOUNT")
    def OBJECT_REFCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_REFCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PERSIST")
    var PERSIST_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PERSIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PERSIST")
    def PERSIST_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PERSIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PEXPIREAT")
    var PEXPIREAT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIREAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PEXPIREAT")
    def PEXPIREAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIREAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PEXPIRETIME")
    var PEXPIRETIME_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIRETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PEXPIRETIME")
    def PEXPIRETIME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIRETIME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PEXPIRE")
    var PEXPIRE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIRE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PEXPIRE")
    def PEXPIRE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIRE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PFADD")
    var PFADD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PFADD")
    def PFADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PFCOUNT")
    var PFCOUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PFCOUNT")
    def PFCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PFMERGE")
    var PFMERGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFMERGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PFMERGE")
    def PFMERGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFMERGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PING")
    var PING_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PING")
    def PING_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PSETEX")
    var PSETEX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PSETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PSETEX")
    def PSETEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PSETEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PTTL")
    var PTTL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PTTL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PTTL")
    def PTTL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PTTL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PUBLISH")
    var PUBLISH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PUBLISH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PUBLISH")
    def PUBLISH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PUBLISH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PUBSUB_CHANNELS")
    var PUBSUB_CHANNELS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_CHANNELS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PUBSUB_CHANNELS")
    def PUBSUB_CHANNELS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_CHANNELS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PUBSUB_NUMPAT")
    var PUBSUB_NUMPAT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_NUMPAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PUBSUB_NUMPAT")
    def PUBSUB_NUMPAT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_NUMPAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("PUBSUB_NUMSUB")
    var PUBSUB_NUMSUB_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_NUMSUB */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("PUBSUB_NUMSUB")
    def PUBSUB_NUMSUB_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_NUMSUB['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("RANDOMKEY")
    var RANDOMKEY_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RANDOMKEY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RANDOMKEY")
    def RANDOMKEY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RANDOMKEY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("READONLY")
    var READONLY_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof READONLY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("READONLY")
    def READONLY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof READONLY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("READWRITE")
    var READWRITE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof READWRITE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("READWRITE")
    def READWRITE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof READWRITE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("RENAMENX")
    var RENAMENX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RENAMENX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RENAMENX")
    def RENAMENX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RENAMENX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("RENAME")
    var RENAME_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RENAME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RENAME")
    def RENAME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RENAME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("REPLICAOF")
    var REPLICAOF_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof REPLICAOF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("REPLICAOF")
    def REPLICAOF_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof REPLICAOF['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("RESTORE-ASKING")
    var `RESTORE-ASKING_Original`: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RESTORE_ASKING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RESTORE-ASKING")
    def `RESTORE-ASKING_transformArguments`(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RESTORE_ASKING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ROLE")
    var ROLE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ROLE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ROLE")
    def ROLE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ROLE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("RPOPLPUSH")
    var RPOPLPUSH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOPLPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPOPLPUSH")
    def RPOPLPUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("RPOP_COUNT")
    var RPOP_COUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOP_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPOP_COUNT")
    def RPOP_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("RPOP")
    var RPOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPOP")
    def RPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("RPUSHX")
    var RPUSHX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPUSHX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPUSHX")
    def RPUSHX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPUSHX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("RPUSH")
    var RPUSH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("RPUSH")
    def RPUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SADD")
    var SADD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SADD")
    def SADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SAVE")
    var SAVE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SAVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SAVE")
    def SAVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SAVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SCAN")
    var SCAN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SCAN")
    def SCAN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCAN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SCARD")
    var SCARD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SCARD")
    def SCARD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SCRIPT_DEBUG")
    var SCRIPT_DEBUG_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_DEBUG */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SCRIPT_DEBUG")
    def SCRIPT_DEBUG_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_DEBUG['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SCRIPT_EXISTS")
    var SCRIPT_EXISTS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_EXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SCRIPT_EXISTS")
    def SCRIPT_EXISTS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_EXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SCRIPT_FLUSH")
    var SCRIPT_FLUSH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_FLUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SCRIPT_FLUSH")
    def SCRIPT_FLUSH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_FLUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SCRIPT_KILL")
    var SCRIPT_KILL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_KILL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SCRIPT_KILL")
    def SCRIPT_KILL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_KILL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SCRIPT_LOAD")
    var SCRIPT_LOAD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_LOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SCRIPT_LOAD")
    def SCRIPT_LOAD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_LOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SDIFFSTORE")
    var SDIFFSTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SDIFFSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SDIFFSTORE")
    def SDIFFSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SDIFF")
    var SDIFF_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SDIFF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SDIFF")
    def SDIFF_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SDIFF['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SETBIT")
    var SETBIT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETBIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SETBIT")
    def SETBIT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETBIT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SETEX")
    var SETEX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SETEX")
    def SETEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SETNX")
    var SETNX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SETNX")
    def SETNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETNX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SETRANGE")
    var SETRANGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SETRANGE")
    def SETRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SET")
    var SET_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SET")
    def SET_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SHUTDOWN")
    var SHUTDOWN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SHUTDOWN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SHUTDOWN")
    def SHUTDOWN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SHUTDOWN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SINTERCARD")
    var SINTERCARD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTERCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SINTERCARD")
    def SINTERCARD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTERCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SINTERSTORE")
    var SINTERSTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SINTERSTORE")
    def SINTERSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SINTER")
    var SINTER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SINTER")
    def SINTER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SISMEMBER")
    var SISMEMBER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SISMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SISMEMBER")
    def SISMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SISMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SMEMBERS")
    var SMEMBERS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMEMBERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SMEMBERS")
    def SMEMBERS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMEMBERS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SMISMEMBER")
    var SMISMEMBER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMISMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SMISMEMBER")
    def SMISMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMISMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SMOVE")
    var SMOVE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SMOVE")
    def SMOVE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SORT")
    var SORT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("SORT_RO")
    var SORT_RO_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SORT_RO")
    def SORT_RO_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SORT_STORE")
    var SORT_STORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT_STORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SORT_STORE")
    def SORT_STORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT_STORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SORT")
    def SORT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SPOP")
    var SPOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SPOP")
    def SPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SRANDMEMBER_COUNT")
    var SRANDMEMBER_COUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SRANDMEMBER_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SRANDMEMBER_COUNT")
    def SRANDMEMBER_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SRANDMEMBER")
    var SRANDMEMBER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SRANDMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SRANDMEMBER")
    def SRANDMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SREM")
    var SREM_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SREM")
    def SREM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SREM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SSCAN")
    var SSCAN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SSCAN")
    def SSCAN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("STRLEN")
    var STRLEN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_STRLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("STRLEN")
    def STRLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_STRLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SUNIONSTORE")
    var SUNIONSTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SUNIONSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SUNIONSTORE")
    def SUNIONSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SUNION")
    var SUNION_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SUNION */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SUNION")
    def SUNION_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SUNION['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("SWAPDB")
    var SWAPDB_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SWAPDB */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("SWAPDB")
    def SWAPDB_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SWAPDB['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("TIME")
    var TIME_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("TIME")
    def TIME_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TIME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("TOUCH")
    var TOUCH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TOUCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("TOUCH")
    def TOUCH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TOUCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("TTL")
    var TTL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TTL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("TTL")
    def TTL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TTL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("TYPE")
    var TYPE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TYPE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("TYPE")
    def TYPE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TYPE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("UNLINK")
    var UNLINK_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_UNLINK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("UNLINK")
    def UNLINK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_UNLINK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("UNWATCH")
    var UNWATCH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof UNWATCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("UNWATCH")
    def UNWATCH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UNWATCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("WAIT")
    var WAIT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof WAIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("WAIT")
    def WAIT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof WAIT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("WATCH")
    var WATCH_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_WATCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("WATCH")
    def WATCH_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_WATCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XACK")
    var XACK_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XACK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XACK")
    def XACK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XACK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XADD")
    var XADD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XADD")
    def XADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XAUTOCLAIM_JUSTID")
    var XAUTOCLAIM_JUSTID_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XAUTOCLAIM_JUSTID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XAUTOCLAIM_JUSTID")
    def XAUTOCLAIM_JUSTID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XAUTOCLAIM")
    var XAUTOCLAIM_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XAUTOCLAIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XAUTOCLAIM")
    def XAUTOCLAIM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XAUTOCLAIM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XCLAIM_JUSTID")
    var XCLAIM_JUSTID_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XCLAIM_JUSTID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XCLAIM_JUSTID")
    def XCLAIM_JUSTID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XCLAIM")
    var XCLAIM_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XCLAIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XCLAIM")
    def XCLAIM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XCLAIM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XDEL")
    var XDEL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XDEL")
    def XDEL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XDEL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XGROUP_CREATECONSUMER")
    var XGROUP_CREATECONSUMER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_CREATECONSUMER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_CREATECONSUMER")
    def XGROUP_CREATECONSUMER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XGROUP_CREATE")
    var XGROUP_CREATE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_CREATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_CREATE")
    def XGROUP_CREATE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_CREATE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XGROUP_DELCONSUMER")
    var XGROUP_DELCONSUMER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_DELCONSUMER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_DELCONSUMER")
    def XGROUP_DELCONSUMER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_DELCONSUMER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XGROUP_DESTROY")
    var XGROUP_DESTROY_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_DESTROY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_DESTROY")
    def XGROUP_DESTROY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_DESTROY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XGROUP_SETID")
    var XGROUP_SETID_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_SETID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XGROUP_SETID")
    def XGROUP_SETID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_SETID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XINFO_CONSUMERS")
    var XINFO_CONSUMERS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_CONSUMERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XINFO_CONSUMERS")
    def XINFO_CONSUMERS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_CONSUMERS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XINFO_GROUPS")
    var XINFO_GROUPS_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_GROUPS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XINFO_GROUPS")
    def XINFO_GROUPS_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_GROUPS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XINFO_STREAM")
    var XINFO_STREAM_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_STREAM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XINFO_STREAM")
    def XINFO_STREAM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_STREAM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XLEN")
    var XLEN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XLEN")
    def XLEN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XPENDING")
    var XPENDING_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XPENDING */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("XPENDING_RANGE")
    var XPENDING_RANGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XPENDING_RANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XPENDING_RANGE")
    def XPENDING_RANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XPENDING_RANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XPENDING")
    def XPENDING_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XPENDING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XRANGE")
    var XRANGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XRANGE")
    def XRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XREADGROUP")
    var XREADGROUP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREADGROUP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XREADGROUP")
    def XREADGROUP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREADGROUP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XREAD")
    var XREAD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XREAD")
    def XREAD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XREVRANGE")
    var XREVRANGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREVRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XREVRANGE")
    def XREVRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREVRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XSETID")
    var XSETID_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XSETID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XSETID")
    def XSETID_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XSETID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("XTRIM")
    var XTRIM_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XTRIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("XTRIM")
    def XTRIM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XTRIM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZADD")
    var ZADD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZADD")
    def ZADD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZCARD")
    var ZCARD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZCARD")
    def ZCARD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZCOUNT")
    var ZCOUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZCOUNT")
    def ZCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZDIFFSTORE")
    var ZDIFFSTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFFSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZDIFFSTORE")
    def ZDIFFSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZDIFF")
    var ZDIFF_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFF */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZDIFF_WITHSCORES")
    var ZDIFF_WITHSCORES_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFF_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZDIFF_WITHSCORES")
    def ZDIFF_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFF_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZDIFF")
    def ZDIFF_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFF['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZINCRBY")
    var ZINCRBY_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZINCRBY")
    def ZINCRBY_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZINTERCARD")
    var ZINTERCARD_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTERCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZINTERCARD")
    def ZINTERCARD_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTERCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZINTERSTORE")
    var ZINTERSTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZINTERSTORE")
    def ZINTERSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZINTER")
    var ZINTER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTER */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZINTER_WITHSCORES")
    var ZINTER_WITHSCORES_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTER_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZINTER_WITHSCORES")
    def ZINTER_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTER_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZINTER")
    def ZINTER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZLEXCOUNT")
    var ZLEXCOUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZLEXCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZLEXCOUNT")
    def ZLEXCOUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZLEXCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZMPOP")
    var ZMPOP_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZMPOP")
    def ZMPOP_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZMSCORE")
    var ZMSCORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZMSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZMSCORE")
    def ZMSCORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZMSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZPOPMAX_COUNT")
    var ZPOPMAX_COUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMAX_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZPOPMAX_COUNT")
    def ZPOPMAX_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMAX_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZPOPMAX")
    var ZPOPMAX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMAX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZPOPMAX")
    def ZPOPMAX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMAX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZPOPMIN_COUNT")
    var ZPOPMIN_COUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMIN_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZPOPMIN_COUNT")
    def ZPOPMIN_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMIN_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZPOPMIN")
    var ZPOPMIN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMIN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZPOPMIN")
    def ZPOPMIN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMIN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANDMEMBER_COUNT")
    var ZRANDMEMBER_COUNT_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZRANDMEMBER_COUNT_WITHSCORES")
    var ZRANDMEMBER_COUNT_WITHSCORES_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER_COUNT_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANDMEMBER_COUNT_WITHSCORES")
    def ZRANDMEMBER_COUNT_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANDMEMBER_COUNT")
    def ZRANDMEMBER_COUNT_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANDMEMBER")
    var ZRANDMEMBER_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANDMEMBER")
    def ZRANDMEMBER_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANGEBYLEX")
    var ZRANGEBYLEX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYLEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANGEBYLEX")
    def ZRANGEBYLEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANGEBYSCORE")
    var ZRANGEBYSCORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZRANGEBYSCORE_WITHSCORES")
    var ZRANGEBYSCORE_WITHSCORES_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYSCORE_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANGEBYSCORE_WITHSCORES")
    def ZRANGEBYSCORE_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANGEBYSCORE")
    def ZRANGEBYSCORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANGESTORE")
    var ZRANGESTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGESTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANGESTORE")
    def ZRANGESTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGESTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANGE")
    var ZRANGE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZRANGE_WITHSCORES")
    var ZRANGE_WITHSCORES_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGE_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANGE_WITHSCORES")
    def ZRANGE_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANGE")
    def ZRANGE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZRANK")
    var ZRANK_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZRANK")
    def ZRANK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZREMRANGEBYLEX")
    var ZREMRANGEBYLEX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYLEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREMRANGEBYLEX")
    def ZREMRANGEBYLEX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZREMRANGEBYRANK")
    var ZREMRANGEBYRANK_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREMRANGEBYRANK")
    def ZREMRANGEBYRANK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYRANK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZREMRANGEBYSCORE")
    var ZREMRANGEBYSCORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREMRANGEBYSCORE")
    def ZREMRANGEBYSCORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZREM")
    var ZREM_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREM")
    def ZREM_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZREVRANK")
    var ZREVRANK_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREVRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZREVRANK")
    def ZREVRANK_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREVRANK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZSCAN")
    var ZSCAN_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZSCAN")
    def ZSCAN_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZSCORE")
    var ZSCORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZSCORE")
    def ZSCORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZUNIONSTORE")
    var ZUNIONSTORE_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNIONSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZUNIONSTORE")
    def ZUNIONSTORE_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZUNION")
    var ZUNION_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNION */ js.Any, 
        M, 
        F, 
        S
      ]
    
    @JSName("ZUNION_WITHSCORES")
    var ZUNION_WITHSCORES_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNION_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ZUNION_WITHSCORES")
    def ZUNION_WITHSCORES_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNION_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ZUNION")
    def ZUNION_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNION['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclCat")
    var aclCat_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_CAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclCat")
    def aclCat_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_CAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclDelUser")
    var aclDelUser_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_DELUSER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclDelUser")
    def aclDelUser_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_DELUSER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclDryRun")
    var aclDryRun_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_DRYRUN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclDryRun")
    def aclDryRun_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_DRYRUN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclGenPass")
    var aclGenPass_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_GENPASS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclGenPass")
    def aclGenPass_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_GENPASS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclGetUser")
    var aclGetUser_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_GETUSER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclGetUser")
    def aclGetUser_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_GETUSER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclList")
    var aclList_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclList")
    def aclList_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclLoad")
    var aclLoad_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclLoad")
    def aclLoad_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclLogReset")
    var aclLogReset_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOG_RESET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclLogReset")
    def aclLogReset_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOG_RESET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclLog")
    var aclLog_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOG */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclLog")
    def aclLog_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_LOG['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclSave")
    var aclSave_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_SAVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclSave")
    def aclSave_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_SAVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclSetUser")
    var aclSetUser_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_SETUSER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclSetUser")
    def aclSetUser_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_SETUSER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclUsers")
    var aclUsers_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_USERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclUsers")
    def aclUsers_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_USERS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("aclWhoAmI")
    var aclWhoAmI_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_WHOAMI */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("aclWhoAmI")
    def aclWhoAmI_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ACL_WHOAMI['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("append")
    var append_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_APPEND */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("append")
    def append_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_APPEND['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("asking")
    var asking_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ASKING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("asking")
    def asking_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ASKING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("auth")
    var auth_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof AUTH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("auth")
    def auth_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof AUTH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bgRewriteAof")
    var bgRewriteAof_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BGREWRITEAOF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bgRewriteAof")
    def bgRewriteAof_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BGREWRITEAOF['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bgSave")
    var bgSave_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof BGSAVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bgSave")
    def bgSave_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof BGSAVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bitCount")
    var bitCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitCount")
    def bitCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bitFieldRo")
    var bitFieldRo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITFIELD_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitFieldRo")
    def bitFieldRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITFIELD_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bitField")
    var bitField_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITFIELD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitField")
    def bitField_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITFIELD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bitOp")
    var bitOp_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitOp")
    def bitOp_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bitPos")
    var bitPos_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bitPos")
    def bitPos_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BITPOS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("blMove")
    var blMove_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("blMove")
    def blMove_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("blPop")
    var blPop_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("blPop")
    def blPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("blmPop")
    var blmPop_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("blmPop")
    def blmPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BLMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("brPopLPush")
    var brPopLPush_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BRPOPLPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("brPopLPush")
    def brPopLPush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BRPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("brPop")
    var brPop_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BRPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("brPop")
    def brPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BRPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bzPopMax")
    var bzPopMax_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZPOPMAX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bzPopMax")
    def bzPopMax_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZPOPMAX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bzPopMin")
    var bzPopMin_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZPOPMIN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bzPopMin")
    def bzPopMin_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZPOPMIN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("bzmPop")
    var bzmPop_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("bzmPop")
    def bzmPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_BZMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientCaching")
    var clientCaching_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_CACHING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientCaching")
    def clientCaching_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_CACHING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientGetName")
    var clientGetName_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_GETNAME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientGetName")
    def clientGetName_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_GETNAME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientGetRedir")
    var clientGetRedir_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_GETREDIR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientGetRedir")
    def clientGetRedir_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_GETREDIR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientId")
    var clientId_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_ID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientId")
    def clientId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_ID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientInfo")
    var clientInfo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_INFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientInfo")
    def clientInfo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_INFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientKill")
    var clientKill_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_KILL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientKill")
    def clientKill_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_KILL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientNoEvict")
    var clientNoEvict_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_NO_EVICT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientNoEvict")
    def clientNoEvict_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_NO_EVICT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientPause")
    var clientPause_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_PAUSE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientPause")
    def clientPause_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_PAUSE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientSetName")
    var clientSetName_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_SETNAME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientSetName")
    def clientSetName_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_SETNAME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientTrackingInfo")
    var clientTrackingInfo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_TRACKINGINFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientTrackingInfo")
    def clientTrackingInfo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_TRACKINGINFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientTracking")
    var clientTracking_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_TRACKING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientTracking")
    def clientTracking_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_TRACKING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clientUnpause")
    var clientUnpause_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_UNPAUSE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clientUnpause")
    def clientUnpause_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLIENT_UNPAUSE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterAddSlotsRange")
    var clusterAddSlotsRange_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_ADDSLOTSRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterAddSlotsRange")
    def clusterAddSlotsRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_ADDSLOTSRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterAddSlots")
    var clusterAddSlots_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_ADDSLOTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterAddSlots")
    def clusterAddSlots_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_ADDSLOTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterBumpEpoch")
    var clusterBumpEpoch_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_BUMPEPOCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterBumpEpoch")
    def clusterBumpEpoch_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_BUMPEPOCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterCountFailureReports")
    var clusterCountFailureReports_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_COUNT_FAILURE_REPORTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterCountFailureReports")
    def clusterCountFailureReports_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_COUNT_FAILURE_REPORTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterCountKeysInSlot")
    var clusterCountKeysInSlot_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_COUNTKEYSINSLOT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterCountKeysInSlot")
    def clusterCountKeysInSlot_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_COUNTKEYSINSLOT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterDelSlotsRange")
    var clusterDelSlotsRange_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_DELSLOTSRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterDelSlotsRange")
    def clusterDelSlotsRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_DELSLOTSRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterDelSlots")
    var clusterDelSlots_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_DELSLOTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterDelSlots")
    def clusterDelSlots_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_DELSLOTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterFailover")
    var clusterFailover_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FAILOVER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterFailover")
    def clusterFailover_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FAILOVER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterFlushSlots")
    var clusterFlushSlots_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FLUSHSLOTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterFlushSlots")
    def clusterFlushSlots_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FLUSHSLOTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterForget")
    var clusterForget_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FORGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterForget")
    def clusterForget_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_FORGET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterGetKeysInSlot")
    var clusterGetKeysInSlot_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_GETKEYSINSLOT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterGetKeysInSlot")
    def clusterGetKeysInSlot_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_GETKEYSINSLOT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterInfo")
    var clusterInfo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_INFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterInfo")
    def clusterInfo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_INFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterKeySlot")
    var clusterKeySlot_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_KEYSLOT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterKeySlot")
    def clusterKeySlot_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_KEYSLOT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterLinks")
    var clusterLinks_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_LINKS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterLinks")
    def clusterLinks_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_LINKS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterMeet")
    var clusterMeet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_MEET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterMeet")
    def clusterMeet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_MEET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterMyId")
    var clusterMyId_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_MYID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterMyId")
    def clusterMyId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_MYID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterNodes")
    var clusterNodes_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_NODES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterNodes")
    def clusterNodes_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_NODES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterReplicas")
    var clusterReplicas_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_REPLICAS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterReplicas")
    def clusterReplicas_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_REPLICAS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterReplicate")
    var clusterReplicate_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_REPLICATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterReplicate")
    def clusterReplicate_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_REPLICATE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterReset")
    var clusterReset_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_RESET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterReset")
    def clusterReset_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_RESET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterSaveConfig")
    var clusterSaveConfig_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SAVECONFIG */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterSaveConfig")
    def clusterSaveConfig_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SAVECONFIG['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterSetConfigEpoch")
    var clusterSetConfigEpoch_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SET_CONFIG_EPOCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterSetConfigEpoch")
    def clusterSetConfigEpoch_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SET_CONFIG_EPOCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterSetSlot")
    var clusterSetSlot_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SETSLOT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterSetSlot")
    def clusterSetSlot_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SETSLOT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("clusterSlots")
    var clusterSlots_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SLOTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("clusterSlots")
    def clusterSlots_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CLUSTER_SLOTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("commandCount")
    var commandCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("commandCount")
    def commandCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("commandGetKeysAndFlags")
    var commandGetKeysAndFlags_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_GETKEYSANDFLAGS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("commandGetKeysAndFlags")
    def commandGetKeysAndFlags_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_GETKEYSANDFLAGS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("commandGetKeys")
    var commandGetKeys_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_GETKEYS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("commandGetKeys")
    def commandGetKeys_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_GETKEYS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("commandInfo")
    var commandInfo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_INFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("commandInfo")
    def commandInfo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_INFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("commandList")
    var commandList_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_LIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("commandList")
    def commandList_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND_LIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("command")
    var command_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("command")
    def command_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof COMMAND['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("configGet")
    var configGet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_GET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("configGet")
    def configGet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_GET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("configResetStat")
    var configResetStat_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_RESETASTAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("configResetStat")
    def configResetStat_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_RESETASTAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("configRewrite")
    var configRewrite_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_REWRITE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("configRewrite")
    def configRewrite_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_REWRITE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("configSet")
    var configSet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_SET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("configSet")
    def configSet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof CONFIG_SET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("copy")
    var copy_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_COPY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("copy")
    def copy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_COPY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("dbSize")
    var dbSize_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DBSIZE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("dbSize")
    def dbSize_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DBSIZE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("decrBy")
    var decrBy_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DECRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("decrBy")
    def decrBy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DECRBY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("decr")
    var decr_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DECR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("decr")
    def decr_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DECR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("del")
    var del_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("del")
    def del_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DEL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("discard")
    var discard_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DISCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("discard")
    def discard_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DISCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("dump")
    var dump_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DUMP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("dump")
    def dump_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_DUMP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("echo")
    var echo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ECHO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("echo")
    def echo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ECHO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("evalRo")
    var evalRo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVAL_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("evalRo")
    def evalRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVAL_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("evalShaRo")
    var evalShaRo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVALSHA_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("evalShaRo")
    def evalShaRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVALSHA_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("evalSha")
    var evalSha_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVALSHA */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("evalSha")
    def evalSha_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVALSHA['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("eval")
    var eval_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVAL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("eval")
    def eval_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EVAL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("exists")
    var exists_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("exists")
    def exists_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("expireAt")
    var expireAt_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIREAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("expireAt")
    def expireAt_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIREAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("expireTime")
    var expireTime_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIRETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("expireTime")
    def expireTime_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIRETIME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("expire")
    var expire_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIRE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("expire")
    def expire_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_EXPIRE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("fCallRo")
    var fCallRo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_FCALL_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("fCallRo")
    def fCallRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_FCALL_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("fCall")
    var fCall_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_FCALL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("fCall")
    def fCall_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_FCALL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("failover")
    var failover_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FAILOVER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("failover")
    def failover_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FAILOVER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("flushAll")
    var flushAll_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FLUSHALL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("flushAll")
    def flushAll_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FLUSHALL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("flushDb")
    var flushDb_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FLUSHDB */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("flushDb")
    def flushDb_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FLUSHDB['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("functionDelete")
    var functionDelete_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_DELETE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("functionDelete")
    def functionDelete_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_DELETE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("functionDump")
    var functionDump_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_DUMP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("functionDump")
    def functionDump_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_DUMP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("functionFlush")
    var functionFlush_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_FLUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("functionFlush")
    def functionFlush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_FLUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("functionKill")
    var functionKill_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_KILL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("functionKill")
    def functionKill_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_KILL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("functionListWithCode")
    var functionListWithCode_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LIST_WITHCODE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("functionListWithCode")
    def functionListWithCode_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LIST_WITHCODE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("functionList")
    var functionList_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("functionList")
    def functionList_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("functionLoad")
    var functionLoad_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("functionLoad")
    def functionLoad_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_LOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("functionRestore")
    var functionRestore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_RESTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("functionRestore")
    def functionRestore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_RESTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("functionStats")
    var functionStats_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_STATS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("functionStats")
    def functionStats_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof FUNCTION_STATS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoAdd")
    var geoAdd_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoAdd")
    def geoAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoDist")
    var geoDist_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEODIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoDist")
    def geoDist_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEODIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoHash")
    var geoHash_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOHASH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoHash")
    def geoHash_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOHASH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoPos")
    var geoPos_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoPos")
    def geoPos_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOPOS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMemberRoWith")
    var geoRadiusByMemberRoWith_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_RO_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMemberRoWith")
    def geoRadiusByMemberRoWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_RO_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMemberRo")
    var geoRadiusByMemberRo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMemberRo")
    def geoRadiusByMemberRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMemberStore")
    var geoRadiusByMemberStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMemberStore")
    def geoRadiusByMemberStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMemberWith")
    var geoRadiusByMemberWith_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMemberWith")
    def geoRadiusByMemberWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadiusByMember")
    var geoRadiusByMember_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusByMember")
    def geoRadiusByMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSBYMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadiusRoWith")
    var geoRadiusRoWith_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_RO_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusRoWith")
    def geoRadiusRoWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_RO_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadiusRo")
    var geoRadiusRo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusRo")
    def geoRadiusRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadiusStore")
    var geoRadiusStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusStore")
    def geoRadiusStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUSSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadiusWith")
    var geoRadiusWith_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadiusWith")
    def geoRadiusWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoRadius")
    var geoRadius_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoRadius")
    def geoRadius_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEORADIUS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoSearchStore")
    var geoSearchStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCHSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoSearchStore")
    def geoSearchStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCHSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoSearchWith")
    var geoSearchWith_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCH_WITH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoSearchWith")
    def geoSearchWith_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCH_WITH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("geoSearch")
    var geoSearch_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("geoSearch")
    def geoSearch_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GEOSEARCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("getBit")
    var getBit_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETBIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getBit")
    def getBit_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETBIT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("getDel")
    var getDel_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getDel")
    def getDel_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETDEL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("getEx")
    var getEx_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getEx")
    def getEx_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("getRange")
    var getRange_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getRange")
    def getRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("getSet")
    var getSet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("getSet")
    def getSet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GETSET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("get")
    var get_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("get")
    def get_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_GET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hDel")
    var hDel_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hDel")
    def hDel_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HDEL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hExists")
    var hExists_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HEXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hExists")
    def hExists_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HEXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hGetAll")
    var hGetAll_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HGETALL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hGetAll")
    def hGetAll_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HGETALL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hGet")
    var hGet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hGet")
    def hGet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HGET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hIncrByFloat")
    var hIncrByFloat_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HINCRBYFLOAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hIncrByFloat")
    def hIncrByFloat_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HINCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hIncrBy")
    var hIncrBy_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HINCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hIncrBy")
    def hIncrBy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HINCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hKeys")
    var hKeys_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HKEYS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hKeys")
    def hKeys_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HKEYS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hLen")
    var hLen_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hLen")
    def hLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hRandFieldCountWithValues")
    var hRandFieldCountWithValues_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD_COUNT_WITHVALUES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hRandFieldCountWithValues")
    def hRandFieldCountWithValues_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD_COUNT_WITHVALUES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hRandFieldCount")
    var hRandFieldCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hRandFieldCount")
    def hRandFieldCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hRandField")
    var hRandField_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hRandField")
    def hRandField_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HRANDFIELD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hScan")
    var hScan_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hScan")
    def hScan_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hSetNX")
    var hSetNX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hSetNX")
    def hSetNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSETNX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hSet")
    var hSet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hSet")
    def hSet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hStrLen")
    var hStrLen_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSTRLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hStrLen")
    def hStrLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HSTRLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hVals")
    var hVals_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HVALS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hVals")
    def hVals_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HVALS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hello")
    var hello_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof HELLO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hello")
    def hello_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof HELLO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("hmGet")
    var hmGet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HMGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("hmGet")
    def hmGet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_HMGET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("incrByFloat")
    var incrByFloat_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCRBYFLOAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("incrByFloat")
    def incrByFloat_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCRBYFLOAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("incrBy")
    var incrBy_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("incrBy")
    def incrBy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("incr")
    var incr_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("incr")
    def incr_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_INCR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("info")
    var info_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof INFO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("info")
    def info_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof INFO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("keys")
    var keys_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof KEYS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("keys")
    def keys_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof KEYS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lIndex")
    var lIndex_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LINDEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lIndex")
    def lIndex_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LINDEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lInsert")
    var lInsert_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LINSERT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lInsert")
    def lInsert_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LINSERT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lLen")
    var lLen_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lLen")
    def lLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lMove")
    var lMove_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lMove")
    def lMove_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lPopCount")
    var lPopCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOP_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPopCount")
    def lPopCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lPop")
    var lPop_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPop")
    def lPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lPosCount")
    var lPosCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOS_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPosCount")
    def lPosCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOS_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lPos")
    var lPos_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPos")
    def lPos_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPOS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lPushX")
    var lPushX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPUSHX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPushX")
    def lPushX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPUSHX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lPush")
    var lPush_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lPush")
    def lPush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lRange")
    var lRange_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lRange")
    def lRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lRem")
    var lRem_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lRem")
    def lRem_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LREM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lSet")
    var lSet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lSet")
    def lSet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LSET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lTrim")
    var lTrim_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LTRIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lTrim")
    def lTrim_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LTRIM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lastSave")
    var lastSave_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LASTSAVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lastSave")
    def lastSave_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LASTSAVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("latencyDoctor")
    var latencyDoctor_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LATENCY_DOCTOR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("latencyDoctor")
    def latencyDoctor_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LATENCY_DOCTOR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lcsIdxWithMatchLen")
    var lcsIdxWithMatchLen_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_IDX_WITHMATCHLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lcsIdxWithMatchLen")
    def lcsIdxWithMatchLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_IDX_WITHMATCHLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lcsIdx")
    var lcsIdx_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_IDX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lcsIdx")
    def lcsIdx_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_IDX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lcsLen")
    var lcsLen_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_LEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lcsLen")
    def lcsLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS_LEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lcs")
    var lcs_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lcs")
    def lcs_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LCS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lmPop")
    var lmPop_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lmPop")
    def lmPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_LMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("lolwut")
    var lolwut_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof LOLWUT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("lolwut")
    def lolwut_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof LOLWUT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("mGet")
    var mGet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MGET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("mGet")
    def mGet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MGET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("mSetNX")
    var mSetNX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MSETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("mSetNX")
    def mSetNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MSETNX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("mSet")
    var mSet_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MSET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("mSet")
    def mSet_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MSET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("memoryDoctor")
    var memoryDoctor_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_DOCTOR */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("memoryDoctor")
    def memoryDoctor_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_DOCTOR['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("memoryMallocStats")
    var memoryMallocStats_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_MALLOC_STATS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("memoryMallocStats")
    def memoryMallocStats_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_MALLOC_STATS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("memoryPurge")
    var memoryPurge_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_PURGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("memoryPurge")
    def memoryPurge_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_PURGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("memoryStats")
    var memoryStats_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_STATS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("memoryStats")
    def memoryStats_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_STATS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("memoryUsage")
    var memoryUsage_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_USAGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("memoryUsage")
    def memoryUsage_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MEMORY_USAGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("migrate")
    var migrate_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MIGRATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("migrate")
    def migrate_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_MIGRATE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("moduleList")
    var moduleList_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_LIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("moduleList")
    def moduleList_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_LIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("moduleLoad")
    var moduleLoad_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_LOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("moduleLoad")
    def moduleLoad_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_LOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("moduleUnload")
    var moduleUnload_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_UNLOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("moduleUnload")
    def moduleUnload_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MODULE_UNLOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("move")
    var move_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof MOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("move")
    def move_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MOVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("objectEncoding")
    var objectEncoding_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_ENCODING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("objectEncoding")
    def objectEncoding_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_ENCODING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("objectFreq")
    var objectFreq_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_FREQ */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("objectFreq")
    def objectFreq_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_FREQ['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("objectIdleTime")
    var objectIdleTime_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_IDLETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("objectIdleTime")
    def objectIdleTime_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_IDLETIME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("objectRefCount")
    var objectRefCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_REFCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("objectRefCount")
    def objectRefCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_OBJECT_REFCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pExpireAt")
    var pExpireAt_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIREAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pExpireAt")
    def pExpireAt_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIREAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pExpireTime")
    var pExpireTime_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIRETIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pExpireTime")
    def pExpireTime_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIRETIME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pExpire")
    var pExpire_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIRE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pExpire")
    def pExpire_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PEXPIRE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pSetEx")
    var pSetEx_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PSETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pSetEx")
    def pSetEx_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PSETEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pTTL")
    var pTTL_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PTTL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pTTL")
    def pTTL_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PTTL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("persist")
    var persist_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PERSIST */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("persist")
    def persist_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PERSIST['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pfAdd")
    var pfAdd_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pfAdd")
    def pfAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pfCount")
    var pfCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pfCount")
    def pfCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pfMerge")
    var pfMerge_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFMERGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pfMerge")
    def pfMerge_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PFMERGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ping")
    var ping_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ping")
    def ping_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pubSubChannels")
    var pubSubChannels_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_CHANNELS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pubSubChannels")
    def pubSubChannels_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_CHANNELS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pubSubNumPat")
    var pubSubNumPat_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_NUMPAT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pubSubNumPat")
    def pubSubNumPat_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_NUMPAT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("pubSubNumSub")
    var pubSubNumSub_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_NUMSUB */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("pubSubNumSub")
    def pubSubNumSub_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof PUBSUB_NUMSUB['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("publish")
    var publish_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PUBLISH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("publish")
    def publish_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_PUBLISH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("rPopCount")
    var rPopCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOP_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPopCount")
    def rPopCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOP_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("rPopLPush")
    var rPopLPush_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOPLPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPopLPush")
    def rPopLPush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOPLPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("rPop")
    var rPop_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPop")
    def rPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("rPushX")
    var rPushX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPUSHX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPushX")
    def rPushX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPUSHX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("rPush")
    var rPush_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rPush")
    def rPush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RPUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("randomKey")
    var randomKey_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RANDOMKEY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("randomKey")
    def randomKey_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RANDOMKEY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("readonly")
    var readonly_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof READONLY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("readonly")
    def readonly_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof READONLY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("readwrite")
    var readwrite_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof READWRITE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("readwrite")
    def readwrite_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof READWRITE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("renameNX")
    var renameNX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RENAMENX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("renameNX")
    def renameNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RENAMENX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("rename")
    var rename_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RENAME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("rename")
    def rename_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_RENAME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("replicaOf")
    var replicaOf_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof REPLICAOF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("replicaOf")
    def replicaOf_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof REPLICAOF['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("restoreAsking")
    var restoreAsking_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof RESTORE_ASKING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("restoreAsking")
    def restoreAsking_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof RESTORE_ASKING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("role")
    var role_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ROLE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("role")
    def role_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ROLE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sAdd")
    var sAdd_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sAdd")
    def sAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sCard")
    var sCard_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sCard")
    def sCard_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sDiffStore")
    var sDiffStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SDIFFSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sDiffStore")
    def sDiffStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sDiff")
    var sDiff_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SDIFF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sDiff")
    def sDiff_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SDIFF['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sInterCard")
    var sInterCard_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTERCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sInterCard")
    def sInterCard_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTERCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sInterStore")
    var sInterStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sInterStore")
    def sInterStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sInter")
    var sInter_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sInter")
    def sInter_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SINTER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sIsMember")
    var sIsMember_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SISMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sIsMember")
    def sIsMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SISMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sMembers")
    var sMembers_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMEMBERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sMembers")
    def sMembers_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMEMBERS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sMove")
    var sMove_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMOVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sMove")
    def sMove_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMOVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sPop")
    var sPop_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sPop")
    def sPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sRandMemberCount")
    var sRandMemberCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SRANDMEMBER_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sRandMemberCount")
    def sRandMemberCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sRandMember")
    var sRandMember_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SRANDMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sRandMember")
    def sRandMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sRem")
    var sRem_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sRem")
    def sRem_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SREM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sScan")
    var sScan_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sScan")
    def sScan_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sUnionStore")
    var sUnionStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SUNIONSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sUnionStore")
    def sUnionStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sUnion")
    var sUnion_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SUNION */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sUnion")
    def sUnion_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SUNION['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("save")
    var save_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SAVE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("save")
    def save_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SAVE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("scan")
    var scan_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("scan")
    def scan_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCAN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("scriptDebug")
    var scriptDebug_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_DEBUG */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("scriptDebug")
    def scriptDebug_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_DEBUG['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("scriptExists")
    var scriptExists_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_EXISTS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("scriptExists")
    def scriptExists_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_EXISTS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("scriptFlush")
    var scriptFlush_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_FLUSH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("scriptFlush")
    def scriptFlush_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_FLUSH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("scriptKill")
    var scriptKill_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_KILL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("scriptKill")
    def scriptKill_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_KILL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("scriptLoad")
    var scriptLoad_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_LOAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("scriptLoad")
    def scriptLoad_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SCRIPT_LOAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("setBit")
    var setBit_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETBIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("setBit")
    def setBit_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETBIT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("setEx")
    var setEx_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("setEx")
    def setEx_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("setNX")
    var setNX_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETNX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("setNX")
    def setNX_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETNX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("setRange")
    var setRange_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("setRange")
    def setRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SETRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("set")
    var set_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SET */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("set")
    def set_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SET['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("shutdown")
    var shutdown_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SHUTDOWN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("shutdown")
    def shutdown_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SHUTDOWN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("smIsMember")
    var smIsMember_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMISMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("smIsMember")
    def smIsMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SMISMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sortRo")
    var sortRo_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT_RO */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sortRo")
    def sortRo_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT_RO['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sortStore")
    var sortStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT_STORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sortStore")
    def sortStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT_STORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("sort")
    var sort_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("sort")
    def sort_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_SORT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("strLen")
    var strLen_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_STRLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("strLen")
    def strLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_STRLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("swapDb")
    var swapDb_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof SWAPDB */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("swapDb")
    def swapDb_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof SWAPDB['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("time")
    var time_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof TIME */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("time")
    def time_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof TIME['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("touch")
    var touch_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TOUCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("touch")
    def touch_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TOUCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("ttl")
    var ttl_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TTL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("ttl")
    def ttl_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TTL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("type")
    var type_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TYPE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("type")
    def type_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_TYPE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("unlink")
    var unlink_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_UNLINK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("unlink")
    def unlink_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_UNLINK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("unwatch")
    var unwatch_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof UNWATCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("unwatch")
    def unwatch_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UNWATCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("wait")
    var wait_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof WAIT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("wait")
    def wait_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof WAIT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("watch")
    var watch_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_WATCH */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("watch")
    def watch_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_WATCH['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xAck")
    var xAck_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XACK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xAck")
    def xAck_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XACK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xAdd")
    var xAdd_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xAdd")
    def xAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xAutoClaimJustId")
    var xAutoClaimJustId_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XAUTOCLAIM_JUSTID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xAutoClaimJustId")
    def xAutoClaimJustId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XAUTOCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xAutoClaim")
    var xAutoClaim_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XAUTOCLAIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xAutoClaim")
    def xAutoClaim_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XAUTOCLAIM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xClaimJustId")
    var xClaimJustId_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XCLAIM_JUSTID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xClaimJustId")
    def xClaimJustId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XCLAIM_JUSTID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xClaim")
    var xClaim_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XCLAIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xClaim")
    def xClaim_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XCLAIM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xDel")
    var xDel_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XDEL */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xDel")
    def xDel_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XDEL['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xGroupCreateConsumer")
    var xGroupCreateConsumer_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_CREATECONSUMER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupCreateConsumer")
    def xGroupCreateConsumer_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_CREATECONSUMER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xGroupCreate")
    var xGroupCreate_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_CREATE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupCreate")
    def xGroupCreate_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_CREATE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xGroupDelConsumer")
    var xGroupDelConsumer_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_DELCONSUMER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupDelConsumer")
    def xGroupDelConsumer_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_DELCONSUMER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xGroupDestroy")
    var xGroupDestroy_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_DESTROY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupDestroy")
    def xGroupDestroy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_DESTROY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xGroupSetId")
    var xGroupSetId_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_SETID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xGroupSetId")
    def xGroupSetId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XGROUP_SETID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xInfoConsumers")
    var xInfoConsumers_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_CONSUMERS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xInfoConsumers")
    def xInfoConsumers_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_CONSUMERS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xInfoGroups")
    var xInfoGroups_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_GROUPS */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xInfoGroups")
    def xInfoGroups_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_GROUPS['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xInfoStream")
    var xInfoStream_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_STREAM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xInfoStream")
    def xInfoStream_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XINFO_STREAM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xLen")
    var xLen_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XLEN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xLen")
    def xLen_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XLEN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xPendingRange")
    var xPendingRange_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XPENDING_RANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xPendingRange")
    def xPendingRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XPENDING_RANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xPending")
    var xPending_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XPENDING */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xPending")
    def xPending_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XPENDING['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xRange")
    var xRange_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xRange")
    def xRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xReadGroup")
    var xReadGroup_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREADGROUP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xReadGroup")
    def xReadGroup_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREADGROUP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xRead")
    var xRead_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREAD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xRead")
    def xRead_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREAD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xRevRange")
    var xRevRange_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREVRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xRevRange")
    def xRevRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XREVRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xSetId")
    var xSetId_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XSETID */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xSetId")
    def xSetId_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XSETID['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("xTrim")
    var xTrim_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XTRIM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("xTrim")
    def xTrim_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_XTRIM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zAdd")
    var zAdd_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZADD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zAdd")
    def zAdd_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZADD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zCard")
    var zCard_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zCard")
    def zCard_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zCount")
    var zCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zCount")
    def zCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zDiffStore")
    var zDiffStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFFSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zDiffStore")
    def zDiffStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFFSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zDiffWithScores")
    var zDiffWithScores_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFF_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zDiffWithScores")
    def zDiffWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFF_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zDiff")
    var zDiff_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFF */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zDiff")
    def zDiff_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZDIFF['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zIncrBy")
    var zIncrBy_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINCRBY */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zIncrBy")
    def zIncrBy_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINCRBY['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zInterCard")
    var zInterCard_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTERCARD */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zInterCard")
    def zInterCard_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTERCARD['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zInterStore")
    var zInterStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTERSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zInterStore")
    def zInterStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTERSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zInterWithScores")
    var zInterWithScores_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTER_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zInterWithScores")
    def zInterWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTER_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zInter")
    var zInter_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zInter")
    def zInter_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZINTER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zLexCount")
    var zLexCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZLEXCOUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zLexCount")
    def zLexCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZLEXCOUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zPopMaxCount")
    var zPopMaxCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMAX_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zPopMaxCount")
    def zPopMaxCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMAX_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zPopMax")
    var zPopMax_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMAX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zPopMax")
    def zPopMax_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMAX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zPopMinCount")
    var zPopMinCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMIN_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zPopMinCount")
    def zPopMinCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMIN_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zPopMin")
    var zPopMin_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMIN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zPopMin")
    def zPopMin_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZPOPMIN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRandMemberCountWithScores")
    var zRandMemberCountWithScores_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER_COUNT_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRandMemberCountWithScores")
    def zRandMemberCountWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER_COUNT_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRandMemberCount")
    var zRandMemberCount_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER_COUNT */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRandMemberCount")
    def zRandMemberCount_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER_COUNT['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRandMember")
    var zRandMember_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRandMember")
    def zRandMember_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANDMEMBER['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRangeByLex")
    var zRangeByLex_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYLEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeByLex")
    def zRangeByLex_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRangeByScoreWithScores")
    var zRangeByScoreWithScores_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYSCORE_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeByScoreWithScores")
    def zRangeByScoreWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYSCORE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRangeByScore")
    var zRangeByScore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeByScore")
    def zRangeByScore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRangeStore")
    var zRangeStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGESTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeStore")
    def zRangeStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGESTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRangeWithScores")
    var zRangeWithScores_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGE_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRangeWithScores")
    def zRangeWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGE_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRange")
    var zRange_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRange")
    def zRange_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANGE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRank")
    var zRank_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRank")
    def zRank_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZRANK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRemRangeByLex")
    var zRemRangeByLex_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYLEX */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRemRangeByLex")
    def zRemRangeByLex_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYLEX['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRemRangeByRank")
    var zRemRangeByRank_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRemRangeByRank")
    def zRemRangeByRank_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYRANK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRemRangeByScore")
    var zRemRangeByScore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRemRangeByScore")
    def zRemRangeByScore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREMRANGEBYSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRem")
    var zRem_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREM */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRem")
    def zRem_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREM['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zRevRank")
    var zRevRank_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREVRANK */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zRevRank")
    def zRevRank_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZREVRANK['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zScan")
    var zScan_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZSCAN */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zScan")
    def zScan_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZSCAN['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zScore")
    var zScore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zScore")
    def zScore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zUnionStore")
    var zUnionStore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNIONSTORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zUnionStore")
    def zUnionStore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNIONSTORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zUnionWithScores")
    var zUnionWithScores_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNION_WITHSCORES */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zUnionWithScores")
    def zUnionWithScores_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNION_WITHSCORES['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zUnion")
    var zUnion_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNION */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zUnion")
    def zUnion_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZUNION['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zmPop")
    var zmPop_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZMPOP */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zmPop")
    def zmPop_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZMPOP['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
    
    @JSName("zmScore")
    var zmScore_Original: CommandSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZMSCORE */ js.Any, 
        M, 
        F, 
        S
      ]
    @JSName("zmScore")
    def zmScore_transformArguments(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<C['transformArguments']> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_ZMSCORE['transformArguments'] */ js.Any
        ]
    ): RedisClientMultiCommandType[M, F, S]
  }
  object WithCommands {
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithCommands[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] (val x: Self & (WithCommands[M, F, S])) extends AnyVal {
      
      inline def setACL_CAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_CAT", js.Any.fromFunction1(value))
      
      inline def setACL_DELUSER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_DELUSER", js.Any.fromFunction1(value))
      
      inline def setACL_DRYRUN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_DRYRUN", js.Any.fromFunction1(value))
      
      inline def setACL_GENPASS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_GENPASS", js.Any.fromFunction1(value))
      
      inline def setACL_GETUSER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_GETUSER", js.Any.fromFunction1(value))
      
      inline def setACL_LIST(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_LIST", js.Any.fromFunction1(value))
      
      inline def setACL_LOAD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_LOAD", js.Any.fromFunction1(value))
      
      inline def setACL_LOG(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_LOG", js.Any.fromFunction1(value))
      
      inline def setACL_LOG_RESET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_LOG_RESET", js.Any.fromFunction1(value))
      
      inline def setACL_SAVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_SAVE", js.Any.fromFunction1(value))
      
      inline def setACL_SETUSER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_SETUSER", js.Any.fromFunction1(value))
      
      inline def setACL_USERS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_USERS", js.Any.fromFunction1(value))
      
      inline def setACL_WHOAMI(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ACL_WHOAMI", js.Any.fromFunction1(value))
      
      inline def setAPPEND(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "APPEND", js.Any.fromFunction1(value))
      
      inline def setASKING(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ASKING", js.Any.fromFunction1(value))
      
      inline def setAUTH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "AUTH", js.Any.fromFunction1(value))
      
      inline def setAclCat(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclCat", js.Any.fromFunction1(value))
      
      inline def setAclDelUser(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclDelUser", js.Any.fromFunction1(value))
      
      inline def setAclDryRun(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclDryRun", js.Any.fromFunction1(value))
      
      inline def setAclGenPass(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclGenPass", js.Any.fromFunction1(value))
      
      inline def setAclGetUser(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclGetUser", js.Any.fromFunction1(value))
      
      inline def setAclList(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclList", js.Any.fromFunction1(value))
      
      inline def setAclLoad(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclLoad", js.Any.fromFunction1(value))
      
      inline def setAclLog(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclLog", js.Any.fromFunction1(value))
      
      inline def setAclLogReset(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclLogReset", js.Any.fromFunction1(value))
      
      inline def setAclSave(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclSave", js.Any.fromFunction1(value))
      
      inline def setAclSetUser(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclSetUser", js.Any.fromFunction1(value))
      
      inline def setAclUsers(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclUsers", js.Any.fromFunction1(value))
      
      inline def setAclWhoAmI(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "aclWhoAmI", js.Any.fromFunction1(value))
      
      inline def setBGREWRITEAOF(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BGREWRITEAOF", js.Any.fromFunction1(value))
      
      inline def setBGSAVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BGSAVE", js.Any.fromFunction1(value))
      
      inline def setBITCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITCOUNT", js.Any.fromFunction1(value))
      
      inline def setBITFIELD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITFIELD", js.Any.fromFunction1(value))
      
      inline def setBITFIELD_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITFIELD_RO", js.Any.fromFunction1(value))
      
      inline def setBITOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITOP", js.Any.fromFunction1(value))
      
      inline def setBITPOS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BITPOS", js.Any.fromFunction1(value))
      
      inline def setBLMOVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BLMOVE", js.Any.fromFunction1(value))
      
      inline def setBLMPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BLMPOP", js.Any.fromFunction1(value))
      
      inline def setBLPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BLPOP", js.Any.fromFunction1(value))
      
      inline def setBRPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BRPOP", js.Any.fromFunction1(value))
      
      inline def setBRPOPLPUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BRPOPLPUSH", js.Any.fromFunction1(value))
      
      inline def setBZMPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BZMPOP", js.Any.fromFunction1(value))
      
      inline def setBZPOPMAX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BZPOPMAX", js.Any.fromFunction1(value))
      
      inline def setBZPOPMIN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "BZPOPMIN", js.Any.fromFunction1(value))
      
      inline def setBitFieldRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "bitFieldRo", js.Any.fromFunction1(value))
      
      inline def setCLIENT_CACHING(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_CACHING", js.Any.fromFunction1(value))
      
      inline def setCLIENT_GETNAME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_GETNAME", js.Any.fromFunction1(value))
      
      inline def setCLIENT_GETREDIR(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_GETREDIR", js.Any.fromFunction1(value))
      
      inline def setCLIENT_ID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_ID", js.Any.fromFunction1(value))
      
      inline def setCLIENT_INFO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_INFO", js.Any.fromFunction1(value))
      
      inline def setCLIENT_KILL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_KILL", js.Any.fromFunction1(value))
      
      inline def `setCLIENT_NO-EVICT`(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_NO-EVICT", js.Any.fromFunction1(value))
      
      inline def setCLIENT_PAUSE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_PAUSE", js.Any.fromFunction1(value))
      
      inline def setCLIENT_SETNAME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_SETNAME", js.Any.fromFunction1(value))
      
      inline def setCLIENT_TRACKING(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_TRACKING", js.Any.fromFunction1(value))
      
      inline def setCLIENT_TRACKINGINFO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_TRACKINGINFO", js.Any.fromFunction1(value))
      
      inline def setCLIENT_UNPAUSE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLIENT_UNPAUSE", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_ADDSLOTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_ADDSLOTS", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_ADDSLOTSRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_ADDSLOTSRANGE", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_BUMPEPOCH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_BUMPEPOCH", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_COUNTKEYSINSLOT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_COUNTKEYSINSLOT", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_COUNT_FAILURE_REPORTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_COUNT_FAILURE_REPORTS", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_DELSLOTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_DELSLOTS", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_DELSLOTSRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_DELSLOTSRANGE", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_FAILOVER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_FAILOVER", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_FLUSHSLOTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_FLUSHSLOTS", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_FORGET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_FORGET", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_GETKEYSINSLOT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_GETKEYSINSLOT", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_INFO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_INFO", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_KEYSLOT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_KEYSLOT", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_LINKS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_LINKS", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_MEET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_MEET", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_MYID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_MYID", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_NODES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_NODES", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_REPLICAS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_REPLICAS", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_REPLICATE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_REPLICATE", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_RESET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_RESET", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_SAVECONFIG(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_SAVECONFIG", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_SETSLOT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_SETSLOT", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_SET_CONFIG_EPOCH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_SET_CONFIG_EPOCH", js.Any.fromFunction1(value))
      
      inline def setCLUSTER_SLOTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CLUSTER_SLOTS", js.Any.fromFunction1(value))
      
      inline def setCOMMAND(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "COMMAND", js.Any.fromFunction1(value))
      
      inline def setCOMMAND_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "COMMAND_COUNT", js.Any.fromFunction1(value))
      
      inline def setCOMMAND_GETKEYS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "COMMAND_GETKEYS", js.Any.fromFunction1(value))
      
      inline def setCOMMAND_GETKEYSANDFLAGS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "COMMAND_GETKEYSANDFLAGS", js.Any.fromFunction1(value))
      
      inline def setCOMMAND_INFO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "COMMAND_INFO", js.Any.fromFunction1(value))
      
      inline def setCOMMAND_LIST(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "COMMAND_LIST", js.Any.fromFunction1(value))
      
      inline def setCONFIG_GET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CONFIG_GET", js.Any.fromFunction1(value))
      
      inline def setCONFIG_RESETASTAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CONFIG_RESETASTAT", js.Any.fromFunction1(value))
      
      inline def setCONFIG_REWRITE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CONFIG_REWRITE", js.Any.fromFunction1(value))
      
      inline def setCONFIG_SET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "CONFIG_SET", js.Any.fromFunction1(value))
      
      inline def setCOPY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "COPY", js.Any.fromFunction1(value))
      
      inline def setClientCaching(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientCaching", js.Any.fromFunction1(value))
      
      inline def setClientGetName(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientGetName", js.Any.fromFunction1(value))
      
      inline def setClientGetRedir(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientGetRedir", js.Any.fromFunction1(value))
      
      inline def setClientId(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientId", js.Any.fromFunction1(value))
      
      inline def setClientInfo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientInfo", js.Any.fromFunction1(value))
      
      inline def setClientKill(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientKill", js.Any.fromFunction1(value))
      
      inline def setClientNoEvict(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientNoEvict", js.Any.fromFunction1(value))
      
      inline def setClientPause(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientPause", js.Any.fromFunction1(value))
      
      inline def setClientSetName(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientSetName", js.Any.fromFunction1(value))
      
      inline def setClientTracking(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientTracking", js.Any.fromFunction1(value))
      
      inline def setClientTrackingInfo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientTrackingInfo", js.Any.fromFunction1(value))
      
      inline def setClientUnpause(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clientUnpause", js.Any.fromFunction1(value))
      
      inline def setClusterAddSlots(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterAddSlots", js.Any.fromFunction1(value))
      
      inline def setClusterAddSlotsRange(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterAddSlotsRange", js.Any.fromFunction1(value))
      
      inline def setClusterBumpEpoch(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterBumpEpoch", js.Any.fromFunction1(value))
      
      inline def setClusterCountFailureReports(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterCountFailureReports", js.Any.fromFunction1(value))
      
      inline def setClusterCountKeysInSlot(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterCountKeysInSlot", js.Any.fromFunction1(value))
      
      inline def setClusterDelSlots(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterDelSlots", js.Any.fromFunction1(value))
      
      inline def setClusterDelSlotsRange(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterDelSlotsRange", js.Any.fromFunction1(value))
      
      inline def setClusterFailover(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterFailover", js.Any.fromFunction1(value))
      
      inline def setClusterFlushSlots(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterFlushSlots", js.Any.fromFunction1(value))
      
      inline def setClusterForget(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterForget", js.Any.fromFunction1(value))
      
      inline def setClusterGetKeysInSlot(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterGetKeysInSlot", js.Any.fromFunction1(value))
      
      inline def setClusterInfo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterInfo", js.Any.fromFunction1(value))
      
      inline def setClusterKeySlot(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterKeySlot", js.Any.fromFunction1(value))
      
      inline def setClusterLinks(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterLinks", js.Any.fromFunction1(value))
      
      inline def setClusterMeet(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterMeet", js.Any.fromFunction1(value))
      
      inline def setClusterMyId(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterMyId", js.Any.fromFunction1(value))
      
      inline def setClusterNodes(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterNodes", js.Any.fromFunction1(value))
      
      inline def setClusterReplicas(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterReplicas", js.Any.fromFunction1(value))
      
      inline def setClusterReplicate(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterReplicate", js.Any.fromFunction1(value))
      
      inline def setClusterReset(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterReset", js.Any.fromFunction1(value))
      
      inline def setClusterSaveConfig(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterSaveConfig", js.Any.fromFunction1(value))
      
      inline def setClusterSetConfigEpoch(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterSetConfigEpoch", js.Any.fromFunction1(value))
      
      inline def setClusterSetSlot(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterSetSlot", js.Any.fromFunction1(value))
      
      inline def setClusterSlots(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "clusterSlots", js.Any.fromFunction1(value))
      
      inline def setCommandCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "commandCount", js.Any.fromFunction1(value))
      
      inline def setCommandGetKeys(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "commandGetKeys", js.Any.fromFunction1(value))
      
      inline def setCommandGetKeysAndFlags(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "commandGetKeysAndFlags", js.Any.fromFunction1(value))
      
      inline def setCommandInfo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "commandInfo", js.Any.fromFunction1(value))
      
      inline def setCommandList(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "commandList", js.Any.fromFunction1(value))
      
      inline def setConfigGet(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "configGet", js.Any.fromFunction1(value))
      
      inline def setConfigResetStat(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "configResetStat", js.Any.fromFunction1(value))
      
      inline def setConfigRewrite(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "configRewrite", js.Any.fromFunction1(value))
      
      inline def setConfigSet(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "configSet", js.Any.fromFunction1(value))
      
      inline def setDBSIZE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DBSIZE", js.Any.fromFunction1(value))
      
      inline def setDECR(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DECR", js.Any.fromFunction1(value))
      
      inline def setDECRBY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DECRBY", js.Any.fromFunction1(value))
      
      inline def setDEL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DEL", js.Any.fromFunction1(value))
      
      inline def setDISCARD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DISCARD", js.Any.fromFunction1(value))
      
      inline def setDUMP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "DUMP", js.Any.fromFunction1(value))
      
      inline def setECHO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ECHO", js.Any.fromFunction1(value))
      
      inline def setEVAL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EVAL", js.Any.fromFunction1(value))
      
      inline def setEVALSHA(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EVALSHA", js.Any.fromFunction1(value))
      
      inline def setEVALSHA_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EVALSHA_RO", js.Any.fromFunction1(value))
      
      inline def setEVAL_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EVAL_RO", js.Any.fromFunction1(value))
      
      inline def setEXISTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EXISTS", js.Any.fromFunction1(value))
      
      inline def setEXPIRE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EXPIRE", js.Any.fromFunction1(value))
      
      inline def setEXPIREAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EXPIREAT", js.Any.fromFunction1(value))
      
      inline def setEXPIRETIME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "EXPIRETIME", js.Any.fromFunction1(value))
      
      inline def setEvalRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "evalRo", js.Any.fromFunction1(value))
      
      inline def setEvalShaRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "evalShaRo", js.Any.fromFunction1(value))
      
      inline def setFAILOVER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FAILOVER", js.Any.fromFunction1(value))
      
      inline def setFCALL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FCALL", js.Any.fromFunction1(value))
      
      inline def setFCALL_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FCALL_RO", js.Any.fromFunction1(value))
      
      inline def setFCallRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "fCallRo", js.Any.fromFunction1(value))
      
      inline def setFLUSHALL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FLUSHALL", js.Any.fromFunction1(value))
      
      inline def setFLUSHDB(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FLUSHDB", js.Any.fromFunction1(value))
      
      inline def setFUNCTION_DELETE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FUNCTION_DELETE", js.Any.fromFunction1(value))
      
      inline def setFUNCTION_DUMP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FUNCTION_DUMP", js.Any.fromFunction1(value))
      
      inline def setFUNCTION_FLUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FUNCTION_FLUSH", js.Any.fromFunction1(value))
      
      inline def setFUNCTION_KILL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FUNCTION_KILL", js.Any.fromFunction1(value))
      
      inline def setFUNCTION_LIST(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FUNCTION_LIST", js.Any.fromFunction1(value))
      
      inline def setFUNCTION_LIST_WITHCODE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FUNCTION_LIST_WITHCODE", js.Any.fromFunction1(value))
      
      inline def setFUNCTION_LOAD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FUNCTION_LOAD", js.Any.fromFunction1(value))
      
      inline def setFUNCTION_RESTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FUNCTION_RESTORE", js.Any.fromFunction1(value))
      
      inline def setFUNCTION_STATS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "FUNCTION_STATS", js.Any.fromFunction1(value))
      
      inline def setFunctionDelete(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "functionDelete", js.Any.fromFunction1(value))
      
      inline def setFunctionDump(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "functionDump", js.Any.fromFunction1(value))
      
      inline def setFunctionFlush(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "functionFlush", js.Any.fromFunction1(value))
      
      inline def setFunctionKill(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "functionKill", js.Any.fromFunction1(value))
      
      inline def setFunctionList(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "functionList", js.Any.fromFunction1(value))
      
      inline def setFunctionListWithCode(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "functionListWithCode", js.Any.fromFunction1(value))
      
      inline def setFunctionLoad(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "functionLoad", js.Any.fromFunction1(value))
      
      inline def setFunctionRestore(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "functionRestore", js.Any.fromFunction1(value))
      
      inline def setFunctionStats(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "functionStats", js.Any.fromFunction1(value))
      
      inline def setGEOADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOADD", js.Any.fromFunction1(value))
      
      inline def setGEODIST(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEODIST", js.Any.fromFunction1(value))
      
      inline def setGEOHASH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOHASH", js.Any.fromFunction1(value))
      
      inline def setGEOPOS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOPOS", js.Any.fromFunction1(value))
      
      inline def setGEORADIUS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUS", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBERSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBERSTORE", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBER_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER_RO", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBER_RO_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER_RO_WITH", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSBYMEMBER_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSBYMEMBER_WITH", js.Any.fromFunction1(value))
      
      inline def setGEORADIUSSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUSSTORE", js.Any.fromFunction1(value))
      
      inline def setGEORADIUS_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUS_RO", js.Any.fromFunction1(value))
      
      inline def setGEORADIUS_RO_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUS_RO_WITH", js.Any.fromFunction1(value))
      
      inline def setGEORADIUS_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEORADIUS_WITH", js.Any.fromFunction1(value))
      
      inline def setGEOSEARCH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOSEARCH", js.Any.fromFunction1(value))
      
      inline def setGEOSEARCHSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOSEARCHSTORE", js.Any.fromFunction1(value))
      
      inline def setGEOSEARCH_WITH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GEOSEARCH_WITH", js.Any.fromFunction1(value))
      
      inline def setGET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GET", js.Any.fromFunction1(value))
      
      inline def setGETBIT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETBIT", js.Any.fromFunction1(value))
      
      inline def setGETDEL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETDEL", js.Any.fromFunction1(value))
      
      inline def setGETEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETEX", js.Any.fromFunction1(value))
      
      inline def setGETRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETRANGE", js.Any.fromFunction1(value))
      
      inline def setGETSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "GETSET", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusByMemberRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusByMemberRo", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusByMemberRoWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusByMemberRoWith", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusByMemberWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusByMemberWith", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusRo", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusRoWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusRoWith", js.Any.fromFunction1(value))
      
      inline def setGeoRadiusWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoRadiusWith", js.Any.fromFunction1(value))
      
      inline def setGeoSearchWith(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "geoSearchWith", js.Any.fromFunction1(value))
      
      inline def setHDEL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HDEL", js.Any.fromFunction1(value))
      
      inline def setHELLO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HELLO", js.Any.fromFunction1(value))
      
      inline def setHEXISTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HEXISTS", js.Any.fromFunction1(value))
      
      inline def setHGET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HGET", js.Any.fromFunction1(value))
      
      inline def setHGETALL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HGETALL", js.Any.fromFunction1(value))
      
      inline def setHINCRBY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HINCRBY", js.Any.fromFunction1(value))
      
      inline def setHINCRBYFLOAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HINCRBYFLOAT", js.Any.fromFunction1(value))
      
      inline def setHKEYS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HKEYS", js.Any.fromFunction1(value))
      
      inline def setHLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HLEN", js.Any.fromFunction1(value))
      
      inline def setHMGET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HMGET", js.Any.fromFunction1(value))
      
      inline def setHRANDFIELD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HRANDFIELD", js.Any.fromFunction1(value))
      
      inline def setHRANDFIELD_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HRANDFIELD_COUNT", js.Any.fromFunction1(value))
      
      inline def setHRANDFIELD_COUNT_WITHVALUES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HRANDFIELD_COUNT_WITHVALUES", js.Any.fromFunction1(value))
      
      inline def setHRandFieldCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "hRandFieldCount", js.Any.fromFunction1(value))
      
      inline def setHRandFieldCountWithValues(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "hRandFieldCountWithValues", js.Any.fromFunction1(value))
      
      inline def setHSCAN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HSCAN", js.Any.fromFunction1(value))
      
      inline def setHSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HSET", js.Any.fromFunction1(value))
      
      inline def setHSETNX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HSETNX", js.Any.fromFunction1(value))
      
      inline def setHSTRLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HSTRLEN", js.Any.fromFunction1(value))
      
      inline def setHVALS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "HVALS", js.Any.fromFunction1(value))
      
      inline def setINCR(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "INCR", js.Any.fromFunction1(value))
      
      inline def setINCRBY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "INCRBY", js.Any.fromFunction1(value))
      
      inline def setINCRBYFLOAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "INCRBYFLOAT", js.Any.fromFunction1(value))
      
      inline def setINFO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "INFO", js.Any.fromFunction1(value))
      
      inline def setKEYS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "KEYS", js.Any.fromFunction1(value))
      
      inline def setLASTSAVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LASTSAVE", js.Any.fromFunction1(value))
      
      inline def setLATENCY_DOCTOR(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LATENCY_DOCTOR", js.Any.fromFunction1(value))
      
      inline def setLCS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LCS", js.Any.fromFunction1(value))
      
      inline def setLCS_IDX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LCS_IDX", js.Any.fromFunction1(value))
      
      inline def setLCS_IDX_WITHMATCHLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LCS_IDX_WITHMATCHLEN", js.Any.fromFunction1(value))
      
      inline def setLCS_LEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LCS_LEN", js.Any.fromFunction1(value))
      
      inline def setLINDEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LINDEX", js.Any.fromFunction1(value))
      
      inline def setLINSERT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LINSERT", js.Any.fromFunction1(value))
      
      inline def setLLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LLEN", js.Any.fromFunction1(value))
      
      inline def setLMOVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LMOVE", js.Any.fromFunction1(value))
      
      inline def setLMPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LMPOP", js.Any.fromFunction1(value))
      
      inline def setLOLWUT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LOLWUT", js.Any.fromFunction1(value))
      
      inline def setLPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPOP", js.Any.fromFunction1(value))
      
      inline def setLPOP_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPOP_COUNT", js.Any.fromFunction1(value))
      
      inline def setLPOS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPOS", js.Any.fromFunction1(value))
      
      inline def setLPOS_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPOS_COUNT", js.Any.fromFunction1(value))
      
      inline def setLPUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPUSH", js.Any.fromFunction1(value))
      
      inline def setLPUSHX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LPUSHX", js.Any.fromFunction1(value))
      
      inline def setLPopCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lPopCount", js.Any.fromFunction1(value))
      
      inline def setLPosCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lPosCount", js.Any.fromFunction1(value))
      
      inline def setLRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LRANGE", js.Any.fromFunction1(value))
      
      inline def setLREM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LREM", js.Any.fromFunction1(value))
      
      inline def setLSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LSET", js.Any.fromFunction1(value))
      
      inline def setLTRIM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "LTRIM", js.Any.fromFunction1(value))
      
      inline def setLatencyDoctor(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "latencyDoctor", js.Any.fromFunction1(value))
      
      inline def setLcsIdx(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lcsIdx", js.Any.fromFunction1(value))
      
      inline def setLcsIdxWithMatchLen(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lcsIdxWithMatchLen", js.Any.fromFunction1(value))
      
      inline def setLcsLen(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "lcsLen", js.Any.fromFunction1(value))
      
      inline def setMEMORY_DOCTOR(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MEMORY_DOCTOR", js.Any.fromFunction1(value))
      
      inline def `setMEMORY_MALLOC-STATS`(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MEMORY_MALLOC-STATS", js.Any.fromFunction1(value))
      
      inline def setMEMORY_PURGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MEMORY_PURGE", js.Any.fromFunction1(value))
      
      inline def setMEMORY_STATS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MEMORY_STATS", js.Any.fromFunction1(value))
      
      inline def setMEMORY_USAGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MEMORY_USAGE", js.Any.fromFunction1(value))
      
      inline def setMGET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MGET", js.Any.fromFunction1(value))
      
      inline def setMIGRATE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MIGRATE", js.Any.fromFunction1(value))
      
      inline def setMODULE_LIST(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MODULE_LIST", js.Any.fromFunction1(value))
      
      inline def setMODULE_LOAD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MODULE_LOAD", js.Any.fromFunction1(value))
      
      inline def setMODULE_UNLOAD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MODULE_UNLOAD", js.Any.fromFunction1(value))
      
      inline def setMOVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MOVE", js.Any.fromFunction1(value))
      
      inline def setMSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MSET", js.Any.fromFunction1(value))
      
      inline def setMSETNX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "MSETNX", js.Any.fromFunction1(value))
      
      inline def setMemoryDoctor(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "memoryDoctor", js.Any.fromFunction1(value))
      
      inline def setMemoryMallocStats(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "memoryMallocStats", js.Any.fromFunction1(value))
      
      inline def setMemoryPurge(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "memoryPurge", js.Any.fromFunction1(value))
      
      inline def setMemoryStats(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "memoryStats", js.Any.fromFunction1(value))
      
      inline def setMemoryUsage(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "memoryUsage", js.Any.fromFunction1(value))
      
      inline def setModuleList(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "moduleList", js.Any.fromFunction1(value))
      
      inline def setModuleLoad(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "moduleLoad", js.Any.fromFunction1(value))
      
      inline def setModuleUnload(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "moduleUnload", js.Any.fromFunction1(value))
      
      inline def setOBJECT_ENCODING(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "OBJECT_ENCODING", js.Any.fromFunction1(value))
      
      inline def setOBJECT_FREQ(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "OBJECT_FREQ", js.Any.fromFunction1(value))
      
      inline def setOBJECT_IDLETIME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "OBJECT_IDLETIME", js.Any.fromFunction1(value))
      
      inline def setOBJECT_REFCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "OBJECT_REFCOUNT", js.Any.fromFunction1(value))
      
      inline def setObjectEncoding(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "objectEncoding", js.Any.fromFunction1(value))
      
      inline def setObjectFreq(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "objectFreq", js.Any.fromFunction1(value))
      
      inline def setObjectIdleTime(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "objectIdleTime", js.Any.fromFunction1(value))
      
      inline def setObjectRefCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "objectRefCount", js.Any.fromFunction1(value))
      
      inline def setPERSIST(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PERSIST", js.Any.fromFunction1(value))
      
      inline def setPEXPIRE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PEXPIRE", js.Any.fromFunction1(value))
      
      inline def setPEXPIREAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PEXPIREAT", js.Any.fromFunction1(value))
      
      inline def setPEXPIRETIME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PEXPIRETIME", js.Any.fromFunction1(value))
      
      inline def setPFADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PFADD", js.Any.fromFunction1(value))
      
      inline def setPFCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PFCOUNT", js.Any.fromFunction1(value))
      
      inline def setPFMERGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PFMERGE", js.Any.fromFunction1(value))
      
      inline def setPING(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PING", js.Any.fromFunction1(value))
      
      inline def setPSETEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PSETEX", js.Any.fromFunction1(value))
      
      inline def setPTTL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PTTL", js.Any.fromFunction1(value))
      
      inline def setPUBLISH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PUBLISH", js.Any.fromFunction1(value))
      
      inline def setPUBSUB_CHANNELS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PUBSUB_CHANNELS", js.Any.fromFunction1(value))
      
      inline def setPUBSUB_NUMPAT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PUBSUB_NUMPAT", js.Any.fromFunction1(value))
      
      inline def setPUBSUB_NUMSUB(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "PUBSUB_NUMSUB", js.Any.fromFunction1(value))
      
      inline def setPubSubChannels(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "pubSubChannels", js.Any.fromFunction1(value))
      
      inline def setPubSubNumPat(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "pubSubNumPat", js.Any.fromFunction1(value))
      
      inline def setPubSubNumSub(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "pubSubNumSub", js.Any.fromFunction1(value))
      
      inline def setRANDOMKEY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RANDOMKEY", js.Any.fromFunction1(value))
      
      inline def setREADONLY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "READONLY", js.Any.fromFunction1(value))
      
      inline def setREADWRITE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "READWRITE", js.Any.fromFunction1(value))
      
      inline def setRENAME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RENAME", js.Any.fromFunction1(value))
      
      inline def setRENAMENX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RENAMENX", js.Any.fromFunction1(value))
      
      inline def setREPLICAOF(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "REPLICAOF", js.Any.fromFunction1(value))
      
      inline def `setRESTORE-ASKING`(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RESTORE-ASKING", js.Any.fromFunction1(value))
      
      inline def setROLE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ROLE", js.Any.fromFunction1(value))
      
      inline def setRPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPOP", js.Any.fromFunction1(value))
      
      inline def setRPOPLPUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPOPLPUSH", js.Any.fromFunction1(value))
      
      inline def setRPOP_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPOP_COUNT", js.Any.fromFunction1(value))
      
      inline def setRPUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPUSH", js.Any.fromFunction1(value))
      
      inline def setRPUSHX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "RPUSHX", js.Any.fromFunction1(value))
      
      inline def setRPopCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "rPopCount", js.Any.fromFunction1(value))
      
      inline def setRestoreAsking(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "restoreAsking", js.Any.fromFunction1(value))
      
      inline def setSADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SADD", js.Any.fromFunction1(value))
      
      inline def setSAVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SAVE", js.Any.fromFunction1(value))
      
      inline def setSCAN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SCAN", js.Any.fromFunction1(value))
      
      inline def setSCARD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SCARD", js.Any.fromFunction1(value))
      
      inline def setSCRIPT_DEBUG(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SCRIPT_DEBUG", js.Any.fromFunction1(value))
      
      inline def setSCRIPT_EXISTS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SCRIPT_EXISTS", js.Any.fromFunction1(value))
      
      inline def setSCRIPT_FLUSH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SCRIPT_FLUSH", js.Any.fromFunction1(value))
      
      inline def setSCRIPT_KILL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SCRIPT_KILL", js.Any.fromFunction1(value))
      
      inline def setSCRIPT_LOAD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SCRIPT_LOAD", js.Any.fromFunction1(value))
      
      inline def setSDIFF(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SDIFF", js.Any.fromFunction1(value))
      
      inline def setSDIFFSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SDIFFSTORE", js.Any.fromFunction1(value))
      
      inline def setSET(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SET", js.Any.fromFunction1(value))
      
      inline def setSETBIT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SETBIT", js.Any.fromFunction1(value))
      
      inline def setSETEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SETEX", js.Any.fromFunction1(value))
      
      inline def setSETNX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SETNX", js.Any.fromFunction1(value))
      
      inline def setSETRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SETRANGE", js.Any.fromFunction1(value))
      
      inline def setSHUTDOWN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SHUTDOWN", js.Any.fromFunction1(value))
      
      inline def setSINTER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SINTER", js.Any.fromFunction1(value))
      
      inline def setSINTERCARD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SINTERCARD", js.Any.fromFunction1(value))
      
      inline def setSINTERSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SINTERSTORE", js.Any.fromFunction1(value))
      
      inline def setSISMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SISMEMBER", js.Any.fromFunction1(value))
      
      inline def setSMEMBERS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SMEMBERS", js.Any.fromFunction1(value))
      
      inline def setSMISMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SMISMEMBER", js.Any.fromFunction1(value))
      
      inline def setSMOVE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SMOVE", js.Any.fromFunction1(value))
      
      inline def setSORT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SORT", js.Any.fromFunction1(value))
      
      inline def setSORT_RO(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SORT_RO", js.Any.fromFunction1(value))
      
      inline def setSORT_STORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SORT_STORE", js.Any.fromFunction1(value))
      
      inline def setSPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SPOP", js.Any.fromFunction1(value))
      
      inline def setSRANDMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SRANDMEMBER", js.Any.fromFunction1(value))
      
      inline def setSRANDMEMBER_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SRANDMEMBER_COUNT", js.Any.fromFunction1(value))
      
      inline def setSREM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SREM", js.Any.fromFunction1(value))
      
      inline def setSRandMemberCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "sRandMemberCount", js.Any.fromFunction1(value))
      
      inline def setSSCAN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SSCAN", js.Any.fromFunction1(value))
      
      inline def setSTRLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "STRLEN", js.Any.fromFunction1(value))
      
      inline def setSUNION(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SUNION", js.Any.fromFunction1(value))
      
      inline def setSUNIONSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SUNIONSTORE", js.Any.fromFunction1(value))
      
      inline def setSWAPDB(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "SWAPDB", js.Any.fromFunction1(value))
      
      inline def setScriptDebug(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "scriptDebug", js.Any.fromFunction1(value))
      
      inline def setScriptExists(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "scriptExists", js.Any.fromFunction1(value))
      
      inline def setScriptFlush(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "scriptFlush", js.Any.fromFunction1(value))
      
      inline def setScriptKill(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "scriptKill", js.Any.fromFunction1(value))
      
      inline def setScriptLoad(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "scriptLoad", js.Any.fromFunction1(value))
      
      inline def setSortRo(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "sortRo", js.Any.fromFunction1(value))
      
      inline def setSortStore(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "sortStore", js.Any.fromFunction1(value))
      
      inline def setTIME(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "TIME", js.Any.fromFunction1(value))
      
      inline def setTOUCH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "TOUCH", js.Any.fromFunction1(value))
      
      inline def setTTL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "TTL", js.Any.fromFunction1(value))
      
      inline def setTYPE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "TYPE", js.Any.fromFunction1(value))
      
      inline def setUNLINK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "UNLINK", js.Any.fromFunction1(value))
      
      inline def setUNWATCH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "UNWATCH", js.Any.fromFunction1(value))
      
      inline def setWAIT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "WAIT", js.Any.fromFunction1(value))
      
      inline def setWATCH(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "WATCH", js.Any.fromFunction1(value))
      
      inline def setWait_(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "wait", js.Any.fromFunction1(value))
      
      inline def setXACK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XACK", js.Any.fromFunction1(value))
      
      inline def setXADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XADD", js.Any.fromFunction1(value))
      
      inline def setXAUTOCLAIM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XAUTOCLAIM", js.Any.fromFunction1(value))
      
      inline def setXAUTOCLAIM_JUSTID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XAUTOCLAIM_JUSTID", js.Any.fromFunction1(value))
      
      inline def setXAutoClaimJustId(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xAutoClaimJustId", js.Any.fromFunction1(value))
      
      inline def setXCLAIM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XCLAIM", js.Any.fromFunction1(value))
      
      inline def setXCLAIM_JUSTID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XCLAIM_JUSTID", js.Any.fromFunction1(value))
      
      inline def setXClaimJustId(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xClaimJustId", js.Any.fromFunction1(value))
      
      inline def setXDEL(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XDEL", js.Any.fromFunction1(value))
      
      inline def setXGROUP_CREATE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_CREATE", js.Any.fromFunction1(value))
      
      inline def setXGROUP_CREATECONSUMER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_CREATECONSUMER", js.Any.fromFunction1(value))
      
      inline def setXGROUP_DELCONSUMER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_DELCONSUMER", js.Any.fromFunction1(value))
      
      inline def setXGROUP_DESTROY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_DESTROY", js.Any.fromFunction1(value))
      
      inline def setXGROUP_SETID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XGROUP_SETID", js.Any.fromFunction1(value))
      
      inline def setXGroupCreate(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupCreate", js.Any.fromFunction1(value))
      
      inline def setXGroupCreateConsumer(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupCreateConsumer", js.Any.fromFunction1(value))
      
      inline def setXGroupDelConsumer(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupDelConsumer", js.Any.fromFunction1(value))
      
      inline def setXGroupDestroy(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupDestroy", js.Any.fromFunction1(value))
      
      inline def setXGroupSetId(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xGroupSetId", js.Any.fromFunction1(value))
      
      inline def setXINFO_CONSUMERS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XINFO_CONSUMERS", js.Any.fromFunction1(value))
      
      inline def setXINFO_GROUPS(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XINFO_GROUPS", js.Any.fromFunction1(value))
      
      inline def setXINFO_STREAM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XINFO_STREAM", js.Any.fromFunction1(value))
      
      inline def setXInfoConsumers(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xInfoConsumers", js.Any.fromFunction1(value))
      
      inline def setXInfoGroups(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xInfoGroups", js.Any.fromFunction1(value))
      
      inline def setXInfoStream(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xInfoStream", js.Any.fromFunction1(value))
      
      inline def setXLEN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XLEN", js.Any.fromFunction1(value))
      
      inline def setXPENDING(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XPENDING", js.Any.fromFunction1(value))
      
      inline def setXPENDING_RANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XPENDING_RANGE", js.Any.fromFunction1(value))
      
      inline def setXPendingRange(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "xPendingRange", js.Any.fromFunction1(value))
      
      inline def setXRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XRANGE", js.Any.fromFunction1(value))
      
      inline def setXREAD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XREAD", js.Any.fromFunction1(value))
      
      inline def setXREADGROUP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XREADGROUP", js.Any.fromFunction1(value))
      
      inline def setXREVRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XREVRANGE", js.Any.fromFunction1(value))
      
      inline def setXSETID(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XSETID", js.Any.fromFunction1(value))
      
      inline def setXTRIM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "XTRIM", js.Any.fromFunction1(value))
      
      inline def setZADD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZADD", js.Any.fromFunction1(value))
      
      inline def setZCARD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZCARD", js.Any.fromFunction1(value))
      
      inline def setZCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZCOUNT", js.Any.fromFunction1(value))
      
      inline def setZDIFF(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZDIFF", js.Any.fromFunction1(value))
      
      inline def setZDIFFSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZDIFFSTORE", js.Any.fromFunction1(value))
      
      inline def setZDIFF_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZDIFF_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZDiffWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zDiffWithScores", js.Any.fromFunction1(value))
      
      inline def setZINCRBY(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINCRBY", js.Any.fromFunction1(value))
      
      inline def setZINTER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINTER", js.Any.fromFunction1(value))
      
      inline def setZINTERCARD(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINTERCARD", js.Any.fromFunction1(value))
      
      inline def setZINTERSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINTERSTORE", js.Any.fromFunction1(value))
      
      inline def setZINTER_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZINTER_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZInterWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zInterWithScores", js.Any.fromFunction1(value))
      
      inline def setZLEXCOUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZLEXCOUNT", js.Any.fromFunction1(value))
      
      inline def setZMPOP(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZMPOP", js.Any.fromFunction1(value))
      
      inline def setZMSCORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZMSCORE", js.Any.fromFunction1(value))
      
      inline def setZPOPMAX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZPOPMAX", js.Any.fromFunction1(value))
      
      inline def setZPOPMAX_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZPOPMAX_COUNT", js.Any.fromFunction1(value))
      
      inline def setZPOPMIN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZPOPMIN", js.Any.fromFunction1(value))
      
      inline def setZPOPMIN_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZPOPMIN_COUNT", js.Any.fromFunction1(value))
      
      inline def setZPopMaxCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zPopMaxCount", js.Any.fromFunction1(value))
      
      inline def setZPopMinCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zPopMinCount", js.Any.fromFunction1(value))
      
      inline def setZRANDMEMBER(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANDMEMBER", js.Any.fromFunction1(value))
      
      inline def setZRANDMEMBER_COUNT(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANDMEMBER_COUNT", js.Any.fromFunction1(value))
      
      inline def setZRANDMEMBER_COUNT_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANDMEMBER_COUNT_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZRANGE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGE", js.Any.fromFunction1(value))
      
      inline def setZRANGEBYLEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGEBYLEX", js.Any.fromFunction1(value))
      
      inline def setZRANGEBYSCORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGEBYSCORE", js.Any.fromFunction1(value))
      
      inline def setZRANGEBYSCORE_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGEBYSCORE_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZRANGESTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGESTORE", js.Any.fromFunction1(value))
      
      inline def setZRANGE_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANGE_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZRANK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZRANK", js.Any.fromFunction1(value))
      
      inline def setZREM(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREM", js.Any.fromFunction1(value))
      
      inline def setZREMRANGEBYLEX(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREMRANGEBYLEX", js.Any.fromFunction1(value))
      
      inline def setZREMRANGEBYRANK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREMRANGEBYRANK", js.Any.fromFunction1(value))
      
      inline def setZREMRANGEBYSCORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREMRANGEBYSCORE", js.Any.fromFunction1(value))
      
      inline def setZREVRANK(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZREVRANK", js.Any.fromFunction1(value))
      
      inline def setZRandMemberCount(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zRandMemberCount", js.Any.fromFunction1(value))
      
      inline def setZRandMemberCountWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zRandMemberCountWithScores", js.Any.fromFunction1(value))
      
      inline def setZRangeByScoreWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zRangeByScoreWithScores", js.Any.fromFunction1(value))
      
      inline def setZRangeWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zRangeWithScores", js.Any.fromFunction1(value))
      
      inline def setZSCAN(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZSCAN", js.Any.fromFunction1(value))
      
      inline def setZSCORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZSCORE", js.Any.fromFunction1(value))
      
      inline def setZUNION(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZUNION", js.Any.fromFunction1(value))
      
      inline def setZUNIONSTORE(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZUNIONSTORE", js.Any.fromFunction1(value))
      
      inline def setZUNION_WITHSCORES(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "ZUNION_WITHSCORES", js.Any.fromFunction1(value))
      
      inline def setZUnionWithScores(
        value: /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: C['transformArguments'] */ js.Any
            ] => RedisClientMultiCommandType[M, F, S]
      ): Self = StObject.set(x, "zUnionWithScores", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof F as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<P> ]: {[ FF in keyof F[P] as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<FF> ]: @redis/client.@redis/client/dist/lib/client/multi-command.CommandSignature<F[P][FF], M, F, S>}}
    }}}
    */
  @js.native
  trait WithFunctions[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof M as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<P> ]: {[ C in keyof M[P] as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<C> ]: @redis/client.@redis/client/dist/lib/client/multi-command.CommandSignature<M[P][C], M, F, S>}}
    }}}
    */
  @js.native
  trait WithModules[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof S as @redis/client.@redis/client/dist/lib/commands.ExcludeMappedString<P> ]: @redis/client.@redis/client/dist/lib/client/multi-command.CommandSignature<S[P], M, F, S>}
    }}}
    */
  @js.native
  trait WithScripts[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject
}

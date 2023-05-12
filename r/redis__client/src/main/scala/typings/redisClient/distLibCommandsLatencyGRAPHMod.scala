package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsLatencyGRAPHMod {
  
  @JSImport("@redis/client/dist/lib/commands/LATENCY_GRAPH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(event: EventType): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(event.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisClient.redisClientStrings.`active-defrag-cycle`
    - typings.redisClient.redisClientStrings.`aof-fsync-always`
    - typings.redisClient.redisClientStrings.`aof-stat`
    - typings.redisClient.redisClientStrings.`aof-rewrite-diff-write`
    - typings.redisClient.redisClientStrings.`aof-rename`
    - typings.redisClient.redisClientStrings.`aof-write`
    - typings.redisClient.redisClientStrings.`aof-write-active-child`
    - typings.redisClient.redisClientStrings.`aof-write-alone`
    - typings.redisClient.redisClientStrings.`aof-write-pending-fsync`
    - typings.redisClient.redisClientStrings.command
    - typings.redisClient.redisClientStrings.`expire-cycle`
    - typings.redisClient.redisClientStrings.`eviction-cycle`
    - typings.redisClient.redisClientStrings.`eviction-del`
    - typings.redisClient.redisClientStrings.`fast-command`
    - typings.redisClient.redisClientStrings.fork
    - typings.redisClient.redisClientStrings.`rdb-unlink-temp-file`
  */
  trait EventType extends StObject
  object EventType {
    
    inline def `active-defrag-cycle`: typings.redisClient.redisClientStrings.`active-defrag-cycle` = "active-defrag-cycle".asInstanceOf[typings.redisClient.redisClientStrings.`active-defrag-cycle`]
    
    inline def `aof-fsync-always`: typings.redisClient.redisClientStrings.`aof-fsync-always` = "aof-fsync-always".asInstanceOf[typings.redisClient.redisClientStrings.`aof-fsync-always`]
    
    inline def `aof-rename`: typings.redisClient.redisClientStrings.`aof-rename` = "aof-rename".asInstanceOf[typings.redisClient.redisClientStrings.`aof-rename`]
    
    inline def `aof-rewrite-diff-write`: typings.redisClient.redisClientStrings.`aof-rewrite-diff-write` = "aof-rewrite-diff-write".asInstanceOf[typings.redisClient.redisClientStrings.`aof-rewrite-diff-write`]
    
    inline def `aof-stat`: typings.redisClient.redisClientStrings.`aof-stat` = "aof-stat".asInstanceOf[typings.redisClient.redisClientStrings.`aof-stat`]
    
    inline def `aof-write`: typings.redisClient.redisClientStrings.`aof-write` = "aof-write".asInstanceOf[typings.redisClient.redisClientStrings.`aof-write`]
    
    inline def `aof-write-active-child`: typings.redisClient.redisClientStrings.`aof-write-active-child` = "aof-write-active-child".asInstanceOf[typings.redisClient.redisClientStrings.`aof-write-active-child`]
    
    inline def `aof-write-alone`: typings.redisClient.redisClientStrings.`aof-write-alone` = "aof-write-alone".asInstanceOf[typings.redisClient.redisClientStrings.`aof-write-alone`]
    
    inline def `aof-write-pending-fsync`: typings.redisClient.redisClientStrings.`aof-write-pending-fsync` = "aof-write-pending-fsync".asInstanceOf[typings.redisClient.redisClientStrings.`aof-write-pending-fsync`]
    
    inline def command: typings.redisClient.redisClientStrings.command = "command".asInstanceOf[typings.redisClient.redisClientStrings.command]
    
    inline def `eviction-cycle`: typings.redisClient.redisClientStrings.`eviction-cycle` = "eviction-cycle".asInstanceOf[typings.redisClient.redisClientStrings.`eviction-cycle`]
    
    inline def `eviction-del`: typings.redisClient.redisClientStrings.`eviction-del` = "eviction-del".asInstanceOf[typings.redisClient.redisClientStrings.`eviction-del`]
    
    inline def `expire-cycle`: typings.redisClient.redisClientStrings.`expire-cycle` = "expire-cycle".asInstanceOf[typings.redisClient.redisClientStrings.`expire-cycle`]
    
    inline def `fast-command`: typings.redisClient.redisClientStrings.`fast-command` = "fast-command".asInstanceOf[typings.redisClient.redisClientStrings.`fast-command`]
    
    inline def fork: typings.redisClient.redisClientStrings.fork = "fork".asInstanceOf[typings.redisClient.redisClientStrings.fork]
    
    inline def `rdb-unlink-temp-file`: typings.redisClient.redisClientStrings.`rdb-unlink-temp-file` = "rdb-unlink-temp-file".asInstanceOf[typings.redisClient.redisClientStrings.`rdb-unlink-temp-file`]
  }
}

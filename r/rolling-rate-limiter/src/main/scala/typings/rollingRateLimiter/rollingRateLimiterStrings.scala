package typings.rollingRateLimiter

import typings.rollingRateLimiter.mod.RedisClientType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollingRateLimiterStrings {
  
  @js.native
  sealed trait WITHSCORES extends StObject
  inline def WITHSCORES: WITHSCORES = "WITHSCORES".asInstanceOf[WITHSCORES]
  
  @js.native
  sealed trait ioredis
    extends StObject
       with RedisClientType
  inline def ioredis: ioredis = "ioredis".asInstanceOf[ioredis]
  
  @js.native
  sealed trait microseconds extends StObject
  inline def microseconds: microseconds = "microseconds".asInstanceOf[microseconds]
  
  @js.native
  sealed trait milliseconds extends StObject
  inline def milliseconds: milliseconds = "milliseconds".asInstanceOf[milliseconds]
  
  @js.native
  sealed trait `node-redis`
    extends StObject
       with RedisClientType
  inline def `node-redis`: `node-redis` = "node-redis".asInstanceOf[`node-redis`]
  
  @js.native
  sealed trait seconds extends StObject
  inline def seconds: seconds = "seconds".asInstanceOf[seconds]
}

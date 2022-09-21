package typings.redisClient.genericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandCategories extends StObject
@JSImport("@redis/client/dist/lib/commands/generic-transformers", "CommandCategories")
@js.native
object CommandCategories extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CommandCategories & String] = js.native
  
  @js.native
  sealed trait ADMIN
    extends StObject
       with CommandCategories
  /* "@admin" */ val ADMIN: typings.redisClient.genericTransformersMod.CommandCategories.ADMIN & String = js.native
  
  @js.native
  sealed trait BITMAP
    extends StObject
       with CommandCategories
  /* "@bitmap" */ val BITMAP: typings.redisClient.genericTransformersMod.CommandCategories.BITMAP & String = js.native
  
  @js.native
  sealed trait BLOCKING
    extends StObject
       with CommandCategories
  /* "@blocking" */ val BLOCKING: typings.redisClient.genericTransformersMod.CommandCategories.BLOCKING & String = js.native
  
  @js.native
  sealed trait CONNECTION
    extends StObject
       with CommandCategories
  /* "@connection" */ val CONNECTION: typings.redisClient.genericTransformersMod.CommandCategories.CONNECTION & String = js.native
  
  @js.native
  sealed trait DANGEROUS
    extends StObject
       with CommandCategories
  /* "@dangerous" */ val DANGEROUS: typings.redisClient.genericTransformersMod.CommandCategories.DANGEROUS & String = js.native
  
  @js.native
  sealed trait FAST
    extends StObject
       with CommandCategories
  /* "@fast" */ val FAST: typings.redisClient.genericTransformersMod.CommandCategories.FAST & String = js.native
  
  @js.native
  sealed trait GEO
    extends StObject
       with CommandCategories
  /* "@geo" */ val GEO: typings.redisClient.genericTransformersMod.CommandCategories.GEO & String = js.native
  
  @js.native
  sealed trait HASH
    extends StObject
       with CommandCategories
  /* "@hash" */ val HASH: typings.redisClient.genericTransformersMod.CommandCategories.HASH & String = js.native
  
  @js.native
  sealed trait HYPERLOGLOG
    extends StObject
       with CommandCategories
  /* "@hyperloglog" */ val HYPERLOGLOG: typings.redisClient.genericTransformersMod.CommandCategories.HYPERLOGLOG & String = js.native
  
  @js.native
  sealed trait KEYSPACE
    extends StObject
       with CommandCategories
  /* "@keyspace" */ val KEYSPACE: typings.redisClient.genericTransformersMod.CommandCategories.KEYSPACE & String = js.native
  
  @js.native
  sealed trait LIST
    extends StObject
       with CommandCategories
  /* "@list" */ val LIST: typings.redisClient.genericTransformersMod.CommandCategories.LIST & String = js.native
  
  @js.native
  sealed trait PUBSUB
    extends StObject
       with CommandCategories
  /* "@pubsub" */ val PUBSUB: typings.redisClient.genericTransformersMod.CommandCategories.PUBSUB & String = js.native
  
  @js.native
  sealed trait READ
    extends StObject
       with CommandCategories
  /* "@read" */ val READ: typings.redisClient.genericTransformersMod.CommandCategories.READ & String = js.native
  
  @js.native
  sealed trait SCRIPTING
    extends StObject
       with CommandCategories
  /* "@scripting" */ val SCRIPTING: typings.redisClient.genericTransformersMod.CommandCategories.SCRIPTING & String = js.native
  
  @js.native
  sealed trait SET
    extends StObject
       with CommandCategories
  /* "@set" */ val SET: typings.redisClient.genericTransformersMod.CommandCategories.SET & String = js.native
  
  @js.native
  sealed trait SLOW
    extends StObject
       with CommandCategories
  /* "@slow" */ val SLOW: typings.redisClient.genericTransformersMod.CommandCategories.SLOW & String = js.native
  
  @js.native
  sealed trait SORTEDSET
    extends StObject
       with CommandCategories
  /* "@sortedset" */ val SORTEDSET: typings.redisClient.genericTransformersMod.CommandCategories.SORTEDSET & String = js.native
  
  @js.native
  sealed trait STREAM
    extends StObject
       with CommandCategories
  /* "@stream" */ val STREAM: typings.redisClient.genericTransformersMod.CommandCategories.STREAM & String = js.native
  
  @js.native
  sealed trait STRING
    extends StObject
       with CommandCategories
  /* "@string" */ val STRING: typings.redisClient.genericTransformersMod.CommandCategories.STRING & String = js.native
  
  @js.native
  sealed trait TRANSACTION
    extends StObject
       with CommandCategories
  /* "@transaction" */ val TRANSACTION: typings.redisClient.genericTransformersMod.CommandCategories.TRANSACTION & String = js.native
  
  @js.native
  sealed trait WRITE
    extends StObject
       with CommandCategories
  /* "@write" */ val WRITE: typings.redisClient.genericTransformersMod.CommandCategories.WRITE & String = js.native
}

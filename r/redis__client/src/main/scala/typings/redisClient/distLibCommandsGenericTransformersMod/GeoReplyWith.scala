package typings.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeoReplyWith extends StObject
@JSImport("@redis/client/dist/lib/commands/generic-transformers", "GeoReplyWith")
@js.native
object GeoReplyWith extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GeoReplyWith & String] = js.native
  
  @js.native
  sealed trait COORDINATES
    extends StObject
       with GeoReplyWith
  /* "WITHCOORD" */ val COORDINATES: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.COORDINATES & String = js.native
  
  @js.native
  sealed trait DISTANCE
    extends StObject
       with GeoReplyWith
  /* "WITHDIST" */ val DISTANCE: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.DISTANCE & String = js.native
  
  @js.native
  sealed trait HASH
    extends StObject
       with GeoReplyWith
  /* "WITHHASH" */ val HASH: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.HASH & String = js.native
}

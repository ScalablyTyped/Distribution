package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsGeoposMod {
  
  @JSImport("@redis/client/dist/lib/commands/GEOPOS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEOPOS", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEOPOS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, member: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], member.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, member: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], member.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: GeoCoordinatesRawReply): js.Array[GeoCoordinates | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[GeoCoordinates | Null]]
  
  trait GeoCoordinates extends StObject {
    
    var latitude: RedisCommandArgument
    
    var longitude: RedisCommandArgument
  }
  object GeoCoordinates {
    
    inline def apply(latitude: RedisCommandArgument, longitude: RedisCommandArgument): GeoCoordinates = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoCoordinates] (val x: Self) extends AnyVal {
      
      inline def setLatitude(value: RedisCommandArgument): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: RedisCommandArgument): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoCoordinatesRawReply = js.Array[(js.Tuple2[RedisCommandArgument, RedisCommandArgument]) | Null]
}

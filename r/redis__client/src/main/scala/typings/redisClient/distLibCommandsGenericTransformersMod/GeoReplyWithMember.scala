package typings.redisClient.distLibCommandsGenericTransformersMod

import typings.redisClient.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoReplyWithMember extends StObject {
  
  var coordinates: js.UndefOr[Latitude] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
  
  var member: String
}
object GeoReplyWithMember {
  
  inline def apply(member: String): GeoReplyWithMember = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoReplyWithMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoReplyWithMember] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: Latitude): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
  }
}

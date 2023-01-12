package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDto extends StObject {
  
  var full: String
  
  var group: String
  
  var h: Double
  
  var sprite: String
  
  var w: Double
  
  var x: Double
  
  var y: Double
}
object ImageDto {
  
  inline def apply(full: String, group: String, h: Double, sprite: String, w: Double, x: Double, y: Double): ImageDto = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDto] (val x: Self) extends AnyVal {
    
    inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageDto extends StObject {
  
  var full: String = js.native
  
  var group: String = js.native
  
  var h: Double = js.native
  
  var sprite: String = js.native
  
  var w: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ImageDto {
  
  @scala.inline
  def apply(full: String, group: String, h: Double, sprite: String, w: Double, x: Double, y: Double): ImageDto = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDto]
  }
  
  @scala.inline
  implicit class ImageDtoMutableBuilder[Self <: ImageDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

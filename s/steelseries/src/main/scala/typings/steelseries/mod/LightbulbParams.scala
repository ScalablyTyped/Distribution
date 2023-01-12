package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightbulbParams extends StObject {
  
  var glowColor: String
  
  var height: Double
  
  var width: Double
}
object LightbulbParams {
  
  inline def apply(glowColor: String, height: Double, width: Double): LightbulbParams = {
    val __obj = js.Dynamic.literal(glowColor = glowColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightbulbParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LightbulbParams] (val x: Self) extends AnyVal {
    
    inline def setGlowColor(value: String): Self = StObject.set(x, "glowColor", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

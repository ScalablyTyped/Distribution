package typings.reactSketchapp.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var fontScale: Requireable[Double]
  
  var height: Requireable[Double]
  
  var name: Requireable[String]
  
  var scale: Requireable[Double]
  
  var width: Requireable[Double]
}
object Scale {
  
  inline def apply(
    fontScale: Requireable[Double],
    height: Requireable[Double],
    name: Requireable[String],
    scale: Requireable[Double],
    width: Requireable[Double]
  ): Scale = {
    val __obj = js.Dynamic.literal(fontScale = fontScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    inline def setFontScale(value: Requireable[Double]): Self = StObject.set(x, "fontScale", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Requireable[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Requireable[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

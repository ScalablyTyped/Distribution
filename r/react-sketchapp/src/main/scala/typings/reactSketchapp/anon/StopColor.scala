package typings.reactSketchapp.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopColor extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var stopColor: Requireable[String]
  
  var stopOpacity: Requireable[String | Double]
}
object StopColor {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    stopColor: Requireable[String],
    stopOpacity: Requireable[String | Double]
  ): StopColor = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], stopColor = stopColor.asInstanceOf[js.Any], stopOpacity = stopOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopColor]
  }
  
  extension [Self <: StopColor](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setStopColor(value: Requireable[String]): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    inline def setStopOpacity(value: Requireable[String | Double]): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
  }
}

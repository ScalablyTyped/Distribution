package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSSymbolContainers extends StObject {
  
  var _class: symbolContainer
  
  var objects: js.Array[Any]
}
object SketchMSSymbolContainers {
  
  inline def apply(objects: js.Array[Any]): SketchMSSymbolContainers = {
    val __obj = js.Dynamic.literal(_class = "symbolContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSymbolContainers]
  }
  
  extension [Self <: SketchMSSymbolContainers](x: Self) {
    
    inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def set_class(value: symbolContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

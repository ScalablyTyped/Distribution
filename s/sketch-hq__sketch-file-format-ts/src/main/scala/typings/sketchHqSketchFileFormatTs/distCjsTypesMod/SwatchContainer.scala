package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.swatchContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwatchContainer
  extends StObject
     with AnyObject {
  
  var _class: swatchContainer
  
  var do_objectID: js.UndefOr[Uuid] = js.undefined
  
  var objects: js.Array[Swatch]
}
object SwatchContainer {
  
  inline def apply(objects: js.Array[Swatch]): SwatchContainer = {
    val __obj = js.Dynamic.literal(_class = "swatchContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwatchContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwatchContainer] (val x: Self) extends AnyVal {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setDo_objectIDUndefined: Self = StObject.set(x, "do_objectID", js.undefined)
    
    inline def setObjects(value: js.Array[Swatch]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Swatch*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def set_class(value: swatchContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

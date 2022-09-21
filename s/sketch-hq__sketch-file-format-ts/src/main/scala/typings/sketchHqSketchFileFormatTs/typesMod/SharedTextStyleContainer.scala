package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.sharedTextStyleContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedTextStyleContainer
  extends StObject
     with AnyObject {
  
  var _class: sharedTextStyleContainer
  
  var do_objectID: js.UndefOr[Uuid] = js.undefined
  
  var objects: js.Array[SharedStyle]
}
object SharedTextStyleContainer {
  
  inline def apply(objects: js.Array[SharedStyle]): SharedTextStyleContainer = {
    val __obj = js.Dynamic.literal(_class = "sharedTextStyleContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedTextStyleContainer]
  }
  
  extension [Self <: SharedTextStyleContainer](x: Self) {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setDo_objectIDUndefined: Self = StObject.set(x, "do_objectID", js.undefined)
    
    inline def setObjects(value: js.Array[SharedStyle]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: SharedStyle*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def set_class(value: sharedTextStyleContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

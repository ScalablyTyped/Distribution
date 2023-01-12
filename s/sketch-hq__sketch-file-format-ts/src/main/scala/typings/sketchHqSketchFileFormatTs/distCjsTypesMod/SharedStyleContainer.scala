package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.sharedStyleContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStyleContainer
  extends StObject
     with AnyObject {
  
  var _class: sharedStyleContainer
  
  var do_objectID: js.UndefOr[Uuid] = js.undefined
  
  var objects: js.Array[SharedStyle]
}
object SharedStyleContainer {
  
  inline def apply(objects: js.Array[SharedStyle]): SharedStyleContainer = {
    val __obj = js.Dynamic.literal(_class = "sharedStyleContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStyleContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedStyleContainer] (val x: Self) extends AnyVal {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setDo_objectIDUndefined: Self = StObject.set(x, "do_objectID", js.undefined)
    
    inline def setObjects(value: js.Array[SharedStyle]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: SharedStyle*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def set_class(value: sharedStyleContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

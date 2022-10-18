package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.symbolContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolContainer
  extends StObject
     with AnyObject {
  
  var _class: symbolContainer
  
  var do_objectID: js.UndefOr[Uuid] = js.undefined
  
  var objects: js.Array[Any]
}
object SymbolContainer {
  
  inline def apply(objects: js.Array[Any]): SymbolContainer = {
    val __obj = js.Dynamic.literal(_class = "symbolContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolContainer]
  }
  
  extension [Self <: SymbolContainer](x: Self) {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setDo_objectIDUndefined: Self = StObject.set(x, "do_objectID", js.undefined)
    
    inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def set_class(value: symbolContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.swatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Swatch
  extends StObject
     with AnyObject {
  
  var _class: swatch
  
  var do_objectID: Uuid
  
  var name: String
  
  var value: Color
}
object Swatch {
  
  inline def apply(do_objectID: Uuid, name: String, value: Color): Swatch = {
    val __obj = js.Dynamic.literal(_class = "swatch", do_objectID = do_objectID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Swatch] (val x: Self) extends AnyVal {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Color): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_class(value: swatch): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

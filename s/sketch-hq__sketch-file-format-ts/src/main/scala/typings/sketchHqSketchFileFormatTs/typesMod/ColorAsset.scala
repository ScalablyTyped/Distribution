package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableColorAsset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorAsset
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableColorAsset
  
  var color: Color
  
  var do_objectID: Uuid
  
  var name: String
}
object ColorAsset {
  
  inline def apply(color: Color, do_objectID: Uuid, name: String): ColorAsset = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableColorAsset", color = color.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorAsset]
  }
  
  extension [Self <: ColorAsset](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSImmutableColorAsset): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

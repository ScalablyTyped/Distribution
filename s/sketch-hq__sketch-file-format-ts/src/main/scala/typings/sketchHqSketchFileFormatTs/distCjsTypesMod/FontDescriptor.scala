package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.anon.Name
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.fontDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontDescriptor
  extends StObject
     with AnyObject {
  
  var _class: fontDescriptor
  
  var attributes: Name
}
object FontDescriptor {
  
  inline def apply(attributes: Name): FontDescriptor = {
    val __obj = js.Dynamic.literal(_class = "fontDescriptor", attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontDescriptor] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Name): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def set_class(value: fontDescriptor): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

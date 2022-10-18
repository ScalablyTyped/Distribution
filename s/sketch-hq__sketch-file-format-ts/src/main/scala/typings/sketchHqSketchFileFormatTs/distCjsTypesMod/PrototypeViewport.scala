package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutablePrototypeViewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrototypeViewport
  extends StObject
     with AnyObject {
  
  var _class: MSImmutablePrototypeViewport
  
  var libraryID: js.UndefOr[Uuid] = js.undefined
  
  var name: String
  
  var size: SizeString
  
  var templateID: js.UndefOr[Uuid] = js.undefined
}
object PrototypeViewport {
  
  inline def apply(name: String, size: SizeString): PrototypeViewport = {
    val __obj = js.Dynamic.literal(_class = "MSImmutablePrototypeViewport", name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrototypeViewport]
  }
  
  extension [Self <: PrototypeViewport](x: Self) {
    
    inline def setLibraryID(value: Uuid): Self = StObject.set(x, "libraryID", value.asInstanceOf[js.Any])
    
    inline def setLibraryIDUndefined: Self = StObject.set(x, "libraryID", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: SizeString): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTemplateID(value: Uuid): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
    
    inline def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
    
    inline def set_class(value: MSImmutablePrototypeViewport): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

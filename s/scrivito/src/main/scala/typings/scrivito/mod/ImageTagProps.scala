package typings.scrivito.mod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageTagProps
  extends StObject
     with HTMLAttributes[HTMLImageElement] {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var attribute: js.UndefOr[String] = js.undefined
  
  var content: Binary | Obj | Widget
}
object ImageTagProps {
  
  inline def apply(content: Binary | Obj | Widget): ImageTagProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTagProps]
  }
  
  extension [Self <: ImageTagProps](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setContent(value: Binary | Obj | Widget): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

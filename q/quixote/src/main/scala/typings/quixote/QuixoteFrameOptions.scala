package typings.quixote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuixoteFrameOptions extends StObject {
  
  // Height of the iframe. Defaults to a large value (see stability note below)
  var height: js.UndefOr[Double] = js.undefined
  
  // URL of an HTML document to load into the frame. Must be served from same domain as the enclosing test document, or you could get same-origin policy errors. Defaults to an empty document with <!DOCTYPE html> (to enable standards-mode rendering)
  var src: js.UndefOr[String] = js.undefined
  
  // URL of a CSS stylesheet to load into the frame. Defaults to loading nothing
  var stylesheet: js.UndefOr[String] = js.undefined
  
  // Width of the iframe. Defaults to a large value (see stability note below)
  var width: js.UndefOr[Double] = js.undefined
}
object QuixoteFrameOptions {
  
  inline def apply(): QuixoteFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuixoteFrameOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuixoteFrameOptions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStylesheet(value: String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

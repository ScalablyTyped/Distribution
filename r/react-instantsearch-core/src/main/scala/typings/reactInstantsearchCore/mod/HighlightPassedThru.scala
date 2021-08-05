package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightPassedThru[TDoc] extends StObject {
  
  var attribute: String
  
  var highlightProperty: js.UndefOr[String] = js.undefined
  
  var hit: Hit[TDoc]
}
object HighlightPassedThru {
  
  inline def apply[TDoc](attribute: String, hit: Hit[TDoc]): HighlightPassedThru[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightPassedThru[TDoc]]
  }
  
  extension [Self <: HighlightPassedThru[?], TDoc](x: Self & HighlightPassedThru[TDoc]) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setHighlightProperty(value: String): Self = StObject.set(x, "highlightProperty", value.asInstanceOf[js.Any])
    
    inline def setHighlightPropertyUndefined: Self = StObject.set(x, "highlightProperty", js.undefined)
    
    inline def setHit(value: Hit[TDoc]): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
  }
}

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
  
  @scala.inline
  def apply[TDoc](attribute: String, hit: Hit[TDoc]): HighlightPassedThru[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightPassedThru[TDoc]]
  }
  
  @scala.inline
  implicit class HighlightPassedThruMutableBuilder[Self <: HighlightPassedThru[?], TDoc] (val x: Self & HighlightPassedThru[TDoc]) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightProperty(value: String): Self = StObject.set(x, "highlightProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightPropertyUndefined: Self = StObject.set(x, "highlightProperty", js.undefined)
    
    @scala.inline
    def setHit(value: Hit[TDoc]): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
  }
}

package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.Hit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightProperty[TDoc] extends StObject {
  
  var attribute: String
  
  var highlightProperty: String
  
  var hit: Hit[TDoc]
  
  var postTag: js.UndefOr[String] = js.undefined
  
  var preTag: js.UndefOr[String] = js.undefined
}
object HighlightProperty {
  
  @scala.inline
  def apply[TDoc](attribute: String, highlightProperty: String, hit: Hit[TDoc]): HighlightProperty[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], highlightProperty = highlightProperty.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProperty[TDoc]]
  }
  
  @scala.inline
  implicit class HighlightPropertyMutableBuilder[Self <: HighlightProperty[?], TDoc] (val x: Self & HighlightProperty[TDoc]) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightProperty(value: String): Self = StObject.set(x, "highlightProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHit(value: Hit[TDoc]): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostTag(value: String): Self = StObject.set(x, "postTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostTagUndefined: Self = StObject.set(x, "postTag", js.undefined)
    
    @scala.inline
    def setPreTag(value: String): Self = StObject.set(x, "preTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreTagUndefined: Self = StObject.set(x, "preTag", js.undefined)
  }
}

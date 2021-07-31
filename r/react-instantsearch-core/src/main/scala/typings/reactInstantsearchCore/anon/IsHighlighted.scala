package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHighlighted extends StObject {
  
  var isHighlighted: Boolean
  
  var value: String
}
object IsHighlighted {
  
  @scala.inline
  def apply(isHighlighted: Boolean, value: String): IsHighlighted = {
    val __obj = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHighlighted]
  }
  
  @scala.inline
  implicit class IsHighlightedMutableBuilder[Self <: IsHighlighted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.RefinementValue
import typings.reactInstantsearchCore.mod.SearchState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var label: String
  
  var value: RefinementValue
}
object Label {
  
  inline def apply(label: String, value: /* searchState */ SearchState => SearchState): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: /* searchState */ SearchState => SearchState): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}

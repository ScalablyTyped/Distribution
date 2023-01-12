package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRefined extends StObject {
  
  var isRefined: Boolean
  
  var label: String
  
  var noRefinement: Boolean
  
  var value: String
}
object IsRefined {
  
  inline def apply(isRefined: Boolean, label: String, noRefinement: Boolean, value: String): IsRefined = {
    val __obj = js.Dynamic.literal(isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], noRefinement = noRefinement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsRefined] (val x: Self) extends AnyVal {
    
    inline def setIsRefined(value: Boolean): Self = StObject.set(x, "isRefined", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNoRefinement(value: Boolean): Self = StObject.set(x, "noRefinement", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

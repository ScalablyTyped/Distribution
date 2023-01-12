package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteExposed extends StObject {
  
  var defaultRefinement: js.UndefOr[String] = js.undefined
}
object AutocompleteExposed {
  
  inline def apply(): AutocompleteExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteExposed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutocompleteExposed] (val x: Self) extends AnyVal {
    
    inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
  }
}

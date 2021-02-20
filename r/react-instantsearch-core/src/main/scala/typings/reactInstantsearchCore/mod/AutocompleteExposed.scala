package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteExposed extends StObject {
  
  var defaultRefinement: js.UndefOr[String] = js.native
}
object AutocompleteExposed {
  
  @scala.inline
  def apply(): AutocompleteExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteExposed]
  }
  
  @scala.inline
  implicit class AutocompleteExposedMutableBuilder[Self <: AutocompleteExposed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
  }
}

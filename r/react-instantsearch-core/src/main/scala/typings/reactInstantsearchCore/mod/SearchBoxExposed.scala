package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBoxExposed extends StObject {
  
  /** Provide a default value for the query */
  var defaultRefinement: js.UndefOr[String] = js.native
}
object SearchBoxExposed {
  
  @scala.inline
  def apply(): SearchBoxExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxExposed]
  }
  
  @scala.inline
  implicit class SearchBoxExposedMutableBuilder[Self <: SearchBoxExposed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
  }
}

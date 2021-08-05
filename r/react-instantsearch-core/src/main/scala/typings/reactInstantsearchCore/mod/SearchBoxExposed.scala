package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBoxExposed extends StObject {
  
  /** Provide a default value for the query */
  var defaultRefinement: js.UndefOr[String] = js.undefined
}
object SearchBoxExposed {
  
  inline def apply(): SearchBoxExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxExposed]
  }
  
  extension [Self <: SearchBoxExposed](x: Self) {
    
    inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
  }
}

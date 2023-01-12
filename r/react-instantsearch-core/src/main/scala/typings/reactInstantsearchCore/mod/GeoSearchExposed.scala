package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoSearchExposed extends StObject {
  
  var defaultRefinement: js.UndefOr[NESW] = js.undefined
}
object GeoSearchExposed {
  
  inline def apply(): GeoSearchExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoSearchExposed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoSearchExposed] (val x: Self) extends AnyVal {
    
    inline def setDefaultRefinement(value: NESW): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
  }
}

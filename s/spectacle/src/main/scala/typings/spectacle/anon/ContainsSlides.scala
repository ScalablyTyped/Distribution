package typings.spectacle.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainsSlides extends StObject {
  
  var children: ReactNode
  
  var containsSlides: js.UndefOr[Boolean] = js.undefined
}
object ContainsSlides {
  
  inline def apply(): ContainsSlides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsSlides]
  }
  
  extension [Self <: ContainsSlides](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContainsSlides(value: Boolean): Self = StObject.set(x, "containsSlides", value.asInstanceOf[js.Any])
    
    inline def setContainsSlidesUndefined: Self = StObject.set(x, "containsSlides", js.undefined)
  }
}

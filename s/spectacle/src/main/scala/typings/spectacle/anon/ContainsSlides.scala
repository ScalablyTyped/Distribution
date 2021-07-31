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
  
  @scala.inline
  def apply(): ContainsSlides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsSlides]
  }
  
  @scala.inline
  implicit class ContainsSlidesMutableBuilder[Self <: ContainsSlides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContainsSlides(value: Boolean): Self = StObject.set(x, "containsSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsSlidesUndefined: Self = StObject.set(x, "containsSlides", js.undefined)
  }
}

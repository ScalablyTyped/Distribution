package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayProps
  extends StObject
     with OverlayTypeaheadProps {
  
  var children: js.UndefOr[js.Function1[/* menuProps */ MenuProps, ReactNode]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var container: HTMLElement
  
  var isMenuShown: js.UndefOr[Boolean] = js.undefined
  
  var positionFixed: js.UndefOr[Boolean] = js.undefined
  
  var referenceElement: js.UndefOr[HTMLElement] = js.undefined
}
object OverlayProps {
  
  inline def apply(container: HTMLElement): OverlayProps = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
  
  extension [Self <: OverlayProps](x: Self) {
    
    inline def setChildren(value: /* menuProps */ MenuProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setIsMenuShown(value: Boolean): Self = StObject.set(x, "isMenuShown", value.asInstanceOf[js.Any])
    
    inline def setIsMenuShownUndefined: Self = StObject.set(x, "isMenuShown", js.undefined)
    
    inline def setPositionFixed(value: Boolean): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
    
    inline def setPositionFixedUndefined: Self = StObject.set(x, "positionFixed", js.undefined)
    
    inline def setReferenceElement(value: HTMLElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
    
    inline def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
  }
}

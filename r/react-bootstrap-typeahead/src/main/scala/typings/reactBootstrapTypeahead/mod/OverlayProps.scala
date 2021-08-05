package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayProps
  extends StObject
     with OverlayTypeaheadProps {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var container: HTMLElement
  
  var referenceElement: js.UndefOr[HTMLElement] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object OverlayProps {
  
  inline def apply(container: HTMLElement): OverlayProps = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
  
  extension [Self <: OverlayProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setReferenceElement(value: HTMLElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
    
    inline def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}

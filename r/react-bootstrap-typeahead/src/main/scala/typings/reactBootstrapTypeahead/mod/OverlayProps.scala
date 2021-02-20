package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayProps extends OverlayTypeaheadProps {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var container: HTMLElement = js.native
  
  var referenceElement: js.UndefOr[HTMLElement] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object OverlayProps {
  
  @scala.inline
  def apply(container: HTMLElement): OverlayProps = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
  
  @scala.inline
  implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceElement(value: HTMLElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}

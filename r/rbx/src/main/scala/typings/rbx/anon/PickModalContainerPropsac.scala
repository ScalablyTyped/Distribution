package typings.rbx.anon

import typings.react.mod.ReactNode
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<rbx.rbx/components/modal/modal-container.ModalContainerProps, 'active' | 'document' | 'children' | 'clipped' | 'closeOnBlur' | 'closeOnEsc' | 'onClose' | 'containerClassName'> */
trait PickModalContainerPropsac extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var clipped: js.UndefOr[Boolean] = js.undefined
  
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  
  var containerClassName: js.UndefOr[String] = js.undefined
  
  var document: js.UndefOr[Document] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object PickModalContainerPropsac {
  
  inline def apply(): PickModalContainerPropsac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickModalContainerPropsac]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickModalContainerPropsac] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
    
    inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
    
    inline def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
    
    inline def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
    
    inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
    
    inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
  }
}

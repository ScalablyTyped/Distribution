package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactBulmaComponents.anon.Card
import typings.reactBulmaComponents.componentsMod.BulmaComponentWithoutModifiers
import typings.std.Document
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/modal", JSImport.Default)
  @js.native
  val default: BulmaComponentWithoutModifiers[ModalProps] & Card = js.native
  
  trait ModalCardHeaderProps extends StObject {
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showClose: js.UndefOr[Boolean] = js.undefined
  }
  object ModalCardHeaderProps {
    
    inline def apply(): ModalCardHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalCardHeaderProps]
    }
    
    extension [Self <: ModalCardHeaderProps](x: Self) {
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      inline def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
    }
  }
  
  trait ModalProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var closeOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var document: js.UndefOr[Document] = js.undefined
    
    var domRef: js.UndefOr[RefObject[HTMLDivElement]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var showClose: js.UndefOr[Boolean] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
      
      inline def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
      
      inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setDomRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      inline def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  type _To = BulmaComponentWithoutModifiers[ModalProps] & Card
  
  /* This means you don't have to write `default`, but can instead just say `modalMod.foo` */
  override def _to: BulmaComponentWithoutModifiers[ModalProps] & Card = default
}

package typings.rbx

import typings.react.mod.ComponentType
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Document
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsModalModalContainerMod {
  
  @JSImport("rbx/components/modal/modal-container", "ModalContainer")
  @js.native
  open class ModalContainer protected ()
    extends PureComponent[ModalContainerProps, js.Object, Any] {
    def this(props: ModalContainerProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MModalContainer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MModalContainer(): Unit = js.native
    
    /* private */ val document: Any = js.native
    
    /* private */ val el: Any = js.native
  }
  /* static members */
  object ModalContainer {
    
    @JSImport("rbx/components/modal/modal-container", "ModalContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/components/modal/modal-container", "ModalContainer.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ModalContainerProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var as: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
      ] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var clipped: js.UndefOr[Boolean] = js.undefined
    
    var closeOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var closeOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var document: js.UndefOr[Document] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ModalContainerProps {
    
    inline def apply(): ModalContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalContainerProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
      ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
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
      
      inline def setInnerRef(value: Ref[HTMLElement | SVGElement | ComponentType[js.Object]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ (HTMLElement | SVGElement | ComponentType[js.Object]) | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    }
  }
}

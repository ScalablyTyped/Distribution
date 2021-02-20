package typings.rbx

import typings.react.mod.ComponentType
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.std.Document
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalContainerMod {
  
  @JSImport("rbx/components/modal/modal-container", "ModalContainer")
  @js.native
  class ModalContainer protected ()
    extends PureComponent[ModalContainerProps, js.Object, js.Any] {
    def this(props: ModalContainerProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MModalContainer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MModalContainer(): Unit = js.native
    
    val document: js.Any = js.native
    
    val el: js.Any = js.native
  }
  /* static members */
  object ModalContainer {
    
    @JSImport("rbx/components/modal/modal-container", "ModalContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/components/modal/modal-container", "ModalContainer.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ModalContainerProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var as: js.UndefOr[ReactType[_]] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var clipped: js.UndefOr[Boolean] = js.native
    
    var closeOnBlur: js.UndefOr[Boolean] = js.native
    
    var closeOnEsc: js.UndefOr[Boolean] = js.native
    
    var containerClassName: js.UndefOr[String] = js.native
    
    var document: js.UndefOr[Document] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ModalContainerProps {
    
    @scala.inline
    def apply(): ModalContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalContainerProps]
    }
    
    @scala.inline
    implicit class ModalContainerPropsMutableBuilder[Self <: ModalContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: ReactType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      @scala.inline
      def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
      
      @scala.inline
      def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement | SVGElement | ComponentType[js.Object]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ (HTMLElement | SVGElement | ComponentType[js.Object]) | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    }
  }
}

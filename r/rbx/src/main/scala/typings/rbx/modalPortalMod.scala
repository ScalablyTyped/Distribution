package typings.rbx

import typings.rbx.anon.CloseOnBlur
import typings.react.mod.ComponentType
import typings.react.mod.PureComponent
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.std.Document
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalPortalMod {
  
  @JSImport("rbx/components/modal/modal-portal", "ModalPortal")
  @js.native
  class ModalPortal protected ()
    extends PureComponent[ModalPortalProps, js.Object, js.Any] {
    def this(props: ModalPortalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalPortalProps, context: js.Any) = this()
    
    /* private */ val close: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MModalPortal(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MModalPortal(): Unit = js.native
    
    /* private */ val handleKeydown: js.Any = js.native
  }
  /* static members */
  object ModalPortal {
    
    @JSImport("rbx/components/modal/modal-portal", "ModalPortal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/components/modal/modal-portal", "ModalPortal.defaultProps")
    @js.native
    def defaultProps: CloseOnBlur = js.native
    inline def defaultProps_=(x: CloseOnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/modal/modal-portal", "ModalPortal.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ModalPortalModifierProps extends StObject {
    
    var as: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clipped: js.UndefOr[Boolean] = js.undefined
    
    var closeOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var closeOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var document: Document
    
    var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ModalPortalModifierProps {
    
    inline def apply(document: Document): ModalPortalModifierProps = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalPortalModifierProps]
    }
    
    extension [Self <: ModalPortalModifierProps](x: Self) {
      
      inline def setAs(value: ReactType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      inline def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
      
      inline def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
      
      inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: Ref[HTMLElement | SVGElement | ComponentType[js.Object]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ (HTMLElement | SVGElement | ComponentType[js.Object]) | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    }
  }
  
  type ModalPortalProps = ModalPortalModifierProps
}

package typings.reactPortal

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-portal", "Portal")
  @js.native
  open class Portal protected () extends Component[PortalProps, ComponentState, Any] {
    def this(props: PortalProps) = this()
    def this(props: PortalProps, context: Any) = this()
  }
  @JSImport("react-portal", "Portal")
  @js.native
  val Portal: ComponentClass[PortalProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-portal", "PortalWithState")
  @js.native
  open class PortalWithState protected () extends Component[PortalWithStateProps, ComponentState, Any] {
    def this(props: PortalWithStateProps) = this()
    def this(props: PortalWithStateProps, context: Any) = this()
  }
  @JSImport("react-portal", "PortalWithState")
  @js.native
  val PortalWithState: ComponentClass[PortalWithStateProps, ComponentState] = js.native
  
  @js.native
  trait PortalFunctionParams extends StObject {
    
    def closePortal(): Unit = js.native
    
    var isOpen: Boolean = js.native
    
    def openPortal(): Unit = js.native
    def openPortal(event: Any): Unit = js.native
    
    def portal(children: ReactNode): ReactElement = js.native
  }
  
  trait PortalProps extends StObject {
    
    var children: ReactNode
    
    var node: js.UndefOr[Element | Null] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeNull: Self = StObject.set(x, "node", null)
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  trait PortalWithStateProps extends StObject {
    
    def children(params: PortalFunctionParams): ReactNode
    
    var closeOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var node: js.UndefOr[Element | Null] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var openByClickOn: js.UndefOr[ReactElement] = js.undefined
  }
  object PortalWithStateProps {
    
    inline def apply(children: PortalFunctionParams => ReactNode): PortalWithStateProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PortalWithStateProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalWithStateProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: PortalFunctionParams => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      inline def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeNull: Self = StObject.set(x, "node", null)
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpenByClickOn(value: ReactElement): Self = StObject.set(x, "openByClickOn", value.asInstanceOf[js.Any])
      
      inline def setOpenByClickOnUndefined: Self = StObject.set(x, "openByClickOn", js.undefined)
    }
  }
}

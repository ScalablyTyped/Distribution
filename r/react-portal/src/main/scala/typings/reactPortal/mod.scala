package typings.reactPortal

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Props
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-portal", "Portal")
  @js.native
  class Portal protected ()
    extends Component[PortalProps, ComponentState, js.Any] {
    def this(props: PortalProps) = this()
    def this(props: PortalProps, context: js.Any) = this()
  }
  @JSImport("react-portal", "Portal")
  @js.native
  val Portal: ComponentClass[PortalProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-portal", "PortalWithState")
  @js.native
  class PortalWithState protected ()
    extends Component[PortalWithStateProps, ComponentState, js.Any] {
    def this(props: PortalWithStateProps) = this()
    def this(props: PortalWithStateProps, context: js.Any) = this()
  }
  @JSImport("react-portal", "PortalWithState")
  @js.native
  val PortalWithState: ComponentClass[PortalWithStateProps, ComponentState] = js.native
  
  @js.native
  trait PortalFunctionParams extends StObject {
    
    def closePortal(): Unit = js.native
    
    var isOpen: Boolean = js.native
    
    def openPortal(): Unit = js.native
    def openPortal(event: js.Any): Unit = js.native
    
    def portal(children: ReactNode): ReactElement = js.native
  }
  
  @js.native
  trait PortalProps
    extends Props[js.Any] {
    
    @JSName("children")
    var children_PortalProps: ReactNode = js.native
    
    var node: js.UndefOr[Element | Null] = js.native
  }
  object PortalProps {
    
    @scala.inline
    def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class PortalPropsMutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNull: Self = StObject.set(x, "node", null)
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  @js.native
  trait PortalWithStateProps
    extends Props[js.Any] {
    
    @JSName("children")
    def children_MPortalWithStateProps(params: PortalFunctionParams): ReactNode = js.native
    
    var closeOnEsc: js.UndefOr[Boolean] = js.native
    
    var closeOnOutsideClick: js.UndefOr[Boolean] = js.native
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    var node: js.UndefOr[Element | Null] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var openByClickOn: js.UndefOr[ReactElement] = js.native
  }
  object PortalWithStateProps {
    
    @scala.inline
    def apply(children: PortalFunctionParams => ReactNode): PortalWithStateProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PortalWithStateProps]
    }
    
    @scala.inline
    implicit class PortalWithStatePropsMutableBuilder[Self <: PortalWithStateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: PortalFunctionParams => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      @scala.inline
      def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNull: Self = StObject.set(x, "node", null)
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpenByClickOn(value: ReactElement): Self = StObject.set(x, "openByClickOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenByClickOnUndefined: Self = StObject.set(x, "openByClickOn", js.undefined)
    }
  }
}

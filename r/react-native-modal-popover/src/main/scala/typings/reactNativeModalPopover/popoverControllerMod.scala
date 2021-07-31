package typings.reactNativeModalPopover

import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.reactNativeModalPopover.anon.Children
import typings.reactNativeModalPopover.popoverGeometryMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverControllerMod {
  
  @JSImport("react-native-modal-popover/lib/PopoverController", "PopoverController")
  @js.native
  class PopoverController protected ()
    extends PureComponent[Props, State, js.Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
    
    var closePopover: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPopoverController(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPopoverController(): Unit = js.native
    
    var onOrientationChange: js.Any = js.native
    
    var onTouchableMeasured: js.Any = js.native
    
    var openPopover: js.Any = js.native
    
    var setTouchableRef: js.Any = js.native
    
    var touchable: js.Any = js.native
  }
  /* static members */
  object PopoverController {
    
    @JSImport("react-native-modal-popover/lib/PopoverController", "PopoverController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover/lib/PopoverController", "PopoverController.propTypes")
    @js.native
    def propTypes: Children = js.native
    @scala.inline
    def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait PopoverControllerRenderProps extends StObject {
    
    def closePopover(): Unit
    
    def openPopover(): Unit
    
    var popoverAnchorRect: Rect
    
    var popoverVisible: Boolean
    
    def setPopoverAnchor(ref: js.Any): Unit
  }
  object PopoverControllerRenderProps {
    
    @scala.inline
    def apply(
      closePopover: () => Unit,
      openPopover: () => Unit,
      popoverAnchorRect: Rect,
      popoverVisible: Boolean,
      setPopoverAnchor: js.Any => Unit
    ): PopoverControllerRenderProps = {
      val __obj = js.Dynamic.literal(closePopover = js.Any.fromFunction0(closePopover), openPopover = js.Any.fromFunction0(openPopover), popoverAnchorRect = popoverAnchorRect.asInstanceOf[js.Any], popoverVisible = popoverVisible.asInstanceOf[js.Any], setPopoverAnchor = js.Any.fromFunction1(setPopoverAnchor))
      __obj.asInstanceOf[PopoverControllerRenderProps]
    }
    
    @scala.inline
    implicit class PopoverControllerRenderPropsMutableBuilder[Self <: PopoverControllerRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosePopover(value: () => Unit): Self = StObject.set(x, "closePopover", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpenPopover(value: () => Unit): Self = StObject.set(x, "openPopover", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPopoverAnchorRect(value: Rect): Self = StObject.set(x, "popoverAnchorRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverVisible(value: Boolean): Self = StObject.set(x, "popoverVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetPopoverAnchor(value: js.Any => Unit): Self = StObject.set(x, "setPopoverAnchor", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    def children(props: PopoverControllerRenderProps): ReactElement
  }
  object Props {
    
    @scala.inline
    def apply(children: PopoverControllerRenderProps => ReactElement): Props = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: PopoverControllerRenderProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait State extends StObject {
    
    var popoverAnchor: Rect
    
    var showPopover: Boolean
  }
  object State {
    
    @scala.inline
    def apply(popoverAnchor: Rect, showPopover: Boolean): State = {
      val __obj = js.Dynamic.literal(popoverAnchor = popoverAnchor.asInstanceOf[js.Any], showPopover = showPopover.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopoverAnchor(value: Rect): Self = StObject.set(x, "popoverAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPopover(value: Boolean): Self = StObject.set(x, "showPopover", value.asInstanceOf[js.Any])
    }
  }
}

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
  open class PopoverController protected () extends PureComponent[Props, State, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    /* private */ var closePopover: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPopoverController(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPopoverController(): Unit = js.native
    
    /* private */ var onOrientationChange: Any = js.native
    
    /* private */ var onTouchableMeasured: Any = js.native
    
    /* private */ var openPopover: Any = js.native
    
    /* private */ var setTouchableRef: Any = js.native
    
    /* private */ var touchable: Any = js.native
  }
  /* static members */
  object PopoverController {
    
    @JSImport("react-native-modal-popover/lib/PopoverController", "PopoverController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover/lib/PopoverController", "PopoverController.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait PopoverControllerRenderProps extends StObject {
    
    def closePopover(): Unit
    
    def openPopover(): Unit
    
    var popoverAnchorRect: Rect
    
    var popoverVisible: Boolean
    
    def setPopoverAnchor(ref: Any): Unit
  }
  object PopoverControllerRenderProps {
    
    inline def apply(
      closePopover: () => Unit,
      openPopover: () => Unit,
      popoverAnchorRect: Rect,
      popoverVisible: Boolean,
      setPopoverAnchor: Any => Unit
    ): PopoverControllerRenderProps = {
      val __obj = js.Dynamic.literal(closePopover = js.Any.fromFunction0(closePopover), openPopover = js.Any.fromFunction0(openPopover), popoverAnchorRect = popoverAnchorRect.asInstanceOf[js.Any], popoverVisible = popoverVisible.asInstanceOf[js.Any], setPopoverAnchor = js.Any.fromFunction1(setPopoverAnchor))
      __obj.asInstanceOf[PopoverControllerRenderProps]
    }
    
    extension [Self <: PopoverControllerRenderProps](x: Self) {
      
      inline def setClosePopover(value: () => Unit): Self = StObject.set(x, "closePopover", js.Any.fromFunction0(value))
      
      inline def setOpenPopover(value: () => Unit): Self = StObject.set(x, "openPopover", js.Any.fromFunction0(value))
      
      inline def setPopoverAnchorRect(value: Rect): Self = StObject.set(x, "popoverAnchorRect", value.asInstanceOf[js.Any])
      
      inline def setPopoverVisible(value: Boolean): Self = StObject.set(x, "popoverVisible", value.asInstanceOf[js.Any])
      
      inline def setSetPopoverAnchor(value: Any => Unit): Self = StObject.set(x, "setPopoverAnchor", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var calculateStatusBar: js.UndefOr[Boolean] = js.undefined
    
    def children(props: PopoverControllerRenderProps): ReactElement
  }
  object Props {
    
    inline def apply(children: PopoverControllerRenderProps => ReactElement): Props = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCalculateStatusBar(value: Boolean): Self = StObject.set(x, "calculateStatusBar", value.asInstanceOf[js.Any])
      
      inline def setCalculateStatusBarUndefined: Self = StObject.set(x, "calculateStatusBar", js.undefined)
      
      inline def setChildren(value: PopoverControllerRenderProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait State extends StObject {
    
    var popoverAnchor: Rect
    
    var showPopover: Boolean
  }
  object State {
    
    inline def apply(popoverAnchor: Rect, showPopover: Boolean): State = {
      val __obj = js.Dynamic.literal(popoverAnchor = popoverAnchor.asInstanceOf[js.Any], showPopover = showPopover.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setPopoverAnchor(value: Rect): Self = StObject.set(x, "popoverAnchor", value.asInstanceOf[js.Any])
      
      inline def setShowPopover(value: Boolean): Self = StObject.set(x, "showPopover", value.asInstanceOf[js.Any])
    }
  }
}

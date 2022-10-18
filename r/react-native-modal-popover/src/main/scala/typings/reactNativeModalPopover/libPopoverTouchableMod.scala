package typings.reactNativeModalPopover

import typings.react.mod.PureComponent
import typings.reactNativeModalPopover.anon.OnPopoverDisplayed
import typings.reactNativeModalPopover.libPopoverGeometryMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverTouchableMod {
  
  @JSImport("react-native-modal-popover/lib/PopoverTouchable", "PopoverTouchable")
  @js.native
  open class PopoverTouchable protected () extends PureComponent[Props, State, Any] {
    def this(props: Props) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MPopoverTouchable(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPopoverTouchable(): Unit = js.native
    
    /* private */ var onClosePopover: Any = js.native
    
    /* private */ var onOrientationChange: Any = js.native
    
    /* private */ var onPress: Any = js.native
    
    /* private */ var onTouchableMeasured: Any = js.native
    
    /* private */ var setRef: Any = js.native
    
    /* private */ var touchable: Any = js.native
  }
  /* static members */
  object PopoverTouchable {
    
    @JSImport("react-native-modal-popover/lib/PopoverTouchable", "PopoverTouchable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover/lib/PopoverTouchable", "PopoverTouchable.propTypes")
    @js.native
    def propTypes: OnPopoverDisplayed = js.native
    inline def propTypes_=(x: OnPopoverDisplayed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait Props extends StObject {
    
    var onPopoverDisplayed: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnPopoverDisplayed(value: () => Any): Self = StObject.set(x, "onPopoverDisplayed", js.Any.fromFunction0(value))
      
      inline def setOnPopoverDisplayedUndefined: Self = StObject.set(x, "onPopoverDisplayed", js.undefined)
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

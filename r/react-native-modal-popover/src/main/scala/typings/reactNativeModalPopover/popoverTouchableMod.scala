package typings.reactNativeModalPopover

import typings.react.mod.PureComponent
import typings.reactNativeModalPopover.anon.OnPopoverDisplayed
import typings.reactNativeModalPopover.popoverGeometryMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverTouchableMod {
  
  @JSImport("react-native-modal-popover/lib/PopoverTouchable", "PopoverTouchable")
  @js.native
  class PopoverTouchable protected ()
    extends PureComponent[Props, State, js.Any] {
    def this(props: Props) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MPopoverTouchable(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPopoverTouchable(): Unit = js.native
    
    /* private */ var onClosePopover: js.Any = js.native
    
    /* private */ var onOrientationChange: js.Any = js.native
    
    /* private */ var onPress: js.Any = js.native
    
    /* private */ var onTouchableMeasured: js.Any = js.native
    
    /* private */ var setRef: js.Any = js.native
    
    /* private */ var touchable: js.Any = js.native
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
    
    var onPopoverDisplayed: js.UndefOr[js.Function0[js.Any]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnPopoverDisplayed(value: () => js.Any): Self = StObject.set(x, "onPopoverDisplayed", js.Any.fromFunction0(value))
      
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

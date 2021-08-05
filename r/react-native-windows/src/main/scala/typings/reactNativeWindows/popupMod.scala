package typings.reactNativeWindows

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNativeWindows.popupPropsMod.IPopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  @JSImport("react-native-windows/Libraries/Components/Popup/Popup", "Popup")
  @js.native
  class Popup protected ()
    extends Component[IPopupProps, IPopupTargetState, js.Any] {
    def this(props: IPopupProps) = this()
  }
  /* static members */
  object Popup {
    
    @JSImport("react-native-windows/Libraries/Components/Popup/Popup", "Popup")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: IPopupProps, prevState: IPopupTargetState): IPopupTargetState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[IPopupTargetState]
  }
  
  trait IPopupTargetState extends StObject {
    
    var target: js.UndefOr[Double | Null] = js.undefined
    
    var targetRef: js.UndefOr[ReactNode] = js.undefined
  }
  object IPopupTargetState {
    
    inline def apply(): IPopupTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupTargetState]
    }
    
    extension [Self <: IPopupTargetState](x: Self) {
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetRef(value: ReactNode): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}

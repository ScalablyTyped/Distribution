package typings.reactNativeWindows

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNativeWindows.librariesComponentsFlyoutFlyoutPropsMod.IFlyoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesComponentsFlyoutFlyoutMod {
  
  @JSImport("react-native-windows/Libraries/Components/Flyout/Flyout", "Flyout")
  @js.native
  open class Flyout protected () extends Component[IFlyoutProps, IFlyoutTargetState, Any] {
    def this(props: IFlyoutProps) = this()
  }
  /* static members */
  object Flyout {
    
    @JSImport("react-native-windows/Libraries/Components/Flyout/Flyout", "Flyout")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: IFlyoutProps, prevState: IFlyoutTargetState): IFlyoutTargetState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[IFlyoutTargetState]
  }
  
  trait IFlyoutTargetState extends StObject {
    
    var target: js.UndefOr[Double | Null] = js.undefined
    
    var targetRef: js.UndefOr[ReactNode] = js.undefined
  }
  object IFlyoutTargetState {
    
    inline def apply(): IFlyoutTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFlyoutTargetState]
    }
    
    extension [Self <: IFlyoutTargetState](x: Self) {
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetRef(value: ReactNode): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}

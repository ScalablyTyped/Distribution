package typings.reactNativeWindows

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNativeWindows.flyoutPropsMod.IFlyoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flyoutMod {
  
  @JSImport("react-native-windows/Libraries/Components/Flyout/Flyout", "Flyout")
  @js.native
  class Flyout protected ()
    extends Component[IFlyoutProps, IFlyoutTargetState, js.Any] {
    def this(props: IFlyoutProps) = this()
  }
  /* static members */
  object Flyout {
    
    @JSImport("react-native-windows/Libraries/Components/Flyout/Flyout", "Flyout")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: IFlyoutProps, prevState: IFlyoutTargetState): IFlyoutTargetState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[IFlyoutTargetState]
  }
  
  trait IFlyoutTargetState extends StObject {
    
    var target: js.UndefOr[Double | Null] = js.undefined
    
    var targetRef: js.UndefOr[ReactNode] = js.undefined
  }
  object IFlyoutTargetState {
    
    @scala.inline
    def apply(): IFlyoutTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFlyoutTargetState]
    }
    
    @scala.inline
    implicit class IFlyoutTargetStateMutableBuilder[Self <: IFlyoutTargetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetRef(value: ReactNode): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}

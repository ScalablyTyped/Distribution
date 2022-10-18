package typings.reactNativeWindows.mod

import typings.reactNativeWindows.librariesComponentsFlyoutFlyoutMod.IFlyoutTargetState
import typings.reactNativeWindows.librariesComponentsFlyoutFlyoutPropsMod.IFlyoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows", "Flyout")
@js.native
open class Flyout protected ()
  extends typings.reactNativeWindows.librariesComponentsFlyoutFlyoutMod.Flyout {
  def this(props: IFlyoutProps) = this()
}
/* static members */
object Flyout {
  
  @JSImport("react-native-windows", "Flyout")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDerivedStateFromProps(nextProps: IFlyoutProps, prevState: IFlyoutTargetState): IFlyoutTargetState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[IFlyoutTargetState]
}

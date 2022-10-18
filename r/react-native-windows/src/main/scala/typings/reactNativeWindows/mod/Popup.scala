package typings.reactNativeWindows.mod

import typings.reactNativeWindows.librariesComponentsPopupPopupMod.IPopupTargetState
import typings.reactNativeWindows.librariesComponentsPopupPopupPropsMod.IPopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows", "Popup")
@js.native
open class Popup protected ()
  extends typings.reactNativeWindows.librariesComponentsPopupPopupMod.Popup {
  def this(props: IPopupProps) = this()
}
/* static members */
object Popup {
  
  @JSImport("react-native-windows", "Popup")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDerivedStateFromProps(nextProps: IPopupProps, prevState: IPopupTargetState): IPopupTargetState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[IPopupTargetState]
}

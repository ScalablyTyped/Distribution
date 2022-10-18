package typings.reactNativeWindows

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.View
import typings.reactNativeWindows.librariesComponentsViewViewWindowsPropsMod.IViewWindowsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesComponentsViewViewWindowsMod {
  
  @JSImport("react-native-windows/Libraries/Components/View/ViewWindows", "ViewWindows")
  @js.native
  val ViewWindows: ViewWindowsType = js.native
  type ViewWindows = ViewWindowsType
  
  @js.native
  trait ViewWindowsType
    extends View
       with ForwardRefExoticComponent[IViewWindowsProps & RefAttributes[View]]
}

package typings.reactNativeWindows

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.View
import typings.reactNativeWindows.viewWindowsPropsMod.IViewWindowsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewWindowsMod {
  
  @JSImport("react-native-windows/Libraries/Components/View/ViewWindows", "ViewWindows")
  @js.native
  val ViewWindows: ViewWindowsType = js.native
  type ViewWindows = ViewWindowsType
  
  type ViewWindowsType = (ForwardRefExoticComponent[IViewWindowsProps with RefAttributes[View]]) with View
}

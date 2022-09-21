package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.dropdownDropdownMod.DropdownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("react-day-picker/dist/components/Dropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Dropdown(props: DropdownProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Dropdown")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}

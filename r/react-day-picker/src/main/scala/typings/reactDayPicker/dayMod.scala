package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.dayDayMod.DayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayMod {
  
  @JSImport("react-day-picker/dist/components/Day", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Day(props: DayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Day")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}

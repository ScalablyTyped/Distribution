package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.monthMonthMod.MonthProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monthMod {
  
  @JSImport("react-day-picker/dist/components/Month", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Month(props: MonthProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Month")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}

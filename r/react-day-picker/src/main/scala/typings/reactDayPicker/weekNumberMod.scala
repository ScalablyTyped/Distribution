package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.weekNumberWeekNumberMod.WeekNumberProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekNumberMod {
  
  @JSImport("react-day-picker/dist/components/WeekNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def WeekNumber(props: WeekNumberProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("WeekNumber")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}

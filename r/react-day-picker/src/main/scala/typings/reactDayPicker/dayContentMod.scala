package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.dayContentDayContentMod.DayContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayContentMod {
  
  @JSImport("react-day-picker/dist/components/DayContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DayContent(props: DayContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}

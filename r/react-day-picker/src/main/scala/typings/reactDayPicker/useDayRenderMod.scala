package typings.reactDayPicker

import typings.react.mod.RefObject
import typings.reactDayPicker.useDayRenderUseDayRenderMod.DayRender
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDayRenderMod {
  
  @JSImport("react-day-picker/dist/hooks/useDayRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDayRender(
    /** The date to render. */
  day: js.Date,
    /** The month where the date is displayed (if not the same as `date`, it means it is an "outside" day). */
  displayMonth: js.Date,
    /** A ref to the button element that will be target of focus when rendered (if required). */
  buttonRef: RefObject[HTMLButtonElement]
  ): DayRender = (^.asInstanceOf[js.Dynamic].applyDynamic("useDayRender")(day.asInstanceOf[js.Any], displayMonth.asInstanceOf[js.Any], buttonRef.asInstanceOf[js.Any])).asInstanceOf[DayRender]
}

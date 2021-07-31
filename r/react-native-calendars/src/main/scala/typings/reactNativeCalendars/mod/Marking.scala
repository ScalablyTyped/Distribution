package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeCalendars.mod.CustomMarking
  - typings.reactNativeCalendars.mod.DotMarking
  - typings.reactNativeCalendars.mod.MultiDotMarking
  - typings.reactNativeCalendars.mod.MultiPeriodMarking
  - typings.reactNativeCalendars.mod.PeriodMarking
*/
trait Marking extends StObject
object Marking {
  
  @scala.inline
  def CustomMarking(customStyles: MarkedDateCustomStyles): typings.reactNativeCalendars.mod.CustomMarking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.CustomMarking]
  }
  
  @scala.inline
  def DotMarking(): typings.reactNativeCalendars.mod.DotMarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.DotMarking]
  }
  
  @scala.inline
  def MultiDotMarking(dots: js.Array[CalendarDot]): typings.reactNativeCalendars.mod.MultiDotMarking = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.MultiDotMarking]
  }
  
  @scala.inline
  def MultiPeriodMarking(periods: js.Array[Color]): typings.reactNativeCalendars.mod.MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.MultiPeriodMarking]
  }
  
  @scala.inline
  def PeriodMarking(): typings.reactNativeCalendars.mod.PeriodMarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.reactNativeCalendars.mod.PeriodMarking]
  }
}

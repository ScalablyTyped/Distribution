package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeCalendars.mod.CustomMarking
  - typings.reactNativeCalendars.mod.DotMarking
  - typings.reactNativeCalendars.mod.MultiDotMarking
  - typings.reactNativeCalendars.mod.MultiPeriodMarking
  - typings.reactNativeCalendars.mod.PeriodMarking
*/
trait Marking extends js.Object
object Marking {
  
  @scala.inline
  def MultiDotMarking(dots: js.Array[CalendarDot]): Marking = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  
  @scala.inline
  def MultiPeriodMarking(periods: js.Array[Color]): Marking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  
  @scala.inline
  def DotMarking(): Marking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Marking]
  }
  
  @scala.inline
  def CustomMarking(customStyles: MarkedDateCustomStyles): Marking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  
  @scala.inline
  def PeriodMarking(): Marking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Marking]
  }
}

package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

@JSGlobal("SP.ViewType")
@js.native
object ViewType extends js.Object {
  @js.native
  sealed trait calendar
    extends sharepointLib.SPNs.ViewType
  
  @js.native
  sealed trait chart
    extends sharepointLib.SPNs.ViewType
  
  @js.native
  sealed trait gantt
    extends sharepointLib.SPNs.ViewType
  
  @js.native
  sealed trait grid
    extends sharepointLib.SPNs.ViewType
  
  @js.native
  sealed trait html
    extends sharepointLib.SPNs.ViewType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.ViewType
  
  @js.native
  sealed trait recurrence
    extends sharepointLib.SPNs.ViewType
  
  /* 3 */ val calendar: calendar with scala.Double = js.native
  /* 5 */ val chart: chart with scala.Double = js.native
  /* 6 */ val gantt: gantt with scala.Double = js.native
  /* 2 */ val grid: grid with scala.Double = js.native
  /* 1 */ val html: html with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val recurrence: recurrence with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ViewType with scala.Double] = js.native
}


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
  
  val calendar: calendar with java.lang.String = js.native
  val chart: chart with java.lang.String = js.native
  val gantt: gantt with java.lang.String = js.native
  val grid: grid with java.lang.String = js.native
  val html: html with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val recurrence: recurrence with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ViewType with java.lang.String] = js.native
}


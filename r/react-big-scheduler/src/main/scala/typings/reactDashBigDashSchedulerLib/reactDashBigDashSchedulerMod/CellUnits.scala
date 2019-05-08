package typings
package reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellUnits extends js.Object

@JSImport("react-big-scheduler", "CellUnits")
@js.native
object CellUnits extends js.Object {
  @js.native
  sealed trait Day
    extends reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.CellUnits
  
  @js.native
  sealed trait Hour
    extends reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.CellUnits
  
  val Day: Day with java.lang.String = js.native
  val Hour: Hour with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.CellUnits with java.lang.String
  ] = js.native
}


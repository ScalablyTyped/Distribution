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
  
  /* 0 */ val Day: Day with scala.Double = js.native
  /* 1 */ val Hour: Hour with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.CellUnits with scala.Double
  ] = js.native
}


package typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellUnits extends js.Object

@JSImport("react-big-scheduler", "CellUnits")
@js.native
object CellUnits extends js.Object {
  @js.native
  sealed trait Day extends CellUnits
  
  @js.native
  sealed trait Hour extends CellUnits
  
  /* 0 */ val Day: typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.CellUnits.Day with Double = js.native
  /* 1 */ val Hour: typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.CellUnits.Hour with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellUnits with Double] = js.native
}


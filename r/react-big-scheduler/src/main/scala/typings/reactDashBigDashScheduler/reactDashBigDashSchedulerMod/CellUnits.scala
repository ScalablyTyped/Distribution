package typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.CellUnits.Day
import typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.CellUnits.Hour
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellUnits with Double] = js.native
  /* 0 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  /* 1 */ @js.native
  object Hour extends TopLevel[Hour with Double]
  
}


package typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SummaryPos extends js.Object

@JSImport("react-big-scheduler", "SummaryPos")
@js.native
object SummaryPos extends js.Object {
  @js.native
  sealed trait Bottom extends SummaryPos
  
  @js.native
  sealed trait BottomLeft extends SummaryPos
  
  @js.native
  sealed trait BottomRight extends SummaryPos
  
  @js.native
  sealed trait Top extends SummaryPos
  
  @js.native
  sealed trait TopLeft extends SummaryPos
  
  @js.native
  sealed trait TopRight extends SummaryPos
  
  /* 3 */ val Bottom: typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.SummaryPos.Bottom with Double = js.native
  /* 5 */ val BottomLeft: typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.SummaryPos.BottomLeft with Double = js.native
  /* 4 */ val BottomRight: typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.SummaryPos.BottomRight with Double = js.native
  /* 0 */ val Top: typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.SummaryPos.Top with Double = js.native
  /* 2 */ val TopLeft: typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.SummaryPos.TopLeft with Double = js.native
  /* 1 */ val TopRight: typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.SummaryPos.TopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryPos with Double] = js.native
}


package typings
package reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SummaryPos extends js.Object

@JSImport("react-big-scheduler", "SummaryPos")
@js.native
object SummaryPos extends js.Object {
  @js.native
  sealed trait Bottom
    extends reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.SummaryPos
  
  @js.native
  sealed trait BottomLeft
    extends reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.SummaryPos
  
  @js.native
  sealed trait BottomRight
    extends reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.SummaryPos
  
  @js.native
  sealed trait Top
    extends reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.SummaryPos
  
  @js.native
  sealed trait TopLeft
    extends reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.SummaryPos
  
  @js.native
  sealed trait TopRight
    extends reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.SummaryPos
  
  /* 3 */ val Bottom: Bottom with scala.Double = js.native
  /* 5 */ val BottomLeft: BottomLeft with scala.Double = js.native
  /* 4 */ val BottomRight: BottomRight with scala.Double = js.native
  /* 0 */ val Top: Top with scala.Double = js.native
  /* 2 */ val TopLeft: TopLeft with scala.Double = js.native
  /* 1 */ val TopRight: TopRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.SummaryPos with scala.Double
  ] = js.native
}


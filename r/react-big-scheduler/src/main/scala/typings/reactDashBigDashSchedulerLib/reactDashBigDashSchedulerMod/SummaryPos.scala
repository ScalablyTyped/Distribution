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
  
  val Bottom: Bottom with java.lang.String = js.native
  val BottomLeft: BottomLeft with java.lang.String = js.native
  val BottomRight: BottomRight with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  val TopLeft: TopLeft with java.lang.String = js.native
  val TopRight: TopRight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod.SummaryPos with java.lang.String
  ] = js.native
}


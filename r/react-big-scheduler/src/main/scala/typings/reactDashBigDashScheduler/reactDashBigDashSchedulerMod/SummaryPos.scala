package typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryPos with Double] = js.native
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 5 */ @js.native
  object BottomLeft extends TopLevel[BottomLeft with Double]
  
  /* 4 */ @js.native
  object BottomRight extends TopLevel[BottomRight with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
  /* 2 */ @js.native
  object TopLeft extends TopLevel[TopLeft with Double]
  
  /* 1 */ @js.native
  object TopRight extends TopLevel[TopRight with Double]
  
}


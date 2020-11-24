package typings.reactBigScheduler.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SummaryPos extends js.Object
@JSImport("react-big-scheduler", "SummaryPos")
@js.native
object SummaryPos extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryPos with Double] = js.native
  
  @js.native
  sealed trait Bottom extends SummaryPos
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  @js.native
  sealed trait BottomLeft extends SummaryPos
  /* 5 */ @js.native
  object BottomLeft extends TopLevel[BottomLeft with Double]
  
  @js.native
  sealed trait BottomRight extends SummaryPos
  /* 4 */ @js.native
  object BottomRight extends TopLevel[BottomRight with Double]
  
  @js.native
  sealed trait Top extends SummaryPos
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
  @js.native
  sealed trait TopLeft extends SummaryPos
  /* 2 */ @js.native
  object TopLeft extends TopLevel[TopLeft with Double]
  
  @js.native
  sealed trait TopRight extends SummaryPos
  /* 1 */ @js.native
  object TopRight extends TopLevel[TopRight with Double]
}

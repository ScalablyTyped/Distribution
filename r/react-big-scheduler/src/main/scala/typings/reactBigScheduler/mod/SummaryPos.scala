package typings.reactBigScheduler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SummaryPos extends StObject
@JSImport("react-big-scheduler", "SummaryPos")
@js.native
object SummaryPos extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryPos with Double] = js.native
  
  @js.native
  sealed trait Bottom extends SummaryPos
  /* 3 */ val Bottom: typings.reactBigScheduler.mod.SummaryPos.Bottom with Double = js.native
  
  @js.native
  sealed trait BottomLeft extends SummaryPos
  /* 5 */ val BottomLeft: typings.reactBigScheduler.mod.SummaryPos.BottomLeft with Double = js.native
  
  @js.native
  sealed trait BottomRight extends SummaryPos
  /* 4 */ val BottomRight: typings.reactBigScheduler.mod.SummaryPos.BottomRight with Double = js.native
  
  @js.native
  sealed trait Top extends SummaryPos
  /* 0 */ val Top: typings.reactBigScheduler.mod.SummaryPos.Top with Double = js.native
  
  @js.native
  sealed trait TopLeft extends SummaryPos
  /* 2 */ val TopLeft: typings.reactBigScheduler.mod.SummaryPos.TopLeft with Double = js.native
  
  @js.native
  sealed trait TopRight extends SummaryPos
  /* 1 */ val TopRight: typings.reactBigScheduler.mod.SummaryPos.TopRight with Double = js.native
}

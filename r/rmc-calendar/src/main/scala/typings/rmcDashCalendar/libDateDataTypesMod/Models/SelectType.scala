package typings.rmcDashCalendar.libDateDataTypesMod.Models

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectType extends js.Object

@JSImport("rmc-calendar/lib/date/DataTypes", "Models.SelectType")
@js.native
object SelectType extends js.Object {
  /** 起/止 */
  @js.native
  sealed trait All extends SelectType
  
  /** 区间止 */
  @js.native
  sealed trait End extends SelectType
  
  /** 区间中 */
  @js.native
  sealed trait Middle extends SelectType
  
  @js.native
  sealed trait None extends SelectType
  
  /** 区间仅选择了 起 */
  @js.native
  sealed trait Only extends SelectType
  
  /** 单选 */
  @js.native
  sealed trait Single extends SelectType
  
  /** 区间起 */
  @js.native
  sealed trait Start extends SelectType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectType with Double] = js.native
  /* 2 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 6 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 5 */ @js.native
  object Middle extends TopLevel[Middle with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object Only extends TopLevel[Only with Double]
  
  /* 1 */ @js.native
  object Single extends TopLevel[Single with Double]
  
  /* 4 */ @js.native
  object Start extends TopLevel[Start with Double]
  
}


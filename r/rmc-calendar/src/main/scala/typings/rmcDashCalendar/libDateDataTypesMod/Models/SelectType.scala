package typings.rmcDashCalendar.libDateDataTypesMod.Models

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
  
  /* 2 */ val All: typings.rmcDashCalendar.libDateDataTypesMod.Models.SelectType.All with Double = js.native
  /* 6 */ val End: typings.rmcDashCalendar.libDateDataTypesMod.Models.SelectType.End with Double = js.native
  /* 5 */ val Middle: typings.rmcDashCalendar.libDateDataTypesMod.Models.SelectType.Middle with Double = js.native
  /* 0 */ val None: typings.rmcDashCalendar.libDateDataTypesMod.Models.SelectType.None with Double = js.native
  /* 3 */ val Only: typings.rmcDashCalendar.libDateDataTypesMod.Models.SelectType.Only with Double = js.native
  /* 1 */ val Single: typings.rmcDashCalendar.libDateDataTypesMod.Models.SelectType.Single with Double = js.native
  /* 4 */ val Start: typings.rmcDashCalendar.libDateDataTypesMod.Models.SelectType.Start with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectType with Double] = js.native
}


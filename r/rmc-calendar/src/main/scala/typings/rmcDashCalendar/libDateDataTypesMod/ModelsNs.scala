package typings.rmcDashCalendar.libDateDataTypesMod

import typings.react.reactMod.ReactNode
import typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.CellData
import typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.SelectType
import typings.rmcDashCalendar.libDateSingleMonthMod.default
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/date/DataTypes", "Models")
@js.native
object ModelsNs extends js.Object {
  trait CellData extends js.Object {
    var dayOfMonth: Double
    var isFirstOfMonth: Boolean
    var isLastOfMonth: Boolean
    var outOfDate: Boolean
    var selected: SelectType
    var tick: Double
  }
  
  trait ExtraData extends js.Object {
    /** (web only) 附加cell样式 className */
    var cellCls: js.UndefOr[js.Any] = js.undefined
    var cellRender: js.UndefOr[js.Function1[/* date */ Date, ReactNode]] = js.undefined
    /** 是否禁止选择 */
    var disable: js.UndefOr[Boolean] = js.undefined
    /** 扩展信息 */
    var info: js.UndefOr[String] = js.undefined
  }
  
  trait Locale extends js.Object {
    var am: String
    var begin: String
    var begin_over: String
    var clear: String
    var confirm: String
    var dateFormat: String
    var dateTimeFormat: String
    var end: String
    var lastMonth: String
    var lastWeek: String
    var loadPrevMonth: String
    var month: String
    var monthTitle: String
    var noChoose: String
    var over: String
    var pm: String
    var selectEndTime: String
    var selectStartTime: String
    var selectTime: String
    var start: String
    var title: String
    var today: String
    var week: js.Array[String]
    var year: String
    var yesterday: String
  }
  
  trait MonthData extends js.Object {
    var component: js.UndefOr[ReactNode] = js.undefined
    var componentRef: js.UndefOr[default] = js.undefined
    var firstDate: Date
    var height: js.UndefOr[Double] = js.undefined
    var lastDate: Date
    var title: String
    var updateLayout: js.UndefOr[js.Function] = js.undefined
    var weeks: js.Array[js.Array[CellData]]
    var y: js.UndefOr[Double] = js.undefined
  }
  
  @js.native
  sealed trait SelectType extends js.Object
  
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
    
    /* 2 */ val All: typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.SelectType.All with Double = js.native
    /* 6 */ val End: typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.SelectType.End with Double = js.native
    /* 5 */ val Middle: typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.SelectType.Middle with Double = js.native
    /* 0 */ val None: typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.SelectType.None with Double = js.native
    /* 3 */ val Only: typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.SelectType.Only with Double = js.native
    /* 1 */ val Single: typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.SelectType.Single with Double = js.native
    /* 4 */ val Start: typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.SelectType.Start with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectType with Double] = js.native
  }
  
}


package typings
package rmcDashCalendarLib.libDateDataTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/date/DataTypes", "Models")
@js.native
object ModelsNs extends js.Object {
  trait CellData extends js.Object {
    var dayOfMonth: scala.Double
    var isFirstOfMonth: scala.Boolean
    var isLastOfMonth: scala.Boolean
    var outOfDate: scala.Boolean
    var selected: SelectType
    var tick: scala.Double
  }
  
  trait ExtraData extends js.Object {
    /** (web only) 附加cell样式 className */
    var cellCls: js.UndefOr[js.Any] = js.undefined
    var cellRender: js.UndefOr[js.Function1[/* date */ stdLib.Date, reactLib.reactMod.ReactNode]] = js.undefined
    /** 是否禁止选择 */
    var disable: js.UndefOr[scala.Boolean] = js.undefined
    /** 扩展信息 */
    var info: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Locale extends js.Object {
    var am: java.lang.String
    var begin: java.lang.String
    var begin_over: java.lang.String
    var clear: java.lang.String
    var confirm: java.lang.String
    var dateFormat: java.lang.String
    var dateTimeFormat: java.lang.String
    var end: java.lang.String
    var lastMonth: java.lang.String
    var lastWeek: java.lang.String
    var loadPrevMonth: java.lang.String
    var month: java.lang.String
    var monthTitle: java.lang.String
    var noChoose: java.lang.String
    var over: java.lang.String
    var pm: java.lang.String
    var selectEndTime: java.lang.String
    var selectStartTime: java.lang.String
    var selectTime: java.lang.String
    var start: java.lang.String
    var title: java.lang.String
    var today: java.lang.String
    var week: js.Array[java.lang.String]
    var year: java.lang.String
    var yesterday: java.lang.String
  }
  
  trait MonthData extends js.Object {
    var component: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
    var componentRef: js.UndefOr[rmcDashCalendarLib.libDateSingleMonthMod.default] = js.undefined
    var firstDate: stdLib.Date
    var height: js.UndefOr[scala.Double] = js.undefined
    var lastDate: stdLib.Date
    var title: java.lang.String
    var updateLayout: js.UndefOr[js.Function] = js.undefined
    var weeks: js.Array[js.Array[CellData]]
    var y: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  sealed trait SelectType extends js.Object
  
  @js.native
  object SelectType extends js.Object {
    /** 起/止 */
    @js.native
    sealed trait All
      extends rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.SelectType
    
    /** 区间止 */
    @js.native
    sealed trait End
      extends rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.SelectType
    
    /** 区间中 */
    @js.native
    sealed trait Middle
      extends rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.SelectType
    
    @js.native
    sealed trait None
      extends rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.SelectType
    
    /** 区间仅选择了 起 */
    @js.native
    sealed trait Only
      extends rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.SelectType
    
    /** 单选 */
    @js.native
    sealed trait Single
      extends rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.SelectType
    
    /** 区间起 */
    @js.native
    sealed trait Start
      extends rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.SelectType
    
    /* 2 */ val All: All with scala.Double = js.native
    /* 6 */ val End: End with scala.Double = js.native
    /* 5 */ val Middle: Middle with scala.Double = js.native
    /* 0 */ val None: None with scala.Double = js.native
    /* 3 */ val Only: Only with scala.Double = js.native
    /* 1 */ val Single: Single with scala.Double = js.native
    /* 4 */ val Start: Start with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.SelectType with scala.Double] = js.native
  }
  
}


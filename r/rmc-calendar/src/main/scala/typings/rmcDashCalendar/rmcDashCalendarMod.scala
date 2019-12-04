package typings.rmcDashCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.rmcDashCalendar.libCalendarMod.default
import typings.rmcDashCalendar.libCalendarPropsMod.PropsType
import typings.rmcDashCalendar.libDateDataTypesMod.Models.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar", JSImport.Namespace)
@js.native
object rmcDashCalendarMod extends js.Object {
  @js.native
  class Calendar protected () extends default {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class DatePicker ()
    extends typings.rmcDashCalendar.libDatePickerMod.DatePicker
  
  /* static members */
  @js.native
  object Calendar extends js.Object {
    var DefaultHeader: TypeofClassHeader = js.native
    var DefaultShortcut: Instantiable0[typings.rmcDashCalendar.libCalendarShortcutPanelMod.default] = js.native
    var defaultProps: PropsType = js.native
  }
  
  @js.native
  object Locale extends js.Object {
    var enUS: typings.rmcDashCalendar.libDateDataTypesMod.Models.Locale = js.native
    var zhCN: typings.rmcDashCalendar.libDateDataTypesMod.Models.Locale = js.native
  }
  
  type LocaleType = Locale
}


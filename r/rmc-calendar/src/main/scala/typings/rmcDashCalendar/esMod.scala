package typings.rmcDashCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.rmcDashCalendar.esCalendarMod.default
import typings.rmcDashCalendar.esCalendarPropsMod.PropsType
import typings.rmcDashCalendar.esDateDataTypesMod.Models.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class Calendar protected () extends default {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class DatePicker ()
    extends typings.rmcDashCalendar.esDatePickerMod.default
  
  /* static members */
  @js.native
  object Calendar extends js.Object {
    var DefaultHeader: TypeofClassHeader = js.native
    var DefaultShortcut: Instantiable0[typings.rmcDashCalendar.esCalendarShortcutPanelMod.default] = js.native
    var defaultProps: PropsType = js.native
  }
  
  @js.native
  object Locale extends js.Object {
    var enUS: typings.rmcDashCalendar.esDateDataTypesMod.Models.Locale = js.native
    var zhCN: typings.rmcDashCalendar.esDateDataTypesMod.Models.Locale = js.native
  }
  
  type LocaleType = Locale
}


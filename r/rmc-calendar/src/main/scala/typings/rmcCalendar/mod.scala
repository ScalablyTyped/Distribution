package typings.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.rmcCalendar.calendarMod.default
import typings.rmcCalendar.calendarPropsMod.PropsType
import typings.rmcCalendar.dataTypesMod.Models.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Calendar protected () extends default {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class DatePicker ()
    extends typings.rmcCalendar.datePickerMod.DatePicker
  
  /* static members */
  @js.native
  object Calendar extends js.Object {
    var DefaultHeader: TypeofHeader = js.native
    var DefaultShortcut: Instantiable0[typings.rmcCalendar.shortcutPanelMod.default] = js.native
    var defaultProps: PropsType = js.native
  }
  
  @js.native
  object Locale extends js.Object {
    var enUS: typings.rmcCalendar.dataTypesMod.Models.Locale = js.native
    var zhCN: typings.rmcCalendar.dataTypesMod.Models.Locale = js.native
  }
  
  type LocaleType = Locale
}


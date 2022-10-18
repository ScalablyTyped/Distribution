package typings.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.rmcCalendar.anon.TypeofHeader
import typings.rmcCalendar.libCalendarMod.default
import typings.rmcCalendar.libCalendarPropsMod.PropsType
import typings.rmcCalendar.libDateDataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-calendar", "Calendar")
  @js.native
  open class Calendar protected () extends default {
    def this(props: PropsType) = this()
  }
  /* static members */
  object Calendar {
    
    @JSImport("rmc-calendar", "Calendar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar", "Calendar.DefaultHeader")
    @js.native
    def DefaultHeader: TypeofHeader = js.native
    inline def DefaultHeader_=(x: TypeofHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar", "Calendar.DefaultShortcut")
    @js.native
    def DefaultShortcut: Instantiable0[typings.rmcCalendar.libCalendarShortcutPanelMod.default] = js.native
    inline def DefaultShortcut_=(x: Instantiable0[typings.rmcCalendar.libCalendarShortcutPanelMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultShortcut")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar", "Calendar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-calendar", "DatePicker")
  @js.native
  open class DatePicker ()
    extends typings.rmcCalendar.libDatePickerMod.default
  
  object Locale {
    
    @JSImport("rmc-calendar", "Locale")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar", "Locale.enUS")
    @js.native
    def enUS: typings.rmcCalendar.libDateDataTypesMod.Models.Locale = js.native
    inline def enUS_=(x: typings.rmcCalendar.libDateDataTypesMod.Models.Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enUS")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar", "Locale.zhCN")
    @js.native
    def zhCN: typings.rmcCalendar.libDateDataTypesMod.Models.Locale = js.native
    inline def zhCN_=(x: typings.rmcCalendar.libDateDataTypesMod.Models.Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zhCN")(x.asInstanceOf[js.Any])
  }
  
  type LocaleType = Locale
}

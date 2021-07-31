package typings.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.rmcCalendar.anon.TypeofHeader
import typings.rmcCalendar.calendarMod.default
import typings.rmcCalendar.calendarPropsMod.PropsType
import typings.rmcCalendar.dataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-calendar", "Calendar")
  @js.native
  class Calendar protected () extends default {
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
    @scala.inline
    def DefaultHeader_=(x: TypeofHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar", "Calendar.DefaultShortcut")
    @js.native
    def DefaultShortcut: Instantiable0[typings.rmcCalendar.shortcutPanelMod.default] = js.native
    @scala.inline
    def DefaultShortcut_=(x: Instantiable0[typings.rmcCalendar.shortcutPanelMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultShortcut")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar", "Calendar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-calendar", "DatePicker")
  @js.native
  class DatePicker ()
    extends typings.rmcCalendar.datePickerMod.default
  
  object Locale {
    
    @JSImport("rmc-calendar", "Locale")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar", "Locale.enUS")
    @js.native
    def enUS: typings.rmcCalendar.dataTypesMod.Models.Locale = js.native
    @scala.inline
    def enUS_=(x: typings.rmcCalendar.dataTypesMod.Models.Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enUS")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar", "Locale.zhCN")
    @js.native
    def zhCN: typings.rmcCalendar.dataTypesMod.Models.Locale = js.native
    @scala.inline
    def zhCN_=(x: typings.rmcCalendar.dataTypesMod.Models.Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zhCN")(x.asInstanceOf[js.Any])
  }
  
  type LocaleType = Locale
}

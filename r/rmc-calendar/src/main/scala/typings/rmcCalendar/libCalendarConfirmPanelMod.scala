package typings.rmcCalendar

import typings.react.mod.PureComponent
import typings.rmcCalendar.libDateDataTypesMod.Models.Locale
import typings.rmcCalendar.rmcCalendarStrings.one
import typings.rmcCalendar.rmcCalendarStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCalendarConfirmPanelMod {
  
  @JSImport("rmc-calendar/lib/calendar/ConfirmPanel", JSImport.Default)
  @js.native
  open class default () extends ConfirmPanel
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/calendar/ConfirmPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/calendar/ConfirmPanel", "default.defaultProps")
    @js.native
    def defaultProps: ConfirmPanelPropsType = js.native
    inline def defaultProps_=(x: ConfirmPanelPropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ConfirmPanel
    extends PureComponent[ConfirmPanelPropsType, js.Object, Any] {
    
    def formatDate(date: js.Date): String = js.native
    
    def onConfirm(): Unit = js.native
  }
  
  trait ConfirmPanelPropsType extends StObject {
    
    var disableBtn: js.UndefOr[Boolean] = js.undefined
    
    var endDateTime: js.UndefOr[js.Date] = js.undefined
    
    var formatStr: js.UndefOr[String] = js.undefined
    
    var locale: Locale
    
    def onConfirm(): Unit
    
    var onlyConfirm: js.UndefOr[Boolean] = js.undefined
    
    var startDateTime: js.UndefOr[js.Date] = js.undefined
    
    var `type`: js.UndefOr[one | range] = js.undefined
  }
  object ConfirmPanelPropsType {
    
    inline def apply(locale: Locale, onConfirm: () => Unit): ConfirmPanelPropsType = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onConfirm = js.Any.fromFunction0(onConfirm))
      __obj.asInstanceOf[ConfirmPanelPropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmPanelPropsType] (val x: Self) extends AnyVal {
      
      inline def setDisableBtn(value: Boolean): Self = StObject.set(x, "disableBtn", value.asInstanceOf[js.Any])
      
      inline def setDisableBtnUndefined: Self = StObject.set(x, "disableBtn", js.undefined)
      
      inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
      
      inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
      
      inline def setFormatStr(value: String): Self = StObject.set(x, "formatStr", value.asInstanceOf[js.Any])
      
      inline def setFormatStrUndefined: Self = StObject.set(x, "formatStr", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnConfirm(value: () => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction0(value))
      
      inline def setOnlyConfirm(value: Boolean): Self = StObject.set(x, "onlyConfirm", value.asInstanceOf[js.Any])
      
      inline def setOnlyConfirmUndefined: Self = StObject.set(x, "onlyConfirm", js.undefined)
      
      inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
      
      inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
      
      inline def setType(value: one | range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

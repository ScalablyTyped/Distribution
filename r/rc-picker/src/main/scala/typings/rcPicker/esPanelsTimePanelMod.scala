package typings.rcPicker

import typings.rcPicker.esInterfaceMod.DisabledTimes
import typings.rcPicker.esInterfaceMod.PanelSharedProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsTimePanelMod {
  
  @JSImport("rc-picker/es/panels/TimePanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: TimePanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SharedTimeProps[DateType] extends StObject {
    
    var defaultValue: js.UndefOr[DateType] = js.undefined
    
    /** @deprecated Please use `disabledTime` instead. */
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
    
    /** @deprecated Please use `disabledTime` instead. */
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
    
    /** @deprecated Please use `disabledTime` instead. */
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
    
    var disabledTime: js.UndefOr[js.Function1[/* date */ DateType, DisabledTimes]] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
    
    var hourStep: js.UndefOr[Double] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var secondStep: js.UndefOr[Double] = js.undefined
    
    var showHour: js.UndefOr[Boolean] = js.undefined
    
    var showMinute: js.UndefOr[Boolean] = js.undefined
    
    var showNow: js.UndefOr[Boolean] = js.undefined
    
    var showSecond: js.UndefOr[Boolean] = js.undefined
    
    var use12Hours: js.UndefOr[Boolean] = js.undefined
  }
  object SharedTimeProps {
    
    inline def apply[DateType](): SharedTimeProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedTimeProps[DateType]]
    }
    
    extension [Self <: SharedTimeProps[?], DateType](x: Self & SharedTimeProps[DateType]) {
      
      inline def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
      
      inline def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      inline def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      inline def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      inline def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      inline def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
      
      inline def setDisabledTime(value: /* date */ DateType => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      inline def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      inline def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      inline def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      inline def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      inline def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      inline def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      inline def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      inline def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      inline def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      inline def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      inline def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    }
  }
  
  @js.native
  trait TimePanelProps[DateType]
    extends StObject
       with PanelSharedProps[DateType]
       with SharedTimeProps[DateType] {
    
    var active: js.UndefOr[Boolean] = js.native
  }
}

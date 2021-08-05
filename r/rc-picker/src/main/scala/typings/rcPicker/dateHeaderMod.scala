package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateHeaderMod {
  
  @JSImport("rc-picker/es/panels/DatePanel/DateHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: DateHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait DateHeaderProps[DateType] extends StObject {
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    def onMonthClick(): Unit
    
    def onNextMonth(): Unit
    
    def onNextYear(): Unit
    
    def onPrevMonth(): Unit
    
    def onPrevYear(): Unit
    
    def onYearClick(): Unit
    
    var prefixCls: String
    
    var value: js.UndefOr[DateType | Null] = js.undefined
    
    var viewDate: DateType
  }
  object DateHeaderProps {
    
    inline def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onMonthClick: () => Unit,
      onNextMonth: () => Unit,
      onNextYear: () => Unit,
      onPrevMonth: () => Unit,
      onPrevYear: () => Unit,
      onYearClick: () => Unit,
      prefixCls: String,
      viewDate: DateType
    ): DateHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onMonthClick = js.Any.fromFunction0(onMonthClick), onNextMonth = js.Any.fromFunction0(onNextMonth), onNextYear = js.Any.fromFunction0(onNextYear), onPrevMonth = js.Any.fromFunction0(onPrevMonth), onPrevYear = js.Any.fromFunction0(onPrevYear), onYearClick = js.Any.fromFunction0(onYearClick), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateHeaderProps[DateType]]
    }
    
    extension [Self <: DateHeaderProps[?], DateType](x: Self & DateHeaderProps[DateType]) {
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnMonthClick(value: () => Unit): Self = StObject.set(x, "onMonthClick", js.Any.fromFunction0(value))
      
      inline def setOnNextMonth(value: () => Unit): Self = StObject.set(x, "onNextMonth", js.Any.fromFunction0(value))
      
      inline def setOnNextYear(value: () => Unit): Self = StObject.set(x, "onNextYear", js.Any.fromFunction0(value))
      
      inline def setOnPrevMonth(value: () => Unit): Self = StObject.set(x, "onPrevMonth", js.Any.fromFunction0(value))
      
      inline def setOnPrevYear(value: () => Unit): Self = StObject.set(x, "onPrevYear", js.Any.fromFunction0(value))
      
      inline def setOnYearClick(value: () => Unit): Self = StObject.set(x, "onYearClick", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

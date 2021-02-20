package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quarterHeaderMod {
  
  @JSImport("rc-picker/es/panels/QuarterPanel/QuarterHeader", JSImport.Default)
  @js.native
  def default[DateType](props: QuarterHeaderProps[DateType]): Element = js.native
  
  @js.native
  trait QuarterHeaderProps[DateType] extends StObject {
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    def onNextYear(): Unit = js.native
    
    def onPrevYear(): Unit = js.native
    
    def onYearClick(): Unit = js.native
    
    var prefixCls: String = js.native
    
    var viewDate: DateType = js.native
  }
  object QuarterHeaderProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onNextYear: () => Unit,
      onPrevYear: () => Unit,
      onYearClick: () => Unit,
      prefixCls: String,
      viewDate: DateType
    ): QuarterHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onNextYear = js.Any.fromFunction0(onNextYear), onPrevYear = js.Any.fromFunction0(onPrevYear), onYearClick = js.Any.fromFunction0(onYearClick), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuarterHeaderProps[DateType]]
    }
    
    @scala.inline
    implicit class QuarterHeaderPropsMutableBuilder[Self <: QuarterHeaderProps[_], DateType] (val x: Self with QuarterHeaderProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNextYear(value: () => Unit): Self = StObject.set(x, "onNextYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPrevYear(value: () => Unit): Self = StObject.set(x, "onPrevYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnYearClick(value: () => Unit): Self = StObject.set(x, "onYearClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

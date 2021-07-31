package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.NullableDateType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yearBodyMod {
  
  @JSImport("rc-picker/es/panels/YearPanel/YearBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: YearBodyProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-picker/es/panels/YearPanel/YearBody", "YEAR_COL_COUNT")
  @js.native
  val YEAR_COL_COUNT: /* 3 */ Double = js.native
  
  trait YearBodyProps[DateType] extends StObject {
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    def onSelect(value: DateType): Unit
    
    var prefixCls: String
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.undefined
    
    var viewDate: DateType
  }
  object YearBodyProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onSelect: DateType => Unit,
      prefixCls: String,
      viewDate: DateType
    ): YearBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearBodyProps[DateType]]
    }
    
    @scala.inline
    implicit class YearBodyPropsMutableBuilder[Self <: YearBodyProps[?], DateType] (val x: Self & YearBodyProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelect(value: DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: NullableDateType[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

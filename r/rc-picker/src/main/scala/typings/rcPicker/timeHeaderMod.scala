package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeHeaderMod {
  
  @JSImport("rc-picker/es/panels/TimePanel/TimeHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: TimeHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TimeHeaderProps[DateType] extends StObject {
    
    var format: String
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    var prefixCls: String
    
    var value: js.UndefOr[DateType | Null] = js.undefined
  }
  object TimeHeaderProps {
    
    @scala.inline
    def apply[DateType](format: String, generateConfig: GenerateConfig[DateType], locale: Locale, prefixCls: String): TimeHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeHeaderProps[DateType]]
    }
    
    @scala.inline
    implicit class TimeHeaderPropsMutableBuilder[Self <: TimeHeaderProps[?], DateType] (val x: Self & TimeHeaderProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

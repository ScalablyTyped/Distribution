package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.CustomFormat
import typings.rcPicker.interfaceMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useValueTextsMod {
  
  @JSImport("rc-picker/es/hooks/useValueTexts", JSImport.Default)
  @js.native
  def default[DateType](value: DateType, hasFormatListGenerateConfigLocale: ValueTextConfig[DateType]): js.Tuple2[js.Array[String], String] = js.native
  @JSImport("rc-picker/es/hooks/useValueTexts", JSImport.Default)
  @js.native
  def default[DateType](value: Null, hasFormatListGenerateConfigLocale: ValueTextConfig[DateType]): js.Tuple2[js.Array[String], String] = js.native
  
  @js.native
  trait ValueTextConfig[DateType] extends StObject {
    
    var formatList: js.Array[String | CustomFormat[DateType]] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
  }
  object ValueTextConfig {
    
    @scala.inline
    def apply[DateType](
      formatList: js.Array[String | CustomFormat[DateType]],
      generateConfig: GenerateConfig[DateType],
      locale: Locale
    ): ValueTextConfig[DateType] = {
      val __obj = js.Dynamic.literal(formatList = formatList.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueTextConfig[DateType]]
    }
    
    @scala.inline
    implicit class ValueTextConfigMutableBuilder[Self <: ValueTextConfig[_], DateType] (val x: Self with ValueTextConfig[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormatList(value: js.Array[String | CustomFormat[DateType]]): Self = StObject.set(x, "formatList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatListVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "formatList", js.Array(value :_*))
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}

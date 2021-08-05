package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.CustomFormat
import typings.rcPicker.interfaceMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useValueTextsMod {
  
  @JSImport("rc-picker/es/hooks/useValueTexts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](value: DateType, hasFormatListGenerateConfigLocale: ValueTextConfig[DateType]): js.Tuple2[js.Array[String], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], hasFormatListGenerateConfigLocale.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[String], String]]
  inline def default[DateType](value: Null, hasFormatListGenerateConfigLocale: ValueTextConfig[DateType]): js.Tuple2[js.Array[String], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], hasFormatListGenerateConfigLocale.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[String], String]]
  
  trait ValueTextConfig[DateType] extends StObject {
    
    var formatList: js.Array[String | CustomFormat[DateType]]
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
  }
  object ValueTextConfig {
    
    inline def apply[DateType](
      formatList: js.Array[String | CustomFormat[DateType]],
      generateConfig: GenerateConfig[DateType],
      locale: Locale
    ): ValueTextConfig[DateType] = {
      val __obj = js.Dynamic.literal(formatList = formatList.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueTextConfig[DateType]]
    }
    
    extension [Self <: ValueTextConfig[?], DateType](x: Self & ValueTextConfig[DateType]) {
      
      inline def setFormatList(value: js.Array[String | CustomFormat[DateType]]): Self = StObject.set(x, "formatList", value.asInstanceOf[js.Any])
      
      inline def setFormatListVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "formatList", js.Array(value :_*))
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}

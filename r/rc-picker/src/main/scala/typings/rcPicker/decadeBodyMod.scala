package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decadeBodyMod {
  
  @JSImport("rc-picker/es/panels/DecadePanel/DecadeBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: YearBodyProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-picker/es/panels/DecadePanel/DecadeBody", "DECADE_COL_COUNT")
  @js.native
  val DECADE_COL_COUNT: /* 3 */ Double = js.native
  
  trait YearBodyProps[DateType] extends StObject {
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    def onSelect(value: DateType): Unit
    
    var prefixCls: String
    
    var viewDate: DateType
  }
  object YearBodyProps {
    
    inline def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      onSelect: DateType => Unit,
      prefixCls: String,
      viewDate: DateType
    ): YearBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearBodyProps[DateType]]
    }
    
    extension [Self <: YearBodyProps[?], DateType](x: Self & YearBodyProps[DateType]) {
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

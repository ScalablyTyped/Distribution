package typings.rcPicker

import typings.rcPicker.esGenerateMod.GenerateConfig
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsYearPanelYearHeaderMod {
  
  @JSImport("rc-picker/es/panels/YearPanel/YearHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: YearHeaderProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait YearHeaderProps[DateType] extends StObject {
    
    var generateConfig: GenerateConfig[DateType]
    
    def onDecadeClick(): Unit
    
    def onNextDecade(): Unit
    
    def onPrevDecade(): Unit
    
    var prefixCls: String
    
    var value: js.UndefOr[DateType | Null] = js.undefined
    
    var viewDate: DateType
  }
  object YearHeaderProps {
    
    inline def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      onDecadeClick: () => Unit,
      onNextDecade: () => Unit,
      onPrevDecade: () => Unit,
      prefixCls: String,
      viewDate: DateType
    ): YearHeaderProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onDecadeClick = js.Any.fromFunction0(onDecadeClick), onNextDecade = js.Any.fromFunction0(onNextDecade), onPrevDecade = js.Any.fromFunction0(onPrevDecade), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearHeaderProps[DateType]]
    }
    
    extension [Self <: YearHeaderProps[?], DateType](x: Self & YearHeaderProps[DateType]) {
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setOnDecadeClick(value: () => Unit): Self = StObject.set(x, "onDecadeClick", js.Any.fromFunction0(value))
      
      inline def setOnNextDecade(value: () => Unit): Self = StObject.set(x, "onNextDecade", js.Any.fromFunction0(value))
      
      inline def setOnPrevDecade(value: () => Unit): Self = StObject.set(x, "onPrevDecade", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

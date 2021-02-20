package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decadeBodyMod {
  
  @JSImport("rc-picker/es/panels/DecadePanel/DecadeBody", JSImport.Default)
  @js.native
  def default[DateType](props: YearBodyProps[DateType]): Element = js.native
  
  @JSImport("rc-picker/es/panels/DecadePanel/DecadeBody", "DECADE_COL_COUNT")
  @js.native
  val DECADE_COL_COUNT: /* 3 */ Double = js.native
  
  @js.native
  trait YearBodyProps[DateType] extends StObject {
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    def onSelect(value: DateType): Unit = js.native
    
    var prefixCls: String = js.native
    
    var viewDate: DateType = js.native
  }
  object YearBodyProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      onSelect: DateType => Unit,
      prefixCls: String,
      viewDate: DateType
    ): YearBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearBodyProps[DateType]]
    }
    
    @scala.inline
    implicit class YearBodyPropsMutableBuilder[Self <: YearBodyProps[_], DateType] (val x: Self with YearBodyProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelect(value: DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

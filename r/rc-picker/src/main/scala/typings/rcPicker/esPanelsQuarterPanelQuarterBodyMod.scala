package typings.rcPicker

import typings.rcPicker.esGenerateMod.GenerateConfig
import typings.rcPicker.esInterfaceMod.CellRender
import typings.rcPicker.esInterfaceMod.CellRenderInfo
import typings.rcPicker.esInterfaceMod.Locale
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsQuarterPanelQuarterBodyMod {
  
  @JSImport("rc-picker/es/panels/QuarterPanel/QuarterBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: QuarterBodyProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-picker/es/panels/QuarterPanel/QuarterBody", "QUARTER_COL_COUNT")
  @js.native
  val QUARTER_COL_COUNT: /* 4 */ Double = js.native
  
  trait QuarterBodyProps[DateType] extends StObject {
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType]] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    def onSelect(value: DateType): Unit
    
    var prefixCls: String
    
    var value: js.UndefOr[DateType | Null] = js.undefined
    
    var viewDate: DateType
  }
  object QuarterBodyProps {
    
    inline def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onSelect: DateType => Unit,
      prefixCls: String,
      viewDate: DateType
    ): QuarterBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuarterBodyProps[DateType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuarterBodyProps[?], DateType] (val x: Self & QuarterBodyProps[DateType]) extends AnyVal {
      
      inline def setCellRender(value: (DateType, /* info */ CellRenderInfo[DateType]) => ReactNode): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      inline def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}

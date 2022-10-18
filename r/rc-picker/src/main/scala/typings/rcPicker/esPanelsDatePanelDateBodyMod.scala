package typings.rcPicker

import typings.rcPicker.esGenerateMod.GenerateConfig
import typings.rcPicker.esInterfaceMod.Locale
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsDatePanelDateBodyMod {
  
  @JSImport("rc-picker/es/panels/DatePanel/DateBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: DateBodyProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait DateBodyPassProps[DateType] extends StObject {
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
    
    var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
  }
  object DateBodyPassProps {
    
    inline def apply[DateType](): DateBodyPassProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateBodyPassProps[DateType]]
    }
    
    extension [Self <: DateBodyPassProps[?], DateType](x: Self & DateBodyPassProps[DateType]) {
      
      inline def setDateRender(value: (DateType, DateType) => ReactNode): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      inline def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setPrefixColumn(value: /* date */ DateType => ReactNode): Self = StObject.set(x, "prefixColumn", js.Any.fromFunction1(value))
      
      inline def setPrefixColumnUndefined: Self = StObject.set(x, "prefixColumn", js.undefined)
      
      inline def setRowClassName(value: /* date */ DateType => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      inline def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
    }
  }
  
  trait DateBodyProps[DateType]
    extends StObject
       with DateBodyPassProps[DateType] {
    
    var generateConfig: GenerateConfig[DateType]
    
    var locale: Locale
    
    def onSelect(value: DateType): Unit
    
    var prefixCls: String
    
    var rowCount: Double
    
    var value: js.UndefOr[DateType | Null] = js.undefined
    
    var viewDate: DateType
  }
  object DateBodyProps {
    
    inline def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onSelect: DateType => Unit,
      prefixCls: String,
      rowCount: Double,
      viewDate: DateType
    ): DateBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateBodyProps[DateType]]
    }
    
    extension [Self <: DateBodyProps[?], DateType](x: Self & DateBodyProps[DateType]) {
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
  
  type DateRender[DateType] = js.Function2[/* currentDate */ DateType, /* today */ DateType, ReactNode]
}

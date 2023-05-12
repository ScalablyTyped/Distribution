package typings.rcPicker

import typings.rcPicker.esGenerateMod.GenerateConfig
import typings.rcPicker.esInterfaceMod.PanelMode
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsPanelBodyMod {
  
  @JSImport("rc-picker/es/panels/PanelBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](param0: PanelBodyProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PanelBodyProps[DateType] extends StObject {
    
    var baseDate: DateType
    
    var colNum: Double
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    def getCellClassName(date: DateType): Record[String, js.UndefOr[Boolean]]
    
    def getCellDate(date: DateType, offset: Double): DateType
    
    var getCellNode: js.UndefOr[js.Function2[/* date */ DateType, /* wrapperNode */ ReactElement, ReactNode]] = js.undefined
    
    def getCellText(date: DateType): ReactNode
    
    var headerCells: js.UndefOr[ReactNode] = js.undefined
    
    def onSelect(value: DateType): Unit
    
    var picker: js.UndefOr[PanelMode] = js.undefined
    
    var prefixCls: String
    
    var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
    
    var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
    
    var rowNum: Double
    
    var titleCell: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
  }
  object PanelBodyProps {
    
    inline def apply[DateType](
      baseDate: DateType,
      colNum: Double,
      generateConfig: GenerateConfig[DateType],
      getCellClassName: DateType => Record[String, js.UndefOr[Boolean]],
      getCellDate: (DateType, Double) => DateType,
      getCellText: DateType => ReactNode,
      onSelect: DateType => Unit,
      prefixCls: String,
      rowNum: Double
    ): PanelBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(baseDate = baseDate.asInstanceOf[js.Any], colNum = colNum.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], getCellClassName = js.Any.fromFunction1(getCellClassName), getCellDate = js.Any.fromFunction2(getCellDate), getCellText = js.Any.fromFunction1(getCellText), onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowNum = rowNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelBodyProps[DateType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanelBodyProps[?], DateType] (val x: Self & PanelBodyProps[DateType]) extends AnyVal {
      
      inline def setBaseDate(value: DateType): Self = StObject.set(x, "baseDate", value.asInstanceOf[js.Any])
      
      inline def setColNum(value: Double): Self = StObject.set(x, "colNum", value.asInstanceOf[js.Any])
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setGetCellClassName(value: DateType => Record[String, js.UndefOr[Boolean]]): Self = StObject.set(x, "getCellClassName", js.Any.fromFunction1(value))
      
      inline def setGetCellDate(value: (DateType, Double) => DateType): Self = StObject.set(x, "getCellDate", js.Any.fromFunction2(value))
      
      inline def setGetCellNode(value: (/* date */ DateType, /* wrapperNode */ ReactElement) => ReactNode): Self = StObject.set(x, "getCellNode", js.Any.fromFunction2(value))
      
      inline def setGetCellNodeUndefined: Self = StObject.set(x, "getCellNode", js.undefined)
      
      inline def setGetCellText(value: DateType => ReactNode): Self = StObject.set(x, "getCellText", js.Any.fromFunction1(value))
      
      inline def setHeaderCells(value: ReactNode): Self = StObject.set(x, "headerCells", value.asInstanceOf[js.Any])
      
      inline def setHeaderCellsUndefined: Self = StObject.set(x, "headerCells", js.undefined)
      
      inline def setOnSelect(value: DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setPicker(value: PanelMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixColumn(value: /* date */ DateType => ReactNode): Self = StObject.set(x, "prefixColumn", js.Any.fromFunction1(value))
      
      inline def setPrefixColumnUndefined: Self = StObject.set(x, "prefixColumn", js.undefined)
      
      inline def setRowClassName(value: /* date */ DateType => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      inline def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      inline def setRowNum(value: Double): Self = StObject.set(x, "rowNum", value.asInstanceOf[js.Any])
      
      inline def setTitleCell(value: /* date */ DateType => String): Self = StObject.set(x, "titleCell", js.Any.fromFunction1(value))
      
      inline def setTitleCellUndefined: Self = StObject.set(x, "titleCell", js.undefined)
    }
  }
}

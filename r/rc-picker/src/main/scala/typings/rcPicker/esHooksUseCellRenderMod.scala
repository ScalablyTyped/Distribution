package typings.rcPicker

import typings.rcPicker.esInterfaceMod.CellRender
import typings.rcPicker.esPickerPanelMod.PickerPanelProps
import typings.rcPicker.esRangePickerMod.RangePickerProps
import typings.rcPicker.rcPickerStrings.cellRender
import typings.rcPicker.rcPickerStrings.dateRender
import typings.rcPicker.rcPickerStrings.monthCellRender
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseCellRenderMod {
  
  @JSImport("rc-picker/es/hooks/useCellRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCellRender[DateType](param0: UseCellRenderOption[DateType]): CellRender[DateType, DateType] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCellRender")(param0.asInstanceOf[js.Any]).asInstanceOf[CellRender[DateType, DateType]]
  
  type UseCellRenderOption[DateType] = Pick[
    PickerPanelProps[DateType] | RangePickerProps[DateType], 
    cellRender | monthCellRender | dateRender
  ]
}

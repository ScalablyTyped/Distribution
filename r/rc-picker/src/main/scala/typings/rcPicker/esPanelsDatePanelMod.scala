package typings.rcPicker

import typings.rcPicker.esInterfaceMod.CellRender
import typings.rcPicker.esInterfaceMod.PanelSharedProps
import typings.rcPicker.esUtilsUiUtilMod.KeyboardConfig
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsDatePanelMod {
  
  @JSImport("rc-picker/es/panels/DatePanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: DatePanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rcPicker.esPanelsDatePanelDateBodyMod.DateBodyPassProps because var conflicts: disabledDate. Inlined cellRender, prefixColumn, rowClassName, isSameCell */ @js.native
  trait DatePanelProps[DateType]
    extends StObject
       with PanelSharedProps[DateType] {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType]] = js.native
    
    var isSameCell: js.UndefOr[js.Function2[DateType, DateType, Boolean]] = js.native
    
    var keyboardConfig: js.UndefOr[KeyboardConfig] = js.native
    
    var panelName: js.UndefOr[String] = js.native
    
    var prefixColumn: js.UndefOr[js.Function1[DateType, ReactNode]] = js.native
    
    var rowClassName: js.UndefOr[js.Function1[DateType, String]] = js.native
  }
}

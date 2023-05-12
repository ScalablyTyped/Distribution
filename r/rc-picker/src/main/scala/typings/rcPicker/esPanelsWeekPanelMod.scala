package typings.rcPicker

import typings.rcPicker.esInterfaceMod.CellRender
import typings.rcPicker.esInterfaceMod.PanelSharedProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsWeekPanelMod {
  
  @JSImport("rc-picker/es/panels/WeekPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: WeekPanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait WeekPanelProps[DateType]
    extends StObject
       with PanelSharedProps[DateType] {
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType]] = js.native
  }
}

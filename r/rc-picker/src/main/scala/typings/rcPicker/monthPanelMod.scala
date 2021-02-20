package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.rcPicker.monthBodyMod.MonthCellRender
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monthPanelMod {
  
  @JSImport("rc-picker/es/panels/MonthPanel", JSImport.Default)
  @js.native
  def default[DateType](props: MonthPanelProps[DateType]): Element = js.native
  
  @js.native
  trait MonthPanelProps[DateType] extends PanelSharedProps[DateType] {
    
    var monthCellContentRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  }
}

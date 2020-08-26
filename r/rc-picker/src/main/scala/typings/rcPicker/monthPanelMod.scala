package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.rcPicker.monthBodyMod.MonthCellRender
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/es/panels/MonthPanel", JSImport.Namespace)
@js.native
object monthPanelMod extends js.Object {
  @js.native
  trait MonthPanelProps[DateType] extends PanelSharedProps[DateType] {
    var monthCellContentRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  }
  
  def default[DateType](props: MonthPanelProps[DateType]): Element = js.native
}


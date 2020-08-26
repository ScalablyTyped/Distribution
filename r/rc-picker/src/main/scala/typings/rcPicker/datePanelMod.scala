package typings.rcPicker

import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.rcPicker.uiUtilMod.KeyboardConfig
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/es/panels/DatePanel", JSImport.Namespace)
@js.native
object datePanelMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rcPicker.dateBodyMod.DateBodyPassProps because var conflicts: disabledDate. Inlined dateRender, prefixColumn, rowClassName */ @js.native
  trait DatePanelProps[DateType] extends PanelSharedProps[DateType] {
    var active: js.UndefOr[Boolean] = js.native
    var dateRender: js.UndefOr[DateRender[DateType]] = js.native
    var keyboardConfig: js.UndefOr[KeyboardConfig] = js.native
    var panelName: js.UndefOr[String] = js.native
    var prefixColumn: js.UndefOr[js.Function1[DateType, ReactNode]] = js.native
    var rowClassName: js.UndefOr[js.Function1[DateType, String]] = js.native
  }
  
  def default[DateType](props: DatePanelProps[DateType]): Element = js.native
}


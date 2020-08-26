package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/es/panels/WeekPanel", JSImport.Namespace)
@js.native
object weekPanelMod extends js.Object {
  def default[DateType](props: WeekPanelProps[DateType]): Element = js.native
  type WeekPanelProps[DateType] = PanelSharedProps[DateType]
}


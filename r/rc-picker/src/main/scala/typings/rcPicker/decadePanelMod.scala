package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.rcPicker.rcPickerNumbers.`10`
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/panels/DecadePanel", JSImport.Namespace)
@js.native
object decadePanelMod extends js.Object {
  val DECADE_DISTANCE_COUNT: Double = js.native
  val DECADE_UNIT_DIFF: `10` = js.native
  def default[DateType](props: DecadePanelProps[DateType]): Element = js.native
  type DecadePanelProps[DateType] = PanelSharedProps[DateType]
}


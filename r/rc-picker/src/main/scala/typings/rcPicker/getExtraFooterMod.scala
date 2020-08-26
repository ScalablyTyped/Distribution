package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelMode
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/es/utils/getExtraFooter", JSImport.Namespace)
@js.native
object getExtraFooterMod extends js.Object {
  def default(prefixCls: String, mode: PanelMode): Element = js.native
  def default(
    prefixCls: String,
    mode: PanelMode,
    renderExtraFooter: js.Function1[/* mode */ PanelMode, ReactNode]
  ): Element = js.native
}


package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/panels/QuarterPanel", JSImport.Namespace)
@js.native
object quarterPanelMod extends js.Object {
  
  def default[DateType](props: QuarterPanelProps[DateType]): Element = js.native
  
  type QuarterPanelProps[DateType] = PanelSharedProps[DateType]
}

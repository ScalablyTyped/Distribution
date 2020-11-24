package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/panels/DecadePanel", JSImport.Namespace)
@js.native
object decadePanelMod extends js.Object {
  
  val DECADE_DISTANCE_COUNT: Double = js.native
  
  val DECADE_UNIT_DIFF: /* 10 */ Double = js.native
  
  def default[DateType](props: DecadePanelProps[DateType]): Element = js.native
  
  type DecadePanelProps[DateType] = PanelSharedProps[DateType]
}

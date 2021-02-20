package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decadePanelMod {
  
  @JSImport("rc-picker/es/panels/DecadePanel", JSImport.Default)
  @js.native
  def default[DateType](props: DecadePanelProps[DateType]): Element = js.native
  
  @JSImport("rc-picker/es/panels/DecadePanel", "DECADE_DISTANCE_COUNT")
  @js.native
  val DECADE_DISTANCE_COUNT: Double = js.native
  
  @JSImport("rc-picker/es/panels/DecadePanel", "DECADE_UNIT_DIFF")
  @js.native
  val DECADE_UNIT_DIFF: /* 10 */ Double = js.native
  
  type DecadePanelProps[DateType] = PanelSharedProps[DateType]
}

package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yearPanelMod {
  
  @JSImport("rc-picker/es/panels/YearPanel", JSImport.Default)
  @js.native
  def default[DateType](props: YearPanelProps[DateType]): Element = js.native
  
  @JSImport("rc-picker/es/panels/YearPanel", "YEAR_DECADE_COUNT")
  @js.native
  val YEAR_DECADE_COUNT: /* 10 */ Double = js.native
  
  @js.native
  trait YearPanelProps[DateType] extends PanelSharedProps[DateType] {
    
    var sourceMode: PanelMode = js.native
  }
}

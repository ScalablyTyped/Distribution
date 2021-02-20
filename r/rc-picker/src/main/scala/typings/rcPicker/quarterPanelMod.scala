package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quarterPanelMod {
  
  @JSImport("rc-picker/es/panels/QuarterPanel", JSImport.Default)
  @js.native
  def default[DateType](props: QuarterPanelProps[DateType]): Element = js.native
  
  type QuarterPanelProps[DateType] = PanelSharedProps[DateType]
}

package typings.rcPicker

import typings.rcPicker.interfaceMod.PanelSharedProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekPanelMod {
  
  @JSImport("rc-picker/es/panels/WeekPanel", JSImport.Default)
  @js.native
  def default[DateType](props: WeekPanelProps[DateType]): Element = js.native
  
  type WeekPanelProps[DateType] = PanelSharedProps[DateType]
}

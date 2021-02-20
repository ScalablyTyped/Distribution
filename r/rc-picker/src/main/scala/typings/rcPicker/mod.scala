package typings.rcPicker

import typings.rcPicker.pickerPanelMod.PickerPanelProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-picker", JSImport.Default)
  @js.native
  class default[DateType] ()
    extends typings.rcPicker.pickerMod.default[DateType]
  
  @JSImport("rc-picker", "PickerPanel")
  @js.native
  def PickerPanel[DateType](props: PickerPanelProps[DateType]): Element = js.native
  
  @JSImport("rc-picker", "RangePicker")
  @js.native
  class RangePicker[DateType] ()
    extends typings.rcPicker.rangePickerMod.default[DateType]
}

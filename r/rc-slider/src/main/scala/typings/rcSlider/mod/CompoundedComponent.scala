package typings.rcSlider.mod

import org.scalablytyped.runtime.Instantiable0
import typings.rcSlider.anon.FnCall
import typings.rcSlider.rangeMod.RangeProps
import typings.rcSlider.rangeMod.RangeState
import typings.rcSlider.sliderMod.SliderProps
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompoundedComponent extends ComponentClass[SliderProps, ComponentState] {
  
  var Handle: Instantiable0[typings.rcSlider.handleMod.default] = js.native
  
  var Range: ComponentClass[RangeProps, RangeState] = js.native
  
  var createSliderWithTooltip: FnCall = js.native
}

package typings.rcSlider

import typings.rcSlider.interfaceMod.GenericSlider
import typings.rcSlider.interfaceMod.GenericSliderProps
import typings.rcSlider.interfaceMod.GenericSliderState
import typings.react.mod.ComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSliderMod {
  
  @JSImport("rc-slider/lib/common/createSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props /* <: GenericSliderProps */, State /* <: GenericSliderState */](Component: GenericSlider[Props, State]): ComponentClass[Props, State] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Props, State]]
}

package typings.rcSlider

import org.scalablytyped.runtime.Shortcut
import typings.rcSlider.sliderMod.SliderProps
import typings.rcSlider.sliderMod.SliderRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-slider", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(SliderProps[Double | js.Array[Double]]) & RefAttributes[SliderRef]] = js.native
  
  type _To = ForwardRefExoticComponent[(SliderProps[Double | js.Array[Double]]) & RefAttributes[SliderRef]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[(SliderProps[Double | js.Array[Double]]) & RefAttributes[SliderRef]] = default
}

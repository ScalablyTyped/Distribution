package typings.rcSlider

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  type AriaValueFormat = js.Function1[/* value */ Double, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcSlider.rcSliderStrings.rtl
    - typings.rcSlider.rcSliderStrings.ltr
    - typings.rcSlider.rcSliderStrings.ttb
    - typings.rcSlider.rcSliderStrings.btt
  */
  trait Direction extends StObject
  object Direction {
    
    inline def btt: typings.rcSlider.rcSliderStrings.btt = "btt".asInstanceOf[typings.rcSlider.rcSliderStrings.btt]
    
    inline def ltr: typings.rcSlider.rcSliderStrings.ltr = "ltr".asInstanceOf[typings.rcSlider.rcSliderStrings.ltr]
    
    inline def rtl: typings.rcSlider.rcSliderStrings.rtl = "rtl".asInstanceOf[typings.rcSlider.rcSliderStrings.rtl]
    
    inline def ttb: typings.rcSlider.rcSliderStrings.ttb = "ttb".asInstanceOf[typings.rcSlider.rcSliderStrings.ttb]
  }
  
  type OnStartMove = js.Function2[
    /* e */ (MouseEvent[Element, NativeMouseEvent]) | TouchEvent[Element], 
    /* valueIndex */ Double, 
    Unit
  ]
}

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
  
  object Direction {
    
    inline def btt: "btt" = "btt".asInstanceOf["btt"]
    
    inline def ltr: "ltr" = "ltr".asInstanceOf["ltr"]
    
    inline def rtl: "rtl" = "rtl".asInstanceOf["rtl"]
    
    inline def ttb: "ttb" = "ttb".asInstanceOf["ttb"]
  }
  type Direction = "rtl" | "ltr" | "ttb" | "btt"
  
  type OnStartMove = js.Function2[
    /* e */ (MouseEvent[Element, NativeMouseEvent]) | TouchEvent[Element], 
    /* valueIndex */ Double, 
    Unit
  ]
}

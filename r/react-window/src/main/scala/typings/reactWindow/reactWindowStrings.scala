package typings.reactWindow

import typings.reactWindow.mod.Align
import typings.reactWindow.mod.CSSDirection
import typings.reactWindow.mod.Direction
import typings.reactWindow.mod.Layout
import typings.reactWindow.mod.ScrollDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactWindowStrings {
  
  @js.native
  sealed trait auto
    extends StObject
       with Align
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait backward
    extends StObject
       with ScrollDirection
  inline def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait center
    extends StObject
       with Align
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait end
    extends StObject
       with Align
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait forward
    extends StObject
       with ScrollDirection
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with Direction
       with Layout
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait ltr
    extends StObject
       with CSSDirection
  inline def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait rtl
    extends StObject
       with CSSDirection
  inline def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait smart
    extends StObject
       with Align
  inline def smart: smart = "smart".asInstanceOf[smart]
  
  @js.native
  sealed trait start
    extends StObject
       with Align
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait vertical
    extends StObject
       with Direction
       with Layout
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}

package typings.reactImageMagnifiers

import typings.reactImageMagnifiers.mod.MouseActivation
import typings.reactImageMagnifiers.mod.TouchActivation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactImageMagnifiersStrings {
  
  @js.native
  sealed trait bottom extends StObject
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait click
    extends StObject
       with MouseActivation
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait doubleClick
    extends StObject
       with MouseActivation
  inline def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  
  @js.native
  sealed trait doubleTap
    extends StObject
       with TouchActivation
  inline def doubleTap: doubleTap = "doubleTap".asInstanceOf[doubleTap]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait longTouch
    extends StObject
       with TouchActivation
  inline def longTouch: longTouch = "longTouch".asInstanceOf[longTouch]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait tap
    extends StObject
       with TouchActivation
  inline def tap: tap = "tap".asInstanceOf[tap]
  
  @js.native
  sealed trait top extends StObject
  inline def top: top = "top".asInstanceOf[top]
}

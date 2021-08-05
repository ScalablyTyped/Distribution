package typings.reactPortalTooltip

import typings.reactPortalTooltip.cardMod.Card.Position
import typings.reactPortalTooltip.cardMod.Card._Align
import typings.reactPortalTooltip.cardMod.Card._Arrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactPortalTooltipStrings {
  
  @js.native
  sealed trait bottom
    extends StObject
       with Position
       with _Arrow
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait center
    extends StObject
       with _Align
       with _Arrow
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait left
    extends StObject
       with Position
       with _Align
       with _Arrow
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait right
    extends StObject
       with Position
       with _Align
       with _Arrow
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait top
    extends StObject
       with Position
       with _Arrow
  inline def top: top = "top".asInstanceOf[top]
}

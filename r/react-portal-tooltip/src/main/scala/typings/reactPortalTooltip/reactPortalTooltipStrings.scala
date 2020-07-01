package typings.reactPortalTooltip

import typings.reactPortalTooltip.cardMod.Card.Position
import typings.reactPortalTooltip.cardMod.Card._Align
import typings.reactPortalTooltip.cardMod.Card._Arrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactPortalTooltipStrings {
  @js.native
  sealed trait bottom
    extends Position
       with _Arrow
  
  @js.native
  sealed trait center
    extends _Align
       with _Arrow
  
  @js.native
  sealed trait left
    extends Position
       with _Align
       with _Arrow
  
  @js.native
  sealed trait right
    extends Position
       with _Align
       with _Arrow
  
  @js.native
  sealed trait top
    extends Position
       with _Arrow
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}


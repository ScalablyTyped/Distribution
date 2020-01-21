package typings.rcTooltip

import typings.rcTooltip.mod.RCTooltip.Placement
import typings.rcTooltip.mod.RCTooltip.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTooltipStrings {
  @js.native
  sealed trait bottom extends Placement
  
  @js.native
  sealed trait bottomLeft extends Placement
  
  @js.native
  sealed trait bottomRight extends Placement
  
  @js.native
  sealed trait click extends Trigger
  
  @js.native
  sealed trait focus extends Trigger
  
  @js.native
  sealed trait hover extends Trigger
  
  @js.native
  sealed trait left extends Placement
  
  @js.native
  sealed trait right extends Placement
  
  @js.native
  sealed trait top extends Placement
  
  @js.native
  sealed trait topLeft extends Placement
  
  @js.native
  sealed trait topRight extends Placement
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def bottomLeft: bottomLeft = "bottomLeft".asInstanceOf[bottomLeft]
  @scala.inline
  def bottomRight: bottomRight = "bottomRight".asInstanceOf[bottomRight]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  @scala.inline
  def hover: hover = "hover".asInstanceOf[hover]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def topLeft: topLeft = "topLeft".asInstanceOf[topLeft]
  @scala.inline
  def topRight: topRight = "topRight".asInstanceOf[topRight]
}


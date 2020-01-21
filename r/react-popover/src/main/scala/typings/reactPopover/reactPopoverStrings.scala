package typings.reactPopover

import typings.reactPopover.mod.PopoverPlace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactPopoverStrings {
  @js.native
  sealed trait above extends PopoverPlace
  
  @js.native
  sealed trait below extends PopoverPlace
  
  @js.native
  sealed trait column extends PopoverPlace
  
  @js.native
  sealed trait end extends PopoverPlace
  
  @js.native
  sealed trait left extends PopoverPlace
  
  @js.native
  sealed trait right extends PopoverPlace
  
  @js.native
  sealed trait row extends PopoverPlace
  
  @js.native
  sealed trait start extends PopoverPlace
  
  @scala.inline
  def above: above = "above".asInstanceOf[above]
  @scala.inline
  def below: below = "below".asInstanceOf[below]
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}


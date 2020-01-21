package typings.snazzyInfoWindow

import typings.snazzyInfoWindow.mod.PlacementOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object snazzyInfoWindowStrings {
  @js.native
  sealed trait bottom extends PlacementOptions
  
  @js.native
  sealed trait left extends PlacementOptions
  
  @js.native
  sealed trait right extends PlacementOptions
  
  @js.native
  sealed trait top extends PlacementOptions
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}


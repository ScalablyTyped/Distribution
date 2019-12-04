package typings.rcDashDrawer

import typings.rcDashDrawer.libIDrawerPropTypesMod.IPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDashDrawerStrings {
  @js.native
  sealed trait bottom extends IPlacement
  
  @js.native
  sealed trait left extends IPlacement
  
  @js.native
  sealed trait right extends IPlacement
  
  @js.native
  sealed trait top extends IPlacement
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}


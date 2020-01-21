package typings.reduxDevtoolsDockMonitor

import typings.reduxDevtoolsDockMonitor.mod.DockPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxDevtoolsDockMonitorStrings {
  @js.native
  sealed trait bottom extends DockPosition
  
  @js.native
  sealed trait left extends DockPosition
  
  @js.native
  sealed trait right extends DockPosition
  
  @js.native
  sealed trait top extends DockPosition
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}


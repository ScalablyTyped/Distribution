package typings
package reactDashNativeDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashTabDashViewLibStrings {
  @js.native
  sealed trait bottom extends js.Object
  
  @js.native
  sealed trait dragging
    extends reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.PageScrollState
  
  @js.native
  sealed trait idle
    extends reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.PageScrollState
  
  @js.native
  sealed trait position
    extends reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SubscriptionName
  
  @js.native
  sealed trait reset
    extends reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.SubscriptionName
  
  @js.native
  sealed trait settling
    extends reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.PageScrollState
  
  @js.native
  sealed trait top extends js.Object
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def dragging: dragging = "dragging".asInstanceOf[dragging]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  @scala.inline
  def position: position = "position".asInstanceOf[position]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def settling: settling = "settling".asInstanceOf[settling]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}


package typings.reactDashStickyDashBox

import typings.reactDashStickyDashBox.reactDashStickyDashBoxMod.StickyBoxMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashStickyDashBoxStrings {
  @js.native
  sealed trait relative extends StickyBoxMode
  
  @js.native
  sealed trait stickyBottom extends StickyBoxMode
  
  @js.native
  sealed trait stickyTop extends StickyBoxMode
  
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  @scala.inline
  def stickyBottom: stickyBottom = "stickyBottom".asInstanceOf[stickyBottom]
  @scala.inline
  def stickyTop: stickyTop = "stickyTop".asInstanceOf[stickyTop]
}


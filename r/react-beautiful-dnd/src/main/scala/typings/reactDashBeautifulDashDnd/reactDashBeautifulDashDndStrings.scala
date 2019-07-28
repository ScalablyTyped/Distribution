package typings.reactDashBeautifulDashDnd

import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DropReason
import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.MovementMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashBeautifulDashDndStrings {
  @js.native
  sealed trait CANCEL extends DropReason
  
  @js.native
  sealed trait DROP extends DropReason
  
  @js.native
  sealed trait FLUID extends MovementMode
  
  @js.native
  sealed trait SNAP extends MovementMode
  
  @js.native
  sealed trait `border-box` extends js.Object
  
  @js.native
  sealed trait fixed extends js.Object
  
  @js.native
  sealed trait horizontal extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait vertical extends js.Object
  
  @scala.inline
  def CANCEL: CANCEL = "CANCEL".asInstanceOf[CANCEL]
  @scala.inline
  def DROP: DROP = "DROP".asInstanceOf[DROP]
  @scala.inline
  def FLUID: FLUID = "FLUID".asInstanceOf[FLUID]
  @scala.inline
  def SNAP: SNAP = "SNAP".asInstanceOf[SNAP]
  @scala.inline
  def `border-box`: `border-box` = "border-box".asInstanceOf[`border-box`]
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}


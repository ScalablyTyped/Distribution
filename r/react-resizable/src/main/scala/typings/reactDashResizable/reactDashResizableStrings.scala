package typings.reactDashResizable

import typings.reactDashResizable.reactDashResizableMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashResizableStrings {
  @js.native
  sealed trait both extends Axis
  
  @js.native
  sealed trait none extends Axis
  
  @js.native
  sealed trait x extends Axis
  
  @js.native
  sealed trait y extends Axis
  
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}


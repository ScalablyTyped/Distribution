package typings.reactDashPointable

import typings.reactDashPointable.reactDashPointableMod.TouchAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashPointableStrings {
  @js.native
  sealed trait auto extends TouchAction
  
  @js.native
  sealed trait div extends js.Object
  
  @js.native
  sealed trait manipulation extends TouchAction
  
  @js.native
  sealed trait none extends TouchAction
  
  @js.native
  sealed trait `pan-x` extends TouchAction
  
  @js.native
  sealed trait `pan-y` extends TouchAction
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def div: div = "div".asInstanceOf[div]
  @scala.inline
  def manipulation: manipulation = "manipulation".asInstanceOf[manipulation]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `pan-x`: `pan-x` = "pan-x".asInstanceOf[`pan-x`]
  @scala.inline
  def `pan-y`: `pan-y` = "pan-y".asInstanceOf[`pan-y`]
}


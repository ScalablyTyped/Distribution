package typings.reactour

import typings.reactour.reactourMod.ReactourStepPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactourStrings {
  @js.native
  sealed trait bottom extends ReactourStepPosition
  
  @js.native
  sealed trait center extends ReactourStepPosition
  
  @js.native
  sealed trait div extends js.Object
  
  @js.native
  sealed trait esc extends js.Object
  
  @js.native
  sealed trait left extends ReactourStepPosition
  
  @js.native
  sealed trait nav extends js.Object
  
  @js.native
  sealed trait right extends ReactourStepPosition
  
  @js.native
  sealed trait top extends ReactourStepPosition
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def div: div = "div".asInstanceOf[div]
  @scala.inline
  def esc: esc = "esc".asInstanceOf[esc]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def nav: nav = "nav".asInstanceOf[nav]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}


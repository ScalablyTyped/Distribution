package typings.reactMdStates

import typings.reactMdStates.typesMod.RippleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactMdStatesStrings {
  @js.native
  sealed trait currentTarget extends js.Object
  
  @js.native
  sealed trait keyboard extends RippleType
  
  @js.native
  sealed trait mouse extends RippleType
  
  @js.native
  sealed trait programmatic extends RippleType
  
  @js.native
  sealed trait target extends js.Object
  
  @js.native
  sealed trait touch extends RippleType
  
  @scala.inline
  def currentTarget: currentTarget = "currentTarget".asInstanceOf[currentTarget]
  @scala.inline
  def keyboard: keyboard = "keyboard".asInstanceOf[keyboard]
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  @scala.inline
  def programmatic: programmatic = "programmatic".asInstanceOf[programmatic]
  @scala.inline
  def target: target = "target".asInstanceOf[target]
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
}


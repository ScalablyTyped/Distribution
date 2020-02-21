package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pubnubStrings {
  @js.native
  sealed trait development extends js.Object
  
  @js.native
  sealed trait join extends js.Object
  
  @js.native
  sealed trait leave extends js.Object
  
  @js.native
  sealed trait production extends js.Object
  
  @js.native
  sealed trait `state-change` extends js.Object
  
  @js.native
  sealed trait timeout extends js.Object
  
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  @scala.inline
  def join: join = "join".asInstanceOf[join]
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  @scala.inline
  def production: production = "production".asInstanceOf[production]
  @scala.inline
  def `state-change`: `state-change` = "state-change".asInstanceOf[`state-change`]
  @scala.inline
  def timeout: timeout = "timeout".asInstanceOf[timeout]
}


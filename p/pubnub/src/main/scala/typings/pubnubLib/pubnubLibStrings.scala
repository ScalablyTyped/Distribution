package typings
package pubnubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pubnubLibStrings {
  @js.native
  sealed trait join extends js.Object
  
  @js.native
  sealed trait leave extends js.Object
  
  @js.native
  sealed trait `state-change` extends js.Object
  
  @js.native
  sealed trait timeout extends js.Object
  
  def join: join = "join".asInstanceOf[join]
  def leave: leave = "leave".asInstanceOf[leave]
  def `state-change`: `state-change` = "state-change".asInstanceOf[`state-change`]
  def timeout: timeout = "timeout".asInstanceOf[timeout]
}


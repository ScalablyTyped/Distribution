package typings.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ractiveStrings {
  @js.native
  sealed trait fast extends js.Object
  
  @js.native
  sealed trait slow extends js.Object
  
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  @scala.inline
  def slow: slow = "slow".asInstanceOf[slow]
}


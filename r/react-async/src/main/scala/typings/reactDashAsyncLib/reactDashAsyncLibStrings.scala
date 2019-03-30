package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashAsyncLibStrings {
  @js.native
  sealed trait fulfilled extends js.Object
  
  @js.native
  sealed trait initial extends js.Object
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait rejected extends js.Object
  
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  @scala.inline
  def initial: initial = "initial".asInstanceOf[initial]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
}


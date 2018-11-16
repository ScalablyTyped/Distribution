package typings
package qLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object qLibStrings {
  @js.native
  sealed trait fulfilled extends js.Object
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait rejected extends js.Object
  
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  def pending: pending = "pending".asInstanceOf[pending]
  def rejected: rejected = "rejected".asInstanceOf[rejected]
}


package typings.schwifty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object schwiftyStrings {
  @js.native
  sealed trait latest extends js.Object
  
  @js.native
  sealed trait rollback extends js.Object
  
  @scala.inline
  def latest: latest = "latest".asInstanceOf[latest]
  @scala.inline
  def rollback: rollback = "rollback".asInstanceOf[rollback]
}


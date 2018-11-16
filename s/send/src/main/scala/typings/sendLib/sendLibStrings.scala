package typings
package sendLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sendLibStrings {
  @js.native
  sealed trait allow extends js.Object
  
  @js.native
  sealed trait deny extends js.Object
  
  @js.native
  sealed trait ignore extends js.Object
  
  def allow: allow = "allow".asInstanceOf[allow]
  def deny: deny = "deny".asInstanceOf[deny]
  def ignore: ignore = "ignore".asInstanceOf[ignore]
}


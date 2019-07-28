package typings.send

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sendStrings {
  @js.native
  sealed trait allow extends js.Object
  
  @js.native
  sealed trait deny extends js.Object
  
  @js.native
  sealed trait ignore extends js.Object
  
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  @scala.inline
  def deny: deny = "deny".asInstanceOf[deny]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
}


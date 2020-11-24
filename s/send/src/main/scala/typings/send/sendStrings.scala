package typings.send

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendStrings {
  
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  
  @scala.inline
  def deny: deny = "deny".asInstanceOf[deny]
  
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait allow extends js.Object
  
  @js.native
  sealed trait deny extends js.Object
  
  @js.native
  sealed trait ignore extends js.Object
}

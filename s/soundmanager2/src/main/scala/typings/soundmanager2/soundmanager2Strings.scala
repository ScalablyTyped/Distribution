package typings.soundmanager2

import typings.soundmanager2.soundmanager.ScriptAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object soundmanager2Strings {
  @js.native
  sealed trait always extends ScriptAccess
  
  @js.native
  sealed trait sameDomain extends ScriptAccess
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def sameDomain: sameDomain = "sameDomain".asInstanceOf[sameDomain]
}


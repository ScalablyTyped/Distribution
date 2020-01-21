package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "PublishContext")
@js.native
class PublishContext protected ()
  extends typings.sipJs.publishContextMod.PublishContext {
  def this(ua: typings.sipJs.uAMod.UA, target: String, event: String) = this()
  def this(ua: typings.sipJs.uAMod.UA, target: typings.sipJs.coreMod.URI, event: String) = this()
  def this(ua: typings.sipJs.uAMod.UA, target: String, event: String, options: js.Any) = this()
  def this(ua: typings.sipJs.uAMod.UA, target: typings.sipJs.coreMod.URI, event: String, options: js.Any) = this()
}


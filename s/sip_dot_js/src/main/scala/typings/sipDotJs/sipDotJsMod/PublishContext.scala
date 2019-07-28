package typings.sipDotJs.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "PublishContext")
@js.native
class PublishContext protected ()
  extends typings.sipDotJs.libPublishContextMod.PublishContext {
  def this(ua: typings.sipDotJs.libUAMod.UA, target: String, event: String) = this()
  def this(ua: typings.sipDotJs.libUAMod.UA, target: typings.sipDotJs.libCoreMod.URI, event: String) = this()
  def this(ua: typings.sipDotJs.libUAMod.UA, target: String, event: String, options: js.Any) = this()
  def this(
    ua: typings.sipDotJs.libUAMod.UA,
    target: typings.sipDotJs.libCoreMod.URI,
    event: String,
    options: js.Any
  ) = this()
}


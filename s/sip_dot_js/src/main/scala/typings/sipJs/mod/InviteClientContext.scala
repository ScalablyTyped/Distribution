package typings.sipJs.mod

import typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipJs.libSessionMod.InviteClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "InviteClientContext")
@js.native
class InviteClientContext protected ()
  extends typings.sipJs.libSessionMod.InviteClientContext {
  def this(ua: typings.sipJs.uAMod.UA, target: String) = this()
  def this(ua: typings.sipJs.uAMod.UA, target: typings.sipJs.coreMod.URI) = this()
  def this(ua: typings.sipJs.uAMod.UA, target: String, options: Options) = this()
  def this(ua: typings.sipJs.uAMod.UA, target: typings.sipJs.coreMod.URI, options: Options) = this()
  def this(
    ua: typings.sipJs.uAMod.UA,
    target: String,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
  def this(
    ua: typings.sipJs.uAMod.UA,
    target: typings.sipJs.coreMod.URI,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
}


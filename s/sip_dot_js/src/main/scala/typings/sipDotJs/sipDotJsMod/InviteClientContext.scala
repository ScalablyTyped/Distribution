package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipDotJs.libSessionMod.InviteClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "InviteClientContext")
@js.native
class InviteClientContext protected ()
  extends typings.sipDotJs.libSessionMod.InviteClientContext {
  def this(ua: typings.sipDotJs.libUAMod.UA, target: String) = this()
  def this(ua: typings.sipDotJs.libUAMod.UA, target: typings.sipDotJs.libCoreMod.URI) = this()
  def this(ua: typings.sipDotJs.libUAMod.UA, target: String, options: Options) = this()
  def this(ua: typings.sipDotJs.libUAMod.UA, target: typings.sipDotJs.libCoreMod.URI, options: Options) = this()
  def this(
    ua: typings.sipDotJs.libUAMod.UA,
    target: String,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
  def this(
    ua: typings.sipDotJs.libUAMod.UA,
    target: typings.sipDotJs.libCoreMod.URI,
    options: Options,
    modifiers: SessionDescriptionHandlerModifiers
  ) = this()
}


package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.libClientContextMod.ClientContextNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ClientContext")
@js.native
class ClientContext protected ()
  extends typings.sipDotJs.libClientContextMod.ClientContext {
  def this(ua: typings.sipDotJs.libUAMod.UA, method: String, target: String) = this()
  def this(ua: typings.sipDotJs.libUAMod.UA, method: String, target: typings.sipDotJs.libCoreMod.URI) = this()
  def this(ua: typings.sipDotJs.libUAMod.UA, method: String, target: String, options: Options) = this()
  def this(
    ua: typings.sipDotJs.libUAMod.UA,
    method: String,
    target: typings.sipDotJs.libCoreMod.URI,
    options: Options
  ) = this()
}

/* static members */
@JSImport("sip.js", "ClientContext")
@js.native
object ClientContext extends js.Object {
  def initializer(
    objToConstruct: typings.sipDotJs.libClientContextMod.ClientContext,
    ua: typings.sipDotJs.libUAMod.UA,
    method: String,
    originalTarget: String
  ): Unit = js.native
  def initializer(
    objToConstruct: typings.sipDotJs.libClientContextMod.ClientContext,
    ua: typings.sipDotJs.libUAMod.UA,
    method: String,
    originalTarget: String,
    options: Options
  ): Unit = js.native
  def initializer(
    objToConstruct: typings.sipDotJs.libClientContextMod.ClientContext,
    ua: typings.sipDotJs.libUAMod.UA,
    method: String,
    originalTarget: typings.sipDotJs.libCoreMod.URI
  ): Unit = js.native
  def initializer(
    objToConstruct: typings.sipDotJs.libClientContextMod.ClientContext,
    ua: typings.sipDotJs.libUAMod.UA,
    method: String,
    originalTarget: typings.sipDotJs.libCoreMod.URI,
    options: Options
  ): Unit = js.native
}


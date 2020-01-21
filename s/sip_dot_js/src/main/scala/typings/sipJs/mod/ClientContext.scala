package typings.sipJs.mod

import typings.sipJs.clientContextMod.ClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ClientContext")
@js.native
class ClientContext protected ()
  extends typings.sipJs.clientContextMod.ClientContext {
  def this(ua: typings.sipJs.uAMod.UA, method: String, target: String) = this()
  def this(ua: typings.sipJs.uAMod.UA, method: String, target: typings.sipJs.coreMod.URI) = this()
  def this(ua: typings.sipJs.uAMod.UA, method: String, target: String, options: Options) = this()
  def this(ua: typings.sipJs.uAMod.UA, method: String, target: typings.sipJs.coreMod.URI, options: Options) = this()
}

/* static members */
@JSImport("sip.js", "ClientContext")
@js.native
object ClientContext extends js.Object {
  def initializer(
    objToConstruct: typings.sipJs.clientContextMod.ClientContext,
    ua: typings.sipJs.uAMod.UA,
    method: String,
    originalTarget: String
  ): Unit = js.native
  def initializer(
    objToConstruct: typings.sipJs.clientContextMod.ClientContext,
    ua: typings.sipJs.uAMod.UA,
    method: String,
    originalTarget: String,
    options: Options
  ): Unit = js.native
  def initializer(
    objToConstruct: typings.sipJs.clientContextMod.ClientContext,
    ua: typings.sipJs.uAMod.UA,
    method: String,
    originalTarget: typings.sipJs.coreMod.URI
  ): Unit = js.native
  def initializer(
    objToConstruct: typings.sipJs.clientContextMod.ClientContext,
    ua: typings.sipJs.uAMod.UA,
    method: String,
    originalTarget: typings.sipJs.coreMod.URI,
    options: Options
  ): Unit = js.native
}


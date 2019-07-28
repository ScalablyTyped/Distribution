package typings.stompit.libConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/connect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(optionsOrPath: ConnectOptions | String): typings.stompit.libClientMod.^ = js.native
  def apply(
    optionsOrPath: ConnectOptions | String,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.libClientMod.^, Unit]
  ): typings.stompit.libClientMod.^ = js.native
  def apply(port: Double): typings.stompit.libClientMod.^ = js.native
  def apply(port: Double, host: String): typings.stompit.libClientMod.^ = js.native
  def apply(
    port: Double,
    host: String,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.libClientMod.^, Unit]
  ): typings.stompit.libClientMod.^ = js.native
}


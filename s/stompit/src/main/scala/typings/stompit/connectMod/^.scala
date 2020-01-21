package typings.stompit.connectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit/lib/connect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(optionsOrPath: String): typings.stompit.clientMod.^ = js.native
  def apply(
    optionsOrPath: String,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.clientMod.^, Unit]
  ): typings.stompit.clientMod.^ = js.native
  def apply(optionsOrPath: ConnectOptions): typings.stompit.clientMod.^ = js.native
  def apply(
    optionsOrPath: ConnectOptions,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.clientMod.^, Unit]
  ): typings.stompit.clientMod.^ = js.native
  def apply(port: Double): typings.stompit.clientMod.^ = js.native
  def apply(port: Double, host: String): typings.stompit.clientMod.^ = js.native
  def apply(
    port: Double,
    host: String,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.clientMod.^, Unit]
  ): typings.stompit.clientMod.^ = js.native
}


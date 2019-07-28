package typings.stompit.stompitMod

import typings.std.Error
import typings.stompit.libConnectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(optionsOrPath: String): typings.stompit.libClientMod.^ = js.native
  def connect(
    optionsOrPath: String,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.libClientMod.^, Unit]
  ): typings.stompit.libClientMod.^ = js.native
  def connect(optionsOrPath: ConnectOptions): typings.stompit.libClientMod.^ = js.native
  def connect(
    optionsOrPath: ConnectOptions,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.libClientMod.^, Unit]
  ): typings.stompit.libClientMod.^ = js.native
  def connect(port: Double): typings.stompit.libClientMod.^ = js.native
  def connect(port: Double, host: String): typings.stompit.libClientMod.^ = js.native
  def connect(
    port: Double,
    host: String,
    connectionListener: js.Function2[/* err */ Error | Null, /* client */ typings.stompit.libClientMod.^, Unit]
  ): typings.stompit.libClientMod.^ = js.native
}


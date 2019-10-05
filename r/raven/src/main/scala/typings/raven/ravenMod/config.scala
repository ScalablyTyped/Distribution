package typings.raven.ravenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "config")
@js.native
object config extends js.Object {
  def apply(): Client = js.native
  def apply(dsn: String): Client = js.native
  def apply(dsn: String, options: ConstructorOptions): Client = js.native
  def apply(options: ConstructorOptions): Client = js.native
}


package typings.scrypt.scryptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", "paramsSync")
@js.native
object paramsSync extends js.Object {
  def apply(maxtime: Double): Params = js.native
  def apply(maxtime: Double, maxmem: Double): Params = js.native
  def apply(maxtime: Double, maxmem: Double, maxmemfrac: Double): Params = js.native
}


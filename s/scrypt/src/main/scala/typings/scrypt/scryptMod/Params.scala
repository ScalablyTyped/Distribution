package typings.scrypt.scryptMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var N: Double
  var p: Double
  var r: Double
}

object Params {
  @scala.inline
  def apply(N: Double, p: Double, r: Double): Params = {
    val __obj = js.Dynamic.literal(N = N, p = p, r = r)
  
    __obj.asInstanceOf[Params]
  }
}

@JSImport("scrypt", "params")
@js.native
object params extends js.Object {
  def apply(maxtime: Double): js.Promise[Params] = js.native
  def apply(maxtime: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params, Unit]): Unit = js.native
  def apply(maxtime: Double, maxmem: Double): js.Promise[Params] = js.native
  def apply(maxtime: Double, maxmem: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params, Unit]): Unit = js.native
  def apply(maxtime: Double, maxmem: Double, maxmemfrac: Double): js.Promise[Params] = js.native
  def apply(
    maxtime: Double,
    maxmem: Double,
    maxmemfrac: Double,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Params, Unit]
  ): Unit = js.native
}


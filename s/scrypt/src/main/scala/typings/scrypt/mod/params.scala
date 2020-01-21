package typings.scrypt.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", "params")
@js.native
object params extends js.Object {
  def apply(maxtime: Double): js.Promise[Params_] = js.native
  def apply(maxtime: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params_, Unit]): Unit = js.native
  def apply(maxtime: Double, maxmem: Double): js.Promise[Params_] = js.native
  def apply(maxtime: Double, maxmem: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params_, Unit]): Unit = js.native
  def apply(maxtime: Double, maxmem: Double, maxmemfrac: Double): js.Promise[Params_] = js.native
  def apply(
    maxtime: Double,
    maxmem: Double,
    maxmemfrac: Double,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Params_, Unit]
  ): Unit = js.native
}


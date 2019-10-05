package typings.scrypt.scryptMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", "kdf")
@js.native
object kdf extends js.Object {
  def apply(key: String, paramsObject: Params): js.Promise[Buffer] = js.native
  def apply(
    key: String,
    paramsObject: Params,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def apply(key: Buffer, paramsObject: Params): js.Promise[Buffer] = js.native
  def apply(
    key: Buffer,
    paramsObject: Params,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
}


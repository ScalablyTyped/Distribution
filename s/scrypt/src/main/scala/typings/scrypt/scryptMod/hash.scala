package typings.scrypt.scryptMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", "hash")
@js.native
object hash extends js.Object {
  def apply(key: String, params: Params, outputLength: Double, salt: String): js.Promise[Buffer] = js.native
  def apply(
    key: String,
    params: Params,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def apply(key: String, params: Params, outputLength: Double, salt: Buffer): js.Promise[Buffer] = js.native
  def apply(
    key: String,
    params: Params,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def apply(key: Buffer, params: Params, outputLength: Double, salt: String): js.Promise[Buffer] = js.native
  def apply(
    key: Buffer,
    params: Params,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def apply(key: Buffer, params: Params, outputLength: Double, salt: Buffer): js.Promise[Buffer] = js.native
  def apply(
    key: Buffer,
    params: Params,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
}


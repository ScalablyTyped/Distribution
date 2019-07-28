package typings.scrypt.scryptMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hash(key: String, params: Params, outputLength: Double, salt: String): js.Promise[Buffer] = js.native
  def hash(
    key: String,
    params: Params,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def hash(key: String, params: Params, outputLength: Double, salt: Buffer): js.Promise[Buffer] = js.native
  def hash(
    key: String,
    params: Params,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def hash(key: Buffer, params: Params, outputLength: Double, salt: String): js.Promise[Buffer] = js.native
  def hash(
    key: Buffer,
    params: Params,
    outputLength: Double,
    salt: String,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def hash(key: Buffer, params: Params, outputLength: Double, salt: Buffer): js.Promise[Buffer] = js.native
  def hash(
    key: Buffer,
    params: Params,
    outputLength: Double,
    salt: Buffer,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def hashSync(key: String, params: Params, outputLength: Double, salt: String): Buffer = js.native
  def hashSync(key: String, params: Params, outputLength: Double, salt: Buffer): Buffer = js.native
  def hashSync(key: Buffer, params: Params, outputLength: Double, salt: String): Buffer = js.native
  def hashSync(key: Buffer, params: Params, outputLength: Double, salt: Buffer): Buffer = js.native
  def kdf(key: String, paramsObject: Params): js.Promise[Buffer] = js.native
  def kdf(
    key: String,
    paramsObject: Params,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def kdf(key: Buffer, paramsObject: Params): js.Promise[Buffer] = js.native
  def kdf(
    key: Buffer,
    paramsObject: Params,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def kdfSync(key: String, paramsObject: Params): Buffer = js.native
  def kdfSync(key: Buffer, paramsObject: Params): Buffer = js.native
  def params(maxtime: Double): js.Promise[Params] = js.native
  def params(maxtime: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params, Unit]): Unit = js.native
  def params(maxtime: Double, maxmem: Double): js.Promise[Params] = js.native
  def params(maxtime: Double, maxmem: Double, cb: js.Function2[/* err */ Error | Null, /* obj */ Params, Unit]): Unit = js.native
  def params(maxtime: Double, maxmem: Double, maxmemfrac: Double): js.Promise[Params] = js.native
  def params(
    maxtime: Double,
    maxmem: Double,
    maxmemfrac: Double,
    cb: js.Function2[/* err */ Error | Null, /* obj */ Params, Unit]
  ): Unit = js.native
  def paramsSync(maxtime: Double): Params = js.native
  def paramsSync(maxtime: Double, maxmem: Double): Params = js.native
  def paramsSync(maxtime: Double, maxmem: Double, maxmemfrac: Double): Params = js.native
  def verifyKdf(kdf: Buffer, key: String): js.Promise[Boolean] = js.native
  def verifyKdf(kdf: Buffer, key: String, cb: js.Function2[/* err */ Error | Null, /* obj */ Boolean, Unit]): Unit = js.native
  def verifyKdf(kdf: Buffer, key: Buffer): js.Promise[Boolean] = js.native
  def verifyKdf(kdf: Buffer, key: Buffer, cb: js.Function2[/* err */ Error | Null, /* obj */ Boolean, Unit]): Unit = js.native
  def verifyKdfSync(kdf: Buffer, key: String): Boolean = js.native
  def verifyKdfSync(kdf: Buffer, key: Buffer): Boolean = js.native
}


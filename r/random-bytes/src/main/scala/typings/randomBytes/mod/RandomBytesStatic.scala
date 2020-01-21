package typings.randomBytes.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomBytesStatic extends js.Object {
  /**
    * Generates strong pseudo-random bytes.
    * @param size - Number of bytes to generate.
    */
  def apply(size: Double): js.Promise[Buffer] = js.native
  /**
    * Generates strong pseudo-random bytes.
    * @param size - Number of bytes to generate.
    * @param callback - Asynchronous callback function.
    */
  def apply(size: Double, callback: js.Function2[/* error */ Error, /* bytes */ Buffer, Unit]): Unit = js.native
  /**
    * Synchronously generates strong pseudo-random bytes.
    * @param size - Number of bytes to generate.
    */
  def sync(size: Double): Buffer = js.native
}


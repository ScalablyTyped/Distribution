package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoHashSha512Wrap extends js.Object {
  /**
    * Finalize the instance.
    *
    * * `output` should be a buffer of length `crypto_hash_sha512_BYTES`.
    *
    * The generated hash is stored in `output`.
    */
  def `final`(output: Buffer): Unit
  /**
    * Update the instance with a new piece of data.
    *
    * * `input` should be a buffer of any size.
    */
  def update(input: Buffer): Unit
}

object CryptoHashSha512Wrap {
  @scala.inline
  def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoHashSha512Wrap = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
    __obj.asInstanceOf[CryptoHashSha512Wrap]
  }
}


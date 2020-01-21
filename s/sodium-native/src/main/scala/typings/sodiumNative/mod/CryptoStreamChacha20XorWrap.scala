package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoStreamChacha20XorWrap extends js.Object {
  /**
    * Finalize the stream. Zeros out internal state.
    */
  def `final`(): Unit
  /**
    * Encrypt the next message
    */
  def update(ciphertext: Buffer, message: Buffer): Unit
}

object CryptoStreamChacha20XorWrap {
  @scala.inline
  def apply(`final`: () => Unit, update: (Buffer, Buffer) => Unit): CryptoStreamChacha20XorWrap = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
    __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
    __obj.asInstanceOf[CryptoStreamChacha20XorWrap]
  }
}


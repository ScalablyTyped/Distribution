package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoOneTimeAuthWrap extends js.Object {
  /**
    * Finalize the instance.
    *
    * * `output` should be a buffer of length `crypto_onetimeauth_BYTES`.
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

object CryptoOneTimeAuthWrap {
  @scala.inline
  def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoOneTimeAuthWrap = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
    __obj.asInstanceOf[CryptoOneTimeAuthWrap]
  }
}


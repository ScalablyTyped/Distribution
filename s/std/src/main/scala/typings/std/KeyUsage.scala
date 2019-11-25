package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.encrypt
  - typings.std.stdStrings.decrypt
  - typings.std.stdStrings.sign
  - typings.std.stdStrings.verify
  - typings.std.stdStrings.deriveKey
  - typings.std.stdStrings.deriveBits
  - typings.std.stdStrings.wrapKey
  - typings.std.stdStrings.unwrapKey
*/
trait KeyUsage extends js.Object

object KeyUsage {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decrypt: typings.std.stdStrings.decrypt = this.cast("decrypt")
  @scala.inline
  def deriveBits: typings.std.stdStrings.deriveBits = this.cast("deriveBits")
  @scala.inline
  def deriveKey: typings.std.stdStrings.deriveKey = this.cast("deriveKey")
  @scala.inline
  def encrypt: typings.std.stdStrings.encrypt = this.cast("encrypt")
  @scala.inline
  def sign: typings.std.stdStrings.sign = this.cast("sign")
  @scala.inline
  def unwrapKey: typings.std.stdStrings.unwrapKey = this.cast("unwrapKey")
  @scala.inline
  def verify: typings.std.stdStrings.verify = this.cast("verify")
  @scala.inline
  def wrapKey: typings.std.stdStrings.wrapKey = this.cast("wrapKey")
}


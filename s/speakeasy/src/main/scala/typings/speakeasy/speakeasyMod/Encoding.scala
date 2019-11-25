package typings.speakeasy.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.speakeasy.speakeasyStrings.ascii
  - typings.speakeasy.speakeasyStrings.hex
  - typings.speakeasy.speakeasyStrings.base32
  - typings.speakeasy.speakeasyStrings.base64
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typings.speakeasy.speakeasyStrings.ascii = this.cast("ascii")
  @scala.inline
  def base32: typings.speakeasy.speakeasyStrings.base32 = this.cast("base32")
  @scala.inline
  def base64: typings.speakeasy.speakeasyStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.speakeasy.speakeasyStrings.hex = this.cast("hex")
}


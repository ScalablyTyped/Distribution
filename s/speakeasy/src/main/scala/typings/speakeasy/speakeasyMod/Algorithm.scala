package typings.speakeasy.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.speakeasy.speakeasyStrings.sha1
  - typings.speakeasy.speakeasyStrings.sha256
  - typings.speakeasy.speakeasyStrings.sha512
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sha1: typings.speakeasy.speakeasyStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typings.speakeasy.speakeasyStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha512: typings.speakeasy.speakeasyStrings.sha512 = this.cast("sha512")
}


package typings.shaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.shaJs.shaJsStrings.sha
  - typings.shaJs.shaJsStrings.sha1
  - typings.shaJs.shaJsStrings.sha224
  - typings.shaJs.shaJsStrings.sha256
  - typings.shaJs.shaJsStrings.sha384
  - typings.shaJs.shaJsStrings.sha512
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sha: typings.shaJs.shaJsStrings.sha = this.cast("sha")
  @scala.inline
  def sha1: typings.shaJs.shaJsStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typings.shaJs.shaJsStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typings.shaJs.shaJsStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typings.shaJs.shaJsStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typings.shaJs.shaJsStrings.sha512 = this.cast("sha512")
}


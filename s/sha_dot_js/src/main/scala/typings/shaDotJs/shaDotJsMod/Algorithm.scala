package typings.shaDotJs.shaDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.shaDotJs.shaDotJsStrings.sha
  - typings.shaDotJs.shaDotJsStrings.sha1
  - typings.shaDotJs.shaDotJsStrings.sha224
  - typings.shaDotJs.shaDotJsStrings.sha256
  - typings.shaDotJs.shaDotJsStrings.sha384
  - typings.shaDotJs.shaDotJsStrings.sha512
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sha: typings.shaDotJs.shaDotJsStrings.sha = this.cast("sha")
  @scala.inline
  def sha1: typings.shaDotJs.shaDotJsStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typings.shaDotJs.shaDotJsStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typings.shaDotJs.shaDotJsStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typings.shaDotJs.shaDotJsStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typings.shaDotJs.shaDotJsStrings.sha512 = this.cast("sha512")
}


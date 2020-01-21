package typings.samlp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.samlp.samlpStrings.sha1
  - typings.samlp.samlpStrings.sha256
*/
trait DigestAlgorithmType extends js.Object

object DigestAlgorithmType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sha1: typings.samlp.samlpStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typings.samlp.samlpStrings.sha256 = this.cast("sha256")
}


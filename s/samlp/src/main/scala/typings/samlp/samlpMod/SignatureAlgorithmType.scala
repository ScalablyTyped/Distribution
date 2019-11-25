package typings.samlp.samlpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.samlp.samlpStrings.`rsa-sha1`
  - typings.samlp.samlpStrings.`rsa-sha256`
*/
trait SignatureAlgorithmType extends js.Object

object SignatureAlgorithmType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `rsa-sha1`: typings.samlp.samlpStrings.`rsa-sha1` = this.cast("rsa-sha1")
  @scala.inline
  def `rsa-sha256`: typings.samlp.samlpStrings.`rsa-sha256` = this.cast("rsa-sha256")
}


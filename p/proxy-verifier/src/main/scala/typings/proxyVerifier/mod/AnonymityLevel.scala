package typings.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyVerifier.proxyVerifierStrings.transparent
  - typings.proxyVerifier.proxyVerifierStrings.anonymous
  - typings.proxyVerifier.proxyVerifierStrings.elite
*/
trait AnonymityLevel extends js.Object

object AnonymityLevel {
  @scala.inline
  def anonymous: typings.proxyVerifier.proxyVerifierStrings.anonymous = this.cast("anonymous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elite: typings.proxyVerifier.proxyVerifierStrings.elite = this.cast("elite")
  @scala.inline
  def transparent: typings.proxyVerifier.proxyVerifierStrings.transparent = this.cast("transparent")
}


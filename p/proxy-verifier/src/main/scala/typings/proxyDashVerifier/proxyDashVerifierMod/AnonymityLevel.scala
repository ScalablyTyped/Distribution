package typings.proxyDashVerifier.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyDashVerifier.proxyDashVerifierStrings.transparent
  - typings.proxyDashVerifier.proxyDashVerifierStrings.anonymous
  - typings.proxyDashVerifier.proxyDashVerifierStrings.elite
*/
trait AnonymityLevel extends js.Object

object AnonymityLevel {
  @scala.inline
  def anonymous: typings.proxyDashVerifier.proxyDashVerifierStrings.anonymous = this.cast("anonymous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elite: typings.proxyDashVerifier.proxyDashVerifierStrings.elite = this.cast("elite")
  @scala.inline
  def transparent: typings.proxyDashVerifier.proxyDashVerifierStrings.transparent = this.cast("transparent")
}


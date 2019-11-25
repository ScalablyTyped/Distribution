package typings.reactDashRelay.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashRelay.reactDashRelayStrings.`store-and-network`
  - typings.reactDashRelay.reactDashRelayStrings.`network-only`
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typings.reactDashRelay.reactDashRelayStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `store-and-network`: typings.reactDashRelay.reactDashRelayStrings.`store-and-network` = this.cast("store-and-network")
}


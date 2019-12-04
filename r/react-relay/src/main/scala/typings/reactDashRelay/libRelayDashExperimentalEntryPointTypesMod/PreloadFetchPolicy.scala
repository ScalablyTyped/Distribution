package typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashRelay.reactDashRelayStrings.`store-or-network`
  - typings.reactDashRelay.reactDashRelayStrings.`store-and-network`
  - typings.reactDashRelay.reactDashRelayStrings.`network-only`
*/
trait PreloadFetchPolicy extends js.Object

object PreloadFetchPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typings.reactDashRelay.reactDashRelayStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `store-and-network`: typings.reactDashRelay.reactDashRelayStrings.`store-and-network` = this.cast("store-and-network")
  @scala.inline
  def `store-or-network`: typings.reactDashRelay.reactDashRelayStrings.`store-or-network` = this.cast("store-or-network")
}


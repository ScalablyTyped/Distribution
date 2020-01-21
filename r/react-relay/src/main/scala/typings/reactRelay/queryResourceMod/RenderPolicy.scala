package typings.reactRelay.queryResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactRelay.reactRelayStrings.full
  - typings.reactRelay.reactRelayStrings.partial
*/
trait RenderPolicy extends js.Object

object RenderPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def full: typings.reactRelay.reactRelayStrings.full = this.cast("full")
  @scala.inline
  def partial: typings.reactRelay.reactRelayStrings.partial = this.cast("partial")
}


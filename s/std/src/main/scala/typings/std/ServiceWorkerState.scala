package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.installing
  - typings.std.stdStrings.installed
  - typings.std.stdStrings.activating
  - typings.std.stdStrings.activated
  - typings.std.stdStrings.redundant
*/
trait ServiceWorkerState extends js.Object

object ServiceWorkerState {
  @scala.inline
  def activated: typings.std.stdStrings.activated = this.cast("activated")
  @scala.inline
  def activating: typings.std.stdStrings.activating = this.cast("activating")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def installed: typings.std.stdStrings.installed = this.cast("installed")
  @scala.inline
  def installing: typings.std.stdStrings.installing = this.cast("installing")
  @scala.inline
  def redundant: typings.std.stdStrings.redundant = this.cast("redundant")
}


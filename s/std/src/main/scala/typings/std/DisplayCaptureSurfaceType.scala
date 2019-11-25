package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.monitor
  - typings.std.stdStrings.window
  - typings.std.stdStrings.application
  - typings.std.stdStrings.browser
*/
trait DisplayCaptureSurfaceType extends js.Object

object DisplayCaptureSurfaceType {
  @scala.inline
  def application: typings.std.stdStrings.application = this.cast("application")
  @scala.inline
  def browser: typings.std.stdStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def monitor: typings.std.stdStrings.monitor = this.cast("monitor")
  @scala.inline
  def window: typings.std.stdStrings.window = this.cast("window")
}


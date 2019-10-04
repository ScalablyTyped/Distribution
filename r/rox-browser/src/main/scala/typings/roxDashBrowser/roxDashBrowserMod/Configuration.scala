package typings.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-browser", "Configuration")
@js.native
class Configuration[T /* <: Double | Boolean | String */] protected () extends js.Object {
  def this(defaultValue: T) = this()
  // Default value of the Configuration
  val defaultValue: BasicType[T] = js.native
  // The name of the Configuration
  val name: String = js.native
  // Returns the current value of the Configuration, accounting for value overrides
  def getValue(): BasicType[T] = js.native
  def getValue(context: js.Any): BasicType[T] = js.native
  // Unlock the Configuration value from changes from the last time it was freezed
  def unfreeze(): Unit = js.native
}


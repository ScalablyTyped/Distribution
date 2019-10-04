package typings.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-browser", "Flag")
@js.native
class Flag () extends js.Object {
  def this(defaultValue: Boolean) = this()
  def this(defaultValue: Boolean, options: RoxFlagOptions) = this()
  // Default value of the Flag
  val defaultValue: Boolean = js.native
  // The name of the Flag
  val name: String = js.native
  // Returns true when the flag is enabled
  def isEnabled(): Boolean = js.native
  def isEnabled(context: js.Any): Boolean = js.native
  // Unlock the Flag value from changes from the last time it was freezed
  def unfreeze(): Unit = js.native
}


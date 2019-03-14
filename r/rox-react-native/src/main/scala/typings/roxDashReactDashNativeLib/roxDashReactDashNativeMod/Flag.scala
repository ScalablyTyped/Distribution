package typings
package roxDashReactDashNativeLib.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-react-native", "Flag")
@js.native
class Flag protected () extends js.Object {
  def this(defaultValue: scala.Boolean) = this()
  def this(defaultValue: scala.Boolean, options: RoxFlagOptions) = this()
  // The name of the Flag
  var name: java.lang.String = js.native
  def getNameDetails(): RoxNameDetails = js.native
  // Returns true when the flag is enabled
  def isEnabled(): scala.Boolean = js.native
  // Unlock the Flag value from changes from the last time it was freezed
  def unfreeze(): scala.Unit = js.native
}


package typings
package roxDashReactDashNativeLib.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-react-native", "Variant")
@js.native
class Variant[T /* <: java.lang.String */] protected () extends js.Object {
  def this(defaultValue: T, options: js.Array[T]) = this()
  def this(defaultValue: T, options: js.Array[T], name: java.lang.String) = this()
  // The name of the Flag
  var name: java.lang.String = js.native
  def getNameDetails(): RoxNameDetails = js.native
  // Returns the current value of the Variant, accounting for value overrides
  def getValue(): T = js.native
  // Unlock the Flag value from changes from the last time it was freezed
  def unfreeze(): scala.Unit = js.native
}


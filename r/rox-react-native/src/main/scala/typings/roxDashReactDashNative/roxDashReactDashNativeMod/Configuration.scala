package typings.roxDashReactDashNative.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-react-native", "Configuration")
@js.native
class Configuration[T /* <: String | Boolean | Double */] protected () extends js.Object {
  def this(defaultValue: T) = this()
  // The name of the Configuration
  var name: String = js.native
  // Returns the current value of the Configuration, accounting for value overrides
  def getValue(): T = js.native
  // Unlock the Configuration value from changes from the last time it was freezed
  def unfreeze(): Unit = js.native
}


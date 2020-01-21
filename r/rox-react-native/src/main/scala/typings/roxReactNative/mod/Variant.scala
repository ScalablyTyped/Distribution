package typings.roxReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-react-native", "Variant")
@js.native
class Variant[T /* <: String */] protected () extends js.Object {
  def this(defaultValue: T, options: js.Array[T]) = this()
  def this(defaultValue: T, options: js.Array[T], name: String) = this()
  // Default value of the Variant
  val defaultValue: BasicType[T] = js.native
  // The name of the Flag
  val name: String = js.native
  // Returns the current value of the Variant, accounting for value overrides
  def getValue(): BasicType[T] = js.native
  // Unlock the Flag value from changes from the last time it was freezed
  def unfreeze(): Unit = js.native
}


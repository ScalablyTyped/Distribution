package typings.roxBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rox-browser", "Variant")
@js.native
class Variant[T /* <: String */] protected () extends js.Object {
  def this(defaultValue: T, options: js.Array[T]) = this()
  def this(defaultValue: T, options: js.Array[T], name: String) = this()
  
  // Default value of the Variant
  val defaultValue: BasicType[T] = js.native
  
  // Returns the current value of the Variant, accounting for value overrides
  def getValue(): BasicType[T] = js.native
  def getValue(context: js.Any): BasicType[T] = js.native
  
  // The name of the Variant
  val name: String = js.native
  
  // Unlock the Variant value from changes from the last time it was freezed
  def unfreeze(): Unit = js.native
}

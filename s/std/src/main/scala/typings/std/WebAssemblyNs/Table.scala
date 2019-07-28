package typings.std.WebAssemblyNs

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  val length: Double = js.native
  def get(index: Double): js.Function | Null = js.native
  def grow(delta: Double): Double = js.native
  def set(index: Double): Unit = js.native
  def set(index: Double, value: js.Function): Unit = js.native
}

@JSGlobal("WebAssembly.Table")
@js.native
class TableCls protected () extends Table {
  def this(descriptor: TableDescriptor) = this()
}

@JSGlobal("WebAssembly.Table")
@js.native
object Table extends Instantiable1[/* descriptor */ TableDescriptor, Table]


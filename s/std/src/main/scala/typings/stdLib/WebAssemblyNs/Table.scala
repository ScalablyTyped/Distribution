package typings
package stdLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  val length: scala.Double = js.native
  def get(index: scala.Double): js.Function | scala.Null = js.native
  def grow(delta: scala.Double): scala.Double = js.native
  def set(index: scala.Double): scala.Unit = js.native
  def set(index: scala.Double, value: js.Function): scala.Unit = js.native
}

@JSGlobal("WebAssembly.Table")
@js.native
class TableCls protected () extends Table {
  def this(descriptor: TableDescriptor) = this()
}

@JSGlobal("WebAssembly.Table")
@js.native
object Table
  extends org.scalablytyped.runtime.Instantiable1[/* descriptor */ TableDescriptor, Table]


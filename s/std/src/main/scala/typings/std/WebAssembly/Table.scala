package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends _ExportValue {
  val length: Double = js.native
  def get(index: Double): js.Function | Null = js.native
  def grow(delta: Double): Double = js.native
  def set(index: Double): Unit = js.native
  def set(index: Double, value: js.Function): Unit = js.native
}


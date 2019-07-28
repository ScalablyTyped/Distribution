package typings.reactDashNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  def append(name: String, value: String): Unit = js.native
  def delete(name: String): Unit = js.native
  def forEach(callback: js.Function): Unit = js.native
  def forEach(callback: js.Function, thisArg: js.Any): Unit = js.native
  def get(name: String): String | Null = js.native
  def has(name: String): Boolean = js.native
  def set(name: String, value: String): Unit = js.native
}

@JSGlobal("Headers")
@js.native
class HeadersCls () extends Headers {
  def this(init: HeadersInit_) = this()
}

@JSGlobal("Headers")
@js.native
object Headers
  extends Instantiable0[Headers]
     with Instantiable1[/* init */ HeadersInit_, Headers]


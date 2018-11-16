package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  def forEach(callback: js.Function): scala.Unit = js.native
  def forEach(callback: js.Function, thisArg: js.Any): scala.Unit = js.native
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("Headers")
@js.native
object Headers
  extends ScalablyTyped.runtime.Instantiable0[Headers]
     with ScalablyTyped.runtime.Instantiable1[/* init */ `HeadersInit_`, Headers]


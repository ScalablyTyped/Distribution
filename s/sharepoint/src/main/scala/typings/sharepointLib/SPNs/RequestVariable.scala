package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RequestVariable")
@js.native
class RequestVariable protected () extends ClientObject {
  def this(context: ClientRuntimeContext) = this()
  def append(value: java.lang.String): scala.Unit = js.native
  def get_value(): java.lang.String = js.native
  def set(value: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("SP.RequestVariable")
@js.native
object RequestVariable extends js.Object {
  def newObject(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.RequestVariable = js.native
}


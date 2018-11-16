package typings
package rxDashDomLib.rxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "helpers")
@js.native
object helpersNs extends js.Object {
  def asArray[T](args: T*): js.Array[T] = js.native
  def defaultComparer(left: js.Any, right: js.Any): scala.Boolean = js.native
  def defaultError(err: js.Any): scala.Unit = js.native
  def defaultKeySerializer(key: js.Any): java.lang.String = js.native
  def defaultNow(): scala.Double = js.native
  def defaultSubComparer(left: js.Any, right: js.Any): scala.Double = js.native
  def identity[T](value: T): T = js.native
  def isFunction(value: js.Any): scala.Boolean = js.native
  def isPromise(p: js.Any): scala.Boolean = js.native
  def noop(): scala.Unit = js.native
  def not(value: js.Any): scala.Boolean = js.native
  def notDefined(value: js.Any): scala.Boolean = js.native
}


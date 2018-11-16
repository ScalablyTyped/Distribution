package typings
package restLib.restMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest", JSImport.Namespace)
@js.native
object restModMembers extends js.Object {
  def apply(path: java.lang.String): restLib.restMod.restNs.ResponsePromise = js.native
  def apply(request: restLib.restMod.restNs.Request): restLib.restMod.restNs.ResponsePromise = js.native
  def getDefaultClient(): restLib.restMod.restNs.Client = js.native
  def resetDefaultClient(): scala.Unit = js.native
  def setDefaultClient(client: restLib.restMod.restNs.Client): scala.Unit = js.native
  def wrap[T](interceptor: restLib.restMod.restNs.Interceptor[T]): restLib.restMod.restNs.Client = js.native
  def wrap[T](interceptor: restLib.restMod.restNs.Interceptor[T], config: T): restLib.restMod.restNs.Client = js.native
}


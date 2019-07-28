package typings.rest.restMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: String): ResponsePromise = js.native
  def apply(request: Request): ResponsePromise = js.native
  def getDefaultClient(): Client = js.native
  def resetDefaultClient(): Unit = js.native
  def setDefaultClient(client: Client): Unit = js.native
  def wrap[T](interceptor: Interceptor[T]): Client = js.native
  def wrap[T](interceptor: Interceptor[T], config: T): Client = js.native
}


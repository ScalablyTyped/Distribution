package typings.restfulJs.mod

import typings.restfulJs.AnonHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionResponse[T] extends ResponseBase {
  def apply(): AnonHeaders[T] = js.native
  def body(): js.Array[ResponseBody[T]] = js.native
}


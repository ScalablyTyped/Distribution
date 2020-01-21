package typings.restfulJs.mod

import typings.restfulJs.AnonDataHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionResponse[T] extends ResponseBase {
  def apply(): AnonDataHeaders[T] = js.native
  def body(): js.Array[ResponseBody[T]] = js.native
}


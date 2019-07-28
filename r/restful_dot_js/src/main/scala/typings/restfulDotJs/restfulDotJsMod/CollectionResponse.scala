package typings.restfulDotJs.restfulDotJsMod

import typings.restfulDotJs.Anon_DataHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionResponse[T] extends ResponseBase {
  def apply(): Anon_DataHeaders[T] = js.native
  def body(): js.Array[ResponseBody[T]] = js.native
}


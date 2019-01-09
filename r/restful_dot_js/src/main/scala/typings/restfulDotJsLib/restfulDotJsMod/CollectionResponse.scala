package typings
package restfulDotJsLib.restfulDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionResponse[T] extends ResponseBase {
  def apply(): restfulDotJsLib.Anon_DataHeaders[T] = js.native
  def body(): js.Array[ResponseBody[T]] = js.native
}


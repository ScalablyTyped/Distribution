package typings
package restfulDotJsLib.restfulDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberResponse[T] extends ResponseBase {
  def apply(): restfulDotJsLib.Anon_StatusText[T] = js.native
  def body(): ResponseBody[T] = js.native
}


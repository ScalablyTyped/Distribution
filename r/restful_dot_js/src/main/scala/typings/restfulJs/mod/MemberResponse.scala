package typings.restfulJs.mod

import typings.restfulJs.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberResponse[T] extends ResponseBase {
  def apply(): Data[T] = js.native
  def body(): ResponseBody[T] = js.native
}


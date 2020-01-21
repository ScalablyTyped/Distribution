package typings.restfulJs.mod

import typings.restfulJs.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberResponse[T] extends ResponseBase {
  def apply(): AnonData[T] = js.native
  def body(): ResponseBody[T] = js.native
}


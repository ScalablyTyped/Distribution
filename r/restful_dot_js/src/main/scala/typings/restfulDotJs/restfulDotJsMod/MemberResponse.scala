package typings.restfulDotJs.restfulDotJsMod

import typings.restfulDotJs.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberResponse[T] extends ResponseBase {
  def apply(): Anon_Data[T] = js.native
  def body(): ResponseBody[T] = js.native
}


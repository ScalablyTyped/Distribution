package typings.restfulDotJs

import typings.restfulDotJs.restfulDotJsMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[T] extends js.Object {
  var data: T
  var headers: Headers
  var status: Double
  var statusText: String
}

object Anon_Data {
  @scala.inline
  def apply[T](data: T, headers: Headers, status: Double, statusText: String): Anon_Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data[T]]
  }
}


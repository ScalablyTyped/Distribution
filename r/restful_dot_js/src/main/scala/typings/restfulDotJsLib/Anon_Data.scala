package typings
package restfulDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[T] extends js.Object {
  var data: T
  var headers: restfulDotJsLib.restfulDotJsMod.Headers
  var status: scala.Double
  var statusText: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply[T](
    data: T,
    headers: restfulDotJsLib.restfulDotJsMod.Headers,
    status: scala.Double,
    statusText: java.lang.String
  ): Anon_Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers, status = status, statusText = statusText)
  
    __obj.asInstanceOf[Anon_Data[T]]
  }
}


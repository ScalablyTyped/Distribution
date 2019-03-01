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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Anon_Data[T]]
  }
}


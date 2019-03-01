package typings
package restfulDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeaders[T] extends js.Object {
  var data: js.Array[T]
  var headers: restfulDotJsLib.restfulDotJsMod.Headers
  var status: scala.Double
  var statusText: java.lang.String
}

object Anon_DataHeaders {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    headers: restfulDotJsLib.restfulDotJsMod.Headers,
    status: scala.Double,
    statusText: java.lang.String
  ): Anon_DataHeaders[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Anon_DataHeaders[T]]
  }
}


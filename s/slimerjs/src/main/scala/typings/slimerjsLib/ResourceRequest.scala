package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRequest extends js.Object {
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var id: scala.Double
  var method: java.lang.String
  var time: stdLib.Date
  var url: java.lang.String
}

object ResourceRequest {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    id: scala.Double,
    method: java.lang.String,
    time: stdLib.Date,
    url: java.lang.String
  ): ResourceRequest = {
    val __obj = js.Dynamic.literal(headers = headers, id = id, method = method, time = time, url = url)
  
    __obj.asInstanceOf[ResourceRequest]
  }
}


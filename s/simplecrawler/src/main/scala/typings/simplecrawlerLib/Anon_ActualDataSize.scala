package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActualDataSize extends js.Object {
  var actualDataSize: scala.Double
  var code: scala.Double
  var contentLength: scala.Double
  var contentType: java.lang.String
  var downloadTime: scala.Double
  var headers: js.Object
  var requestLatency: scala.Double
  var requestTime: scala.Double
  var sentIncorrectSize: scala.Boolean
}

object Anon_ActualDataSize {
  @scala.inline
  def apply(
    actualDataSize: scala.Double,
    code: scala.Double,
    contentLength: scala.Double,
    contentType: java.lang.String,
    downloadTime: scala.Double,
    headers: js.Object,
    requestLatency: scala.Double,
    requestTime: scala.Double,
    sentIncorrectSize: scala.Boolean
  ): Anon_ActualDataSize = {
    val __obj = js.Dynamic.literal(actualDataSize = actualDataSize, code = code, contentLength = contentLength, contentType = contentType, downloadTime = downloadTime, headers = headers, requestLatency = requestLatency, requestTime = requestTime, sentIncorrectSize = sentIncorrectSize)
  
    __obj.asInstanceOf[Anon_ActualDataSize]
  }
}


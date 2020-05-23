package typings.simplecrawler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActualDataSize extends js.Object {
  var actualDataSize: Double
  var code: Double
  var contentLength: Double
  var contentType: String
  var downloadTime: Double
  var headers: js.Object
  var requestLatency: Double
  var requestTime: Double
  var sentIncorrectSize: Boolean
}

object ActualDataSize {
  @scala.inline
  def apply(
    actualDataSize: Double,
    code: Double,
    contentLength: Double,
    contentType: String,
    downloadTime: Double,
    headers: js.Object,
    requestLatency: Double,
    requestTime: Double,
    sentIncorrectSize: Boolean
  ): ActualDataSize = {
    val __obj = js.Dynamic.literal(actualDataSize = actualDataSize.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], downloadTime = downloadTime.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestLatency = requestLatency.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], sentIncorrectSize = sentIncorrectSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualDataSize]
  }
}


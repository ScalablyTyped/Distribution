package typings.slackDashMock.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveButtonCall[T] extends js.Object {
  var headers: InteractiveButtonHttpHeaders
  var params: T
  var statusCode: Double
  var `type`: InteractiveButtonCallType
  var url: InteractiveButtonUrl
}

object InteractiveButtonCall {
  @scala.inline
  def apply[T](
    headers: InteractiveButtonHttpHeaders,
    params: T,
    statusCode: Double,
    `type`: InteractiveButtonCallType,
    url: InteractiveButtonUrl
  ): InteractiveButtonCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveButtonCall[T]]
  }
}


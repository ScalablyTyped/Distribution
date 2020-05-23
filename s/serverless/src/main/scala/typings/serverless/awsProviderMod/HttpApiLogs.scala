package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpApiLogs extends js.Object {
  var format: js.UndefOr[String] = js.undefined
}

object HttpApiLogs {
  @scala.inline
  def apply(format: String = null): HttpApiLogs = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpApiLogs]
  }
}


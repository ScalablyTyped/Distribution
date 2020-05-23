package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudwatchLog extends js.Object {
  var filter: String
  var logGroup: String
}

object CloudwatchLog {
  @scala.inline
  def apply(filter: String, logGroup: String): CloudwatchLog = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchLog]
  }
}


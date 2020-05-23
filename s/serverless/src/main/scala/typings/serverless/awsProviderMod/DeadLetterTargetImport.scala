package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeadLetterTargetImport extends js.Object {
  var arn: String
  var url: String
}

object DeadLetterTargetImport {
  @scala.inline
  def apply(arn: String, url: String): DeadLetterTargetImport = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeadLetterTargetImport]
  }
}


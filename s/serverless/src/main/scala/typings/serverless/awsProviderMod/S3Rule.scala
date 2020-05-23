package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Rule extends js.Object {
  var prefix: String
  var suffix: String
}

object S3Rule {
  @scala.inline
  def apply(prefix: String, suffix: String): S3Rule = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Rule]
  }
}


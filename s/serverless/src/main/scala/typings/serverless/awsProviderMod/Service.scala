package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var awsKmsKeyArn: js.UndefOr[String] = js.undefined
  var name: String
}

object Service {
  @scala.inline
  def apply(name: String, awsKmsKeyArn: String = null): Service = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (awsKmsKeyArn != null) __obj.updateDynamic("awsKmsKeyArn")(awsKmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}


package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoUserPool extends js.Object {
  var existing: js.UndefOr[Boolean] = js.undefined
  var pool: String
  var trigger: String
}

object CognitoUserPool {
  @scala.inline
  def apply(pool: String, trigger: String, existing: js.UndefOr[Boolean] = js.undefined): CognitoUserPool = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(existing)) __obj.updateDynamic("existing")(existing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoUserPool]
  }
}


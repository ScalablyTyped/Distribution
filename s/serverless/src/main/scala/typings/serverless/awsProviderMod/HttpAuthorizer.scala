package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpAuthorizer extends js.Object {
  var arn: js.UndefOr[String] = js.undefined
  var identitySource: js.UndefOr[String] = js.undefined
  var identityValidationExpression: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var resultTtlInSeconds: js.UndefOr[Double | String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object HttpAuthorizer {
  @scala.inline
  def apply(
    arn: String = null,
    identitySource: String = null,
    identityValidationExpression: String = null,
    name: String = null,
    resultTtlInSeconds: Double | String = null,
    `type`: String = null
  ): HttpAuthorizer = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (identitySource != null) __obj.updateDynamic("identitySource")(identitySource.asInstanceOf[js.Any])
    if (identityValidationExpression != null) __obj.updateDynamic("identityValidationExpression")(identityValidationExpression.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resultTtlInSeconds != null) __obj.updateDynamic("resultTtlInSeconds")(resultTtlInSeconds.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAuthorizer]
  }
}


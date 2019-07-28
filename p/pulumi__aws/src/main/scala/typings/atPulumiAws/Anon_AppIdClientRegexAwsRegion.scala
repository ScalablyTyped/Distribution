package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppIdClientRegexAwsRegion extends js.Object {
  var appIdClientRegex: js.UndefOr[Input[String]] = js.undefined
  var awsRegion: js.UndefOr[Input[String]] = js.undefined
  var defaultAction: Input[String]
  var userPoolId: Input[String]
}

object Anon_AppIdClientRegexAwsRegion {
  @scala.inline
  def apply(
    defaultAction: Input[String],
    userPoolId: Input[String],
    appIdClientRegex: Input[String] = null,
    awsRegion: Input[String] = null
  ): Anon_AppIdClientRegexAwsRegion = {
    val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex.asInstanceOf[js.Any])
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AppIdClientRegexAwsRegion]
  }
}


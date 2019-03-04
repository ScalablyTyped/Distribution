package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppIdClientRegex extends js.Object {
  var appIdClientRegex: js.UndefOr[java.lang.String] = js.undefined
  var awsRegion: java.lang.String
  var defaultAction: java.lang.String
  var userPoolId: java.lang.String
}

object Anon_AppIdClientRegex {
  @scala.inline
  def apply(
    awsRegion: java.lang.String,
    defaultAction: java.lang.String,
    userPoolId: java.lang.String,
    appIdClientRegex: java.lang.String = null
  ): Anon_AppIdClientRegex = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, defaultAction = defaultAction, userPoolId = userPoolId)
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex)
    __obj.asInstanceOf[Anon_AppIdClientRegex]
  }
}


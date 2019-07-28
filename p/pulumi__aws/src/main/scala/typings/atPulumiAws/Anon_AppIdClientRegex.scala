package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppIdClientRegex extends js.Object {
  var appIdClientRegex: js.UndefOr[String] = js.undefined
  var awsRegion: String
  var defaultAction: String
  var userPoolId: String
}

object Anon_AppIdClientRegex {
  @scala.inline
  def apply(awsRegion: String, defaultAction: String, userPoolId: String, appIdClientRegex: String = null): Anon_AppIdClientRegex = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, defaultAction = defaultAction, userPoolId = userPoolId)
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex)
    __obj.asInstanceOf[Anon_AppIdClientRegex]
  }
}


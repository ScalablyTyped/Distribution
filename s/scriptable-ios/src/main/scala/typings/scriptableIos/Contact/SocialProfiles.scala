package typings.scriptableIos.Contact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialProfiles extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var label: String
  var localizedLabel: String
  var service: String
  var url: String
  var userIdentifier: String
  var username: String
}

object SocialProfiles {
  @scala.inline
  def apply(
    label: String,
    localizedLabel: String,
    service: String,
    url: String,
    userIdentifier: String,
    username: String,
    identifier: String = null
  ): SocialProfiles = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], localizedLabel = localizedLabel.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userIdentifier = userIdentifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialProfiles]
  }
}


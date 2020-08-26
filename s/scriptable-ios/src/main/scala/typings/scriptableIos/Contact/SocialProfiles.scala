package typings.scriptableIos.Contact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialProfiles extends js.Object {
  var identifier: js.UndefOr[String] = js.native
  var label: String = js.native
  var localizedLabel: String = js.native
  var service: String = js.native
  var url: String = js.native
  var userIdentifier: String = js.native
  var username: String = js.native
}

object SocialProfiles {
  @scala.inline
  def apply(
    label: String,
    localizedLabel: String,
    service: String,
    url: String,
    userIdentifier: String,
    username: String
  ): SocialProfiles = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], localizedLabel = localizedLabel.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userIdentifier = userIdentifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialProfiles]
  }
  @scala.inline
  implicit class SocialProfilesOps[Self <: SocialProfiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalizedLabel(value: String): Self = this.set("localizedLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserIdentifier(value: String): Self = this.set("userIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
  }
  
}


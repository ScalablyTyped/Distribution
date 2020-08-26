package typings.reactNativeShare.anon

import typings.reactNativeShare.mod.ActivityItemSource
import typings.reactNativeShare.mod.Share.Social
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-share.react-native-share.Options & {  social :react-native-share.react-native-share.Share.Social} */
@js.native
trait OptionssocialSocial extends js.Object {
  var activityItemSources: js.UndefOr[js.Array[ActivityItemSource]] = js.native
  var excludedActivityTypes: js.UndefOr[String] = js.native
  var failOnCancel: js.UndefOr[Boolean] = js.native
  var filename: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var saveToFiles: js.UndefOr[Boolean] = js.native
  var showAppsToView: js.UndefOr[Boolean] = js.native
  var social: Social = js.native
  var subject: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var urls: js.UndefOr[js.Array[String]] = js.native
}

object OptionssocialSocial {
  @scala.inline
  def apply(social: Social): OptionssocialSocial = {
    val __obj = js.Dynamic.literal(social = social.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionssocialSocial]
  }
  @scala.inline
  implicit class OptionssocialSocialOps[Self <: OptionssocialSocial] (val x: Self) extends AnyVal {
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
    def setSocial(value: Social): Self = this.set("social", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivityItemSourcesVarargs(value: ActivityItemSource*): Self = this.set("activityItemSources", js.Array(value :_*))
    @scala.inline
    def setActivityItemSources(value: js.Array[ActivityItemSource]): Self = this.set("activityItemSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityItemSources: Self = this.set("activityItemSources", js.undefined)
    @scala.inline
    def setExcludedActivityTypes(value: String): Self = this.set("excludedActivityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedActivityTypes: Self = this.set("excludedActivityTypes", js.undefined)
    @scala.inline
    def setFailOnCancel(value: Boolean): Self = this.set("failOnCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailOnCancel: Self = this.set("failOnCancel", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setSaveToFiles(value: Boolean): Self = this.set("saveToFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveToFiles: Self = this.set("saveToFiles", js.undefined)
    @scala.inline
    def setShowAppsToView(value: Boolean): Self = this.set("showAppsToView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAppsToView: Self = this.set("showAppsToView", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}


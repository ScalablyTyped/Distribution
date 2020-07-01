package typings.reactNativeShare.anon

import typings.reactNativeShare.mod.ActivityItemSource
import typings.reactNativeShare.mod.Share.Social
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-share.react-native-share.Options & {  social  :react-native-share.react-native-share.Share.Social} */
trait OptionssocialSocial extends js.Object {
  var activityItemSources: js.UndefOr[js.Array[ActivityItemSource]] = js.undefined
  var excludedActivityTypes: js.UndefOr[String] = js.undefined
  var failOnCancel: js.UndefOr[Boolean] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var saveToFiles: js.UndefOr[Boolean] = js.undefined
  var showAppsToView: js.UndefOr[Boolean] = js.undefined
  var social: Social
  var subject: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}

object OptionssocialSocial {
  @scala.inline
  def apply(
    social: Social,
    activityItemSources: js.Array[ActivityItemSource] = null,
    excludedActivityTypes: String = null,
    failOnCancel: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    message: String = null,
    saveToFiles: js.UndefOr[Boolean] = js.undefined,
    showAppsToView: js.UndefOr[Boolean] = js.undefined,
    subject: String = null,
    title: String = null,
    `type`: String = null,
    url: String = null,
    urls: js.Array[String] = null
  ): OptionssocialSocial = {
    val __obj = js.Dynamic.literal(social = social.asInstanceOf[js.Any])
    if (activityItemSources != null) __obj.updateDynamic("activityItemSources")(activityItemSources.asInstanceOf[js.Any])
    if (excludedActivityTypes != null) __obj.updateDynamic("excludedActivityTypes")(excludedActivityTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnCancel)) __obj.updateDynamic("failOnCancel")(failOnCancel.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(saveToFiles)) __obj.updateDynamic("saveToFiles")(saveToFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAppsToView)) __obj.updateDynamic("showAppsToView")(showAppsToView.get.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionssocialSocial]
  }
}


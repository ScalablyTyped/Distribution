package typings.reactNativeShare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkMetadata extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var originalUrl: js.UndefOr[String] = js.undefined
  var remoteVideoUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var video: js.UndefOr[String] = js.undefined
}

object LinkMetadata {
  @scala.inline
  def apply(
    icon: String = null,
    image: String = null,
    originalUrl: String = null,
    remoteVideoUrl: String = null,
    title: String = null,
    url: String = null,
    video: String = null
  ): LinkMetadata = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (originalUrl != null) __obj.updateDynamic("originalUrl")(originalUrl.asInstanceOf[js.Any])
    if (remoteVideoUrl != null) __obj.updateDynamic("remoteVideoUrl")(remoteVideoUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkMetadata]
  }
}


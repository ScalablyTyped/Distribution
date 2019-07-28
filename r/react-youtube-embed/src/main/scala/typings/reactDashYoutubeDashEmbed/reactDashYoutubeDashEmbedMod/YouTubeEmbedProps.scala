package typings.reactDashYoutubeDashEmbed.reactDashYoutubeDashEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeEmbedProps extends js.Object {
  var appendSrc: js.UndefOr[String] = js.undefined
  var aspectRatio: js.UndefOr[String] = js.undefined
  var id: String
  var prependSrc: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object YouTubeEmbedProps {
  @scala.inline
  def apply(
    id: String,
    appendSrc: String = null,
    aspectRatio: String = null,
    prependSrc: String = null,
    width: Int | Double = null
  ): YouTubeEmbedProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (appendSrc != null) __obj.updateDynamic("appendSrc")(appendSrc)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (prependSrc != null) __obj.updateDynamic("prependSrc")(prependSrc)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubeEmbedProps]
  }
}


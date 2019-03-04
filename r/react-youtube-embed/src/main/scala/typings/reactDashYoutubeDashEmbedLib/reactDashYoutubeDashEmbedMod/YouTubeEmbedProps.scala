package typings
package reactDashYoutubeDashEmbedLib.reactDashYoutubeDashEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeEmbedProps extends js.Object {
  var appendSrc: js.UndefOr[java.lang.String] = js.undefined
  var aspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var prependSrc: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object YouTubeEmbedProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    appendSrc: java.lang.String = null,
    aspectRatio: java.lang.String = null,
    prependSrc: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): YouTubeEmbedProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (appendSrc != null) __obj.updateDynamic("appendSrc")(appendSrc)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (prependSrc != null) __obj.updateDynamic("prependSrc")(prependSrc)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubeEmbedProps]
  }
}


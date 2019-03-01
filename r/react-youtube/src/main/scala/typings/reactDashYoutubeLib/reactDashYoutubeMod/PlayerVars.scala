package typings
package reactDashYoutubeLib.reactDashYoutubeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerVars extends js.Object {
  var autoplay: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`
  ] = js.undefined
  var cc_load_policy: js.UndefOr[reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`] = js.undefined
  var color: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibStrings.red | reactDashYoutubeLib.reactDashYoutubeLibStrings.white
  ] = js.undefined
  var controls: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`2`
  ] = js.undefined
  var disablekb: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`
  ] = js.undefined
  var enablejsapi: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`
  ] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var fs: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`
  ] = js.undefined
  var hl: js.UndefOr[java.lang.String] = js.undefined
  var iv_load_policy: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`3`
  ] = js.undefined
  var list: js.UndefOr[java.lang.String] = js.undefined
  var listType: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibStrings.playlist | reactDashYoutubeLib.reactDashYoutubeLibStrings.search | reactDashYoutubeLib.reactDashYoutubeLibStrings.user_uploads
  ] = js.undefined
  var loop: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`
  ] = js.undefined
  var modestbranding: js.UndefOr[reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var playlist: js.UndefOr[java.lang.String] = js.undefined
  var playsinline: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`
  ] = js.undefined
  var rel: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`
  ] = js.undefined
  var showinfo: js.UndefOr[
    reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1`
  ] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object PlayerVars {
  @scala.inline
  def apply(
    autoplay: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    cc_load_policy: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    color: reactDashYoutubeLib.reactDashYoutubeLibStrings.red | reactDashYoutubeLib.reactDashYoutubeLibStrings.white = null,
    controls: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`2` = null,
    disablekb: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    enablejsapi: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    end: scala.Int | scala.Double = null,
    fs: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    hl: java.lang.String = null,
    iv_load_policy: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`3` = null,
    list: java.lang.String = null,
    listType: reactDashYoutubeLib.reactDashYoutubeLibStrings.playlist | reactDashYoutubeLib.reactDashYoutubeLibStrings.search | reactDashYoutubeLib.reactDashYoutubeLibStrings.user_uploads = null,
    loop: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    modestbranding: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    origin: java.lang.String = null,
    playlist: java.lang.String = null,
    playsinline: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    rel: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    showinfo: reactDashYoutubeLib.reactDashYoutubeLibNumbers.`0` | reactDashYoutubeLib.reactDashYoutubeLibNumbers.`1` = null,
    start: scala.Int | scala.Double = null
  ): PlayerVars = {
    val __obj = js.Dynamic.literal()
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (cc_load_policy != null) __obj.updateDynamic("cc_load_policy")(cc_load_policy)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (disablekb != null) __obj.updateDynamic("disablekb")(disablekb.asInstanceOf[js.Any])
    if (enablejsapi != null) __obj.updateDynamic("enablejsapi")(enablejsapi.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl)
    if (iv_load_policy != null) __obj.updateDynamic("iv_load_policy")(iv_load_policy.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list)
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (modestbranding != null) __obj.updateDynamic("modestbranding")(modestbranding)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (playlist != null) __obj.updateDynamic("playlist")(playlist)
    if (playsinline != null) __obj.updateDynamic("playsinline")(playsinline.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (showinfo != null) __obj.updateDynamic("showinfo")(showinfo.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerVars]
  }
}


package typings
package reactDashPlayerLib.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConfig extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var dashVersion: js.UndefOr[java.lang.String] = js.undefined
  var forceAudio: js.UndefOr[scala.Boolean] = js.undefined
  var forceDASH: js.UndefOr[scala.Boolean] = js.undefined
  var forceHLS: js.UndefOr[scala.Boolean] = js.undefined
  var forceVideo: js.UndefOr[scala.Boolean] = js.undefined
  var hlsOptions: js.UndefOr[js.Object] = js.undefined
  var hlsVersion: js.UndefOr[java.lang.String] = js.undefined
  var tracks: js.UndefOr[js.Array[TrackProps]] = js.undefined
}

object FileConfig {
  @scala.inline
  def apply(
    attributes: js.Object = null,
    dashVersion: java.lang.String = null,
    forceAudio: js.UndefOr[scala.Boolean] = js.undefined,
    forceDASH: js.UndefOr[scala.Boolean] = js.undefined,
    forceHLS: js.UndefOr[scala.Boolean] = js.undefined,
    forceVideo: js.UndefOr[scala.Boolean] = js.undefined,
    hlsOptions: js.Object = null,
    hlsVersion: java.lang.String = null,
    tracks: js.Array[TrackProps] = null
  ): FileConfig = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (dashVersion != null) __obj.updateDynamic("dashVersion")(dashVersion)
    if (!js.isUndefined(forceAudio)) __obj.updateDynamic("forceAudio")(forceAudio)
    if (!js.isUndefined(forceDASH)) __obj.updateDynamic("forceDASH")(forceDASH)
    if (!js.isUndefined(forceHLS)) __obj.updateDynamic("forceHLS")(forceHLS)
    if (!js.isUndefined(forceVideo)) __obj.updateDynamic("forceVideo")(forceVideo)
    if (hlsOptions != null) __obj.updateDynamic("hlsOptions")(hlsOptions)
    if (hlsVersion != null) __obj.updateDynamic("hlsVersion")(hlsVersion)
    if (tracks != null) __obj.updateDynamic("tracks")(tracks)
    __obj.asInstanceOf[FileConfig]
  }
}


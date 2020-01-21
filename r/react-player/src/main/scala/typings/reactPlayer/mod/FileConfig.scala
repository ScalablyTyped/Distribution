package typings.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConfig extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var dashVersion: js.UndefOr[String] = js.undefined
  var forceAudio: js.UndefOr[Boolean] = js.undefined
  var forceDASH: js.UndefOr[Boolean] = js.undefined
  var forceHLS: js.UndefOr[Boolean] = js.undefined
  var forceVideo: js.UndefOr[Boolean] = js.undefined
  var hlsOptions: js.UndefOr[js.Object] = js.undefined
  var hlsVersion: js.UndefOr[String] = js.undefined
  var tracks: js.UndefOr[js.Array[TrackProps]] = js.undefined
}

object FileConfig {
  @scala.inline
  def apply(
    attributes: js.Object = null,
    dashVersion: String = null,
    forceAudio: js.UndefOr[Boolean] = js.undefined,
    forceDASH: js.UndefOr[Boolean] = js.undefined,
    forceHLS: js.UndefOr[Boolean] = js.undefined,
    forceVideo: js.UndefOr[Boolean] = js.undefined,
    hlsOptions: js.Object = null,
    hlsVersion: String = null,
    tracks: js.Array[TrackProps] = null
  ): FileConfig = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (dashVersion != null) __obj.updateDynamic("dashVersion")(dashVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(forceAudio)) __obj.updateDynamic("forceAudio")(forceAudio.asInstanceOf[js.Any])
    if (!js.isUndefined(forceDASH)) __obj.updateDynamic("forceDASH")(forceDASH.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHLS)) __obj.updateDynamic("forceHLS")(forceHLS.asInstanceOf[js.Any])
    if (!js.isUndefined(forceVideo)) __obj.updateDynamic("forceVideo")(forceVideo.asInstanceOf[js.Any])
    if (hlsOptions != null) __obj.updateDynamic("hlsOptions")(hlsOptions.asInstanceOf[js.Any])
    if (hlsVersion != null) __obj.updateDynamic("hlsVersion")(hlsVersion.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfig]
  }
}


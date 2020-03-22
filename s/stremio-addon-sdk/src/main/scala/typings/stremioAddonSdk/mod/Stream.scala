package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.AnonCountryWhitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tells Stremio how to obtain the media content.
  *
  * It may be torrent info hash, HTTP URL, etc.
  */
trait Stream extends js.Object {
  var behaviorHints: js.UndefOr[AnonCountryWhitelist] = js.undefined
  /**
    * Meta Link or an external URL to the video, which should be opened in a browser (webpage).
    *
    * e.g. a link to Netflix.
    */
  var externalUrl: js.UndefOr[String] = js.undefined
  /**
    * The index of the video file within the torrent (from infoHash).
    *
    * If fileIdx is not specified, the largest file in the torrent will be selected.
    */
  var fileIdx: js.UndefOr[Double] = js.undefined
  /**
    * Info hash of a torrent file, and fileIdx is the index of the video file within the torrent.
    *
    * If fileIdx is not specified, the largest file in the torrent will be selected.
    */
  var infoHash: js.UndefOr[String] = js.undefined
  /**
    * Name of the stream
    *
    * Usually a short name to identify the addon that provided the stream
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Array of Subtitle objects representing subtitles for this stream.
    */
  var subtitles: js.UndefOr[js.Array[Subtitle]] = js.undefined
  /**
    * Title of the stream
    *
    * Usually used for stream quality.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Direct URL to a video stream - http, https, rtmp protocols are supported.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Youtube video ID, plays using the built-in YouTube player.
    */
  var ytId: js.UndefOr[String] = js.undefined
}

object Stream {
  @scala.inline
  def apply(
    behaviorHints: AnonCountryWhitelist = null,
    externalUrl: String = null,
    fileIdx: Int | Double = null,
    infoHash: String = null,
    name: String = null,
    subtitles: js.Array[Subtitle] = null,
    title: String = null,
    url: String = null,
    ytId: String = null
  ): Stream = {
    val __obj = js.Dynamic.literal()
    if (behaviorHints != null) __obj.updateDynamic("behaviorHints")(behaviorHints.asInstanceOf[js.Any])
    if (externalUrl != null) __obj.updateDynamic("externalUrl")(externalUrl.asInstanceOf[js.Any])
    if (fileIdx != null) __obj.updateDynamic("fileIdx")(fileIdx.asInstanceOf[js.Any])
    if (infoHash != null) __obj.updateDynamic("infoHash")(infoHash.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (ytId != null) __obj.updateDynamic("ytId")(ytId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
}


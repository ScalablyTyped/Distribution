package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.CountryWhitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tells Stremio how to obtain the media content.
  *
  * It may be torrent info hash, HTTP URL, etc.
  */
@js.native
trait Stream extends js.Object {
  var behaviorHints: js.UndefOr[CountryWhitelist] = js.native
  /**
    * Meta Link or an external URL to the video, which should be opened in a browser (webpage).
    *
    * e.g. a link to Netflix.
    */
  var externalUrl: js.UndefOr[String] = js.native
  /**
    * The index of the video file within the torrent (from infoHash).
    *
    * If fileIdx is not specified, the largest file in the torrent will be selected.
    */
  var fileIdx: js.UndefOr[Double] = js.native
  /**
    * Info hash of a torrent file, and fileIdx is the index of the video file within the torrent.
    *
    * If fileIdx is not specified, the largest file in the torrent will be selected.
    */
  var infoHash: js.UndefOr[String] = js.native
  /**
    * Name of the stream
    *
    * Usually a short name to identify the addon that provided the stream
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Array of Subtitle objects representing subtitles for this stream.
    */
  var subtitles: js.UndefOr[js.Array[Subtitle]] = js.native
  /**
    * Title of the stream
    *
    * Usually used for stream quality.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Direct URL to a video stream - http, https, rtmp protocols are supported.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Youtube video ID, plays using the built-in YouTube player.
    */
  var ytId: js.UndefOr[String] = js.native
}

object Stream {
  @scala.inline
  def apply(): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stream]
  }
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
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
    def setBehaviorHints(value: CountryWhitelist): Self = this.set("behaviorHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehaviorHints: Self = this.set("behaviorHints", js.undefined)
    @scala.inline
    def setExternalUrl(value: String): Self = this.set("externalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalUrl: Self = this.set("externalUrl", js.undefined)
    @scala.inline
    def setFileIdx(value: Double): Self = this.set("fileIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileIdx: Self = this.set("fileIdx", js.undefined)
    @scala.inline
    def setInfoHash(value: String): Self = this.set("infoHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoHash: Self = this.set("infoHash", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSubtitlesVarargs(value: Subtitle*): Self = this.set("subtitles", js.Array(value :_*))
    @scala.inline
    def setSubtitles(value: js.Array[Subtitle]): Self = this.set("subtitles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitles: Self = this.set("subtitles", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setYtId(value: String): Self = this.set("ytId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYtId: Self = this.set("ytId", js.undefined)
  }
  
}


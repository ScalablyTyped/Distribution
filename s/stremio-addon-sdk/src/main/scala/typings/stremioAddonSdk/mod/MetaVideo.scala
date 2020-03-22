package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaVideo extends js.Object {
  /**
    * Set to true to explicitly state that this video is available for streaming, from your addon.
    *
    * No need to use this if you've passed stream.
    */
  var available: js.UndefOr[Boolean] = js.undefined
  /**
    * Episode number, if applicable.
    */
  var episode: js.UndefOr[Double] = js.undefined
  /**
    * ID of the video.
    */
  var id: String
  /**
    * Video overview/summary
    */
  var overview: js.UndefOr[String] = js.undefined
  /**
    * ISO 8601, publish date of the video.
    *
    * for episodes, this should be the initial air date.
    *
    * e.g. "2010-12-06T05:00:00.000Z"
    */
  var released: String
  /**
    * Season number, if applicable.
    */
  var season: js.UndefOr[Double] = js.undefined
  /**
    * In case you can return links to streams while forming meta response,
    * you can pass and array of Stream Objects to point the video to a HTTP URL, BitTorrent,
    * YouTube or any other stremio-supported transport protocol.
    *
    * Note that this is exclusive: passing video.streams means that Stremio will not request any streams
    * from other addons for that video.
    * If you return streams that way, it is still recommended to implement the streams resource.
    */
  var streams: js.UndefOr[js.Array[Stream]] = js.undefined
  /**
    * URL to png of the video thumbnail, in the video's aspect ratio.
    *
    * max file size 5kb.
    */
  var thumbnail: js.UndefOr[String] = js.undefined
  /**
    * Title of the video.
    */
  var title: String
  /**
    * YouTube ID of the trailer video; use if this is an episode for a series.
    */
  var trailer: js.UndefOr[String] = js.undefined
}

object MetaVideo {
  @scala.inline
  def apply(
    id: String,
    released: String,
    title: String,
    available: js.UndefOr[Boolean] = js.undefined,
    episode: Int | Double = null,
    overview: String = null,
    season: Int | Double = null,
    streams: js.Array[Stream] = null,
    thumbnail: String = null,
    trailer: String = null
  ): MetaVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (episode != null) __obj.updateDynamic("episode")(episode.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (season != null) __obj.updateDynamic("season")(season.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (trailer != null) __obj.updateDynamic("trailer")(trailer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaVideo]
  }
}


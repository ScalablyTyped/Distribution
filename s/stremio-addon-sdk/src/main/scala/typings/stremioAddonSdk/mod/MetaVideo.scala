package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaVideo extends StObject {
  
  /**
    * Set to true to explicitly state that this video is available for streaming, from your addon.
    *
    * No need to use this if you've passed stream.
    */
  var available: js.UndefOr[Boolean] = js.native
  
  /**
    * Episode number, if applicable.
    */
  var episode: js.UndefOr[Double] = js.native
  
  /**
    * ID of the video.
    */
  var id: String = js.native
  
  /**
    * Video overview/summary
    */
  var overview: js.UndefOr[String] = js.native
  
  /**
    * ISO 8601, publish date of the video.
    *
    * for episodes, this should be the initial air date.
    *
    * e.g. "2010-12-06T05:00:00.000Z"
    */
  var released: String = js.native
  
  /**
    * Season number, if applicable.
    */
  var season: js.UndefOr[Double] = js.native
  
  /**
    * In case you can return links to streams while forming meta response,
    * you can pass and array of Stream Objects to point the video to a HTTP URL, BitTorrent,
    * YouTube or any other stremio-supported transport protocol.
    *
    * Note that this is exclusive: passing video.streams means that Stremio will not request any streams
    * from other addons for that video.
    * If you return streams that way, it is still recommended to implement the streams resource.
    */
  var streams: js.UndefOr[js.Array[Stream]] = js.native
  
  /**
    * URL to png of the video thumbnail, in the video's aspect ratio.
    *
    * max file size 5kb.
    */
  var thumbnail: js.UndefOr[String] = js.native
  
  /**
    * Title of the video.
    */
  var title: String = js.native
  
  /**
    * YouTube ID of the trailer video; use if this is an episode for a series.
    */
  var trailer: js.UndefOr[String] = js.native
}
object MetaVideo {
  
  @scala.inline
  def apply(id: String, released: String, title: String): MetaVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaVideo]
  }
  
  @scala.inline
  implicit class MetaVideoMutableBuilder[Self <: MetaVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    @scala.inline
    def setEpisode(value: Double): Self = StObject.set(x, "episode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpisodeUndefined: Self = StObject.set(x, "episode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    @scala.inline
    def setReleased(value: String): Self = StObject.set(x, "released", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeason(value: Double): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
    
    @scala.inline
    def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    @scala.inline
    def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailer(value: String): Self = StObject.set(x, "trailer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailerUndefined: Self = StObject.set(x, "trailer", js.undefined)
  }
}

package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Recommendations Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-object)
  */
@js.native
trait RecommendationsObject extends js.Object {
  var seeds: js.Array[RecommendationsSeedObject] = js.native
  var tracks: js.Array[TrackObjectSimplified] = js.native
}

object RecommendationsObject {
  @scala.inline
  def apply(seeds: js.Array[RecommendationsSeedObject], tracks: js.Array[TrackObjectSimplified]): RecommendationsObject = {
    val __obj = js.Dynamic.literal(seeds = seeds.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationsObject]
  }
  @scala.inline
  implicit class RecommendationsObjectOps[Self <: RecommendationsObject] (val x: Self) extends AnyVal {
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
    def setSeedsVarargs(value: RecommendationsSeedObject*): Self = this.set("seeds", js.Array(value :_*))
    @scala.inline
    def setSeeds(value: js.Array[RecommendationsSeedObject]): Self = this.set("seeds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracksVarargs(value: TrackObjectSimplified*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[TrackObjectSimplified]): Self = this.set("tracks", value.asInstanceOf[js.Any])
  }
  
}


package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.artist
import typings.spotifyApi.spotifyApiStrings.genre
import typings.spotifyApi.spotifyApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recommendations Seed Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-seed-object)
  */
@js.native
trait RecommendationsSeedObject extends js.Object {
  
  var afterFilteringSize: Double = js.native
  
  var afterRelinkingSize: Double = js.native
  
  var href: String = js.native
  
  var id: String = js.native
  
  var initialPoolSize: Double = js.native
  
  var `type`: artist | track | genre = js.native
}
object RecommendationsSeedObject {
  
  @scala.inline
  def apply(
    afterFilteringSize: Double,
    afterRelinkingSize: Double,
    href: String,
    id: String,
    initialPoolSize: Double,
    `type`: artist | track | genre
  ): RecommendationsSeedObject = {
    val __obj = js.Dynamic.literal(afterFilteringSize = afterFilteringSize.asInstanceOf[js.Any], afterRelinkingSize = afterRelinkingSize.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialPoolSize = initialPoolSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationsSeedObject]
  }
  
  @scala.inline
  implicit class RecommendationsSeedObjectOps[Self <: RecommendationsSeedObject] (val x: Self) extends AnyVal {
    
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
    def setAfterFilteringSize(value: Double): Self = this.set("afterFilteringSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRelinkingSize(value: Double): Self = this.set("afterRelinkingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPoolSize(value: Double): Self = this.set("initialPoolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: artist | track | genre): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

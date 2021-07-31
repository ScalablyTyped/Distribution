package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.artist
import typings.spotifyApi.spotifyApiStrings.genre
import typings.spotifyApi.spotifyApiStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recommendations Seed Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-seed-object)
  */
trait RecommendationsSeedObject extends StObject {
  
  var afterFilteringSize: Double
  
  var afterRelinkingSize: Double
  
  var href: String
  
  var id: String
  
  var initialPoolSize: Double
  
  var `type`: artist | track | genre
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
  implicit class RecommendationsSeedObjectMutableBuilder[Self <: RecommendationsSeedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterFilteringSize(value: Double): Self = StObject.set(x, "afterFilteringSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRelinkingSize(value: Double): Self = StObject.set(x, "afterRelinkingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPoolSize(value: Double): Self = StObject.set(x, "initialPoolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: artist | track | genre): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

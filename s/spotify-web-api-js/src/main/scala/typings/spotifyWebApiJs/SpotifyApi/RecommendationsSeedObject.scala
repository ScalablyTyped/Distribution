package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.artist
import typings.spotifyWebApiJs.spotifyWebApiJsStrings.genre
import typings.spotifyWebApiJs.spotifyWebApiJsStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recommendations Seed Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-seed-object)
  */
@js.native
trait RecommendationsSeedObject extends StObject {
  
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

package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get a list of categories
  *
  * GET /v1/browse/categories
  * https://developer.spotify.com/web-api/get-list-categories/
  */
trait MultipleCategoriesResponse extends StObject {
  
  var categories: PagingObject[CategoryObject]
}
object MultipleCategoriesResponse {
  
  @scala.inline
  def apply(categories: PagingObject[CategoryObject]): MultipleCategoriesResponse = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleCategoriesResponse]
  }
  
  @scala.inline
  implicit class MultipleCategoriesResponseMutableBuilder[Self <: MultipleCategoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: PagingObject[CategoryObject]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
  }
}

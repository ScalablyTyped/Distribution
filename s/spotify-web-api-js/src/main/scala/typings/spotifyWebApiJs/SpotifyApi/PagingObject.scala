package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Paging Object wrapper used for retrieving collections from the Spotify API.
  * [](https://developer.spotify.com/web-api/object-model/#paging-object)
  */
trait PagingObject[T] extends StObject {
  
  var href: String
  
  var items: js.Array[T]
  
  var limit: Double
  
  var next: String
  
  var offset: Double
  
  var previous: String
  
  var total: Double
}
object PagingObject {
  
  @scala.inline
  def apply[T](
    href: String,
    items: js.Array[T],
    limit: Double,
    next: String,
    offset: Double,
    previous: String,
    total: Double
  ): PagingObject[T] = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagingObject[T]]
  }
  
  @scala.inline
  implicit class PagingObjectMutableBuilder[Self <: PagingObject[?], T] (val x: Self & PagingObject[T]) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}

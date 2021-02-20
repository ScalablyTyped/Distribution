package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cursor Based Paging Object wrappers used for retrieving collections from the Spotify API.
  * [](https://developer.spotify.com/web-api/object-model/#cursor-based-paging-object)
  */
@js.native
trait CursorBasedPagingObject[T] extends StObject {
  
  var cursors: CursorObject = js.native
  
  var href: String = js.native
  
  var items: js.Array[T] = js.native
  
  var limit: Double = js.native
  
  var next: String = js.native
  
  var total: js.UndefOr[Double] = js.native
}
object CursorBasedPagingObject {
  
  @scala.inline
  def apply[T](cursors: CursorObject, href: String, items: js.Array[T], limit: Double, next: String): CursorBasedPagingObject[T] = {
    val __obj = js.Dynamic.literal(cursors = cursors.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorBasedPagingObject[T]]
  }
  
  @scala.inline
  implicit class CursorBasedPagingObjectMutableBuilder[Self <: CursorBasedPagingObject[_], T] (val x: Self with CursorBasedPagingObject[T]) extends AnyVal {
    
    @scala.inline
    def setCursors(value: CursorObject): Self = StObject.set(x, "cursors", value.asInstanceOf[js.Any])
    
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
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}

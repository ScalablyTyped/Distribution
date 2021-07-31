package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cursor object
  * [cursor object](https://developer.spotify.com/web-api/object-model/)
  */
trait CursorObject extends StObject {
  
  var after: String
  
  var before: js.UndefOr[String] = js.undefined
}
object CursorObject {
  
  @scala.inline
  def apply(after: String): CursorObject = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorObject]
  }
  
  @scala.inline
  implicit class CursorObjectMutableBuilder[Self <: CursorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}

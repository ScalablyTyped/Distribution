package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayParameterObject extends StObject {
  
  var context_uri: js.UndefOr[String] = js.undefined
  
  var device_id: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Position] = js.undefined
  
  var position_ms: js.UndefOr[Double] = js.undefined
  
  var uris: js.UndefOr[js.Array[String]] = js.undefined
}
object PlayParameterObject {
  
  @scala.inline
  def apply(): PlayParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayParameterObject]
  }
  
  @scala.inline
  implicit class PlayParameterObjectMutableBuilder[Self <: PlayParameterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext_uri(value: String): Self = StObject.set(x, "context_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext_uriUndefined: Self = StObject.set(x, "context_uri", js.undefined)
    
    @scala.inline
    def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
    
    @scala.inline
    def setOffset(value: Position): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition_ms(value: Double): Self = StObject.set(x, "position_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition_msUndefined: Self = StObject.set(x, "position_ms", js.undefined)
    
    @scala.inline
    def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    @scala.inline
    def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value :_*))
  }
}

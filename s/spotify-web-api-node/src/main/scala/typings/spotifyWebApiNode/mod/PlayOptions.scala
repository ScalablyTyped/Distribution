package typings.spotifyWebApiNode.mod

import typings.spotifyWebApiNode.anon.Position
import typings.spotifyWebApiNode.anon.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayOptions extends DeviceOptions {
  
  var context_uri: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Position | Uri] = js.native
  
  var position_ms: js.UndefOr[Double] = js.native
  
  var uris: js.UndefOr[js.Array[String]] = js.native
}
object PlayOptions {
  
  @scala.inline
  def apply(): PlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayOptions]
  }
  
  @scala.inline
  implicit class PlayOptionsMutableBuilder[Self <: PlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext_uri(value: String): Self = StObject.set(x, "context_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext_uriUndefined: Self = StObject.set(x, "context_uri", js.undefined)
    
    @scala.inline
    def setOffset(value: Position | Uri): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
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

package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangePlaylistOptions
  extends StObject
     with PlaylistDetailsOptions {
  
  var name: js.UndefOr[String] = js.undefined
}
object ChangePlaylistOptions {
  
  inline def apply(): ChangePlaylistOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangePlaylistOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangePlaylistOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

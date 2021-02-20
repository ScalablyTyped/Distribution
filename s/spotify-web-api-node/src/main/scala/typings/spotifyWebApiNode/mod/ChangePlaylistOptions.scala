package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangePlaylistOptions extends PlaylistDetailsOptions {
  
  var name: js.UndefOr[String] = js.native
}
object ChangePlaylistOptions {
  
  @scala.inline
  def apply(): ChangePlaylistOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangePlaylistOptions]
  }
  
  @scala.inline
  implicit class ChangePlaylistOptionsMutableBuilder[Self <: ChangePlaylistOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

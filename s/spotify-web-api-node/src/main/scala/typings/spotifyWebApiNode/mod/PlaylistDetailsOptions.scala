package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistDetailsOptions extends PublicOptions {
  
  var collaborative: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
}
object PlaylistDetailsOptions {
  
  @scala.inline
  def apply(): PlaylistDetailsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistDetailsOptions]
  }
  
  @scala.inline
  implicit class PlaylistDetailsOptionsMutableBuilder[Self <: PlaylistDetailsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollaborative(value: Boolean): Self = StObject.set(x, "collaborative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaborativeUndefined: Self = StObject.set(x, "collaborative", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}

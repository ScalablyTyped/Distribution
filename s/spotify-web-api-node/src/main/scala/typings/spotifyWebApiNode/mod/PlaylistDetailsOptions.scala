package typings.spotifyWebApiNode.mod

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
  implicit class PlaylistDetailsOptionsOps[Self <: PlaylistDetailsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollaborative(value: Boolean): Self = this.set("collaborative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollaborative: Self = this.set("collaborative", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}

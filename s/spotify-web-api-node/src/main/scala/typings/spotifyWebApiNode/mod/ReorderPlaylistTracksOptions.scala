package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReorderPlaylistTracksOptions extends SnapshotOptions {
  
  var range_length: js.UndefOr[Double] = js.native
}
object ReorderPlaylistTracksOptions {
  
  @scala.inline
  def apply(): ReorderPlaylistTracksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReorderPlaylistTracksOptions]
  }
  
  @scala.inline
  implicit class ReorderPlaylistTracksOptionsOps[Self <: ReorderPlaylistTracksOptions] (val x: Self) extends AnyVal {
    
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
    def setRange_length(value: Double): Self = this.set("range_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange_length: Self = this.set("range_length", js.undefined)
  }
}

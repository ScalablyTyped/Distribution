package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ReorderPlaylistTracksOptionsMutableBuilder[Self <: ReorderPlaylistTracksOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange_length(value: Double): Self = StObject.set(x, "range_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange_lengthUndefined: Self = StObject.set(x, "range_length", js.undefined)
  }
}

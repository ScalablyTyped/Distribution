package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReorderPlaylistTracksOptions
  extends StObject
     with SnapshotOptions {
  
  var range_length: js.UndefOr[Double] = js.undefined
}
object ReorderPlaylistTracksOptions {
  
  inline def apply(): ReorderPlaylistTracksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReorderPlaylistTracksOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReorderPlaylistTracksOptions] (val x: Self) extends AnyVal {
    
    inline def setRange_length(value: Double): Self = StObject.set(x, "range_length", value.asInstanceOf[js.Any])
    
    inline def setRange_lengthUndefined: Self = StObject.set(x, "range_length", js.undefined)
  }
}

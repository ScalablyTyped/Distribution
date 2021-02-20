package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Track extends StObject {
  
  var positions: js.UndefOr[js.Array[Double]] = js.native
  
  var uri: String = js.native
}
object Track {
  
  @scala.inline
  def apply(uri: String): Track = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit class TrackMutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    @scala.inline
    def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}

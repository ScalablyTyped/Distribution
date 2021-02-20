package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSourceEventMap extends StObject {
  
  var sourceclose: Event = js.native
  
  var sourceended: Event = js.native
  
  var sourceopen: Event = js.native
}
object MediaSourceEventMap {
  
  @scala.inline
  def apply(sourceclose: Event, sourceended: Event, sourceopen: Event): MediaSourceEventMap = {
    val __obj = js.Dynamic.literal(sourceclose = sourceclose.asInstanceOf[js.Any], sourceended = sourceended.asInstanceOf[js.Any], sourceopen = sourceopen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceEventMap]
  }
  
  @scala.inline
  implicit class MediaSourceEventMapMutableBuilder[Self <: MediaSourceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceclose(value: Event): Self = StObject.set(x, "sourceclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceended(value: Event): Self = StObject.set(x, "sourceended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceopen(value: Event): Self = StObject.set(x, "sourceopen", value.asInstanceOf[js.Any])
  }
}

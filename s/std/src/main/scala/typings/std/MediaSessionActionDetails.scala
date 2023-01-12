package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSessionActionDetails extends StObject {
  
  /* standard dom */
  var action: MediaSessionAction
  
  /* standard dom */
  var fastSeek: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var seekOffset: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var seekTime: js.UndefOr[Double] = js.undefined
}
object MediaSessionActionDetails {
  
  inline def apply(action: MediaSessionAction): MediaSessionActionDetails = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionActionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaSessionActionDetails] (val x: Self) extends AnyVal {
    
    inline def setAction(value: MediaSessionAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFastSeek(value: scala.Boolean): Self = StObject.set(x, "fastSeek", value.asInstanceOf[js.Any])
    
    inline def setFastSeekUndefined: Self = StObject.set(x, "fastSeek", js.undefined)
    
    inline def setSeekOffset(value: Double): Self = StObject.set(x, "seekOffset", value.asInstanceOf[js.Any])
    
    inline def setSeekOffsetUndefined: Self = StObject.set(x, "seekOffset", js.undefined)
    
    inline def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    
    inline def setSeekTimeUndefined: Self = StObject.set(x, "seekTime", js.undefined)
  }
}

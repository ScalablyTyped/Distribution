package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMessageHistoryOptions extends StObject {
  
  var lastOrdinal: js.UndefOr[Double] = js.undefined
  
  var lastTime: js.UndefOr[js.Date | Double] = js.undefined
  
  var maxCount: js.UndefOr[Double] = js.undefined
  
  var startOrdinal: js.UndefOr[Double] = js.undefined
  
  var startTime: js.UndefOr[js.Date | Double] = js.undefined
  
  var wantBbcode: js.UndefOr[Boolean] = js.undefined
}
object GetMessageHistoryOptions {
  
  inline def apply(): GetMessageHistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMessageHistoryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMessageHistoryOptions] (val x: Self) extends AnyVal {
    
    inline def setLastOrdinal(value: Double): Self = StObject.set(x, "lastOrdinal", value.asInstanceOf[js.Any])
    
    inline def setLastOrdinalUndefined: Self = StObject.set(x, "lastOrdinal", js.undefined)
    
    inline def setLastTime(value: js.Date | Double): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
    
    inline def setLastTimeUndefined: Self = StObject.set(x, "lastTime", js.undefined)
    
    inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
    
    inline def setStartOrdinal(value: Double): Self = StObject.set(x, "startOrdinal", value.asInstanceOf[js.Any])
    
    inline def setStartOrdinalUndefined: Self = StObject.set(x, "startOrdinal", js.undefined)
    
    inline def setStartTime(value: js.Date | Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setWantBbcode(value: Boolean): Self = StObject.set(x, "wantBbcode", value.asInstanceOf[js.Any])
    
    inline def setWantBbcodeUndefined: Self = StObject.set(x, "wantBbcode", js.undefined)
  }
}

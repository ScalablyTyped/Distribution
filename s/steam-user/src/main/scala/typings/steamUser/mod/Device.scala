package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var deviceName: String
  
  var deviceToken: String
  
  var isCanceled: Boolean
  
  var isLimited: Boolean
  
  var isPending: Boolean
  
  var lastAppPlayed: js.Date | Null
  
  var lastBorrower: typings.steamid.mod.^ | Null
  
  var lastTimeUsed: js.Date | Null
}
object Device {
  
  inline def apply(
    deviceName: String,
    deviceToken: String,
    isCanceled: Boolean,
    isLimited: Boolean,
    isPending: Boolean
  ): Device = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceToken = deviceToken.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], isLimited = isLimited.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], lastAppPlayed = null, lastBorrower = null, lastTimeUsed = null)
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceToken(value: String): Self = StObject.set(x, "deviceToken", value.asInstanceOf[js.Any])
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    inline def setIsLimited(value: Boolean): Self = StObject.set(x, "isLimited", value.asInstanceOf[js.Any])
    
    inline def setIsPending(value: Boolean): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    inline def setLastAppPlayed(value: js.Date): Self = StObject.set(x, "lastAppPlayed", value.asInstanceOf[js.Any])
    
    inline def setLastAppPlayedNull: Self = StObject.set(x, "lastAppPlayed", null)
    
    inline def setLastBorrower(value: typings.steamid.mod.^): Self = StObject.set(x, "lastBorrower", value.asInstanceOf[js.Any])
    
    inline def setLastBorrowerNull: Self = StObject.set(x, "lastBorrower", null)
    
    inline def setLastTimeUsed(value: js.Date): Self = StObject.set(x, "lastTimeUsed", value.asInstanceOf[js.Any])
    
    inline def setLastTimeUsedNull: Self = StObject.set(x, "lastTimeUsed", null)
  }
}

package typings.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeAndroidChannel extends StObject {
  
  var bypassDnd: js.UndefOr[Boolean] = js.undefined
  
  var channelId: String
  
  var description: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var importance: Double
  
  var lightColor: js.UndefOr[String] = js.undefined
  
  var lightsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var lockScreenVisibility: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var showBadge: js.UndefOr[Boolean] = js.undefined
  
  var sound: js.UndefOr[String] = js.undefined
  
  var vibrationEnabled: js.UndefOr[Boolean] = js.undefined
  
  var vibrationPattern: js.UndefOr[js.Array[Double]] = js.undefined
}
object NativeAndroidChannel {
  
  inline def apply(channelId: String, importance: Double, name: String): NativeAndroidChannel = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeAndroidChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeAndroidChannel] (val x: Self) extends AnyVal {
    
    inline def setBypassDnd(value: Boolean): Self = StObject.set(x, "bypassDnd", value.asInstanceOf[js.Any])
    
    inline def setBypassDndUndefined: Self = StObject.set(x, "bypassDnd", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setImportance(value: Double): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setLightColor(value: String): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    
    inline def setLightsEnabled(value: Boolean): Self = StObject.set(x, "lightsEnabled", value.asInstanceOf[js.Any])
    
    inline def setLightsEnabledUndefined: Self = StObject.set(x, "lightsEnabled", js.undefined)
    
    inline def setLockScreenVisibility(value: Double): Self = StObject.set(x, "lockScreenVisibility", value.asInstanceOf[js.Any])
    
    inline def setLockScreenVisibilityUndefined: Self = StObject.set(x, "lockScreenVisibility", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShowBadge(value: Boolean): Self = StObject.set(x, "showBadge", value.asInstanceOf[js.Any])
    
    inline def setShowBadgeUndefined: Self = StObject.set(x, "showBadge", js.undefined)
    
    inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    inline def setVibrationEnabled(value: Boolean): Self = StObject.set(x, "vibrationEnabled", value.asInstanceOf[js.Any])
    
    inline def setVibrationEnabledUndefined: Self = StObject.set(x, "vibrationEnabled", js.undefined)
    
    inline def setVibrationPattern(value: js.Array[Double]): Self = StObject.set(x, "vibrationPattern", value.asInstanceOf[js.Any])
    
    inline def setVibrationPatternUndefined: Self = StObject.set(x, "vibrationPattern", js.undefined)
    
    inline def setVibrationPatternVarargs(value: Double*): Self = StObject.set(x, "vibrationPattern", js.Array(value*))
  }
}

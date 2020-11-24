package typings.reactNativeFirebase.mod.RNFirebase.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeAndroidChannel extends js.Object {
  
  var bypassDnd: js.UndefOr[Boolean] = js.native
  
  var channelId: String = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var importance: Double = js.native
  
  var lightColor: js.UndefOr[String] = js.native
  
  var lightsEnabled: js.UndefOr[Boolean] = js.native
  
  var lockScreenVisibility: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var showBadge: js.UndefOr[Boolean] = js.native
  
  var sound: js.UndefOr[String] = js.native
  
  var vibrationEnabled: js.UndefOr[Boolean] = js.native
  
  var vibrationPattern: js.UndefOr[js.Array[Double]] = js.native
}
object NativeAndroidChannel {
  
  @scala.inline
  def apply(channelId: String, importance: Double, name: String): NativeAndroidChannel = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeAndroidChannel]
  }
  
  @scala.inline
  implicit class NativeAndroidChannelOps[Self <: NativeAndroidChannel] (val x: Self) extends AnyVal {
    
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportance(value: Double): Self = this.set("importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassDnd(value: Boolean): Self = this.set("bypassDnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassDnd: Self = this.set("bypassDnd", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setLightColor(value: String): Self = this.set("lightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightColor: Self = this.set("lightColor", js.undefined)
    
    @scala.inline
    def setLightsEnabled(value: Boolean): Self = this.set("lightsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightsEnabled: Self = this.set("lightsEnabled", js.undefined)
    
    @scala.inline
    def setLockScreenVisibility(value: Double): Self = this.set("lockScreenVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockScreenVisibility: Self = this.set("lockScreenVisibility", js.undefined)
    
    @scala.inline
    def setShowBadge(value: Boolean): Self = this.set("showBadge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBadge: Self = this.set("showBadge", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def setVibrationEnabled(value: Boolean): Self = this.set("vibrationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVibrationEnabled: Self = this.set("vibrationEnabled", js.undefined)
    
    @scala.inline
    def setVibrationPatternVarargs(value: Double*): Self = this.set("vibrationPattern", js.Array(value :_*))
    
    @scala.inline
    def setVibrationPattern(value: js.Array[Double]): Self = this.set("vibrationPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVibrationPattern: Self = this.set("vibrationPattern", js.undefined)
  }
}

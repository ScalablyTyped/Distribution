package typings.reactNativePermissions

import typings.reactNativePermissions.distTypescriptPermissionsDotandroidMod.AndroidPermissionMap
import typings.reactNativePermissions.distTypescriptPermissionsDotiosMod.IOSPermissionMap
import typings.reactNativePermissions.distTypescriptPermissionsDotwindowsMod.WindowsPermissionMap
import typings.reactNativePermissions.distTypescriptResultsMod.ResultMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypescriptTypesMod {
  
  type AndroidPermission = Values[AndroidPermissionMap]
  
  type IOSPermission = Values[IOSPermissionMap]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePermissions.reactNativePermissionsStrings.full
    - typings.reactNativePermissions.reactNativePermissionsStrings.reduced
  */
  trait LocationAccuracy extends StObject
  object LocationAccuracy {
    
    inline def full: typings.reactNativePermissions.reactNativePermissionsStrings.full = "full".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.full]
    
    inline def reduced: typings.reactNativePermissions.reactNativePermissionsStrings.reduced = "reduced".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.reduced]
  }
  
  trait LocationAccuracyOptions extends StObject {
    
    var purposeKey: String
  }
  object LocationAccuracyOptions {
    
    inline def apply(purposeKey: String): LocationAccuracyOptions = {
      val __obj = js.Dynamic.literal(purposeKey = purposeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationAccuracyOptions]
    }
    
    extension [Self <: LocationAccuracyOptions](x: Self) {
      
      inline def setPurposeKey(value: String): Self = StObject.set(x, "purposeKey", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePermissions.reactNativePermissionsStrings.alert
    - typings.reactNativePermissions.reactNativePermissionsStrings.badge
    - typings.reactNativePermissions.reactNativePermissionsStrings.sound
    - typings.reactNativePermissions.reactNativePermissionsStrings.carPlay
    - typings.reactNativePermissions.reactNativePermissionsStrings.criticalAlert
    - typings.reactNativePermissions.reactNativePermissionsStrings.provisional
    - typings.reactNativePermissions.reactNativePermissionsStrings.providesAppSettings
  */
  trait NotificationOption extends StObject
  object NotificationOption {
    
    inline def alert: typings.reactNativePermissions.reactNativePermissionsStrings.alert = "alert".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.alert]
    
    inline def badge: typings.reactNativePermissions.reactNativePermissionsStrings.badge = "badge".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.badge]
    
    inline def carPlay: typings.reactNativePermissions.reactNativePermissionsStrings.carPlay = "carPlay".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.carPlay]
    
    inline def criticalAlert: typings.reactNativePermissions.reactNativePermissionsStrings.criticalAlert = "criticalAlert".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.criticalAlert]
    
    inline def providesAppSettings: typings.reactNativePermissions.reactNativePermissionsStrings.providesAppSettings = "providesAppSettings".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.providesAppSettings]
    
    inline def provisional: typings.reactNativePermissions.reactNativePermissionsStrings.provisional = "provisional".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.provisional]
    
    inline def sound: typings.reactNativePermissions.reactNativePermissionsStrings.sound = "sound".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.sound]
  }
  
  trait NotificationSettings extends StObject {
    
    var alert: js.UndefOr[Boolean] = js.undefined
    
    var badge: js.UndefOr[Boolean] = js.undefined
    
    var carPlay: js.UndefOr[Boolean] = js.undefined
    
    var criticalAlert: js.UndefOr[Boolean] = js.undefined
    
    var lockScreen: js.UndefOr[Boolean] = js.undefined
    
    var notificationCenter: js.UndefOr[Boolean] = js.undefined
    
    var providesAppSettings: js.UndefOr[Boolean] = js.undefined
    
    var provisional: js.UndefOr[Boolean] = js.undefined
    
    var sound: js.UndefOr[Boolean] = js.undefined
  }
  object NotificationSettings {
    
    inline def apply(): NotificationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationSettings]
    }
    
    extension [Self <: NotificationSettings](x: Self) {
      
      inline def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setCarPlay(value: Boolean): Self = StObject.set(x, "carPlay", value.asInstanceOf[js.Any])
      
      inline def setCarPlayUndefined: Self = StObject.set(x, "carPlay", js.undefined)
      
      inline def setCriticalAlert(value: Boolean): Self = StObject.set(x, "criticalAlert", value.asInstanceOf[js.Any])
      
      inline def setCriticalAlertUndefined: Self = StObject.set(x, "criticalAlert", js.undefined)
      
      inline def setLockScreen(value: Boolean): Self = StObject.set(x, "lockScreen", value.asInstanceOf[js.Any])
      
      inline def setLockScreenUndefined: Self = StObject.set(x, "lockScreen", js.undefined)
      
      inline def setNotificationCenter(value: Boolean): Self = StObject.set(x, "notificationCenter", value.asInstanceOf[js.Any])
      
      inline def setNotificationCenterUndefined: Self = StObject.set(x, "notificationCenter", js.undefined)
      
      inline def setProvidesAppSettings(value: Boolean): Self = StObject.set(x, "providesAppSettings", value.asInstanceOf[js.Any])
      
      inline def setProvidesAppSettingsUndefined: Self = StObject.set(x, "providesAppSettings", js.undefined)
      
      inline def setProvisional(value: Boolean): Self = StObject.set(x, "provisional", value.asInstanceOf[js.Any])
      
      inline def setProvisionalUndefined: Self = StObject.set(x, "provisional", js.undefined)
      
      inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    }
  }
  
  trait NotificationsResponse extends StObject {
    
    var settings: NotificationSettings
    
    var status: PermissionStatus
  }
  object NotificationsResponse {
    
    inline def apply(settings: NotificationSettings, status: PermissionStatus): NotificationsResponse = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationsResponse]
    }
    
    extension [Self <: NotificationsResponse](x: Self) {
      
      inline def setSettings(value: NotificationSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PermissionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type Permission = AndroidPermission | IOSPermission | WindowsPermission
  
  type PermissionStatus = Values[ResultMap]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type WindowsPermission = Values[WindowsPermissionMap]
}

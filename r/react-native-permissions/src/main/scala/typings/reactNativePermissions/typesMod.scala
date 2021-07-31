package typings.reactNativePermissions

import typings.reactNativePermissions.permissionsAndroidMod.AndroidPermissionMap
import typings.reactNativePermissions.permissionsIosMod.IOSPermissionMap
import typings.reactNativePermissions.permissionsWindowsMod.WindowsPermissionMap
import typings.reactNativePermissions.resultsMod.ResultMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AndroidPermission = Values[AndroidPermissionMap]
  
  type IOSPermission = Values[IOSPermissionMap]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePermissions.reactNativePermissionsStrings.full
    - typings.reactNativePermissions.reactNativePermissionsStrings.reduced
  */
  trait LocationAccuracy extends StObject
  object LocationAccuracy {
    
    @scala.inline
    def full: typings.reactNativePermissions.reactNativePermissionsStrings.full = "full".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.full]
    
    @scala.inline
    def reduced: typings.reactNativePermissions.reactNativePermissionsStrings.reduced = "reduced".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.reduced]
  }
  
  trait LocationAccuracyOptions extends StObject {
    
    var purposeKey: String
  }
  object LocationAccuracyOptions {
    
    @scala.inline
    def apply(purposeKey: String): LocationAccuracyOptions = {
      val __obj = js.Dynamic.literal(purposeKey = purposeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationAccuracyOptions]
    }
    
    @scala.inline
    implicit class LocationAccuracyOptionsMutableBuilder[Self <: LocationAccuracyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPurposeKey(value: String): Self = StObject.set(x, "purposeKey", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePermissions.reactNativePermissionsStrings.alert
    - typings.reactNativePermissions.reactNativePermissionsStrings.badge
    - typings.reactNativePermissions.reactNativePermissionsStrings.sound
    - typings.reactNativePermissions.reactNativePermissionsStrings.carPlay
    - typings.reactNativePermissions.reactNativePermissionsStrings.criticalAlert
    - typings.reactNativePermissions.reactNativePermissionsStrings.provisional
  */
  trait NotificationOption extends StObject
  object NotificationOption {
    
    @scala.inline
    def alert: typings.reactNativePermissions.reactNativePermissionsStrings.alert = "alert".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.alert]
    
    @scala.inline
    def badge: typings.reactNativePermissions.reactNativePermissionsStrings.badge = "badge".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.badge]
    
    @scala.inline
    def carPlay: typings.reactNativePermissions.reactNativePermissionsStrings.carPlay = "carPlay".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.carPlay]
    
    @scala.inline
    def criticalAlert: typings.reactNativePermissions.reactNativePermissionsStrings.criticalAlert = "criticalAlert".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.criticalAlert]
    
    @scala.inline
    def provisional: typings.reactNativePermissions.reactNativePermissionsStrings.provisional = "provisional".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.provisional]
    
    @scala.inline
    def sound: typings.reactNativePermissions.reactNativePermissionsStrings.sound = "sound".asInstanceOf[typings.reactNativePermissions.reactNativePermissionsStrings.sound]
  }
  
  trait NotificationSettings extends StObject {
    
    var alert: js.UndefOr[Boolean] = js.undefined
    
    var badge: js.UndefOr[Boolean] = js.undefined
    
    var carPlay: js.UndefOr[Boolean] = js.undefined
    
    var criticalAlert: js.UndefOr[Boolean] = js.undefined
    
    var lockScreen: js.UndefOr[Boolean] = js.undefined
    
    var notificationCenter: js.UndefOr[Boolean] = js.undefined
    
    var provisional: js.UndefOr[Boolean] = js.undefined
    
    var sound: js.UndefOr[Boolean] = js.undefined
  }
  object NotificationSettings {
    
    @scala.inline
    def apply(): NotificationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationSettings]
    }
    
    @scala.inline
    implicit class NotificationSettingsMutableBuilder[Self <: NotificationSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      @scala.inline
      def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setCarPlay(value: Boolean): Self = StObject.set(x, "carPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarPlayUndefined: Self = StObject.set(x, "carPlay", js.undefined)
      
      @scala.inline
      def setCriticalAlert(value: Boolean): Self = StObject.set(x, "criticalAlert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCriticalAlertUndefined: Self = StObject.set(x, "criticalAlert", js.undefined)
      
      @scala.inline
      def setLockScreen(value: Boolean): Self = StObject.set(x, "lockScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockScreenUndefined: Self = StObject.set(x, "lockScreen", js.undefined)
      
      @scala.inline
      def setNotificationCenter(value: Boolean): Self = StObject.set(x, "notificationCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationCenterUndefined: Self = StObject.set(x, "notificationCenter", js.undefined)
      
      @scala.inline
      def setProvisional(value: Boolean): Self = StObject.set(x, "provisional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionalUndefined: Self = StObject.set(x, "provisional", js.undefined)
      
      @scala.inline
      def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    }
  }
  
  trait NotificationsResponse extends StObject {
    
    var settings: NotificationSettings
    
    var status: PermissionStatus
  }
  object NotificationsResponse {
    
    @scala.inline
    def apply(settings: NotificationSettings, status: PermissionStatus): NotificationsResponse = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationsResponse]
    }
    
    @scala.inline
    implicit class NotificationsResponseMutableBuilder[Self <: NotificationsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSettings(value: NotificationSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: PermissionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type Permission = AndroidPermission | IOSPermission | WindowsPermission
  
  type PermissionStatus = Values[ResultMap]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type WindowsPermission = Values[WindowsPermissionMap]
}

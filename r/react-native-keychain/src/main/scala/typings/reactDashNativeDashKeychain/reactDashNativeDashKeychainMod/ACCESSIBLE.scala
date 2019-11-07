package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ACCESSIBLE extends js.Object

@JSImport("react-native-keychain", "ACCESSIBLE")
@js.native
object ACCESSIBLE extends js.Object {
  @js.native
  sealed trait AFTER_FIRST_UNLOCK extends ACCESSIBLE
  
  @js.native
  sealed trait AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY extends ACCESSIBLE
  
  @js.native
  sealed trait ALWAYS extends ACCESSIBLE
  
  @js.native
  sealed trait ALWAYS_THIS_DEVICE_ONLY extends ACCESSIBLE
  
  @js.native
  sealed trait WHEN_PASSCODE_SET_THIS_DEVICE_ONLY extends ACCESSIBLE
  
  @js.native
  sealed trait WHEN_UNLOCKED extends ACCESSIBLE
  
  @js.native
  sealed trait WHEN_UNLOCKED_THIS_DEVICE_ONLY extends ACCESSIBLE
  
  /* "AccessibleAfterFirstUnlock" */ val AFTER_FIRST_UNLOCK: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.AFTER_FIRST_UNLOCK with String = js.native
  /* "AccessibleAfterFirstUnlockThisDeviceOnly" */ val AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY with String = js.native
  /* "AccessibleAlways" */ val ALWAYS: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.ALWAYS with String = js.native
  /* "AccessibleAlwaysThisDeviceOnly" */ val ALWAYS_THIS_DEVICE_ONLY: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.ALWAYS_THIS_DEVICE_ONLY with String = js.native
  /* "AccessibleWhenPasscodeSetThisDeviceOnly" */ val WHEN_PASSCODE_SET_THIS_DEVICE_ONLY: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.WHEN_PASSCODE_SET_THIS_DEVICE_ONLY with String = js.native
  /* "AccessibleWhenUnlocked" */ val WHEN_UNLOCKED: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.WHEN_UNLOCKED with String = js.native
  /* "AccessibleWhenUnlockedThisDeviceOnly" */ val WHEN_UNLOCKED_THIS_DEVICE_ONLY: typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.WHEN_UNLOCKED_THIS_DEVICE_ONLY with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACCESSIBLE with String] = js.native
}


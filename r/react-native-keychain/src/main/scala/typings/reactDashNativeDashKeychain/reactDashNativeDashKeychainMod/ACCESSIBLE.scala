package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.AFTER_FIRST_UNLOCK
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.ALWAYS
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.ALWAYS_THIS_DEVICE_ONLY
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.WHEN_PASSCODE_SET_THIS_DEVICE_ONLY
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.WHEN_UNLOCKED
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.ACCESSIBLE.WHEN_UNLOCKED_THIS_DEVICE_ONLY
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACCESSIBLE with String] = js.native
  /* "AccessibleAfterFirstUnlock" */ @js.native
  object AFTER_FIRST_UNLOCK extends TopLevel[AFTER_FIRST_UNLOCK with String]
  
  /* "AccessibleAfterFirstUnlockThisDeviceOnly" */ @js.native
  object AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY extends TopLevel[AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY with String]
  
  /* "AccessibleAlways" */ @js.native
  object ALWAYS extends TopLevel[ALWAYS with String]
  
  /* "AccessibleAlwaysThisDeviceOnly" */ @js.native
  object ALWAYS_THIS_DEVICE_ONLY extends TopLevel[ALWAYS_THIS_DEVICE_ONLY with String]
  
  /* "AccessibleWhenPasscodeSetThisDeviceOnly" */ @js.native
  object WHEN_PASSCODE_SET_THIS_DEVICE_ONLY extends TopLevel[WHEN_PASSCODE_SET_THIS_DEVICE_ONLY with String]
  
  /* "AccessibleWhenUnlocked" */ @js.native
  object WHEN_UNLOCKED extends TopLevel[WHEN_UNLOCKED with String]
  
  /* "AccessibleWhenUnlockedThisDeviceOnly" */ @js.native
  object WHEN_UNLOCKED_THIS_DEVICE_ONLY extends TopLevel[WHEN_UNLOCKED_THIS_DEVICE_ONLY with String]
  
}


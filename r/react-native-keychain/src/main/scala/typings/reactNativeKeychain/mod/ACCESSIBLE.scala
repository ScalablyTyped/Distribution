package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ACCESSIBLE extends StObject
@JSImport("react-native-keychain", "ACCESSIBLE")
@js.native
object ACCESSIBLE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACCESSIBLE with String] = js.native
  
  @js.native
  sealed trait AFTER_FIRST_UNLOCK extends ACCESSIBLE
  /* "AccessibleAfterFirstUnlock" */ val AFTER_FIRST_UNLOCK: typings.reactNativeKeychain.mod.ACCESSIBLE.AFTER_FIRST_UNLOCK with String = js.native
  
  @js.native
  sealed trait AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY extends ACCESSIBLE
  /* "AccessibleAfterFirstUnlockThisDeviceOnly" */ val AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY: typings.reactNativeKeychain.mod.ACCESSIBLE.AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY with String = js.native
  
  @js.native
  sealed trait ALWAYS extends ACCESSIBLE
  /* "AccessibleAlways" */ val ALWAYS: typings.reactNativeKeychain.mod.ACCESSIBLE.ALWAYS with String = js.native
  
  @js.native
  sealed trait ALWAYS_THIS_DEVICE_ONLY extends ACCESSIBLE
  /* "AccessibleAlwaysThisDeviceOnly" */ val ALWAYS_THIS_DEVICE_ONLY: typings.reactNativeKeychain.mod.ACCESSIBLE.ALWAYS_THIS_DEVICE_ONLY with String = js.native
  
  @js.native
  sealed trait WHEN_PASSCODE_SET_THIS_DEVICE_ONLY extends ACCESSIBLE
  /* "AccessibleWhenPasscodeSetThisDeviceOnly" */ val WHEN_PASSCODE_SET_THIS_DEVICE_ONLY: typings.reactNativeKeychain.mod.ACCESSIBLE.WHEN_PASSCODE_SET_THIS_DEVICE_ONLY with String = js.native
  
  @js.native
  sealed trait WHEN_UNLOCKED extends ACCESSIBLE
  /* "AccessibleWhenUnlocked" */ val WHEN_UNLOCKED: typings.reactNativeKeychain.mod.ACCESSIBLE.WHEN_UNLOCKED with String = js.native
  
  @js.native
  sealed trait WHEN_UNLOCKED_THIS_DEVICE_ONLY extends ACCESSIBLE
  /* "AccessibleWhenUnlockedThisDeviceOnly" */ val WHEN_UNLOCKED_THIS_DEVICE_ONLY: typings.reactNativeKeychain.mod.ACCESSIBLE.WHEN_UNLOCKED_THIS_DEVICE_ONLY with String = js.native
}

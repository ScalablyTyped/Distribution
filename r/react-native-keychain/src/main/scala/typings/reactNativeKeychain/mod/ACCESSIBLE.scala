package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ACCESSIBLE extends StObject
@JSImport("react-native-keychain", "ACCESSIBLE")
@js.native
object ACCESSIBLE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACCESSIBLE & String] = js.native
  
  @js.native
  sealed trait AFTER_FIRST_UNLOCK
    extends StObject
       with ACCESSIBLE
  /* "AccessibleAfterFirstUnlock" */ val AFTER_FIRST_UNLOCK: typings.reactNativeKeychain.mod.ACCESSIBLE.AFTER_FIRST_UNLOCK & String = js.native
  
  @js.native
  sealed trait AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY
    extends StObject
       with ACCESSIBLE
  /* "AccessibleAfterFirstUnlockThisDeviceOnly" */ val AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY: typings.reactNativeKeychain.mod.ACCESSIBLE.AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY & String = js.native
  
  @js.native
  sealed trait ALWAYS
    extends StObject
       with ACCESSIBLE
  /* "AccessibleAlways" */ val ALWAYS: typings.reactNativeKeychain.mod.ACCESSIBLE.ALWAYS & String = js.native
  
  @js.native
  sealed trait ALWAYS_THIS_DEVICE_ONLY
    extends StObject
       with ACCESSIBLE
  /* "AccessibleAlwaysThisDeviceOnly" */ val ALWAYS_THIS_DEVICE_ONLY: typings.reactNativeKeychain.mod.ACCESSIBLE.ALWAYS_THIS_DEVICE_ONLY & String = js.native
  
  @js.native
  sealed trait WHEN_PASSCODE_SET_THIS_DEVICE_ONLY
    extends StObject
       with ACCESSIBLE
  /* "AccessibleWhenPasscodeSetThisDeviceOnly" */ val WHEN_PASSCODE_SET_THIS_DEVICE_ONLY: typings.reactNativeKeychain.mod.ACCESSIBLE.WHEN_PASSCODE_SET_THIS_DEVICE_ONLY & String = js.native
  
  @js.native
  sealed trait WHEN_UNLOCKED
    extends StObject
       with ACCESSIBLE
  /* "AccessibleWhenUnlocked" */ val WHEN_UNLOCKED: typings.reactNativeKeychain.mod.ACCESSIBLE.WHEN_UNLOCKED & String = js.native
  
  @js.native
  sealed trait WHEN_UNLOCKED_THIS_DEVICE_ONLY
    extends StObject
       with ACCESSIBLE
  /* "AccessibleWhenUnlockedThisDeviceOnly" */ val WHEN_UNLOCKED_THIS_DEVICE_ONLY: typings.reactNativeKeychain.mod.ACCESSIBLE.WHEN_UNLOCKED_THIS_DEVICE_ONLY & String = js.native
}

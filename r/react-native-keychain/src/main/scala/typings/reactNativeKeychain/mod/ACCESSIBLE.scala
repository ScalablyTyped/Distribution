package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ACCESSIBLE extends js.Object
@JSImport("react-native-keychain", "ACCESSIBLE")
@js.native
object ACCESSIBLE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACCESSIBLE with String] = js.native
  
  @js.native
  sealed trait AFTER_FIRST_UNLOCK extends ACCESSIBLE
  /* "AccessibleAfterFirstUnlock" */ @js.native
  object AFTER_FIRST_UNLOCK extends TopLevel[AFTER_FIRST_UNLOCK with String]
  
  @js.native
  sealed trait AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY extends ACCESSIBLE
  /* "AccessibleAfterFirstUnlockThisDeviceOnly" */ @js.native
  object AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY extends TopLevel[AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY with String]
  
  @js.native
  sealed trait ALWAYS extends ACCESSIBLE
  /* "AccessibleAlways" */ @js.native
  object ALWAYS extends TopLevel[ALWAYS with String]
  
  @js.native
  sealed trait ALWAYS_THIS_DEVICE_ONLY extends ACCESSIBLE
  /* "AccessibleAlwaysThisDeviceOnly" */ @js.native
  object ALWAYS_THIS_DEVICE_ONLY extends TopLevel[ALWAYS_THIS_DEVICE_ONLY with String]
  
  @js.native
  sealed trait WHEN_PASSCODE_SET_THIS_DEVICE_ONLY extends ACCESSIBLE
  /* "AccessibleWhenPasscodeSetThisDeviceOnly" */ @js.native
  object WHEN_PASSCODE_SET_THIS_DEVICE_ONLY extends TopLevel[WHEN_PASSCODE_SET_THIS_DEVICE_ONLY with String]
  
  @js.native
  sealed trait WHEN_UNLOCKED extends ACCESSIBLE
  /* "AccessibleWhenUnlocked" */ @js.native
  object WHEN_UNLOCKED extends TopLevel[WHEN_UNLOCKED with String]
  
  @js.native
  sealed trait WHEN_UNLOCKED_THIS_DEVICE_ONLY extends ACCESSIBLE
  /* "AccessibleWhenUnlockedThisDeviceOnly" */ @js.native
  object WHEN_UNLOCKED_THIS_DEVICE_ONLY extends TopLevel[WHEN_UNLOCKED_THIS_DEVICE_ONLY with String]
}

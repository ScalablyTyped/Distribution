package typings.reactDashNativeDashKeychain

import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.LAPolicy
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.SecAccessControl
import typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod.SecAccessible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashKeychainStrings {
  @js.native
  sealed trait AccessibleAfterFirstUnlock extends SecAccessible
  
  @js.native
  sealed trait AccessibleAfterFirstUnlockThisDeviceOnly extends SecAccessible
  
  @js.native
  sealed trait AccessibleAlways extends SecAccessible
  
  @js.native
  sealed trait AccessibleAlwaysThisDeviceOnly extends SecAccessible
  
  @js.native
  sealed trait AccessibleWhenPasscodeSetThisDeviceOnly extends SecAccessible
  
  @js.native
  sealed trait AccessibleWhenUnlocked extends SecAccessible
  
  @js.native
  sealed trait AccessibleWhenUnlockedThisDeviceOnly extends SecAccessible
  
  @js.native
  sealed trait ApplicationPassword extends SecAccessControl
  
  @js.native
  sealed trait Authentication extends LAPolicy
  
  @js.native
  sealed trait AuthenticationWithBiometrics extends LAPolicy
  
  @js.native
  sealed trait BiometryAny extends SecAccessControl
  
  @js.native
  sealed trait BiometryAnyOrDevicePasscode extends SecAccessControl
  
  @js.native
  sealed trait BiometryCurrentSet extends SecAccessControl
  
  @js.native
  sealed trait BiometryCurrentSetOrDevicePasscode extends SecAccessControl
  
  @js.native
  sealed trait DevicePasscode extends SecAccessControl
  
  @js.native
  sealed trait UserPresence extends SecAccessControl
  
  @scala.inline
  def AccessibleAfterFirstUnlock: AccessibleAfterFirstUnlock = "AccessibleAfterFirstUnlock".asInstanceOf[AccessibleAfterFirstUnlock]
  @scala.inline
  def AccessibleAfterFirstUnlockThisDeviceOnly: AccessibleAfterFirstUnlockThisDeviceOnly = "AccessibleAfterFirstUnlockThisDeviceOnly".asInstanceOf[AccessibleAfterFirstUnlockThisDeviceOnly]
  @scala.inline
  def AccessibleAlways: AccessibleAlways = "AccessibleAlways".asInstanceOf[AccessibleAlways]
  @scala.inline
  def AccessibleAlwaysThisDeviceOnly: AccessibleAlwaysThisDeviceOnly = "AccessibleAlwaysThisDeviceOnly".asInstanceOf[AccessibleAlwaysThisDeviceOnly]
  @scala.inline
  def AccessibleWhenPasscodeSetThisDeviceOnly: AccessibleWhenPasscodeSetThisDeviceOnly = "AccessibleWhenPasscodeSetThisDeviceOnly".asInstanceOf[AccessibleWhenPasscodeSetThisDeviceOnly]
  @scala.inline
  def AccessibleWhenUnlocked: AccessibleWhenUnlocked = "AccessibleWhenUnlocked".asInstanceOf[AccessibleWhenUnlocked]
  @scala.inline
  def AccessibleWhenUnlockedThisDeviceOnly: AccessibleWhenUnlockedThisDeviceOnly = "AccessibleWhenUnlockedThisDeviceOnly".asInstanceOf[AccessibleWhenUnlockedThisDeviceOnly]
  @scala.inline
  def ApplicationPassword: ApplicationPassword = "ApplicationPassword".asInstanceOf[ApplicationPassword]
  @scala.inline
  def Authentication: Authentication = "Authentication".asInstanceOf[Authentication]
  @scala.inline
  def AuthenticationWithBiometrics: AuthenticationWithBiometrics = "AuthenticationWithBiometrics".asInstanceOf[AuthenticationWithBiometrics]
  @scala.inline
  def BiometryAny: BiometryAny = "BiometryAny".asInstanceOf[BiometryAny]
  @scala.inline
  def BiometryAnyOrDevicePasscode: BiometryAnyOrDevicePasscode = "BiometryAnyOrDevicePasscode".asInstanceOf[BiometryAnyOrDevicePasscode]
  @scala.inline
  def BiometryCurrentSet: BiometryCurrentSet = "BiometryCurrentSet".asInstanceOf[BiometryCurrentSet]
  @scala.inline
  def BiometryCurrentSetOrDevicePasscode: BiometryCurrentSetOrDevicePasscode = "BiometryCurrentSetOrDevicePasscode".asInstanceOf[BiometryCurrentSetOrDevicePasscode]
  @scala.inline
  def DevicePasscode: DevicePasscode = "DevicePasscode".asInstanceOf[DevicePasscode]
  @scala.inline
  def UserPresence: UserPresence = "UserPresence".asInstanceOf[UserPresence]
}


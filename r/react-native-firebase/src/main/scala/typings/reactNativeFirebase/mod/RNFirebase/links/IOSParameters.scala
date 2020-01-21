package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOSParameters extends js.Object {
  def setAppStoreId(appStoreId: String): DynamicLink
  def setBundleId(bundleId: String): DynamicLink
  def setCustomScheme(customScheme: String): DynamicLink
  def setFallbackUrl(fallbackUrl: String): DynamicLink
  def setIPadBundleId(iPadBundleId: String): DynamicLink
  def setIPadFallbackUrl(iPadFallbackUrl: String): DynamicLink
  def setMinimumVersion(minimumVersion: String): DynamicLink
}

object IOSParameters {
  @scala.inline
  def apply(
    setAppStoreId: String => DynamicLink,
    setBundleId: String => DynamicLink,
    setCustomScheme: String => DynamicLink,
    setFallbackUrl: String => DynamicLink,
    setIPadBundleId: String => DynamicLink,
    setIPadFallbackUrl: String => DynamicLink,
    setMinimumVersion: String => DynamicLink
  ): IOSParameters = {
    val __obj = js.Dynamic.literal(setAppStoreId = js.Any.fromFunction1(setAppStoreId), setBundleId = js.Any.fromFunction1(setBundleId), setCustomScheme = js.Any.fromFunction1(setCustomScheme), setFallbackUrl = js.Any.fromFunction1(setFallbackUrl), setIPadBundleId = js.Any.fromFunction1(setIPadBundleId), setIPadFallbackUrl = js.Any.fromFunction1(setIPadFallbackUrl), setMinimumVersion = js.Any.fromFunction1(setMinimumVersion))
  
    __obj.asInstanceOf[IOSParameters]
  }
}


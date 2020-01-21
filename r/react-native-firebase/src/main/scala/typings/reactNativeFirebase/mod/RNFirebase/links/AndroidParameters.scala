package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidParameters extends js.Object {
  def setFallbackUrl(fallbackUrl: String): DynamicLink
  def setMinimumVersion(minimumVersion: Double): DynamicLink
  def setPackageName(packageName: String): DynamicLink
}

object AndroidParameters {
  @scala.inline
  def apply(
    setFallbackUrl: String => DynamicLink,
    setMinimumVersion: Double => DynamicLink,
    setPackageName: String => DynamicLink
  ): AndroidParameters = {
    val __obj = js.Dynamic.literal(setFallbackUrl = js.Any.fromFunction1(setFallbackUrl), setMinimumVersion = js.Any.fromFunction1(setMinimumVersion), setPackageName = js.Any.fromFunction1(setPackageName))
  
    __obj.asInstanceOf[AndroidParameters]
  }
}


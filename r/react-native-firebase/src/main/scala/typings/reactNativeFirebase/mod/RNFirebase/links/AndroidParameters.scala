package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidParameters extends js.Object {
  def setFallbackUrl(fallbackUrl: String): DynamicLink = js.native
  def setMinimumVersion(minimumVersion: Double): DynamicLink = js.native
  def setPackageName(packageName: String): DynamicLink = js.native
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
  @scala.inline
  implicit class AndroidParametersOps[Self <: AndroidParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetFallbackUrl(value: String => DynamicLink): Self = this.set("setFallbackUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMinimumVersion(value: Double => DynamicLink): Self = this.set("setMinimumVersion", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPackageName(value: String => DynamicLink): Self = this.set("setPackageName", js.Any.fromFunction1(value))
  }
  
}


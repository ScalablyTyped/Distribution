package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOSParameters extends js.Object {
  
  def setAppStoreId(appStoreId: String): DynamicLink = js.native
  
  def setBundleId(bundleId: String): DynamicLink = js.native
  
  def setCustomScheme(customScheme: String): DynamicLink = js.native
  
  def setFallbackUrl(fallbackUrl: String): DynamicLink = js.native
  
  def setIPadBundleId(iPadBundleId: String): DynamicLink = js.native
  
  def setIPadFallbackUrl(iPadFallbackUrl: String): DynamicLink = js.native
  
  def setMinimumVersion(minimumVersion: String): DynamicLink = js.native
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
  
  @scala.inline
  implicit class IOSParametersOps[Self <: IOSParameters] (val x: Self) extends AnyVal {
    
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
    def setSetAppStoreId(value: String => DynamicLink): Self = this.set("setAppStoreId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBundleId(value: String => DynamicLink): Self = this.set("setBundleId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCustomScheme(value: String => DynamicLink): Self = this.set("setCustomScheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFallbackUrl(value: String => DynamicLink): Self = this.set("setFallbackUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIPadBundleId(value: String => DynamicLink): Self = this.set("setIPadBundleId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIPadFallbackUrl(value: String => DynamicLink): Self = this.set("setIPadFallbackUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinimumVersion(value: String => DynamicLink): Self = this.set("setMinimumVersion", js.Any.fromFunction1(value))
  }
}

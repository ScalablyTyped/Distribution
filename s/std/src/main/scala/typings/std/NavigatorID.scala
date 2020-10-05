package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorID extends js.Object {
  val appCodeName: java.lang.String = js.native
  val appName: java.lang.String = js.native
  val appVersion: java.lang.String = js.native
  val platform: java.lang.String = js.native
  val product: java.lang.String = js.native
  val productSub: java.lang.String = js.native
  val userAgent: java.lang.String = js.native
  val vendor: java.lang.String = js.native
  val vendorSub: java.lang.String = js.native
}

object NavigatorID {
  @scala.inline
  def apply(
    appCodeName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    platform: java.lang.String,
    product: java.lang.String,
    productSub: java.lang.String,
    userAgent: java.lang.String,
    vendor: java.lang.String,
    vendorSub: java.lang.String
  ): NavigatorID = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productSub = productSub.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorSub = vendorSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorID]
  }
  @scala.inline
  implicit class NavigatorIDOps[Self <: NavigatorID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppCodeName(value: java.lang.String): Self = this.set("appCodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppName(value: java.lang.String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppVersion(value: java.lang.String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: java.lang.String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct(value: java.lang.String): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductSub(value: java.lang.String): Self = this.set("productSub", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAgent(value: java.lang.String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendor(value: java.lang.String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendorSub(value: java.lang.String): Self = this.set("vendorSub", value.asInstanceOf[js.Any])
  }
  
}


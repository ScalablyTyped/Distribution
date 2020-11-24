package typings.spdxExpressionParse.mod

import typings.spdxExpressionParse.spdxExpressionParseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseInfo extends Info {
  
  var license: String = js.native
  
  var plus: js.UndefOr[`true`] = js.native
}
object LicenseInfo {
  
  @scala.inline
  def apply(license: String): LicenseInfo = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseInfo]
  }
  
  @scala.inline
  implicit class LicenseInfoOps[Self <: LicenseInfo] (val x: Self) extends AnyVal {
    
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
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlus(value: `true`): Self = this.set("plus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlus: Self = this.set("plus", js.undefined)
  }
}

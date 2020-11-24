package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends js.Object {
  
  var allowedAccounts: js.UndefOr[js.Array[String]] = js.native
  
  var compatibleRuntimes: js.UndefOr[js.Array[String]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var licenseInfo: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  var retain: js.UndefOr[Boolean] = js.native
}
object Layer {
  
  @scala.inline
  def apply(path: String): Layer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedAccountsVarargs(value: String*): Self = this.set("allowedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setAllowedAccounts(value: js.Array[String]): Self = this.set("allowedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedAccounts: Self = this.set("allowedAccounts", js.undefined)
    
    @scala.inline
    def setCompatibleRuntimesVarargs(value: String*): Self = this.set("compatibleRuntimes", js.Array(value :_*))
    
    @scala.inline
    def setCompatibleRuntimes(value: js.Array[String]): Self = this.set("compatibleRuntimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibleRuntimes: Self = this.set("compatibleRuntimes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLicenseInfo(value: String): Self = this.set("licenseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseInfo: Self = this.set("licenseInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRetain(value: Boolean): Self = this.set("retain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetain: Self = this.set("retain", js.undefined)
  }
}

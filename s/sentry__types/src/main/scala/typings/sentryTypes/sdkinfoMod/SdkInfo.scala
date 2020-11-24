package typings.sentryTypes.sdkinfoMod

import typings.sentryTypes.packageMod.Package
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdkInfo extends js.Object {
  
  var integrations: js.UndefOr[js.Array[String]] = js.native
  
  var name: String = js.native
  
  var packages: js.UndefOr[js.Array[Package]] = js.native
  
  var version: String = js.native
}
object SdkInfo {
  
  @scala.inline
  def apply(name: String, version: String): SdkInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkInfo]
  }
  
  @scala.inline
  implicit class SdkInfoOps[Self <: SdkInfo] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationsVarargs(value: String*): Self = this.set("integrations", js.Array(value :_*))
    
    @scala.inline
    def setIntegrations(value: js.Array[String]): Self = this.set("integrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrations: Self = this.set("integrations", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: Package*): Self = this.set("packages", js.Array(value :_*))
    
    @scala.inline
    def setPackages(value: js.Array[Package]): Self = this.set("packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackages: Self = this.set("packages", js.undefined)
  }
}

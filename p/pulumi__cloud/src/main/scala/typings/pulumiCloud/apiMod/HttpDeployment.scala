package typings.pulumiCloud.apiMod

import typings.pulumiPulumi.outputMod.Output_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpDeployment extends js.Object {
  
  /**
    * An optional list of custom domain names, each corresponding to a
    * previous call to attachCustomDomain on the API.  Each name
    * should be mapped using a DNS A record.
    */
  var customDomainNames: js.Array[Output_[String]] = js.native
  
  /**
    * The URL at which the HttpDeployment is available to the Internet.
    */
  var url: Output_[String] = js.native
}
object HttpDeployment {
  
  @scala.inline
  def apply(customDomainNames: js.Array[Output_[String]], url: Output_[String]): HttpDeployment = {
    val __obj = js.Dynamic.literal(customDomainNames = customDomainNames.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDeployment]
  }
  
  @scala.inline
  implicit class HttpDeploymentOps[Self <: HttpDeployment] (val x: Self) extends AnyVal {
    
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
    def setCustomDomainNamesVarargs(value: Output_[String]*): Self = this.set("customDomainNames", js.Array(value :_*))
    
    @scala.inline
    def setCustomDomainNames(value: js.Array[Output_[String]]): Self = this.set("customDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Output_[String]): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}

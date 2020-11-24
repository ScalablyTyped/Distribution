package typings.serverless.awsProviderMod

import typings.serverless.anon.OriginProtocolPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Origin extends js.Object {
  
  var CustomOriginConfig: OriginProtocolPolicy = js.native
  
  var DomainName: String = js.native
  
  var OriginPath: String = js.native
}
object Origin {
  
  @scala.inline
  def apply(CustomOriginConfig: OriginProtocolPolicy, DomainName: String, OriginPath: String): Origin = {
    val __obj = js.Dynamic.literal(CustomOriginConfig = CustomOriginConfig.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], OriginPath = OriginPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
  
  @scala.inline
  implicit class OriginOps[Self <: Origin] (val x: Self) extends AnyVal {
    
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
    def setCustomOriginConfig(value: OriginProtocolPolicy): Self = this.set("CustomOriginConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPath(value: String): Self = this.set("OriginPath", value.asInstanceOf[js.Any])
  }
}

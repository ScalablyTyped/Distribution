package typings.serverless.awsProviderMod

import typings.serverless.anon.OriginProtocolPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Origin extends StObject {
  
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
  implicit class OriginMutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomOriginConfig(value: OriginProtocolPolicy): Self = StObject.set(x, "CustomOriginConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPath(value: String): Self = StObject.set(x, "OriginPath", value.asInstanceOf[js.Any])
  }
}

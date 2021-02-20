package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionOriginCustomHeader extends StObject {
  
  var name: String = js.native
  
  var value: String = js.native
}
object DistributionOriginCustomHeader {
  
  @scala.inline
  def apply(name: String, value: String): DistributionOriginCustomHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginCustomHeader]
  }
  
  @scala.inline
  implicit class DistributionOriginCustomHeaderMutableBuilder[Self <: DistributionOriginCustomHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

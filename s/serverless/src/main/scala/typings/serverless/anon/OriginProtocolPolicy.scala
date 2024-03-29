package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginProtocolPolicy extends StObject {
  
  var OriginProtocolPolicy: String
}
object OriginProtocolPolicy {
  
  inline def apply(OriginProtocolPolicy: String): OriginProtocolPolicy = {
    val __obj = js.Dynamic.literal(OriginProtocolPolicy = OriginProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginProtocolPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginProtocolPolicy] (val x: Self) extends AnyVal {
    
    inline def setOriginProtocolPolicy(value: String): Self = StObject.set(x, "OriginProtocolPolicy", value.asInstanceOf[js.Any])
  }
}

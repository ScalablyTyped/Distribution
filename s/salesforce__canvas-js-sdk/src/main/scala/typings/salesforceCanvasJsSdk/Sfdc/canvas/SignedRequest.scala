package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/canvas_request_object.htm
trait SignedRequest extends StObject {
  
  val algorithm: String
  
  val client: Client_
  
  val context: Context
  
  val issuedAt: String | Null
  
  val userId: String
}
object SignedRequest {
  
  inline def apply(algorithm: String, client: Client_, context: Context, userId: String): SignedRequest = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], issuedAt = null)
    __obj.asInstanceOf[SignedRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedRequest] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setClient(value: Client_): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setIssuedAt(value: String): Self = StObject.set(x, "issuedAt", value.asInstanceOf[js.Any])
    
    inline def setIssuedAtNull: Self = StObject.set(x, "issuedAt", null)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

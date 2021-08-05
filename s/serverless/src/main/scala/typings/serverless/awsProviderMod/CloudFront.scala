package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFront extends StObject {
  
  var eventType: String
  
  var includeBody: Boolean
  
  var origin: Origin
  
  var pathPattern: String
}
object CloudFront {
  
  inline def apply(eventType: String, includeBody: Boolean, origin: Origin, pathPattern: String): CloudFront = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], includeBody = includeBody.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFront]
  }
  
  extension [Self <: CloudFront](x: Self) {
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setIncludeBody(value: Boolean): Self = StObject.set(x, "includeBody", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Origin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPathPattern(value: String): Self = StObject.set(x, "pathPattern", value.asInstanceOf[js.Any])
  }
}

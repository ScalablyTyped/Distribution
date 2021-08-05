package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeadLetterTargetImport extends StObject {
  
  var arn: String
  
  var url: String
}
object DeadLetterTargetImport {
  
  inline def apply(arn: String, url: String): DeadLetterTargetImport = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeadLetterTargetImport]
  }
  
  extension [Self <: DeadLetterTargetImport](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

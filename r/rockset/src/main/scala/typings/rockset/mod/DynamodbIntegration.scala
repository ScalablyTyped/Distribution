package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamodbIntegration extends StObject {
  
  // credentials for an AWS access key integration
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
}
object DynamodbIntegration {
  
  inline def apply(): DynamodbIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamodbIntegration]
  }
  
  extension [Self <: DynamodbIntegration](x: Self) {
    
    inline def setAws_access_key(value: AwsAccessKey): Self = StObject.set(x, "aws_access_key", value.asInstanceOf[js.Any])
    
    inline def setAws_access_keyUndefined: Self = StObject.set(x, "aws_access_key", js.undefined)
  }
}

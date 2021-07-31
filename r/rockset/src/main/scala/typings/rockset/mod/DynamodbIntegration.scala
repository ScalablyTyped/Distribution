package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamodbIntegration extends StObject {
  
  // credentials for an AWS access key integration
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
}
object DynamodbIntegration {
  
  @scala.inline
  def apply(): DynamodbIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamodbIntegration]
  }
  
  @scala.inline
  implicit class DynamodbIntegrationMutableBuilder[Self <: DynamodbIntegration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAws_access_key(value: AwsAccessKey): Self = StObject.set(x, "aws_access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAws_access_keyUndefined: Self = StObject.set(x, "aws_access_key", js.undefined)
  }
}

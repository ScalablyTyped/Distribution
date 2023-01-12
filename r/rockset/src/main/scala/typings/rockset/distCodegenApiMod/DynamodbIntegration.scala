package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamodbIntegration extends StObject {
  
  /**
    * credentials for an AWS access key integration
    * @type {AwsAccessKey}
    * @memberof DynamodbIntegration
    */
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
  
  /**
    * role used for external id type authentication
    * @type {AwsRole}
    * @memberof DynamodbIntegration
    */
  var aws_role: js.UndefOr[AwsRole] = js.undefined
}
object DynamodbIntegration {
  
  inline def apply(): DynamodbIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamodbIntegration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamodbIntegration] (val x: Self) extends AnyVal {
    
    inline def setAws_access_key(value: AwsAccessKey): Self = StObject.set(x, "aws_access_key", value.asInstanceOf[js.Any])
    
    inline def setAws_access_keyUndefined: Self = StObject.set(x, "aws_access_key", js.undefined)
    
    inline def setAws_role(value: AwsRole): Self = StObject.set(x, "aws_role", value.asInstanceOf[js.Any])
    
    inline def setAws_roleUndefined: Self = StObject.set(x, "aws_role", js.undefined)
  }
}

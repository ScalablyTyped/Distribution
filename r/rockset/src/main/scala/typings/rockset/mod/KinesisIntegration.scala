package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisIntegration extends StObject {
  
  // credentials for an AWS access key integration
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
  
  // details of an AWS cross-account role integration
  var aws_role: js.UndefOr[AwsRole] = js.undefined
}
object KinesisIntegration {
  
  inline def apply(): KinesisIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisIntegration]
  }
  
  extension [Self <: KinesisIntegration](x: Self) {
    
    inline def setAws_access_key(value: AwsAccessKey): Self = StObject.set(x, "aws_access_key", value.asInstanceOf[js.Any])
    
    inline def setAws_access_keyUndefined: Self = StObject.set(x, "aws_access_key", js.undefined)
    
    inline def setAws_role(value: AwsRole): Self = StObject.set(x, "aws_role", value.asInstanceOf[js.Any])
    
    inline def setAws_roleUndefined: Self = StObject.set(x, "aws_role", js.undefined)
  }
}

package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Integration extends StObject {
  
  /**
    * credentials for an AWS access key integration
    * @type {AwsAccessKey}
    * @memberof S3Integration
    */
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
  
  /**
    * details of an AWS cross-account role integration
    * @type {AwsRole}
    * @memberof S3Integration
    */
  var aws_role: js.UndefOr[AwsRole] = js.undefined
}
object S3Integration {
  
  inline def apply(): S3Integration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Integration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Integration] (val x: Self) extends AnyVal {
    
    inline def setAws_access_key(value: AwsAccessKey): Self = StObject.set(x, "aws_access_key", value.asInstanceOf[js.Any])
    
    inline def setAws_access_keyUndefined: Self = StObject.set(x, "aws_access_key", js.undefined)
    
    inline def setAws_role(value: AwsRole): Self = StObject.set(x, "aws_role", value.asInstanceOf[js.Any])
    
    inline def setAws_roleUndefined: Self = StObject.set(x, "aws_role", js.undefined)
  }
}

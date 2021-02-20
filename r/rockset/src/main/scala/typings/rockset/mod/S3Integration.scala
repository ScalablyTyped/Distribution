package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Integration extends StObject {
  
  // credentials for an AWS access key integration
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.native
  
  // details of an AWS cross-account role integration
  var aws_role: js.UndefOr[AwsRole] = js.native
}
object S3Integration {
  
  @scala.inline
  def apply(): S3Integration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Integration]
  }
  
  @scala.inline
  implicit class S3IntegrationMutableBuilder[Self <: S3Integration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAws_access_key(value: AwsAccessKey): Self = StObject.set(x, "aws_access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAws_access_keyUndefined: Self = StObject.set(x, "aws_access_key", js.undefined)
    
    @scala.inline
    def setAws_role(value: AwsRole): Self = StObject.set(x, "aws_role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAws_roleUndefined: Self = StObject.set(x, "aws_role", js.undefined)
  }
}

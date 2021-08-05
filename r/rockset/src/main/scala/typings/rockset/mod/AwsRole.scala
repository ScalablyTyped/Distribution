package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRole extends StObject {
  
  // ARN of rockset-role created in your account
  var aws_role_arn: String
}
object AwsRole {
  
  inline def apply(aws_role_arn: String): AwsRole = {
    val __obj = js.Dynamic.literal(aws_role_arn = aws_role_arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsRole]
  }
  
  extension [Self <: AwsRole](x: Self) {
    
    inline def setAws_role_arn(value: String): Self = StObject.set(x, "aws_role_arn", value.asInstanceOf[js.Any])
  }
}

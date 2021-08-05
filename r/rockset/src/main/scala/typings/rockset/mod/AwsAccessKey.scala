package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAccessKey extends StObject {
  
  // AWS access key ID
  var aws_access_key_id: String
  
  // AWS secret access key
  var aws_secret_access_key: String
}
object AwsAccessKey {
  
  inline def apply(aws_access_key_id: String, aws_secret_access_key: String): AwsAccessKey = {
    val __obj = js.Dynamic.literal(aws_access_key_id = aws_access_key_id.asInstanceOf[js.Any], aws_secret_access_key = aws_secret_access_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsAccessKey]
  }
  
  extension [Self <: AwsAccessKey](x: Self) {
    
    inline def setAws_access_key_id(value: String): Self = StObject.set(x, "aws_access_key_id", value.asInstanceOf[js.Any])
    
    inline def setAws_secret_access_key(value: String): Self = StObject.set(x, "aws_secret_access_key", value.asInstanceOf[js.Any])
  }
}

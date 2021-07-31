package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  var awsKmsKeyArn: js.UndefOr[String] = js.undefined
  
  var name: String
}
object Service {
  
  @scala.inline
  def apply(name: String): Service = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsKmsKeyArn(value: String): Self = StObject.set(x, "awsKmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsKmsKeyArnUndefined: Self = StObject.set(x, "awsKmsKeyArn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

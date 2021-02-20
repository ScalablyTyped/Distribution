package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Secret extends StObject {
  
  /**
    * The name of the secret.
    */
  var name: String = js.native
  
  /**
    * The secret to expose to the container. The supported values are either the full ARN of the
    * AWS Secrets Manager secret or the full ARN of the parameter in the AWS Systems Manager
    * Parameter Store.
    *
    * Note: If the AWS Systems Manager Parameter Store parameter exists in the same Region as the
    * task you are launching, then you can use either the full ARN or name of the parameter. If the
    * parameter exists in a different Region, then the full ARN must be specified.
    */
  var valueFrom: String = js.native
}
object Secret {
  
  @scala.inline
  def apply(name: String, valueFrom: String): Secret = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], valueFrom = valueFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
  
  @scala.inline
  implicit class SecretMutableBuilder[Self <: Secret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFrom(value: String): Self = StObject.set(x, "valueFrom", value.asInstanceOf[js.Any])
  }
}

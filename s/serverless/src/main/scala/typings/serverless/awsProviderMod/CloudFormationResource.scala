package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFormationResource extends StObject {
  
  var DeletionPolicy: js.UndefOr[String] = js.native
  
  var DependsOn: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  
  var Properties: StringDictionary[js.Any] = js.native
  
  var Type: String = js.native
}
object CloudFormationResource {
  
  @scala.inline
  def apply(Properties: StringDictionary[js.Any], Type: String): CloudFormationResource = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationResource]
  }
  
  @scala.inline
  implicit class CloudFormationResourceMutableBuilder[Self <: CloudFormationResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionPolicy(value: String): Self = StObject.set(x, "DeletionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionPolicyUndefined: Self = StObject.set(x, "DeletionPolicy", js.undefined)
    
    @scala.inline
    def setDependsOn(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "DependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependsOnUndefined: Self = StObject.set(x, "DependsOn", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}

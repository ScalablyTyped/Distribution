package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resources extends StObject {
  
  var Description: js.UndefOr[String] = js.native
  
  var Outputs: js.UndefOr[typings.serverless.awsProviderMod.Outputs] = js.native
  
  var Resources: CloudFormationResources = js.native
  
  var extensions: js.UndefOr[CloudFormationResources] = js.native
}
object Resources {
  
  @scala.inline
  def apply(Resources: CloudFormationResources): Resources = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit class ResourcesMutableBuilder[Self <: Resources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExtensions(value: CloudFormationResources): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setOutputs(value: Outputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setResources(value: CloudFormationResources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
  }
}

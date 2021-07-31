package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedFunctionResourceUri extends StObject {
  
  /**
    * The type of the resource. can be one of `JAR`, `FILE`, and `ARCHIVE`.
    */
  var resourceType: Input[String]
  
  /**
    * The URI for accessing the resource.
    */
  var uri: Input[String]
}
object UserDefinedFunctionResourceUri {
  
  @scala.inline
  def apply(resourceType: Input[String], uri: Input[String]): UserDefinedFunctionResourceUri = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunctionResourceUri]
  }
  
  @scala.inline
  implicit class UserDefinedFunctionResourceUriMutableBuilder[Self <: UserDefinedFunctionResourceUri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: Input[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}

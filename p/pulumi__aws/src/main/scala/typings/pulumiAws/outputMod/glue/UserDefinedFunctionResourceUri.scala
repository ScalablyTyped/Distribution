package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedFunctionResourceUri extends StObject {
  
  /**
    * The type of the resource. can be one of `JAR`, `FILE`, and `ARCHIVE`.
    */
  var resourceType: String = js.native
  
  /**
    * The URI for accessing the resource.
    */
  var uri: String = js.native
}
object UserDefinedFunctionResourceUri {
  
  @scala.inline
  def apply(resourceType: String, uri: String): UserDefinedFunctionResourceUri = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunctionResourceUri]
  }
  
  @scala.inline
  implicit class UserDefinedFunctionResourceUriMutableBuilder[Self <: UserDefinedFunctionResourceUri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}

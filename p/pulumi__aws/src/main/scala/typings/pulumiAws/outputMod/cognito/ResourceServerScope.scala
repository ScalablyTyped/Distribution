package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceServerScope extends StObject {
  
  /**
    * The scope description.
    */
  var scopeDescription: String = js.native
  
  /**
    * The scope name.
    */
  var scopeName: String = js.native
}
object ResourceServerScope {
  
  @scala.inline
  def apply(scopeDescription: String, scopeName: String): ResourceServerScope = {
    val __obj = js.Dynamic.literal(scopeDescription = scopeDescription.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerScope]
  }
  
  @scala.inline
  implicit class ResourceServerScopeMutableBuilder[Self <: ResourceServerScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescription(value: String): Self = StObject.set(x, "scopeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
  }
}

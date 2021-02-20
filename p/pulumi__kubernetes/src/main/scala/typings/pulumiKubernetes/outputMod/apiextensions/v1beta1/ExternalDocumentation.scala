package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalDocumentation allows referencing an external resource for extended documentation.
  */
@js.native
trait ExternalDocumentation extends StObject {
  
  var description: String = js.native
  
  var url: String = js.native
}
object ExternalDocumentation {
  
  @scala.inline
  def apply(description: String, url: String): ExternalDocumentation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDocumentation]
  }
  
  @scala.inline
  implicit class ExternalDocumentationMutableBuilder[Self <: ExternalDocumentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

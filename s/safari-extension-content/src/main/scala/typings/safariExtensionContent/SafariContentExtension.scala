package typings.safariExtensionContent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafariContentExtension extends StObject {
  
  var baseURI: String
}
object SafariContentExtension {
  
  @scala.inline
  def apply(baseURI: String): SafariContentExtension = {
    val __obj = js.Dynamic.literal(baseURI = baseURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariContentExtension]
  }
  
  @scala.inline
  implicit class SafariContentExtensionMutableBuilder[Self <: SafariContentExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
  }
}

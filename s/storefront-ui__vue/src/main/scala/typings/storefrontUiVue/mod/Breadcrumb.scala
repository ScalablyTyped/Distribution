package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breadcrumb extends StObject {
  
  var link: String
  
  var text: String
}
object Breadcrumb {
  
  inline def apply(link: String, text: String): Breadcrumb = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Breadcrumb] (val x: Self) extends AnyVal {
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}

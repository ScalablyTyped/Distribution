package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'image'> */
trait PickImplimage extends StObject {
  
  var image: String
}
object PickImplimage {
  
  @scala.inline
  def apply(image: String): PickImplimage = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplimage]
  }
  
  @scala.inline
  implicit class PickImplimageMutableBuilder[Self <: PickImplimage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}

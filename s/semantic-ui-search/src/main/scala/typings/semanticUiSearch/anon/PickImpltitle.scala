package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'title'> */
trait PickImpltitle extends StObject {
  
  var title: String
}
object PickImpltitle {
  
  @scala.inline
  def apply(title: String): PickImpltitle = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltitle]
  }
  
  @scala.inline
  implicit class PickImpltitleMutableBuilder[Self <: PickImpltitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

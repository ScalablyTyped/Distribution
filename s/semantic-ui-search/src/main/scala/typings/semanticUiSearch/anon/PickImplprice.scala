package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'price'> */
trait PickImplprice extends StObject {
  
  var price: String
}
object PickImplprice {
  
  @scala.inline
  def apply(price: String): PickImplprice = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprice]
  }
  
  @scala.inline
  implicit class PickImplpriceMutableBuilder[Self <: PickImplprice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
  }
}

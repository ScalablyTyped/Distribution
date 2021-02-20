package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericMenuExposed extends StObject {
  
  /** the name of the attribute in the records */
  var attribute: String = js.native
  
  /** the value of the item selected by default, follow the shape of a string with a pattern of '{start}:{end}'. */
  var defaultRefinement: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  /** List of options. With a text label, and upper and lower bounds. */
  var items: js.Array[End] = js.native
  
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object NumericMenuExposed {
  
  @scala.inline
  def apply(attribute: String, items: js.Array[End]): NumericMenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericMenuExposed]
  }
  
  @scala.inline
  implicit class NumericMenuExposedMutableBuilder[Self <: NumericMenuExposed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[End]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: End*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTransformItems(value: /* repeated */ js.Any => _): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
  }
}

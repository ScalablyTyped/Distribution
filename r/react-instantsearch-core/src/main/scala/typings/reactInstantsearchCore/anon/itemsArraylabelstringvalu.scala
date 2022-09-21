package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.Refinement
import typings.reactInstantsearchCore.mod.RefinementValue
import typings.reactInstantsearchCore.mod.SearchState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  items :std.Array<{  label :string,   value :react-instantsearch-core.react-instantsearch-core.RefinementValue}>,   currentRefinement :std.Array<string>} & {  label :string,   attribute :string,   index :string,   id :string,   value :react-instantsearch-core.react-instantsearch-core.RefinementValue} */
trait itemsArraylabelstringvalu
  extends StObject
     with Refinement {
  
  var attribute: String
  
  var currentRefinement: js.Array[String]
  
  var id: String
  
  var index: String
  
  var items: js.Array[Label]
  
  var label: String
  
  var value: RefinementValue
}
object itemsArraylabelstringvalu {
  
  inline def apply(
    attribute: String,
    currentRefinement: js.Array[String],
    id: String,
    index: String,
    items: js.Array[Label],
    label: String,
    value: /* searchState */ SearchState => SearchState
  ): itemsArraylabelstringvalu = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], currentRefinement = currentRefinement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[itemsArraylabelstringvalu]
  }
  
  extension [Self <: itemsArraylabelstringvalu](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setCurrentRefinement(value: js.Array[String]): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setCurrentRefinementVarargs(value: String*): Self = StObject.set(x, "currentRefinement", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Label]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Label*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: /* searchState */ SearchState => SearchState): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}

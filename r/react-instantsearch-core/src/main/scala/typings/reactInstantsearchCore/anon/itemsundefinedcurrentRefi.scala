package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.Refinement
import typings.reactInstantsearchCore.mod.RefinementValue
import typings.reactInstantsearchCore.mod.SearchState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  items :undefined,   currentRefinement :string} & {  label :string,   attribute :string,   index :string,   id :string,   value :react-instantsearch-core.react-instantsearch-core.RefinementValue} */
trait itemsundefinedcurrentRefi
  extends StObject
     with Refinement {
  
  var attribute: String
  
  var currentRefinement: String
  
  var id: String
  
  var index: String
  
  var items: Unit
  
  var label: String
  
  var value: RefinementValue
}
object itemsundefinedcurrentRefi {
  
  inline def apply(
    attribute: String,
    currentRefinement: String,
    id: String,
    index: String,
    items: Unit,
    label: String,
    value: /* searchState */ SearchState => SearchState
  ): itemsundefinedcurrentRefi = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], currentRefinement = currentRefinement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[itemsundefinedcurrentRefi]
  }
  
  extension [Self <: itemsundefinedcurrentRefi](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Unit): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: /* searchState */ SearchState => SearchState): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}

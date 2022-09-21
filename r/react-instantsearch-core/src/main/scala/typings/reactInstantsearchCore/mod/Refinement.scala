package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactInstantsearchCore.anon.itemsundefinedcurrentRefi
  - typings.reactInstantsearchCore.anon.itemsArraylabelstringvalu
*/
trait Refinement extends StObject
object Refinement {
  
  inline def itemsArraylabelstringvalu(
    attribute: String,
    currentRefinement: js.Array[String],
    id: String,
    index: String,
    items: js.Array[Label],
    label: String,
    value: /* searchState */ SearchState => SearchState
  ): typings.reactInstantsearchCore.anon.itemsArraylabelstringvalu = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], currentRefinement = currentRefinement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[typings.reactInstantsearchCore.anon.itemsArraylabelstringvalu]
  }
  
  inline def itemsundefinedcurrentRefi(
    attribute: String,
    currentRefinement: String,
    id: String,
    index: String,
    items: Unit,
    label: String,
    value: /* searchState */ SearchState => SearchState
  ): typings.reactInstantsearchCore.anon.itemsundefinedcurrentRefi = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], currentRefinement = currentRefinement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[typings.reactInstantsearchCore.anon.itemsundefinedcurrentRefi]
  }
}

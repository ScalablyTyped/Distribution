package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.and
import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefinementListExposed extends StObject {
  
  /** the name of the attribute in the record */
  var attribute: String
  
  /**
    * the values of the items selected by default. The searchState of this widget takes the form of a list of strings,
    * which correspond to the values of all selected refinements. However, when there are no refinements selected,
    * the value of the searchState is an empty string.
    */
  var defaultRefinement: js.UndefOr[js.Array[String]] = js.undefined
  
  /** the minimum number of displayed items */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** How to apply the refinements. Possible values: ‘or’ or ‘and’. */
  var operator: js.UndefOr[or | and] = js.undefined
  
  /** allow search inside values */
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  /** true if the component should display a button that will expand the number of items */
  var showMore: js.UndefOr[Boolean] = js.undefined
  
  /** the maximun number of displayed items. Only used when showMore is set to true */
  var showMoreLimit: js.UndefOr[Double] = js.undefined
  
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
}
object RefinementListExposed {
  
  inline def apply(attribute: String): RefinementListExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementListExposed]
  }
  
  extension [Self <: RefinementListExposed](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinement(value: js.Array[String]): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
    
    inline def setDefaultRefinementVarargs(value: String*): Self = StObject.set(x, "defaultRefinement", js.Array(value :_*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOperator(value: or | and): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setShowMore(value: Boolean): Self = StObject.set(x, "showMore", value.asInstanceOf[js.Any])
    
    inline def setShowMoreLimit(value: Double): Self = StObject.set(x, "showMoreLimit", value.asInstanceOf[js.Any])
    
    inline def setShowMoreLimitUndefined: Self = StObject.set(x, "showMoreLimit", js.undefined)
    
    inline def setShowMoreUndefined: Self = StObject.set(x, "showMore", js.undefined)
    
    inline def setTransformItems(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
    
    inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
  }
}

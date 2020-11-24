package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.and
import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinementListExposed extends js.Object {
  
  /** the name of the attribute in the record */
  var attribute: String = js.native
  
  /**
    * the values of the items selected by default. The searchState of this widget takes the form of a list of strings,
    * which correspond to the values of all selected refinements. However, when there are no refinements selected,
    * the value of the searchState is an empty string.
    */
  var defaultRefinement: js.UndefOr[js.Array[String]] = js.native
  
  /** the minimum number of displayed items */
  var limit: js.UndefOr[Double] = js.native
  
  /** How to apply the refinements. Possible values: ‘or’ or ‘and’. */
  var operator: js.UndefOr[or | and] = js.native
  
  /** allow search inside values */
  var searchable: js.UndefOr[Boolean] = js.native
  
  /** true if the component should display a button that will expand the number of items */
  var showMore: js.UndefOr[Boolean] = js.native
  
  /** the maximun number of displayed items. Only used when showMore is set to true */
  var showMoreLimit: js.UndefOr[Double] = js.native
  
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object RefinementListExposed {
  
  @scala.inline
  def apply(attribute: String): RefinementListExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementListExposed]
  }
  
  @scala.inline
  implicit class RefinementListExposedOps[Self <: RefinementListExposed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinementVarargs(value: String*): Self = this.set("defaultRefinement", js.Array(value :_*))
    
    @scala.inline
    def setDefaultRefinement(value: js.Array[String]): Self = this.set("defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRefinement: Self = this.set("defaultRefinement", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setOperator(value: or | and): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    
    @scala.inline
    def setShowMore(value: Boolean): Self = this.set("showMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMore: Self = this.set("showMore", js.undefined)
    
    @scala.inline
    def setShowMoreLimit(value: Double): Self = this.set("showMoreLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMoreLimit: Self = this.set("showMoreLimit", js.undefined)
    
    @scala.inline
    def setTransformItems(value: /* repeated */ js.Any => _): Self = this.set("transformItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformItems: Self = this.set("transformItems", js.undefined)
  }
}

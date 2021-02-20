package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuExposed extends StObject {
  
  var attribute: String = js.native
  
  var defaultRefinement: js.UndefOr[String] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var searchable: js.UndefOr[Boolean] = js.native
  
  var showMore: js.UndefOr[Boolean] = js.native
  
  var showMoreLimit: js.UndefOr[Double] = js.native
  
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object MenuExposed {
  
  @scala.inline
  def apply(attribute: String): MenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuExposed]
  }
  
  @scala.inline
  implicit class MenuExposedMutableBuilder[Self <: MenuExposed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setShowMore(value: Boolean): Self = StObject.set(x, "showMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMoreLimit(value: Double): Self = StObject.set(x, "showMoreLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMoreLimitUndefined: Self = StObject.set(x, "showMoreLimit", js.undefined)
    
    @scala.inline
    def setShowMoreUndefined: Self = StObject.set(x, "showMore", js.undefined)
    
    @scala.inline
    def setTransformItems(value: /* repeated */ js.Any => _): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
  }
}

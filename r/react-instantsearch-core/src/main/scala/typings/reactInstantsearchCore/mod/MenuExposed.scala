package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuExposed extends js.Object {
  
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
  implicit class MenuExposedOps[Self <: MenuExposed] (val x: Self) extends AnyVal {
    
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
    def setDefaultRefinement(value: String): Self = this.set("defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRefinement: Self = this.set("defaultRefinement", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
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

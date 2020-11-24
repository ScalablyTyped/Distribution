package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends js.Object {
  
  var location: ActionMetaLocation = js.native
  
  var navigation: js.UndefOr[NavigationAction] = js.native
  
  var notFoundPath: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[Query] = js.native
  
  var search: js.UndefOr[String] = js.native
}
object Meta {
  
  @scala.inline
  def apply(location: ActionMetaLocation): Meta = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: ActionMetaLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: NavigationAction): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    
    @scala.inline
    def setNotFoundPath(value: String): Self = this.set("notFoundPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFoundPath: Self = this.set("notFoundPath", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
}

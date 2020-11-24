package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateURL extends js.Object {
  
  def createURL(args: js.Any*): String = js.native
  
  def refine(args: js.Any*): js.Any = js.native
  
  def searchForItems(args: js.Any*): js.Any = js.native
}
object CreateURL {
  
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => String,
    refine: /* repeated */ js.Any => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): CreateURL = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[CreateURL]
  }
  
  @scala.inline
  implicit class CreateURLOps[Self <: CreateURL] (val x: Self) extends AnyVal {
    
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
    def setCreateURL(value: /* repeated */ js.Any => String): Self = this.set("createURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => js.Any): Self = this.set("refine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchForItems(value: /* repeated */ js.Any => js.Any): Self = this.set("searchForItems", js.Any.fromFunction1(value))
  }
}
